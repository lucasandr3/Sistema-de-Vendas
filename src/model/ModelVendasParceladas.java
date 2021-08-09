package model;
/**
*
* @author Lucas Vieira
*/
public class ModelVendasParceladas {

    private int idVendaParcelada;
    private int idVenda;
    private int idCliente;
    private int quantidadeParcelas;
    private int valorParcela;
    private float juros;
    private String vencimento;

    /**
    * Construtor
    */
    public ModelVendasParceladas(){}

    /**
    * seta o valor de idVendaParcelada
    * @param pIdVendaParcelada
    */
    public void setIdVendaParcelada(int pIdVendaParcelada){
        this.idVendaParcelada = pIdVendaParcelada;
    }
    /**
    * @return idVendaParcelada
    */
    public int getIdVendaParcelada(){
        return this.idVendaParcelada;
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
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * @return idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
    }

    /**
    * seta o valor de quantidadeParcelas
    * @param pQuantidadeParcelas
    */
    public void setQuantidadeParcelas(int pQuantidadeParcelas){
        this.quantidadeParcelas = pQuantidadeParcelas;
    }
    /**
    * @return quantidadeParcelas
    */
    public int getQuantidadeParcelas(){
        return this.quantidadeParcelas;
    }

    /**
    * seta o valor de valorParcela
    * @param pValorParcela
    */
    public void setValorParcela(int pValorParcela){
        this.valorParcela = pValorParcela;
    }
    /**
    * @return valorParcela
    */
    public int getValorParcela(){
        return this.valorParcela;
    }

    /**
    * seta o valor de juros
    * @param pJuros
    */
    public void setJuros(float pJuros){
        this.juros = pJuros;
    }
    /**
    * @return juros
    */
    public float getJuros(){
        return this.juros;
    }

    /**
    * seta o valor de vencimento
    * @param pVencimento
    */
    public void setVencimento(String pVencimento){
        this.vencimento = pVencimento;
    }
    /**
    * @return vencimento
    */
    public String getVencimento(){
        return this.vencimento;
    }

    @Override
    public String toString(){
        return "ModelVendasParceladas {" + "::idVendaParcelada = " + this.idVendaParcelada + "::idVenda = " + this.idVenda + "::idCliente = " + this.idCliente + "::quantidadeParcelas = " + this.quantidadeParcelas + "::valorParcela = " + this.valorParcela + "::juros = " + this.juros + "::vencimento = " + this.vencimento +  "}";
    }
}