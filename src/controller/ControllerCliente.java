package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pIdCliente
    * @return ModelCliente
    */
    public ModelCliente getClienteController(int pIdCliente){
        return this.daoCliente.getClienteDAO(pIdCliente);
    }

    /**
    * recupera uma lista deCliente
    * @param pIdCliente
    * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pIdCliente
    * @return boolean
    */
    public boolean excluirClienteController(int pIdCliente){
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }

    public boolean desativarClienteController(int codigoCliente) {
        return this.daoCliente.desativarClienteDAO(codigoCliente);
    }

    public ArrayList<ModelCliente> getListaClienteInativosController() {
        return this.daoCliente.getListaClienteInativosDAO();
    }

    public boolean ativarClienteController(int codigoCliente) {
        return this.daoCliente.ativarClienteDAO(codigoCliente);
    }
    
    /**
    * recupera Cliente
    * @param pClienteNome
    * @return ModelCliente
    */
    public ModelCliente getClienteControllerNome(String pClienteNome){
        return this.daoCliente.getClienteNomeDAO(pClienteNome);
    }
}