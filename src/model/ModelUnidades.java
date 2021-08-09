package model;
/**
*
* @author Lucas Vieira
*/
public class ModelUnidades {

    private int idUnit;
    private String unitName;
    private int isActive;

    /**
    * Construtor
    */
    public ModelUnidades(){}

    /**
    * seta o valor de idUnit
    * @param pIdUnit
    */
    public void setIdUnit(int pIdUnit){
        this.idUnit = pIdUnit;
    }
    /**
    * @return pk_idUnit
    */
    public int getIdUnit(){
        return this.idUnit;
    }

    /**
    * seta o valor de unitName
    * @param pUnitName
    */
    public void setUnitName(String pUnitName){
        this.unitName = pUnitName;
    }
    /**
    * @return unitName
    */
    public String getUnitName(){
        return this.unitName;
    }

    /**
    * seta o valor de isActive
    * @param pIsActive
    */
    public void setIsActive(int pIsActive){
        this.isActive = pIsActive;
    }
    /**
    * @return isActive
    */
    public int getIsActive(){
        return this.isActive;
    }

    @Override
    public String toString(){
        return "ModelUnidades {" + "::idUnit = " + this.idUnit + "::unitName = " + this.unitName + "::isActive = " + this.isActive +  "}";
    }
}