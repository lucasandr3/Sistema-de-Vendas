/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;
import model.ModelProdutosVendasEstoque;
import model.ModelVendasProdutos;

/**
 *
 * @author Lucas
 */
public class DAOProdutosVendasEstoque extends ConexaoMySql {

    public ArrayList<ModelProdutosVendasEstoque> getListaProdutosVendasEstoque(int pCodigoVenda) {
        ArrayList<ModelProdutosVendasEstoque> listaModelProdutosVendasEstoque = new ArrayList<>();
        ModelProdutosVendasEstoque modelProdutosVendasEstoque = new ModelProdutosVendasEstoque();
        ModelProdutos modelProdutos = new ModelProdutos();
        ModelVendasProdutos modelProdutosVenda = new ModelVendasProdutos();
        
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM produtos "
                    + "INNER JOIN vendas_produtos ON produtos.id_prod = vendas_produtos.id_produto"
                    + " WHERE vendas_produtos.id_venda = '" + pCodigoVenda + "';");

            while (this.getResultSet().next()) {

                modelProdutosVendasEstoque = new ModelProdutosVendasEstoque();
                modelProdutos = new ModelProdutos();
                modelProdutosVenda = new ModelVendasProdutos();
                
                modelProdutos.setIdProd(this.getResultSet().getInt(1));
                modelProdutos.setNovo_cod(this.getResultSet().getString(2));
                modelProdutos.setNome_prod(this.getResultSet().getString(3));
                modelProdutos.setMarca(this.getResultSet().getString(4));
                modelProdutos.setCategoria(this.getResultSet().getString(5));
                modelProdutos.setUnidade(this.getResultSet().getString(6));
                modelProdutos.setCost(this.getResultSet().getDouble(7));
                modelProdutos.setPreco(this.getResultSet().getDouble(8));
                modelProdutos.setQuantidade(this.getResultSet().getInt(9));
                modelProdutos.setAlert(this.getResultSet().getInt(10));
                modelProdutos.setValidateProd(this.getResultSet().getString(11));
                modelProdutos.setImagem(this.getResultSet().getString(12));
                
                modelProdutosVenda.setIdVendaProdutos(this.getResultSet().getInt(13));
                modelProdutosVenda.setIdVenda(this.getResultSet().getInt(14));
                modelProdutosVenda.setIdProduto(this.getResultSet().getInt(15));
                modelProdutosVenda.setQuantidade(this.getResultSet().getInt(16));
                modelProdutosVenda.setValor(this.getResultSet().getDouble(17));
                modelProdutosVenda.setValorVendido(this.getResultSet().getDouble(18));
                modelProdutosVenda.setCusto(this.getResultSet().getDouble(19));
                
                modelProdutosVendasEstoque.setModelProdutos(modelProdutos);
                modelProdutosVendasEstoque.setModelProdutosVenda(modelProdutosVenda);
                
                listaModelProdutosVendasEstoque.add(modelProdutosVendasEstoque);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return listaModelProdutosVendasEstoque;
    }
    
}
