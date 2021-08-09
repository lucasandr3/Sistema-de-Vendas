package controller;

import model.ModelFornecedores;
import DAO.DAOFornecedores;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerFornecedores {

    private DAOFornecedores daoFornecedores = new DAOFornecedores();

    /**
    * grava Fornecedores
    * @param pModelFornecedores
    * @return int
    */
    public int salvarFornecedoresController(ModelFornecedores pModelFornecedores){
        return this.daoFornecedores.salvarFornecedoresDAO(pModelFornecedores);
    }

    /**
    * recupera Fornecedores
    * @param pIdFornecedor
    * @return ModelFornecedores
    */
    public ModelFornecedores getFornecedoresController(int pIdFornecedor){
        return this.daoFornecedores.getFornecedoresDAO(pIdFornecedor);
    }

    /**
    * recupera uma lista deFornecedores
    * @param pIdFornecedor
    * @return ArrayList
    */
    public ArrayList<ModelFornecedores> getListaFornecedoresController(){
        return this.daoFornecedores.getListaFornecedoresDAO();
    }

    /**
    * atualiza Fornecedores
    * @param pModelFornecedores
    * @return boolean
    */
    public boolean atualizarFornecedoresController(ModelFornecedores pModelFornecedores){
        return this.daoFornecedores.atualizarFornecedoresDAO(pModelFornecedores);
    }

    /**
    * exclui Fornecedores
    * @param pIdFornecedor
    * @return boolean
    */
    public boolean excluirFornecedoresController(int pIdFornecedor){
        return this.daoFornecedores.excluirFornecedoresDAO(pIdFornecedor);
    }

    public ArrayList<ModelFornecedores> getListaClienteInativosController() {
        return this.daoFornecedores.getListaFornecedoresInativosDAO();
    }
}