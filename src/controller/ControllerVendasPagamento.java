package controller;

import model.ModelVendasPagamento;
import DAO.DAOVendasPagamento;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerVendasPagamento {

    private DAOVendasPagamento daoVendasPagamento = new DAOVendasPagamento();

    /**
    * grava VendasPagamento
    * @param pModelVendasPagamento
    * @return int
    */
    public int salvarVendasPagamentoController(ModelVendasPagamento pModelVendasPagamento){
        return this.daoVendasPagamento.salvarVendasPagamentoDAO(pModelVendasPagamento);
    }

    /**
    * recupera VendasPagamento
    * @param pIdVendaPagamento
    * @return ModelVendasPagamento
    */
    public ModelVendasPagamento getVendasPagamentoController(int pIdVendaPagamento){
        return this.daoVendasPagamento.getVendasPagamentoDAO(pIdVendaPagamento);
    }

    /**
    * recupera uma lista deVendasPagamento
    * @param pIdVendaPagamento
    * @return ArrayList
    */
    public ArrayList<ModelVendasPagamento> getListaVendasPagamentoController(){
        return this.daoVendasPagamento.getListaVendasPagamentoDAO();
    }

    /**
    * atualiza VendasPagamento
    * @param pModelVendasPagamento
    * @return boolean
    */
    public boolean atualizarVendasPagamentoController(ModelVendasPagamento pModelVendasPagamento){
        return this.daoVendasPagamento.atualizarVendasPagamentoDAO(pModelVendasPagamento);
    }

    /**
    * exclui VendasPagamento
    * @param pIdVendaPagamento
    * @return boolean
    */
    public boolean excluirVendasPagamentoController(int pIdVendaPagamento){
        return this.daoVendasPagamento.excluirVendasPagamentoDAO(pIdVendaPagamento);
    }
}