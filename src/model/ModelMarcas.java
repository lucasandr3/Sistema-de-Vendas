package model;
/**
*
* @author Lucas Vieira
*/
public class ModelMarcas {

    private int id;
    private String title;
    private int isActive;

    /**
    * Construtor
    */
    public ModelMarcas(){}

    /**
    * seta o valor de id
    * @param pId
    */
    public void setId(int pId){
        this.id = pId;
    }
    /**
    * @return pk_id
    */
    public int getId(){
        return this.id;
    }

    /**
    * seta o valor de title
    * @param pTitle
    */
    public void setTitle(String pTitle){
        this.title = pTitle;
    }
    /**
    * @return title
    */
    public String getTitle(){
        return this.title;
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
        return "ModelMarcas {" + "::id = " + this.id + "::title = " + this.title + "::isActive = " + this.isActive +  "}";
    }
}