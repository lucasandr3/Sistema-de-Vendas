package model;
/**
*
* @author Lucas Vieira
*/
public class ModelVendasPagamento {

    private int idVendaPagamento;
    private int idVenda;
    private String dinheiro;
    private String cartaoCreditoLojaHist;
    private String cartaoCreditoLoja;
    private String taxaCreditoLoja;
    private String parcelaCreditoLoja;
    private String bandeiraCreditoLoja;
    private String cartaoCredito2LojaHist;
    private String cartaoCredito2Loja;
    private String taxaCredito2Loja;
    private String parcelaCredito2Loja;
    private String bandeiraCredito2Loja;
    private String cartaoDebitoLojaHist;
    private String cartaoDebitoLoja;
    private String taxaDebitoLoja;
    private String bandeiraDebitoLoja;
    private String cartaoDebito2LojaHist;
    private String cartaoDebito2Loja;
    private String taxaDebito2Loja;
    private String bandeiraDebito2Loja;
    private String cartaoCreditoParceiroHist;
    private String cartaoCreditoParceiro;
    private String cartaoCredito2ParceiroHist;
    private String cartaoCredito2Parceiro;
    private String cartaoDebitoParceiroHist;
    private String cartaoDebitoParceiro;
    private String cartaoDebito2ParceiroHist;
    private String cartaoDebito2Parceiro;
    private String pix;
    private String picpayHist;
    private String picpay;
    private String taxaPicpay;
    private String parcelaPicPay;
    private String crediarioLoja;
    private String parcelaCrediarioLoja;
    private String jurosCrediarioLoja;

    /**
    * Construtor
    */
    public ModelVendasPagamento(){}

    /**
    * seta o valor de idVendaPagamento
    * @param pIdVendaPagamento
    */
    public void setIdVendaPagamento(int pIdVendaPagamento){
        this.idVendaPagamento = pIdVendaPagamento;
    }
    /**
    * @return idVendaPagamento
    */
    public int getIdVendaPagamento(){
        return this.idVendaPagamento;
    }

    /**
    * seta o valor de idVenda
    * @param pIdVenda
    */
    public void setIdVenda(int pIdVenda){
        this.idVenda = pIdVenda;
    }
    /**
    * @return idVenda
    */
    public int getIdVenda(){
        return this.idVenda;
    }

    /**
    * seta o valor de dinheiro
    * @param pDinheiro
    */
    public void setDinheiro(String pDinheiro){
        this.dinheiro = pDinheiro;
    }
    /**
    * @return dinheiro
    */
    public String getDinheiro(){
        return this.dinheiro;
    }

    /**
    * seta o valor de cartaoCreditoLojaHist
    * @param pCartaoCreditoLojaHist
    */
    public void setCartaoCreditoLojaHist(String pCartaoCreditoLojaHist){
        this.cartaoCreditoLojaHist = pCartaoCreditoLojaHist;
    }
    /**
    * @return cartaoCreditoLojaHist
    */
    public String getCartaoCreditoLojaHist(){
        return this.cartaoCreditoLojaHist;
    }

    /**
    * seta o valor de cartaoCreditoLoja
    * @param pCartaoCreditoLoja
    */
    public void setCartaoCreditoLoja(String pCartaoCreditoLoja){
        this.cartaoCreditoLoja = pCartaoCreditoLoja;
    }
    /**
    * @return cartaoCreditoLoja
    */
    public String getCartaoCreditoLoja(){
        return this.cartaoCreditoLoja;
    }

    /**
    * seta o valor de taxaCreditoLoja
    * @param pTaxaCreditoLoja
    */
    public void setTaxaCreditoLoja(String pTaxaCreditoLoja){
        this.taxaCreditoLoja = pTaxaCreditoLoja;
    }
    /**
    * @return taxaCreditoLoja
    */
    public String getTaxaCreditoLoja(){
        return this.taxaCreditoLoja;
    }

