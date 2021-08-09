package controller;

import model.ModellistaTaxas;
import DAO.DAOlistaTaxas;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerlistaTaxas {

    private DAOlistaTaxas daolistaTaxas = new DAOlistaTaxas();

    /**
    * grava listaTaxas
    * @param pModellistaTaxas
    * @return int
    */
    public int salvarlistaTaxasController(ModellistaTaxas pModellistaTaxas){
        return this.daolistaTaxas.salvarlistaTaxasDAO(pModellistaTaxas);
    }

    /**
    * recupera listaTaxas
    * @param pId
    * @return ModellistaTaxas
    */
    public ModellistaTaxas getlistaTaxasController(int pId){
        return this.daolistaTaxas.getlistaTaxasDAO(pId);
    }

    /**
    * recupera uma lista delistaTaxas
    * @param pId
    * @return ArrayList
    */
    public ArrayList<ModellistaTaxas> getListalistaTaxasController(){
        return this.daolistaTaxas.getListalistaTaxasDAO();
    }

    /**
    * atualiza listaTaxas
    * @param pModellistaTaxas
    * @return boolean
    */
    public boolean atualizarlistaTaxasController(ModellistaTaxas pModellistaTaxas){
        return this.daolistaTaxas.atualizarlistaTaxasDAO(pModellistaTaxas);
    }

    /**
    * exclui listaTaxas
    * @param pId
    * @return boolean
    */
    public boolean excluirlistaTaxasController(int pId){
        return this.daolistaTaxas.excluirlistaTaxasDAO(pId);
    }

    public ArrayList<ModellistaTaxas> getListalistaTaxasIDController(int idTaxaDetalhes) {
        return this.daolistaTaxas.getListalistaIDTaxasDAO(idTaxaDetalhes);
    }

  
}