package model;
/**
*
* @author Lucas Vieira
*/
public class ModelTaxas {

    private int idTax;
    private String type;
    private String brand;
    private String op;
    private String who;

    /**
    * Construtor
    */
    public ModelTaxas(){}

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
    * seta o valor de type
    * @param pType
    */
    public void setType(String pType){
        this.type = pType;
    }
    /**
    * @return type
    */
    public String getType(){
        return this.type;
    }

    /**
    * seta o valor de brand
    * @param pBrand
    */
    public void setBrand(String pBrand){
        this.brand = pBrand;
    }
    /**
    * @return brand
    */
    public String getBrand(){
        return this.brand;
    }

    /**
    * seta o valor de op
    * @param pOp
    */
    public void setOp(String pOp){
        this.op = pOp;
    }
    /**
    * @return op
    */
    public String getOp(){
        return this.op;
    }

    /**
    * seta o valor de who
    * @param pWho
    */
    public void setWho(String pWho){
        this.who = pWho;
    }
    /**
    * @return who
    */
    public String getWho(){
        return this.who;
    }

    @Override
    public String toString(){
        return "ModelTaxas {" + "::idTax = " + this.idTax + "::type = " + this.type + "::brand = " + this.brand + "::op = " + this.op + "::who = " + this.who +  "}";
    }
}