    /**
    * seta o valor de parcelaCreditoLoja
    * @param pParcelaCreditoLoja
    */
    public void setParcelaCreditoLoja(String pParcelaCreditoLoja){
        this.parcelaCreditoLoja = pParcelaCreditoLoja;
    }
    /**
    * @return parcelaCreditoLoja
    */
    public String getParcelaCreditoLoja(){
        return this.parcelaCreditoLoja;
    }

    /**
    * seta o valor de bandeiraCreditoLoja
    * @param pBandeiraCreditoLoja
    */
    public void setBandeiraCreditoLoja(String pBandeiraCreditoLoja){
        this.bandeiraCreditoLoja = pBandeiraCreditoLoja;
    }
    /**
    * @return bandeiraCreditoLoja
    */
    public String getBandeiraCreditoLoja(){
        return this.bandeiraCreditoLoja;
    }

    /**
    * seta o valor de cartaoCredito2LojaHist
    * @param pCartaoCredito2LojaHist
    */
    public void setCartaoCredito2LojaHist(String pCartaoCredito2LojaHist){
        this.cartaoCredito2LojaHist = pCartaoCredito2LojaHist;
    }
    /**
    * @return cartaoCredito2LojaHist
    */
    public String getCartaoCredito2LojaHist(){
        return this.cartaoCredito2LojaHist;
    }

    /**
    * seta o valor de cartaoCredito2Loja
    * @param pCartaoCredito2Loja
    */
    public void setCartaoCredito2Loja(String pCartaoCredito2Loja){
        this.cartaoCredito2Loja = pCartaoCredito2Loja;
    }
    /**
    * @return cartaoCredito2Loja
    */
    public String getCartaoCredito2Loja(){
        return this.cartaoCredito2Loja;
    }

    /**
    * seta o valor de taxaCredito2Loja
    * @param pTaxaCredito2Loja
    */
    public void setTaxaCredito2Loja(String pTaxaCredito2Loja){
        this.taxaCredito2Loja = pTaxaCredito2Loja;
    }
    /**
    * @return taxaCredito2Loja
    */
    public String getTaxaCredito2Loja(){
        return this.taxaCredito2Loja;
    }

    /**
    * seta o valor de parcelaCredito2Loja
    * @param pParcelaCredito2Loja
    */
    public void setParcelaCredito2Loja(String pParcelaCredito2Loja){
        this.parcelaCredito2Loja = pParcelaCredito2Loja;
    }
    /**
    * @return parcelaCredito2Loja
    */
    public String getParcelaCredito2Loja(){
        return this.parcelaCredito2Loja;
    }

    /**
    * seta o valor de bandeiraCredito2Loja
    * @param pBandeiraCredito2Loja
    */
    public void setBandeiraCredito2Loja(String pBandeiraCredito2Loja){
        this.bandeiraCredito2Loja = pBandeiraCredito2Loja;
    }
    /**
    * @return bandeiraCredito2Loja
    */
    public String getBandeiraCredito2Loja(){
        return this.bandeiraCredito2Loja;
    }

    /**
    * seta o valor de cartaoDebitoLojaHist
    * @param pCartaoDebitoLojaHist
    */
    public void setCartaoDebitoLojaHist(String pCartaoDebitoLojaHist){
        this.cartaoDebitoLojaHist = pCartaoDebitoLojaHist;
    }
    /**
    * @return cartaoDebitoLojaHist
    */
    public String getCartaoDebitoLojaHist(){
        return this.cartaoDebitoLojaHist;
    }

    /**
    * seta o valor de cartaoDebitoLoja
    * @param pCartaoDebitoLoja
    */
    public void setCartaoDebitoLoja(String pCartaoDebitoLoja){
        this.cartaoDebitoLoja = pCartaoDebitoLoja;
    }
    /**
    * @return cartaoDebitoLoja
    */
    public String getCartaoDebitoLoja(){
        return this.cartaoDebitoLoja;
    }

