package DAO;

import model.ModelVendasPagamento;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOVendasPagamento extends ConexaoMySql {

    /**
    * grava VendasPagamento
    * @param pModelVendasPagamento
    * @return int
    */
    public int salvarVendasPagamentoDAO(ModelVendasPagamento pModelVendasPagamento){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO vendas_pagamento ("
//                    + "id_venda_pagamento,"
                    + "id_venda,"
                    + "dinheiro,"
                    + "cartao_credito_loja_hist,"
                    + "cartao_credito_loja,"
                    + "taxa_credito_loja,"
                    + "parcela_credito_loja,"
                    + "bandeira_cartao_loja,"
                    + "cartao_credito2_loja_hist,"
                    + "cartao_credito2_loja,"
                    + "taxa_credito2_loja,"
                    + "parcela_credito2_loja,"
                    + "bandeira_credito2_loja,"
                    + "cartao_debito_loja_hist,"
                    + "cartao_debito_loja,"
                    + "taxa_debito_loja,"
                    + "bandeira_debito_loja,"
                    + "cartao_debito2_loja_hist,"
                    + "cartao_debito2_loja,"
                    + "taxa_debito2_loja,"
                    + "bandeira_debito2_loja,"
                    + "cartao_credito_parceiro_hist,"
                    + "cartao_credito_parceiro,"
                    + "cartao_credito2_parceiro_hist,"
                    + "cartao_credito2_parceiro,"
                    + "cartao_debito_parceiro_hist,"
                    + "cartao_debito_parceiro,"
                    + "cartao_debito2_parceiro_hist,"
                    + "cartao_debito2_parceiro,"
                    + "pix,"
                    + "picpay_hist,"
                    + "picpay,"
                    + "taxa_picpay,"
                    + "parcela_picpay,"
                    + "crediario_loja,"
                    + "parcela_crediario_loja,"
                    + "juros_crediario_loja"
                + ") VALUES ("
//                    + "'" + pModelVendasPagamento.getIdVendaPagamento() + "',"
                    + "'" + pModelVendasPagamento.getIdVenda() + "',"
                    + "'" + pModelVendasPagamento.getDinheiro() + "',"
                    + "'" + pModelVendasPagamento.getCartaoCreditoLojaHist() + "',"
                    + "'" + pModelVendasPagamento.getCartaoCreditoLoja() + "',"
                    + "'" + pModelVendasPagamento.getTaxaCreditoLoja() + "',"
                    + "'" + pModelVendasPagamento.getParcelaCreditoLoja() + "',"
                    + "'" + pModelVendasPagamento.getBandeiraCreditoLoja() + "',"
                    + "'" + pModelVendasPagamento.getCartaoCredito2LojaHist() + "',"
                    + "'" + pModelVendasPagamento.getCartaoCredito2Loja() + "',"
                    + "'" + pModelVendasPagamento.getTaxaCredito2Loja() + "',"
                    + "'" + pModelVendasPagamento.getParcelaCredito2Loja() + "',"
                    + "'" + pModelVendasPagamento.getBandeiraCredito2Loja() + "',"
                    + "'" + pModelVendasPagamento.getCartaoDebitoLojaHist() + "',"
                    + "'" + pModelVendasPagamento.getCartaoDebitoLoja() + "',"
                    + "'" + pModelVendasPagamento.getTaxaDebitoLoja() + "',"
                    + "'" + pModelVendasPagamento.getBandeiraDebitoLoja() + "',"
                    + "'" + pModelVendasPagamento.getCartaoDebito2LojaHist() + "',"
                    + "'" + pModelVendasPagamento.getCartaoDebito2Loja() + "',"
                    + "'" + pModelVendasPagamento.getTaxaDebito2Loja() + "',"
                    + "'" + pModelVendasPagamento.getBandeiraDebito2Loja() + "',"
                    + "'" + pModelVendasPagamento.getCartaoCreditoParceiroHist() + "',"
                    + "'" + pModelVendasPagamento.getCartaoCreditoParceiro() + "',"
                    + "'" + pModelVendasPagamento.getCartaoCredito2ParceiroHist() + "',"
                    + "'" + pModelVendasPagamento.getCartaoCredito2Parceiro() + "',"
                    + "'" + pModelVendasPagamento.getCartaoDebitoParceiroHist() + "',"
                    + "'" + pModelVendasPagamento.getCartaoDebitoParceiro() + "',"
                    + "'" + pModelVendasPagamento.getCartaoDebito2ParceiroHist() + "',"
                    + "'" + pModelVendasPagamento.getCartaoDebito2Parceiro() + "',"
                    + "'" + pModelVendasPagamento.getPix() + "',"
                    + "'" + pModelVendasPagamento.getPicpayHist() + "',"
                    + "'" + pModelVendasPagamento.getPicpay() + "',"
                    + "'" + pModelVendasPagamento.getTaxaPicpay() + "',"
                    + "'" + pModelVendasPagamento.getParcelaPicPay() + "',"
                    + "'" + pModelVendasPagamento.getCrediarioLoja() + "',"
                    + "'" + pModelVendasPagamento.getParcelaCrediarioLoja() + "',"
                    + "'" + pModelVendasPagamento.getJurosCrediarioLoja() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera VendasPagamento
    * @param pIdVendaPagamento
    * @return ModelVendasPagamento
    */
    public ModelVendasPagamento getVendasPagamentoDAO(int pIdVendaPagamento){
        ModelVendasPagamento modelVendasPagamento = new ModelVendasPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda_pagamento,"
                    + "id_venda,"
                    + "dinheiro,"
                    + "cartao_credito_loja_hist,"
                    + "cartao_credito_loja,"
                    + "taxa_credito_loja,"
                    + "parcela_credito_loja,"
                    + "bandeira_credito_loja,"
                    + "cartao_credito_2_loja_hist,"
                    + "cartao_credito_2_loja,"
                    + "taxa_credito_2_loja,"
                    + "parcela_credito_2_loja,"
                    + "bandeira_credito_2_loja,"
                    + "cartao_debito_loja_hist,"
                    + "cartao_debito_loja,"
                    + "taxa_debito_loja,"
                    + "bandeira_debito_loja,"
                    + "cartao_debito_2_loja_hist,"
                    + "cartao_debito_2_loja,"
                    + "taxa_debito_2_loja,"
                    + "bandeira_debito_2_loja,"
                    + "cartao_credito_parceiro_hist,"
                    + "cartao_credito_parceiro,"
                    + "cartao_credito_2_parceiro_hist,"
                    + "cartao_credito_2_parceiro,"
                    + "cartao_debito_parceiro_hist,"
                    + "cartao_debito_parceiro,"
                    + "cartao_debito_2_parceiro_hist,"
                    + "cartao_debito_2_parceiro,"
                    + "pix,"
                    + "picpay_hist,"
                    + "picpay,"
                    + "taxa_picpay,"
                    + "parcela_pic_pay,"
                    + "crediario_loja,"
                    + "parcela_crediario_loja,"
                    + "juros_crediario_loja"
                 + " FROM"
                     + " vendas_pagamento"
                 + " WHERE"
                     + " id_venda_pagamento = '" + pIdVendaPagamento + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasPagamento.setIdVendaPagamento(this.getResultSet().getInt(1));
                modelVendasPagamento.setIdVenda(this.getResultSet().getInt(2));
                modelVendasPagamento.setDinheiro(this.getResultSet().getString(3));
                modelVendasPagamento.setCartaoCreditoLojaHist(this.getResultSet().getString(4));
                modelVendasPagamento.setCartaoCreditoLoja(this.getResultSet().getString(5));
                modelVendasPagamento.setTaxaCreditoLoja(this.getResultSet().getString(6));
                modelVendasPagamento.setParcelaCreditoLoja(this.getResultSet().getString(7));
                modelVendasPagamento.setBandeiraCreditoLoja(this.getResultSet().getString(8));
                modelVendasPagamento.setCartaoCredito2LojaHist(this.getResultSet().getString(9));
                modelVendasPagamento.setCartaoCredito2Loja(this.getResultSet().getString(10));
                modelVendasPagamento.setTaxaCredito2Loja(this.getResultSet().getString(11));
                modelVendasPagamento.setParcelaCredito2Loja(this.getResultSet().getString(12));
                modelVendasPagamento.setBandeiraCredito2Loja(this.getResultSet().getString(13));
                modelVendasPagamento.setCartaoDebitoLojaHist(this.getResultSet().getString(14));
                modelVendasPagamento.setCartaoDebitoLoja(this.getResultSet().getString(15));
                modelVendasPagamento.setTaxaDebitoLoja(this.getResultSet().getString(16));
                modelVendasPagamento.setBandeiraDebitoLoja(this.getResultSet().getString(17));
                modelVendasPagamento.setCartaoDebito2LojaHist(this.getResultSet().getString(18));
                modelVendasPagamento.setCartaoDebito2Loja(this.getResultSet().getString(19));
                modelVendasPagamento.setTaxaDebito2Loja(this.getResultSet().getString(20));
                modelVendasPagamento.setBandeiraDebito2Loja(this.getResultSet().getString(21));
                modelVendasPagamento.setCartaoCreditoParceiroHist(this.getResultSet().getString(22));
                modelVendasPagamento.setCartaoCreditoParceiro(this.getResultSet().getString(23));
                modelVendasPagamento.setCartaoCredito2ParceiroHist(this.getResultSet().getString(24));
                modelVendasPagamento.setCartaoCredito2Parceiro(this.getResultSet().getString(25));
                modelVendasPagamento.setCartaoDebitoParceiroHist(this.getResultSet().getString(26));
                modelVendasPagamento.setCartaoDebitoParceiro(this.getResultSet().getString(27));
                modelVendasPagamento.setCartaoDebito2ParceiroHist(this.getResultSet().getString(28));
                modelVendasPagamento.setCartaoDebito2Parceiro(this.getResultSet().getString(29));
                modelVendasPagamento.setPix(this.getResultSet().getString(30));
                modelVendasPagamento.setPicpayHist(this.getResultSet().getString(31));
                modelVendasPagamento.setPicpay(this.getResultSet().getString(32));
                modelVendasPagamento.setTaxaPicpay(this.getResultSet().getString(33));
                modelVendasPagamento.setParcelaPicPay(this.getResultSet().getString(34));
                modelVendasPagamento.setCrediarioLoja(this.getResultSet().getString(35));
                modelVendasPagamento.setParcelaCrediarioLoja(this.getResultSet().getString(36));
                modelVendasPagamento.setJurosCrediarioLoja(this.getResultSet().getString(37));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasPagamento;
    }

    /**
    * recupera uma lista de VendasPagamento
        * @return ArrayList
    */
    public ArrayList<ModelVendasPagamento> getListaVendasPagamentoDAO(){
        ArrayList<ModelVendasPagamento> listamodelVendasPagamento = new ArrayList();
        ModelVendasPagamento modelVendasPagamento = new ModelVendasPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda_pagamento,"
                    + "id_venda,"
                    + "dinheiro,"
                    + "cartao_credito_loja_hist,"
                    + "cartao_credito_loja,"
                    + "taxa_credito_loja,"
                    + "parcela_credito_loja,"
                    + "bandeira_credito_loja,"
                    + "cartao_credito_2_loja_hist,"
                    + "cartao_credito_2_loja,"
                    + "taxa_credito_2_loja,"
                    + "parcela_credito_2_loja,"
                    + "bandeira_credito_2_loja,"
                    + "cartao_debito_loja_hist,"
                    + "cartao_debito_loja,"
                    + "taxa_debito_loja,"
                    + "bandeira_debito_loja,"
                    + "cartao_debito_2_loja_hist,"
                    + "cartao_debito_2_loja,"
                    + "taxa_debito_2_loja,"
                    + "bandeira_debito_2_loja,"
                    + "cartao_credito_parceiro_hist,"
                    + "cartao_credito_parceiro,"
                    + "cartao_credito_2_parceiro_hist,"
                    + "cartao_credito_2_parceiro,"
                    + "cartao_debito_parceiro_hist,"
                    + "cartao_debito_parceiro,"
                    + "cartao_debito_2_parceiro_hist,"
                    + "cartao_debito_2_parceiro,"
                    + "pix,"
                    + "picpay_hist,"
                    + "picpay,"
                    + "taxa_picpay,"
                    + "parcela_pic_pay,"
                    + "crediario_loja,"
                    + "parcela_crediario_loja,"
                    + "juros_crediario_loja"
                 + " FROM"
                     + " vendas_pagamento"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasPagamento = new ModelVendasPagamento();
                modelVendasPagamento.setIdVendaPagamento(this.getResultSet().getInt(1));
                modelVendasPagamento.setIdVenda(this.getResultSet().getInt(2));
                modelVendasPagamento.setDinheiro(this.getResultSet().getString(3));
                modelVendasPagamento.setCartaoCreditoLojaHist(this.getResultSet().getString(4));
                modelVendasPagamento.setCartaoCreditoLoja(this.getResultSet().getString(5));
                modelVendasPagamento.setTaxaCreditoLoja(this.getResultSet().getString(6));
                modelVendasPagamento.setParcelaCreditoLoja(this.getResultSet().getString(7));
                modelVendasPagamento.setBandeiraCreditoLoja(this.getResultSet().getString(8));
                modelVendasPagamento.setCartaoCredito2LojaHist(this.getResultSet().getString(9));
                modelVendasPagamento.setCartaoCredito2Loja(this.getResultSet().getString(10));
                modelVendasPagamento.setTaxaCredito2Loja(this.getResultSet().getString(11));
                modelVendasPagamento.setParcelaCredito2Loja(this.getResultSet().getString(12));
                modelVendasPagamento.setBandeiraCredito2Loja(this.getResultSet().getString(13));
                modelVendasPagamento.setCartaoDebitoLojaHist(this.getResultSet().getString(14));
                modelVendasPagamento.setCartaoDebitoLoja(this.getResultSet().getString(15));
                modelVendasPagamento.setTaxaDebitoLoja(this.getResultSet().getString(16));
                modelVendasPagamento.setBandeiraDebitoLoja(this.getResultSet().getString(17));
                modelVendasPagamento.setCartaoDebito2LojaHist(this.getResultSet().getString(18));
                modelVendasPagamento.setCartaoDebito2Loja(this.getResultSet().getString(19));
                modelVendasPagamento.setTaxaDebito2Loja(this.getResultSet().getString(20));
                modelVendasPagamento.setBandeiraDebito2Loja(this.getResultSet().getString(21));
                modelVendasPagamento.setCartaoCreditoParceiroHist(this.getResultSet().getString(22));
                modelVendasPagamento.setCartaoCreditoParceiro(this.getResultSet().getString(23));
                modelVendasPagamento.setCartaoCredito2ParceiroHist(this.getResultSet().getString(24));
                modelVendasPagamento.setCartaoCredito2Parceiro(this.getResultSet().getString(25));
                modelVendasPagamento.setCartaoDebitoParceiroHist(this.getResultSet().getString(26));
                modelVendasPagamento.setCartaoDebitoParceiro(this.getResultSet().getString(27));
                modelVendasPagamento.setCartaoDebito2ParceiroHist(this.getResultSet().getString(28));
                modelVendasPagamento.setCartaoDebito2Parceiro(this.getResultSet().getString(29));
                modelVendasPagamento.setPix(this.getResultSet().getString(30));
                modelVendasPagamento.setPicpayHist(this.getResultSet().getString(31));
                modelVendasPagamento.setPicpay(this.getResultSet().getString(32));
                modelVendasPagamento.setTaxaPicpay(this.getResultSet().getString(33));
                modelVendasPagamento.setParcelaPicPay(this.getResultSet().getString(34));
                modelVendasPagamento.setCrediarioLoja(this.getResultSet().getString(35));
                modelVendasPagamento.setParcelaCrediarioLoja(this.getResultSet().getString(36));
                modelVendasPagamento.setJurosCrediarioLoja(this.getResultSet().getString(37));
                listamodelVendasPagamento.add(modelVendasPagamento);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasPagamento;
    }

    /**
    * atualiza VendasPagamento
    * @param pModelVendasPagamento
    * @return boolean
    */
    public boolean atualizarVendasPagamentoDAO(ModelVendasPagamento pModelVendasPagamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE vendas_pagamento SET "
                    + "id_venda_pagamento = '" + pModelVendasPagamento.getIdVendaPagamento() + "',"
                    + "id_venda = '" + pModelVendasPagamento.getIdVenda() + "',"
                    + "dinheiro = '" + pModelVendasPagamento.getDinheiro() + "',"
                    + "cartao_credito_loja_hist = '" + pModelVendasPagamento.getCartaoCreditoLojaHist() + "',"
                    + "cartao_credito_loja = '" + pModelVendasPagamento.getCartaoCreditoLoja() + "',"
                    + "taxa_credito_loja = '" + pModelVendasPagamento.getTaxaCreditoLoja() + "',"
                    + "parcela_credito_loja = '" + pModelVendasPagamento.getParcelaCreditoLoja() + "',"
                    + "bandeira_credito_loja = '" + pModelVendasPagamento.getBandeiraCreditoLoja() + "',"
                    + "cartao_credito_2_loja_hist = '" + pModelVendasPagamento.getCartaoCredito2LojaHist() + "',"
                    + "cartao_credito_2_loja = '" + pModelVendasPagamento.getCartaoCredito2Loja() + "',"
                    + "taxa_credito_2_loja = '" + pModelVendasPagamento.getTaxaCredito2Loja() + "',"
                    + "parcela_credito_2_loja = '" + pModelVendasPagamento.getParcelaCredito2Loja() + "',"
                    + "bandeira_credito_2_loja = '" + pModelVendasPagamento.getBandeiraCredito2Loja() + "',"
                    + "cartao_debito_loja_hist = '" + pModelVendasPagamento.getCartaoDebitoLojaHist() + "',"
                    + "cartao_debito_loja = '" + pModelVendasPagamento.getCartaoDebitoLoja() + "',"
                    + "taxa_debito_loja = '" + pModelVendasPagamento.getTaxaDebitoLoja() + "',"
                    + "bandeira_debito_loja = '" + pModelVendasPagamento.getBandeiraDebitoLoja() + "',"
                    + "cartao_debito_2_loja_hist = '" + pModelVendasPagamento.getCartaoDebito2LojaHist() + "',"
                    + "cartao_debito_2_loja = '" + pModelVendasPagamento.getCartaoDebito2Loja() + "',"
                    + "taxa_debito_2_loja = '" + pModelVendasPagamento.getTaxaDebito2Loja() + "',"
                    + "bandeira_debito_2_loja = '" + pModelVendasPagamento.getBandeiraDebito2Loja() + "',"
                    + "cartao_credito_parceiro_hist = '" + pModelVendasPagamento.getCartaoCreditoParceiroHist() + "',"
                    + "cartao_credito_parceiro = '" + pModelVendasPagamento.getCartaoCreditoParceiro() + "',"
                    + "cartao_credito_2_parceiro_hist = '" + pModelVendasPagamento.getCartaoCredito2ParceiroHist() + "',"
                    + "cartao_credito_2_parceiro = '" + pModelVendasPagamento.getCartaoCredito2Parceiro() + "',"
                    + "cartao_debito_parceiro_hist = '" + pModelVendasPagamento.getCartaoDebitoParceiroHist() + "',"
                    + "cartao_debito_parceiro = '" + pModelVendasPagamento.getCartaoDebitoParceiro() + "',"
                    + "cartao_debito_2_parceiro_hist = '" + pModelVendasPagamento.getCartaoDebito2ParceiroHist() + "',"
                    + "cartao_debito_2_parceiro = '" + pModelVendasPagamento.getCartaoDebito2Parceiro() + "',"
                    + "pix = '" + pModelVendasPagamento.getPix() + "',"
                    + "picpay_hist = '" + pModelVendasPagamento.getPicpayHist() + "',"
                    + "picpay = '" + pModelVendasPagamento.getPicpay() + "',"
                    + "taxa_picpay = '" + pModelVendasPagamento.getTaxaPicpay() + "',"
                    + "parcela_pic_pay = '" + pModelVendasPagamento.getParcelaPicPay() + "',"
                    + "crediario_loja = '" + pModelVendasPagamento.getCrediarioLoja() + "',"
                    + "parcela_crediario_loja = '" + pModelVendasPagamento.getParcelaCrediarioLoja() + "',"
                    + "juros_crediario_loja = '" + pModelVendasPagamento.getJurosCrediarioLoja() + "'"
                + " WHERE "
                    + "id_venda_pagamento = '" + pModelVendasPagamento.getIdVendaPagamento() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui VendasPagamento
    * @param pIdVendaPagamento
    * @return boolean
    */
    public boolean excluirVendasPagamentoDAO(int pIdVendaPagamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM vendas_pagamento "
                + " WHERE "
                    + "id_venda_pagamento = '" + pIdVendaPagamento + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}