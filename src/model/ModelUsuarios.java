package model;
/**
*
* @author Lucas Vieira
*/
public class ModelUsuarios {

    private int idUser;
    private int idPermissao;
    private String name;
    private String email;
    private String password;
    private String passDiscount;
    private String passCancelSale;
    private int status;
    private String dateCreate;
    private String funcao;

    /**
    * Construtor
    */
    public ModelUsuarios(){}

    /**
    * seta o valor de idUser
    * @param pIdUser
    */
    public void setIdUser(int pIdUser){
        this.idUser = pIdUser;
    }
    /**
    * @return pk_idUser
    */
    public int getIdUser(){
        return this.idUser;
    }

    /**
    * seta o valor de idPermissao
    * @param pIdPermissao
    */
    public void setIdPermissao(int pIdPermissao){
        this.idPermissao = pIdPermissao;
    }
    /**
    * @return idPermissao
    */
    public int getIdPermissao(){
        return this.idPermissao;
    }

    /**
    * seta o valor de name
    * @param pName
    */
    public void setName(String pName){
        this.name = pName;
    }
    /**
    * @return name
    */
    public String getName(){
        return this.name;
    }

    /**
    * seta o valor de email
    * @param pEmail
    */
    public void setEmail(String pEmail){
        this.email = pEmail;
    }
    /**
    * @return email
    */
    public String getEmail(){
        return this.email;
    }

    /**
    * seta o valor de password
    * @param pPassword
    */
    public void setPassword(String pPassword){
        this.password = pPassword;
    }
    /**
    * @return password
    */
    public String getPassword(){
        return this.password;
    }

    /**
    * seta o valor de passDiscount
    * @param pPassDiscount
    */
    public void setPassDiscount(String pPassDiscount){
        this.passDiscount = pPassDiscount;
    }
    /**
    * @return passDiscount
    */
    public String getPassDiscount(){
        return this.passDiscount;
    }

    /**
    * seta o valor de status
    * @param pStatus
    */
    public void setStatus(int pStatus){
        this.status = pStatus;
    }
    /**
    * @return status
    */
    public int getStatus(){
        return this.status;
    }

    /**
    * seta o valor de dateCreate
    * @param pDateCreate
    */
    public void setDateCreate(String pDateCreate){
        this.dateCreate = pDateCreate;
    }
    /**
    * @return dateCreate
    */
    public String getDateCreate(){
        return this.dateCreate;
    }

    @Override
    public String toString(){
        return "ModelUsuarios {" + "::idUser = " + this.idUser + "::idPermissao = " + this.idPermissao + "::name = " + this.name + "::email = " + this.email + "::password = " + this.password + "::passDiscount = " + this.passDiscount + "::status = " + this.status + "::dateCreate = " + this.dateCreate + "::funcao = " + this.funcao + "}";
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the passCancelSale
     */
    public String getPassCancelSale() {
        return passCancelSale;
    }

    /**
     * @param passCancelSale the passCancelSale to set
     */
    public void setPassCancelSale(String passCancelSale) {
        this.passCancelSale = passCancelSale;
    }
}