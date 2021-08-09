package controller;

import model.ModelTaxas;
import DAO.DAOTaxas;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerTaxas {

    private DAOTaxas daoTaxas = new DAOTaxas();

    /**
    * grava Taxas
    * @param pModelTaxas
    * @return int
    */
    public int salvarTaxasController(ModelTaxas pModelTaxas){
        return this.daoTaxas.salvarTaxasDAO(pModelTaxas);
    }

    /**
    * recupera Taxas
    * @param pIdTax
    * @return ModelTaxas
    */
    public ModelTaxas getTaxasController(int pIdTax){
        return this.daoTaxas.getTaxasDAO(pIdTax);
    }

    /**
    * recupera uma lista deTaxas
    * @param pIdTax
    * @return ArrayList
    */
    public ArrayList<ModelTaxas> getListaTaxasController(){
        return this.daoTaxas.getListaTaxasDAO();
    }

    /**
    * atualiza Taxas
    * @param pModelTaxas
    * @return boolean
    */
    public boolean atualizarTaxasController(ModelTaxas pModelTaxas){
        return this.daoTaxas.atualizarTaxasDAO(pModelTaxas);
    }

    /**
    * exclui Taxas
    * @param pIdTax
    * @return boolean
    */
    public boolean excluirTaxasController(int pIdTax){
        return this.daoTaxas.excluirTaxasDAO(pIdTax);
    }
}