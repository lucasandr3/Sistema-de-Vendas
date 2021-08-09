/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVendas;
import model.ModelVendasCliente;

/**
 *
 * @author Lucas
 */
public class DAOVendasCliente extends ConexaoMySql {

    public ArrayList<ModelVendasCliente> getListaVendasClientesDAO() {

        ArrayList<ModelVendasCliente> listaModelVendasclientes = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendasCliente modelVendasClientes = new ModelVendasCliente();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM vendas INNER JOIN clients ON vendas.id_cliente = clients.id_cliente"
            );

            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                modelCliente = new ModelCliente();
                modelVendasClientes = new ModelVendasCliente();
                // seta a venda
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setIdVendedor(this.getResultSet().getString(2));
                modelVendas.setIdParceiro(this.getResultSet().getInt(3));
                modelVendas.setIdCliente(this.getResultSet().getInt(4));
                modelVendas.setTotal(this.getResultSet().getFloat(5));
                modelVendas.setTotal_taxa(this.getResultSet().getFloat(6));
                modelVendas.setTaxa(this.getResultSet().getFloat(7));
                modelVendas.setDesconto(this.getResultSet().getFloat(8));
                modelVendas.setObservacao(this.getResultSet().getString(9));
                modelVendas.setDataVenda(this.getResultSet().getString(10));
                modelVendas.setEditada(this.getResultSet().getInt(11));
                modelVendas.setStatusVenda(this.getResultSet().getInt(12));
                // seta o cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(13));
                modelCliente.setName(this.getResultSet().getString(14));
                modelCliente.setEmail(this.getResultSet().getString(15));
                modelCliente.setPhone(this.getResultSet().getString(16));
                modelCliente.setBirthdate(this.getResultSet().getString(17));
                modelCliente.setAddress(this.getResultSet().getString(18));
                modelCliente.setAddressNumber(this.getResultSet().getString(19));
                modelCliente.setAddressNeighb(this.getResultSet().getString(20));
                modelCliente.setAddressCity(this.getResultSet().getString(21));
                modelCliente.setAddressState(this.getResultSet().getString(22));
                modelCliente.setAddressZipcode(this.getResultSet().getString(23));
                modelCliente.setInternalObs(this.getResultSet().getString(24));
                modelCliente.setDateCreate(this.getResultSet().getString(25));
                modelCliente.setStatus(this.getResultSet().getInt(26));

                // seta os model e preenche as lista
                modelVendasClientes.setModelVenda(modelVendas);
                modelVendasClientes.setModelCliente(modelCliente);

                listaModelVendasclientes.add(modelVendasClientes);
            }

        } catch (Exception e) {
        }

        return listaModelVendasclientes;
    }

    public ModelVendasCliente getVendaCliente(int codigoVenda) {
        ModelVendas modelVendas = new ModelVendas();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendasCliente modelVendasClientes = new ModelVendasCliente();

        try {
            this.conectar();
            this.executarSQL(
                "SELECT * FROM vendas INNER JOIN clients ON vendas.id_cliente = clients.id_cliente WHERE vendas.id_venda = "+codigoVenda+""
            );

            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                modelCliente = new ModelCliente();
                modelVendasClientes = new ModelVendasCliente();
                // seta a venda
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setIdVendedor(this.getResultSet().getString(2));
                modelVendas.setIdParceiro(this.getResultSet().getInt(3));
                modelVendas.setIdCliente(this.getResultSet().getInt(4));
                modelVendas.setTotal(this.getResultSet().getFloat(5));
                modelVendas.setTotal_taxa(this.getResultSet().getFloat(6));
                modelVendas.setTaxa(this.getResultSet().getFloat(7));
                modelVendas.setDesconto(this.getResultSet().getFloat(8));
                modelVendas.setObservacao(this.getResultSet().getString(9));
                modelVendas.setDataVenda(this.getResultSet().getString(10));
                modelVendas.setEditada(this.getResultSet().getInt(11));
                modelVendas.setStatusVenda(this.getResultSet().getInt(12));
                // seta o cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(13));
                modelCliente.setName(this.getResultSet().getString(14));
                modelCliente.setEmail(this.getResultSet().getString(15));
                modelCliente.setPhone(this.getResultSet().getString(16));
                modelCliente.setBirthdate(this.getResultSet().getString(17));
                modelCliente.setAddress(this.getResultSet().getString(18));
                modelCliente.setAddressNumber(this.getResultSet().getString(19));
                modelCliente.setAddressNeighb(this.getResultSet().getString(20));
                modelCliente.setAddressCity(this.getResultSet().getString(21));
                modelCliente.setAddressState(this.getResultSet().getString(22));
                modelCliente.setAddressZipcode(this.getResultSet().getString(23));
                modelCliente.setInternalObs(this.getResultSet().getString(24));
                modelCliente.setDateCreate(this.getResultSet().getString(25));
                modelCliente.setStatus(this.getResultSet().getInt(26));

                // seta os model e preenche as lista
                modelVendasClientes.setModelVenda(modelVendas);
                modelVendasClientes.setModelCliente(modelCliente);

            }

        } catch (Exception e) {
        }

        return modelVendasClientes;
    }

}
