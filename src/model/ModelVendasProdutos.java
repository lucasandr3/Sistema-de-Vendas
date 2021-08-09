package model;
/**
*
* @author Lucas Vieira
*/
public class ModelVendasProdutos {

    private int idVendaProdutos;
    private int idVenda;
    private int idProduto;
    private int quantidade;
    private double valor;
    private double valorVendido;
    private double custo;

    /**
    * Construtor
    */
    public ModelVendasProdutos(){}

    /**
    * seta o valor de idVendaProdutos
    * @param pIdVendaProdutos
    */
    public void setIdVendaProdutos(int pIdVendaProdutos){
        this.idVendaProdutos = pIdVendaProdutos;
    }
    /**
    * @return idVendaProdutos
    */
    public int getIdVendaProdutos(){
        return this.idVendaProdutos;
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
    * seta o valor de idProduto
    * @param pIdProduto
    */
    public void setIdProduto(int pIdProduto){
        this.idProduto = pIdProduto;
    }
    /**
    * @return idProduto
    */
    public int getIdProduto(){
        return this.idProduto;
    }

    /**
    * seta o valor de quantidade
    * @param pQuantidade
    */
    public void setQuantidade(int pQuantidade){
        this.quantidade = pQuantidade;
    }
    /**
    * @return quantidade
    */
    public int getQuantidade(){
        return this.quantidade;
    }

    /**
    * seta o valor de valor
    * @param pValor
    */
    public void setValor(double pValor){
        this.valor = pValor;
    }
    /**
    * @return valor
    */
    public double getValor(){
        return this.valor;
    }

    /**
    * seta o valor de valorVendido
    * @param pValorVendido
    */
    public void setValorVendido(double pValorVendido){
        this.valorVendido = pValorVendido;
    }
    /**
    * @return valorVendido
    */
    public double getValorVendido(){
        return this.valorVendido;
    }

    /**
    * seta o valor de custo
    * @param pCusto
    */
    public void setCusto(double pCusto){
        this.custo = pCusto;
    }
    /**
    * @return custo
    */
    public double getCusto(){
        return this.custo;
    }

    @Override
    public String toString(){
        return "ModelVendasProdutos {" + "::idVendaProdutos = " + this.idVendaProdutos + "::idVenda = " + this.idVenda + "::idProduto = " + this.idProduto + "::quantidade = " + this.quantidade + "::valor = " + this.valor + "::valorVendido = " + this.valorVendido + "::custo = " + this.custo +  "}";
    }
}