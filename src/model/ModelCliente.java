package model;
/**
*
* @author Lucas Vieira
*/
public class ModelCliente {

    private int idCliente;
    private String name;
    private String email;
    private String phone;
    private String birthdate;
    private String address;
    private String addressNumber;
    private String addressNeighb;
    private String addressCity;
    private String addressState;
    private String addressZipcode;
    private String internalObs;
    private String dateCreate;
    private int status;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * @return pk_idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
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
    * seta o valor de phone
    * @param pPhone
    */
    public void setPhone(String pPhone){
        this.phone = pPhone;
    }
    /**
    * @return phone
    */
    public String getPhone(){
        return this.phone;
    }

    /**
    * seta o valor de birthdate
    * @param pBirthdate
    */
    public void setBirthdate(String pBirthdate){
        this.birthdate = pBirthdate;
    }
    /**
    * @return birthdate
    */
    public String getBirthdate(){
        return this.birthdate;
    }

    /**
    * seta o valor de address
    * @param pAddress
    */
    public void setAddress(String pAddress){
        this.address = pAddress;
    }
    /**
    * @return address
    */
    public String getAddress(){
        return this.address;
    }

    /**
    * seta o valor de addressNumber
    * @param pAddressNumber
    */
    public void setAddressNumber(String pAddressNumber){
        this.addressNumber = pAddressNumber;
    }
    /**
    * @return addressNumber
    */
    public String getAddressNumber(){
        return this.addressNumber;
    }

    /**
    * seta o valor de addressNeighb
    * @param pAddressNeighb
    */
    public void setAddressNeighb(String pAddressNeighb){
        this.addressNeighb = pAddressNeighb;
    }
    /**
    * @return addressNeighb
    */
    public String getAddressNeighb(){
        return this.addressNeighb;
    }

    /**
    * seta o valor de addressCity
    * @param pAddressCity
    */
    public void setAddressCity(String pAddressCity){
        this.addressCity = pAddressCity;
    }
    /**
    * @return addressCity
    */
    public String getAddressCity(){
        return this.addressCity;
    }

    /**
    * seta o valor de addressState
    * @param pAddressState
    */
    public void setAddressState(String pAddressState){
        this.addressState = pAddressState;
    }
    /**
    * @return addressState
    */
    public String getAddressState(){
        return this.addressState;
    }

    /**
    * seta o valor de addressZipcode
    * @param pAddressZipcode
    */
    public void setAddressZipcode(String pAddressZipcode){
        this.addressZipcode = pAddressZipcode;
    }
    /**
    * @return addressZipcode
    */
    public String getAddressZipcode(){
        return this.addressZipcode;
    }

    /**
    * seta o valor de internalObs
    * @param pInternalObs
    */
    public void setInternalObs(String pInternalObs){
        this.internalObs = pInternalObs;
    }
    /**
    * @return internalObs
    */
    public String getInternalObs(){
        return this.internalObs;
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
        return "ModelCliente {" + "::idCliente = " + this.idCliente + "::name = " + this.name + "::email = " + this.email + "::phone = " + this.phone + "::birthdate = " + this.birthdate + "::address = " + this.address + "::addressNumber = " + this.addressNumber + "::addressNeighb = " + this.addressNeighb + "::addressCity = " + this.addressCity + "::addressState = " + this.addressState + "::addressZipcode = " + this.addressZipcode + "::internalObs = " + this.internalObs + "::dateCreate = " + this.dateCreate + "::status = " + this.status + "}";
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