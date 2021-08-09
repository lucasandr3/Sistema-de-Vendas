/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOVendasCliente;
import java.util.ArrayList;
import model.ModelVendasCliente;

/**
 *
 * @author Lucas
 */
public class ControllerVendasCliente {
    private DAOVendasCliente daoVendasCliente = new DAOVendasCliente();

    public ArrayList<ModelVendasCliente> getListaVendasClienteController() {
        return this.daoVendasCliente.getListaVendasClientesDAO();
    }

    public ModelVendasCliente getVendaCliente(int codigoVenda) {
        return this.daoVendasCliente.getVendaCliente(codigoVenda);
    }

}
