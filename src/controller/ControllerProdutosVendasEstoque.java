/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProdutosVendasEstoque;
import java.util.ArrayList;
import model.ModelProdutosVendasEstoque;

/**
 *
 * @author Lucas
 */
public class ControllerProdutosVendasEstoque {
    private DAOProdutosVendasEstoque daoProdutosVendasEstoque = new DAOProdutosVendasEstoque();
    
    public ArrayList<ModelProdutosVendasEstoque> getListaProdutosVendasEstoqueController(int pCodigoVenda) {
        return this.daoProdutosVendasEstoque.getListaProdutosVendasEstoque(pCodigoVenda);
    }
}
