package DAO;

import conexoes.ConexaoMySql;
import model.ModelProdutos;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOProdutos extends ConexaoMySql {

    /**
    * grava Produtos
    * @param pModelProdutos
    * @return int
    */
    public int salvarProdutosDAO(ModelProdutos produtos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO produtos ("
                    + "id_prod,"
                    + "novo_cod,"
                    + "nome_prod,"
                    + "marca,"
                    + "categoria,"
                    + "unidade,"
                    + "cost,"
                    + "preco,"
                    + "quantidade,"
                    + "alert,"
                    + "validade_prod,"
                    + "imagem"
                + ") VALUES ("
                    + "'" + produtos.getIdProd() + "',"
                    + "'" + produtos.getNovo_cod() + "',"
                    + "'" + produtos.getNome_prod() + "',"
                    + "'" + produtos.getMarca() + "',"
                    + "'" + produtos.getCategoria() + "',"
                    + "'" + produtos.getUnidade() + "',"
                    + "'" + produtos.getCost() + "',"
                    + "'" + produtos.getPreco() + "',"
                    + "'" + produtos.getQuantidade() + "',"
                    + "'" + produtos.getAlert() + "',"
                    + "'" + produtos.getValidateProd() + "',"
                    + "'" + produtos.getImagem() + "'"
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
    * recupera Produtos
    * @param pIdProd
    * @return ModelProdutos
    */
    public ModelProdutos getProdutosDAO(String pIdProd){
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_prod,"
                    + "novo_cod,"
                    + "nome_prod,"
                    + "marca,"
                    + "categoria,"
                    + "unidade,"
                    + "cost,"
                    + "preco,"
                    + "quantidade,"
                    + "alert,"
                    + "validade_prod,"
                    + "imagem"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " novo_cod = '" + pIdProd + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProdutos.setIdProd(this.getResultSet().getInt(1));
                modelProdutos.setNovo_cod(this.getResultSet().getString(2));
                modelProdutos.setNome_prod(this.getResultSet().getString(3));
                modelProdutos.setMarca(this.getResultSet().getString(4));
                modelProdutos.setCategoria(this.getResultSet().getString(5));
                modelProdutos.setUnidade(this.getResultSet().getString(6));
                modelProdutos.setCost(this.getResultSet().getDouble(7));
                modelProdutos.setPreco(this.getResultSet().getDouble(8));
                modelProdutos.setQuantidade(this.getResultSet().getInt(9));
                modelProdutos.setAlert(this.getResultSet().getInt(10));
                modelProdutos.setValidateProd(this.getResultSet().getString(11));
                modelProdutos.setImagem(this.getResultSet().getString(12));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
    * recupera uma lista de Produtos
        * @return ArrayList
    */
    public ArrayList<ModelProdutos> getListaProdutosDAO(){
        ArrayList<ModelProdutos> listamodelProdutos = new ArrayList();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_prod,"
                    + "novo_cod,"
                    + "nome_prod,"
                    + "marca,"
                    + "categoria,"
                    + "unidade,"
                    + "cost,"
                    + "preco,"
                    + "quantidade,"
                    + "alert,"
                    + "validade_prod,"
                    + "imagem"
                 + " FROM"
                     + " produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProd(this.getResultSet().getInt(1));
                modelProdutos.setNovo_cod(this.getResultSet().getString(2));
                modelProdutos.setNome_prod(this.getResultSet().getString(3));
                modelProdutos.setMarca(this.getResultSet().getString(4));
                modelProdutos.setCategoria(this.getResultSet().getString(5));
                modelProdutos.setUnidade(this.getResultSet().getString(6));
                modelProdutos.setCost(this.getResultSet().getDouble(7));
                modelProdutos.setPreco(this.getResultSet().getDouble(8));
                modelProdutos.setQuantidade(this.getResultSet().getInt(9));
                modelProdutos.setAlert(this.getResultSet().getInt(10));
                modelProdutos.setValidateProd(this.getResultSet().getString(11));
                modelProdutos.setImagem(this.getResultSet().getString(12));
                listamodelProdutos.add(modelProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProdutos;
    }

    /**
    * atualiza Produtos
    * @param pModelProdutos
    * @return boolean
    */
    public boolean atualizarProdutosDAO(ModelProdutos produtos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE produtos SET "
                    + "id_prod = '" + produtos.getIdProd() + "',"
                    + "novo_cod = '" + produtos.getNovo_cod() + "',"
                    + "nome_prod = '" + produtos.getNome_prod() + "',"
                    + "marca = '" + produtos.getMarca() + "',"
                    + "categoria = '" + produtos.getCategoria() + "',"
                    + "unidade = '" + produtos.getUnidade() + "',"
                    + "cost = '" + produtos.getCost() + "',"
                    + "preco = '" + produtos.getPreco() + "',"
                    + "quantidade = '" + produtos.getQuantidade() + "',"
                    + "alert = '" + produtos.getAlert() + "',"
                    + "validade_prod = '" + produtos.getValidateProd() + "',"
                    + "imagem = '" + produtos.getImagem()+ "'"
                + " WHERE "
                    + "novo_cod = '" + produtos.getNovo_cod() + "'"
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
    * exclui Produtos
    * @param pIdProd
    * @return boolean
    */
    public boolean excluirProdutosDAO(String pIdProd){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM produtos "
                + " WHERE "
                    + "novo_cod = '" + pIdProd + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public ArrayList<ModelProdutos> getListaProdutosProximosDAO() {
        ArrayList<ModelProdutos> listamodelProdutos = new ArrayList();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT nome_prod, validade_prod FROM produtos WHERE Month(validade_prod) = Month(NOW()) + 3 AND day(validade_prod)"
            );

            while(this.getResultSet().next()){
                modelProdutos = new ModelProdutos();
                modelProdutos.setNome_prod(this.getResultSet().getString(1));
                modelProdutos.setValidateProd(this.getResultSet().getString(2));
//                modelProdutos.setNome_prod(this.getResultSet().getString(3));
//                modelProdutos.setMarca(this.getResultSet().getString(4));
//                modelProdutos.setCategoria(this.getResultSet().getString(5));
//                modelProdutos.setUnidade(this.getResultSet().getString(6));
//                modelProdutos.setCost(this.getResultSet().getDouble(7));
//                modelProdutos.setPreco(this.getResultSet().getDouble(8));
//                modelProdutos.setQuantidade(this.getResultSet().getInt(9));
//                modelProdutos.setAlert(this.getResultSet().getInt(10));
//                modelProdutos.setValidateProd(this.getResultSet().getString(11));
                listamodelProdutos.add(modelProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProdutos;
    }

    public ArrayList<ModelProdutos> getListaProdutosVencidosDAO() {
         ArrayList<ModelProdutos> listamodelProdutos = new ArrayList();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT nome_prod, validade_prod FROM produtos WHERE date(NOW()) > date(validade_prod)"
            );

            while(this.getResultSet().next()){
                modelProdutos = new ModelProdutos();
                modelProdutos.setNome_prod(this.getResultSet().getString(1));
                modelProdutos.setValidateProd(this.getResultSet().getString(2));
//                modelProdutos.setNome_prod(this.getResultSet().getString(3));
//                modelProdutos.setMarca(this.getResultSet().getString(4));
//                modelProdutos.setCategoria(this.getResultSet().getString(5));
//                modelProdutos.setUnidade(this.getResultSet().getString(6));
//                modelProdutos.setCost(this.getResultSet().getDouble(7));
//                modelProdutos.setPreco(this.getResultSet().getDouble(8));
//                modelProdutos.setQuantidade(this.getResultSet().getInt(9));
//                modelProdutos.setAlert(this.getResultSet().getInt(10));
//                modelProdutos.setValidateProd(this.getResultSet().getString(11));
                listamodelProdutos.add(modelProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProdutos;
    }

    public ModelProdutos retornarProdutoDAO(String pNomeProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_prod,"
                    + "novo_cod,"
                    + "nome_prod,"
                    + "marca,"
                    + "categoria,"
                    + "unidade,"
                    + "cost,"
                    + "preco,"
                    + "quantidade,"
                    + "alert,"
                    + "validade_prod,"
                    + "imagem"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " nome_prod = '" + pNomeProduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProdutos.setIdProd(this.getResultSet().getInt(1));
                modelProdutos.setNovo_cod(this.getResultSet().getString(2));
                modelProdutos.setNome_prod(this.getResultSet().getString(3));
                modelProdutos.setMarca(this.getResultSet().getString(4));
                modelProdutos.setCategoria(this.getResultSet().getString(5));
                modelProdutos.setUnidade(this.getResultSet().getString(6));
                modelProdutos.setCost(this.getResultSet().getDouble(7));
                modelProdutos.setPreco(this.getResultSet().getDouble(8));
                modelProdutos.setQuantidade(this.getResultSet().getInt(9));
                modelProdutos.setAlert(this.getResultSet().getInt(10));
                modelProdutos.setValidateProd(this.getResultSet().getString(11));
                modelProdutos.setImagem(this.getResultSet().getString(12));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProdutos;
    }

    public boolean alterarEstoqueProdutosDAO(ArrayList<ModelProdutos> listaModelProdutos) {
        try {
            this.conectar();
            for (int i = 0; i < listaModelProdutos.size(); i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE produto SET "
                        + "quantidade = '" + listaModelProdutos.get(i).getQuantidade()+ "'"
                        + " WHERE id_prod = '" + listaModelProdutos.get(i).getIdProd() + "'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}