    /**
    * seta o valor de taxaDebitoLoja
    * @param pTaxaDebitoLoja
    */
    public void setTaxaDebitoLoja(String pTaxaDebitoLoja){
        this.taxaDebitoLoja = pTaxaDebitoLoja;
    }
    /**
    * @return taxaDebitoLoja
    */
    public String getTaxaDebitoLoja(){
        return this.taxaDebitoLoja;
    }

    /**
    * seta o valor de bandeiraDebitoLoja
    * @param pBandeiraDebitoLoja
    */
    public void setBandeiraDebitoLoja(String pBandeiraDebitoLoja){
        this.bandeiraDebitoLoja = pBandeiraDebitoLoja;
    }
    /**
    * @return bandeiraDebitoLoja
    */
    public String getBandeiraDebitoLoja(){
        return this.bandeiraDebitoLoja;
    }

    /**
    * seta o valor de cartaoDebito2LojaHist
    * @param pCartaoDebito2LojaHist
    */
    public void setCartaoDebito2LojaHist(String pCartaoDebito2LojaHist){
        this.cartaoDebito2LojaHist = pCartaoDebito2LojaHist;
    }
    /**
    * @return cartaoDebito2LojaHist
    */
    public String getCartaoDebito2LojaHist(){
        return this.cartaoDebito2LojaHist;
    }

    /**
    * seta o valor de cartaoDebito2Loja
    * @param pCartaoDebito2Loja
    */
    public void setCartaoDebito2Loja(String pCartaoDebito2Loja){
        this.cartaoDebito2Loja = pCartaoDebito2Loja;
    }
    /**
    * @return cartaoDebito2Loja
    */
    public String getCartaoDebito2Loja(){
        return this.cartaoDebito2Loja;
    }

    /**
    * seta o valor de taxaDebito2Loja
    * @param pTaxaDebito2Loja
    */
    public void setTaxaDebito2Loja(String pTaxaDebito2Loja){
        this.taxaDebito2Loja = pTaxaDebito2Loja;
    }
    /**
    * @return taxaDebito2Loja
    */
    public String getTaxaDebito2Loja(){
        return this.taxaDebito2Loja;
    }

    /**
    * seta o valor de bandeiraDebito2Loja
    * @param pBandeiraDebito2Loja
    */
    public void setBandeiraDebito2Loja(String pBandeiraDebito2Loja){
        this.bandeiraDebito2Loja = pBandeiraDebito2Loja;
    }
    /**
    * @return bandeiraDebito2Loja
    */
    public String getBandeiraDebito2Loja(){
        return this.bandeiraDebito2Loja;
    }

    /**
    * seta o valor de cartaoCreditoParceiroHist
    * @param pCartaoCreditoParceiroHist
    */
    public void setCartaoCreditoParceiroHist(String pCartaoCreditoParceiroHist){
        this.cartaoCreditoParceiroHist = pCartaoCreditoParceiroHist;
    }
    /**
    * @return cartaoCreditoParceiroHist
    */
    public String getCartaoCreditoParceiroHist(){
        return this.cartaoCreditoParceiroHist;
    }

    /**
    * seta o valor de cartaoCreditoParceiro
    * @param pCartaoCreditoParceiro
    */
    public void setCartaoCreditoParceiro(String pCartaoCreditoParceiro){
        this.cartaoCreditoParceiro = pCartaoCreditoParceiro;
    }
    /**
    * @return cartaoCreditoParceiro
    */
    public String getCartaoCreditoParceiro(){
        return this.cartaoCreditoParceiro;
    }

    /**
    * seta o valor de cartaoCredito2ParceiroHist
    * @param pCartaoCredito2ParceiroHist
    */
    public void setCartaoCredito2ParceiroHist(String pCartaoCredito2ParceiroHist){
        this.cartaoCredito2ParceiroHist = pCartaoCredito2ParceiroHist;
    }
    /**
    * @return cartaoCredito2ParceiroHist
    */
    public String getCartaoCredito2ParceiroHist(){
        return this.cartaoCredito2ParceiroHist;
    }

