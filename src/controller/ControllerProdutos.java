package controller;

import model.ModelProdutos;
import DAO.DAOProdutos;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerProdutos {

    private DAOProdutos daoProdutos = new DAOProdutos();

    /**
    * grava Produtos
    * @param pModelProdutos
    * @return int
    */
    public int salvarProdutosController(ModelProdutos produtos){
        return this.daoProdutos.salvarProdutosDAO(produtos);
    }

    /**
    * recupera Produtos
    * @param pIdProd
    * @return ModelProdutos
    */
    public ModelProdutos getProdutosController(String pIdProd){
        return this.daoProdutos.getProdutosDAO(pIdProd);
    }

    /**
    * recupera uma lista deProdutos
    * @param pIdProd
    * @return ArrayList
    */
    public ArrayList<ModelProdutos> getListaProdutosController(){
        return this.daoProdutos.getListaProdutosDAO();
    }

    /**
    * atualiza Produtos
    * @param pModelProdutos
    * @return boolean
    */
    public boolean atualizarProdutosController(ModelProdutos produtos){
        return this.daoProdutos.atualizarProdutosDAO(produtos);
    }

    /**
    * exclui Produtos
    * @param pIdProd
    * @return boolean
    */
    public boolean excluirProdutosController(String pIdProd){
        return this.daoProdutos.excluirProdutosDAO(pIdProd);
    }

    public ArrayList<ModelProdutos> getListaProdutosProximosController() {
        return this.daoProdutos.getListaProdutosProximosDAO();
    }

    public ArrayList<ModelProdutos> getListaProdutosVencidosController() {
        return this.daoProdutos.getListaProdutosVencidosDAO();
    }
    
    public ModelProdutos retornaProdutoControllerNome(String pNomeProduto) {
       return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }

    public boolean atualizarProdutosController(ArrayList<ModelProdutos> listaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutosDAO(listaModelProdutos);
    }
}