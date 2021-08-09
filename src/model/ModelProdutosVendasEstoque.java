/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lucas
 */
public class ModelProdutosVendasEstoque {
    
    private ModelProdutos modelProdutos;
    private ModelVendasProdutos modelProdutosVenda;

    /**
     * @return the modelProdutos
     */
    public ModelProdutos getModelProdutos() {
        return modelProdutos;
    }

    /**
     * @param modelProdutos the modelProdutos to set
     */
    public void setModelProdutos(ModelProdutos modelProdutos) {
        this.modelProdutos = modelProdutos;
    }

    /**
     * @return the modelProdutosVenda
     */
    public ModelVendasProdutos getModelProdutosVenda() {
        return modelProdutosVenda;
    }

    /**
     * @param modelProdutosVenda the modelProdutosVenda to set
     */
    public void setModelProdutosVenda(ModelVendasProdutos modelProdutosVenda) {
        this.modelProdutosVenda = modelProdutosVenda;
    }
}
