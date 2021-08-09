package DAO;

import model.ModelVendasProdutos;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOVendasProdutos extends ConexaoMySql {

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * @return int
    */
    public int salvarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO vendas_produtos ("
                    + "id_venda_produtos,"
                    + "id_venda,"
                    + "id_produto,"
                    + "quantidade,"
                    + "valor,"
                    + "valor_vendido,"
                    + "custo"
                + ") VALUES ("
                    + "'" + pModelVendasProdutos.getIdVendaProdutos() + "',"
                    + "'" + pModelVendasProdutos.getIdVenda() + "',"
                    + "'" + pModelVendasProdutos.getIdProduto() + "',"
                    + "'" + pModelVendasProdutos.getQuantidade() + "',"
                    + "'" + pModelVendasProdutos.getValor() + "',"
                    + "'" + pModelVendasProdutos.getValorVendido() + "',"
                    + "'" + pModelVendasProdutos.getCusto() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera VendasProdutos
    * @param pIdVendaProdutos
    * @return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosDAO(int pIdVendaProdutos){
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda_produtos,"
                    + "id_venda,"
                    + "id_produto,"
                    + "quantidade,"
                    + "valor,"
                    + "valor_vendido,"
                    + "custo"
                 + " FROM"
                     + " vendas_produtos"
                 + " WHERE"
                     + " id_venda_produtos = '" + pIdVendaProdutos + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos.setIdVendaProdutos(this.getResultSet().getInt(1));
                modelVendasProdutos.setIdVenda(this.getResultSet().getInt(2));
                modelVendasProdutos.setIdProduto(this.getResultSet().getInt(3));
                modelVendasProdutos.setQuantidade(this.getResultSet().getInt(4));
                modelVendasProdutos.setValor(this.getResultSet().getFloat(5));
                modelVendasProdutos.setValorVendido(this.getResultSet().getFloat(6));
                modelVendasProdutos.setCusto(this.getResultSet().getFloat(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
    * recupera uma lista de VendasProdutos
        * @return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO(){
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda_produtos,"
                    + "id_venda,"
                    + "id_produto,"
                    + "quantidade,"
                    + "valor,"
                    + "valor_vendido,"
                    + "custo"
                 + " FROM"
                     + " vendas_produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setIdVendaProdutos(this.getResultSet().getInt(1));
                modelVendasProdutos.setIdVenda(this.getResultSet().getInt(2));
                modelVendasProdutos.setIdProduto(this.getResultSet().getInt(3));
                modelVendasProdutos.setQuantidade(this.getResultSet().getInt(4));
                modelVendasProdutos.setValor(this.getResultSet().getFloat(5));
                modelVendasProdutos.setValorVendido(this.getResultSet().getFloat(6));
                modelVendasProdutos.setCusto(this.getResultSet().getFloat(7));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE vendas_produtos SET "
                    + "id_venda_produtos = '" + pModelVendasProdutos.getIdVendaProdutos() + "',"
                    + "id_venda = '" + pModelVendasProdutos.getIdVenda() + "',"
                    + "id_produto = '" + pModelVendasProdutos.getIdProduto() + "',"
                    + "quantidade = '" + pModelVendasProdutos.getQuantidade() + "',"
                    + "valor = '" + pModelVendasProdutos.getValor() + "',"
                    + "valor_vendido = '" + pModelVendasProdutos.getValorVendido() + "',"
                    + "custo = '" + pModelVendasProdutos.getCusto() + "'"
                + " WHERE "
                    + "id_venda_produtos = '" + pModelVendasProdutos.getIdVendaProdutos() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui VendasProdutos
    * @param pIdVendaProdutos
    * @return boolean
    */
    public boolean excluirVendasProdutosDAO(int pIdVendaProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM vendas_produtos "
                + " WHERE "
                    + "id_venda_produtos = '" + pIdVendaProdutos + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarVendasProdutosDAO(ArrayList<ModelVendasProdutos> listaVendasProdutos) {
        try {
            this.conectar();
            int count = listaVendasProdutos.size();
            for(int i = 0; i < count; i++) {
                this.insertSQL(
                    "INSERT INTO vendas_produtos ("
                    + "id_venda,"
                    + "id_produto,"
                    + "quantidade,"
                    + "valor,"
                    + "valor_vendido,"
                    + "custo"
                + ") VALUES ("
                    + "'" + listaVendasProdutos.get(i).getIdVenda() + "',"
                    + "'" + listaVendasProdutos.get(i).getIdProduto() + "',"
                    + "'" + listaVendasProdutos.get(i).getQuantidade() + "',"
                    + "'" + listaVendasProdutos.get(i).getValor() + "',"
                    + "'" + listaVendasProdutos.get(i).getValorVendido() + "',"
                    + "'" + listaVendasProdutos.get(i).getCusto() + "'"
                + ");"
                );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}