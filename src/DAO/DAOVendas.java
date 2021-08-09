package DAO;

import model.ModelVendas;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOVendas extends ConexaoMySql {

    /**
    * grava Vendas
    * @param pModelVendas
    * @return int
    */
    public int salvarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO vendas ("
//                    + "id_venda,"
                    + "id_vendedor,"
                    + "id_parceiro,"
                    + "id_cliente,"
                    + "total,"
                    + "taxa,"
                    + "total_taxa,"
                    + "desconto,"    
                    + "observacao,"
                    + "data_venda,"
                    + "editada,"
                    + "status_venda"
                + ") VALUES ("
//                    + "'" + pModelVendas.getIdVenda() + "',"
                    + "'" + pModelVendas.getIdVendedor() + "',"
                    + "'" + pModelVendas.getIdParceiro() + "',"
                    + "'" + pModelVendas.getIdCliente() + "',"
                    + "'" + pModelVendas.getTotal() + "',"
                    + "'" + pModelVendas.getTaxa() + "',"
                    + "'" + pModelVendas.getTotal_taxa() + "',"
                    + "'" + pModelVendas.getDesconto() + "',"
                    + "'" + pModelVendas.getObservacao() + "',"
                    + "'" + pModelVendas.getDataVenda() + "',"
                    + "'" + pModelVendas.getEditada() + "',"
                    + "'" + pModelVendas.getStatusVenda() + "'"
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
    * recupera Vendas
    * @param pIdVenda
    * @return ModelVendas
    */
    public ModelVendas getVendasDAO(int pIdVenda){
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda,"
                    + "id_vendedor,"
                    + "id_parceiro,"
                    + "id_cliente,"
                    + "total,"
                    + "taxa,"
                    + "total_taxa,"
                    + "desconto,"
                    + "observacao,"
                    + "data_venda,"
                    + "editada,"
                    + "status_venda"
                 + " FROM"
                     + " vendas"
                 + " WHERE"
                     + " id_venda = '" + pIdVenda + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setIdVendedor(this.getResultSet().getString(2));
                modelVendas.setIdParceiro(this.getResultSet().getInt(3));
                modelVendas.setIdCliente(this.getResultSet().getInt(4));
                modelVendas.setTotal(this.getResultSet().getFloat(5));
                modelVendas.setTaxa(this.getResultSet().getFloat(6));
                modelVendas.setTotal_taxa(this.getResultSet().getFloat(7));
                modelVendas.setDesconto(this.getResultSet().getFloat(8));
                modelVendas.setObservacao(this.getResultSet().getString(9));
                modelVendas.setDataVenda(this.getResultSet().getString(10));
                modelVendas.setEditada(this.getResultSet().getInt(11));
                modelVendas.setStatusVenda(this.getResultSet().getInt(12));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }

    /**
    * recupera uma lista de Vendas
        * @return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasDAO(){
        ArrayList<ModelVendas> listamodelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda,"
                    + "id_vendedor,"
                    + "id_parceiro,"
                    + "id_cliente,"
                    + "total,"
                    + "taxa,"
                    + "total_taxa,"
                    + "desconto,"
                    + "observacao,"
                    + "data_venda,"
                    + "editada,"
                    + "status_venda"
                 + " FROM"
                     + " vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setIdVendedor(this.getResultSet().getString(2));
                modelVendas.setIdParceiro(this.getResultSet().getInt(3));
                modelVendas.setIdCliente(this.getResultSet().getInt(4));
                modelVendas.setTotal(this.getResultSet().getFloat(5));
                modelVendas.setTaxa(this.getResultSet().getFloat(6));
                modelVendas.setTotal_taxa(this.getResultSet().getFloat(7));
                modelVendas.setDesconto(this.getResultSet().getFloat(8));
                modelVendas.setObservacao(this.getResultSet().getString(9));
                modelVendas.setDataVenda(this.getResultSet().getString(10));
                modelVendas.setEditada(this.getResultSet().getInt(11));
                modelVendas.setStatusVenda(this.getResultSet().getInt(12));
                listamodelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas;
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * @return boolean
    */
    public boolean atualizarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE vendas SET "
                    + "id_venda = '" + pModelVendas.getIdVenda() + "',"
                    + "id_vendedor = '" + pModelVendas.getIdVendedor() + "',"
                    + "id_parceiro = '" + pModelVendas.getIdParceiro() + "',"
                    + "id_cliente = '" + pModelVendas.getIdCliente() + "',"
                    + "total = '" + pModelVendas.getTotal() + "',"
                    + "taxa = '" + pModelVendas.getTaxa() + "',"
                    + "total_taxa = '" + pModelVendas.getTotal_taxa() + "',"
                    + "desconto = '" + pModelVendas.getDesconto()+ "',"
                    + "observacao = '" + pModelVendas.getObservacao() + "',"
                    + "data_venda = '" + pModelVendas.getDataVenda() + "',"
                    + "editada = '" + pModelVendas.getEditada() + "',"
                    + "status_venda = '" + pModelVendas.getStatusVenda() + "'"
                + " WHERE "
                    + "id_venda = '" + pModelVendas.getIdVenda() + "'"
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
    * exclui Vendas
    * @param pIdVenda
    * @return boolean
    */
    public boolean excluirVendasDAO(int pIdVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM vendas "
                + " WHERE "
                    + "id_venda = '" + pIdVenda + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}