package controller;

import model.ModelVendasParceladas;
import DAO.DAOVendasParceladas;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerVendasParceladas {

    private DAOVendasParceladas daoVendasParceladas = new DAOVendasParceladas();

    /**
    * grava VendasParceladas
    * @param pModelVendasParceladas
    * @return int
    */
    public int salvarVendasParceladasController(ModelVendasParceladas pModelVendasParceladas){
        return this.daoVendasParceladas.salvarVendasParceladasDAO(pModelVendasParceladas);
    }

    /**
    * recupera VendasParceladas
    * @param pIdVendaParcelada
    * @return ModelVendasParceladas
    */
    public ModelVendasParceladas getVendasParceladasController(int pIdVendaParcelada){
        return this.daoVendasParceladas.getVendasParceladasDAO(pIdVendaParcelada);
    }

    /**
    * recupera uma lista deVendasParceladas
    * @param pIdVendaParcelada
    * @return ArrayList
    */
    public ArrayList<ModelVendasParceladas> getListaVendasParceladasController(){
        return this.daoVendasParceladas.getListaVendasParceladasDAO();
    }

    /**
    * atualiza VendasParceladas
    * @param pModelVendasParceladas
    * @return boolean
    */
    public boolean atualizarVendasParceladasController(ModelVendasParceladas pModelVendasParceladas){
        return this.daoVendasParceladas.atualizarVendasParceladasDAO(pModelVendasParceladas);
    }

    /**
    * exclui VendasParceladas
    * @param pIdVendaParcelada
    * @return boolean
    */
    public boolean excluirVendasParceladasController(int pIdVendaParcelada){
        return this.daoVendasParceladas.excluirVendasParceladasDAO(pIdVendaParcelada);
    }
}