    /**
    * seta o valor de cartaoCredito2Parceiro
    * @param pCartaoCredito2Parceiro
    */
    public void setCartaoCredito2Parceiro(String pCartaoCredito2Parceiro){
        this.cartaoCredito2Parceiro = pCartaoCredito2Parceiro;
    }
    /**
    * @return cartaoCredito2Parceiro
    */
    public String getCartaoCredito2Parceiro(){
        return this.cartaoCredito2Parceiro;
    }

    /**
    * seta o valor de cartaoDebitoParceiroHist
    * @param pCartaoDebitoParceiroHist
    */
    public void setCartaoDebitoParceiroHist(String pCartaoDebitoParceiroHist){
        this.cartaoDebitoParceiroHist = pCartaoDebitoParceiroHist;
    }
    /**
    * @return cartaoDebitoParceiroHist
    */
    public String getCartaoDebitoParceiroHist(){
        return this.cartaoDebitoParceiroHist;
    }

    /**
    * seta o valor de cartaoDebitoParceiro
    * @param pCartaoDebitoParceiro
    */
    public void setCartaoDebitoParceiro(String pCartaoDebitoParceiro){
        this.cartaoDebitoParceiro = pCartaoDebitoParceiro;
    }
    /**
    * @return cartaoDebitoParceiro
    */
    public String getCartaoDebitoParceiro(){
        return this.cartaoDebitoParceiro;
    }

    /**
    * seta o valor de cartaoDebito2ParceiroHist
    * @param pCartaoDebito2ParceiroHist
    */
    public void setCartaoDebito2ParceiroHist(String pCartaoDebito2ParceiroHist){
        this.cartaoDebito2ParceiroHist = pCartaoDebito2ParceiroHist;
    }
    /**
    * @return cartaoDebito2ParceiroHist
    */
    public String getCartaoDebito2ParceiroHist(){
        return this.cartaoDebito2ParceiroHist;
    }

    /**
    * seta o valor de cartaoDebito2Parceiro
    * @param pCartaoDebito2Parceiro
    */
    public void setCartaoDebito2Parceiro(String pCartaoDebito2Parceiro){
        this.cartaoDebito2Parceiro = pCartaoDebito2Parceiro;
    }
    /**
    * @return cartaoDebito2Parceiro
    */
    public String getCartaoDebito2Parceiro(){
        return this.cartaoDebito2Parceiro;
    }

    /**
    * seta o valor de pix
    * @param pPix
    */
    public void setPix(String pPix){
        this.pix = pPix;
    }
    /**
    * @return pix
    */
    public String getPix(){
        return this.pix;
    }

    /**
    * seta o valor de picpayHist
    * @param pPicpayHist
    */
    public void setPicpayHist(String pPicpayHist){
        this.picpayHist = pPicpayHist;
    }
    /**
    * @return picpayHist
    */
    public String getPicpayHist(){
        return this.picpayHist;
    }

    /**
    * seta o valor de picpay
    * @param pPicpay
    */
    public void setPicpay(String pPicpay){
        this.picpay = pPicpay;
    }
    /**
    * @return picpay
    */
    public String getPicpay(){
        return this.picpay;
    }

    /**
    * seta o valor de taxaPicpay
    * @param pTaxaPicpay
    */
    public void setTaxaPicpay(String pTaxaPicpay){
        this.taxaPicpay = pTaxaPicpay;
    }
    /**
    * @return taxaPicpay
    */
    public String getTaxaPicpay(){
        return this.taxaPicpay;
    }

    /**
    * seta o valor de parcelaPicPay
    * @param pParcelaPicPay
    */
    public void setParcelaPicPay(String pParcelaPicPay){
        this.parcelaPicPay = pParcelaPicPay;
    }
    /**
    * @return parcelaPicPay
    */
    public String getParcelaPicPay(){
        return this.parcelaPicPay;
    }

