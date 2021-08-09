package controller;

import model.ModelVendasProdutos;
import DAO.DAOVendasProdutos;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerVendasProdutos {

    private DAOVendasProdutos daoVendasProdutos = new DAOVendasProdutos();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * @return int
    */
    public int salvarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pIdVendaProdutos
    * @return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosController(int pIdVendaProdutos){
        return this.daoVendasProdutos.getVendasProdutosDAO(pIdVendaProdutos);
    }

    /**
    * recupera uma lista deVendasProdutos
    * @param pIdVendaProdutos
    * @return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pIdVendaProdutos
    * @return boolean
    */
    public boolean excluirVendasProdutosController(int pIdVendaProdutos){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pIdVendaProdutos);
    }

    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> listaVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(listaVendasProdutos);
    }


}