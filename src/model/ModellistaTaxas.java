package model;
/**
*
* @author Lucas Vieira
*/
public class ModellistaTaxas {

    private int id;
    private int idTax;
    private int qtParc;
    private String taxaV;

    /**
    * Construtor
    */
    public ModellistaTaxas(){}

    /**
    * seta o valor de id
    * @param pId
    */
    public void setId(int pId){
        this.id = pId;
    }
    /**
    * @return id
    */
    public int getId(){
        return this.id;
    }

    /**
    * seta o valor de idTax
    * @param pIdTax
    */
    public void setIdTax(int pIdTax){
        this.idTax = pIdTax;
    }
    /**
    * @return idTax
    */
    public int getIdTax(){
        return this.idTax;
    }

    /**
    * seta o valor de qtParc
    * @param pQtParc
    */
    public void setQtParc(int pQtParc){
        this.qtParc = pQtParc;
    }
    /**
    * @return qtParc
    */
    public int getQtParc(){
        return this.qtParc;
    }

    /**
    * seta o valor de taxaV
    * @param pTaxaV
    */
    public void setTaxaV(String pTaxaV){
        this.taxaV = pTaxaV;
    }
    /**
    * @return taxaV
    */
    public String getTaxaV(){
        return this.taxaV;
    }

    @Override
    public String toString(){
        return "ModellistaTaxas {" + "::id = " + this.id + "::idTax = " + this.idTax + "::qtParc = " + this.qtParc + "::taxaV = " + this.taxaV +  "}";
    }
}