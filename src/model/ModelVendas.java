package model;
/**
*
* @author Lucas Vieira
*/
public class ModelVendas {

    private int idVenda;
    private String idVendedor;
    private int idParceiro;
    private int idCliente;
    private float total;
    private float taxa;
    private float total_taxa;
    private float desconto;
    private String observacao;
    private String dataVenda;
    private int editada;
    private int statusVenda;

    /**
    * Construtor
    */
    public ModelVendas(){}

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
    * seta o valor de idVendedor
    * @param pIdVendedor
    */
    public void setIdVendedor(String pIdVendedor){
        this.idVendedor = pIdVendedor;
    }
    /**
    * @return idVendedor
    */
    public String getIdVendedor(){
        return this.idVendedor;
    }

    /**
    * seta o valor de idParceiro
    * @param pIdParceiro
    */
    public void setIdParceiro(int pIdParceiro){
        this.idParceiro = pIdParceiro;
    }
    /**
    * @return idParceiro
    */
    public int getIdParceiro(){
        return this.idParceiro;
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
    * seta o valor de total
    * @param pTotal
    */
    public void setTotal(float pTotal){
        this.total = pTotal;
    }
    /**
    * @return total
    */
    public float getTotal(){
        return this.total;
    }

    /**
    * seta o valor de taxa
    * @param pTaxa
    */
    public void setTaxa(float pTaxa){
        this.taxa = pTaxa;
    }
    /**
    * @return taxa
    */
    public float getTaxa(){
        return this.taxa;
    }

    /**
    * seta o valor de total_taxa
    * @param pTotal_taxa
    */
    public void setTotal_taxa(float pTotal_taxa){
        this.total_taxa = pTotal_taxa;
    }
    /**
    * @return total_taxa
    */
    public float getTotal_taxa(){
        return this.total_taxa;
    }

    /**
    * seta o valor de observacao
    * @param pObservacao
    */
    public void setObservacao(String pObservacao){
        this.observacao = pObservacao;
    }
    /**
    * @return observacao
    */
    public String getObservacao(){
        return this.observacao;
    }

    /**
    * seta o valor de dataVenda
    * @param pDataVenda
    */
    public void setDataVenda(String pDataVenda){
        this.dataVenda = pDataVenda;
    }
    /**
    * @return dataVenda
    */
    public String getDataVenda(){
        return this.dataVenda;
    }

    /**
    * seta o valor de editada
    * @param pEditada
    */
    public void setEditada(int pEditada){
        this.editada = pEditada;
    }
    /**
    * @return editada
    */
    public int getEditada(){
        return this.editada;
    }

    /**
    * seta o valor de statusVenda
    * @param pStatusVenda
    */
    public void setStatusVenda(int pStatusVenda){
        this.statusVenda = pStatusVenda;
    }
    /**
    * @return statusVenda
    */
    public int getStatusVenda(){
        return this.statusVenda;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::idVenda = " + this.idVenda + "::idVendedor = " + this.idVendedor + "::idParceiro = " + this.idParceiro + "::idCliente = " + this.idCliente + "::total = " + this.total + "::taxa = " + this.taxa + "::total_taxa = " + this.total_taxa + "::desconto = " + this.desconto + "::observacao = " + this.observacao + "::dataVenda = " + this.dataVenda + "::editada = " + this.editada + "::statusVenda = " + this.statusVenda +  "}";
    }

    /**
     * @return the desconto
     */
    public float getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}