    /**
    * seta o valor de crediarioLoja
    * @param pCrediarioLoja
    */
    public void setCrediarioLoja(String pCrediarioLoja){
        this.crediarioLoja = pCrediarioLoja;
    }
    /**
    * @return crediarioLoja
    */
    public String getCrediarioLoja(){
        return this.crediarioLoja;
    }

    /**
    * seta o valor de parcelaCrediarioLoja
    * @param pParcelaCrediarioLoja
    */
    public void setParcelaCrediarioLoja(String pParcelaCrediarioLoja){
        this.parcelaCrediarioLoja = pParcelaCrediarioLoja;
    }
    /**
    * @return parcelaCrediarioLoja
    */
    public String getParcelaCrediarioLoja(){
        return this.parcelaCrediarioLoja;
    }

    /**
    * seta o valor de jurosCrediarioLoja
    * @param pJurosCrediarioLoja
    */
    public void setJurosCrediarioLoja(String pJurosCrediarioLoja){
        this.jurosCrediarioLoja = pJurosCrediarioLoja;
    }
    /**
    * @return jurosCrediarioLoja
    */
    public String getJurosCrediarioLoja(){
        return this.jurosCrediarioLoja;
    }

    @Override
    public String toString(){
        return "ModelVendasPagamento {" + "::idVendaPagamento = " + this.idVendaPagamento + "::idVenda = " + this.idVenda + "::dinheiro = " + this.dinheiro + "::cartaoCreditoLojaHist = " + this.cartaoCreditoLojaHist + "::cartaoCreditoLoja = " + this.cartaoCreditoLoja + "::taxaCreditoLoja = " + this.taxaCreditoLoja + "::parcelaCreditoLoja = " + this.parcelaCreditoLoja + "::bandeiraCreditoLoja = " + this.bandeiraCreditoLoja + "::cartaoCredito2LojaHist = " + this.cartaoCredito2LojaHist + "::cartaoCredito2Loja = " + this.cartaoCredito2Loja + "::taxaCredito2Loja = " + this.taxaCredito2Loja + "::parcelaCredito2Loja = " + this.parcelaCredito2Loja + "::bandeiraCredito2Loja = " + this.bandeiraCredito2Loja + "::cartaoDebitoLojaHist = " + this.cartaoDebitoLojaHist + "::cartaoDebitoLoja = " + this.cartaoDebitoLoja + "::taxaDebitoLoja = " + this.taxaDebitoLoja + "::bandeiraDebitoLoja = " + this.bandeiraDebitoLoja + "::cartaoDebito2LojaHist = " + this.cartaoDebito2LojaHist + "::cartaoDebito2Loja = " + this.cartaoDebito2Loja + "::taxaDebito2Loja = " + this.taxaDebito2Loja + "::bandeiraDebito2Loja = " + this.bandeiraDebito2Loja + "::cartaoCreditoParceiroHist = " + this.cartaoCreditoParceiroHist + "::cartaoCreditoParceiro = " + this.cartaoCreditoParceiro + "::cartaoCredito2ParceiroHist = " + this.cartaoCredito2ParceiroHist + "::cartaoCredito2Parceiro = " + this.cartaoCredito2Parceiro + "::cartaoDebitoParceiroHist = " + this.cartaoDebitoParceiroHist + "::cartaoDebitoParceiro = " + this.cartaoDebitoParceiro + "::cartaoDebito2ParceiroHist = " + this.cartaoDebito2ParceiroHist + "::cartaoDebito2Parceiro = " + this.cartaoDebito2Parceiro + "::pix = " + this.pix + "::picpayHist = " + this.picpayHist + "::picpay = " + this.picpay + "::taxaPicpay = " + this.taxaPicpay + "::parcelaPicPay = " + this.parcelaPicPay + "::crediarioLoja = " + this.crediarioLoja + "::parcelaCrediarioLoja = " + this.parcelaCrediarioLoja + "::jurosCrediarioLoja = " + this.jurosCrediarioLoja +  "}";
    }
}