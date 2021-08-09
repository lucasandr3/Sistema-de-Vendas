package model;
/**
*
* @author Lucas Vieira
*/
public class ModelCategorias {

    private int idCat;
    private String nameCat;
    private int status;

    /**
    * Construtor
    */
    public ModelCategorias(){}

    /**
    * seta o valor de idCat
    * @param pIdCat
    */
    public void setIdCat(int pIdCat){
        this.idCat = pIdCat;
    }
    /**
    * @return pk_idCat
    */
    public int getIdCat(){
        return this.idCat;
    }

    /**
    * seta o valor de nameCat
    * @param pNameCat
    */
    public void setNameCat(String pNameCat){
        this.nameCat = pNameCat;
    }
    /**
    * @return nameCat
    */
    public String getNameCat(){
        return this.nameCat;
    }

    @Override
    public String toString(){
        return "ModelCategorias {" + "::idCat = " + this.idCat + "::nameCat = " + this.nameCat +  "}";
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
}