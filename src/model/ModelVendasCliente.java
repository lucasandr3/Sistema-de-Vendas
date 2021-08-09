/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class ModelVendasCliente {
    
    private ModelVendas modelVenda;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendasCliente> listaVendasCliente = new ArrayList<>();

    /**
     * @return the modelVenda
     */
    public ModelVendas getModelVenda() {
        return modelVenda;
    }

    /**
     * @param modelVenda the modelVenda to set
     */
    public void setModelVenda(ModelVendas modelVenda) {
        this.modelVenda = modelVenda;
    }

    /**
     * @return the modelCliente
     */
    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the listaVendasCliente
     */
    public ArrayList<ModelVendasCliente> getListaVendasCliente() {
        return listaVendasCliente;
    }

    /**
     * @param listaVendasCliente the listaVendasCliente to set
     */
    public void setListaVendasCliente(ArrayList<ModelVendasCliente> listaVendasCliente) {
        this.listaVendasCliente = listaVendasCliente;
    }
    
}
