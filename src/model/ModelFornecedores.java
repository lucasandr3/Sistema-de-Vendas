package model;
/**
*
* @author Lucas Vieira
*/
public class ModelFornecedores {

    private int idFornecedor;
    private String doc;
    private String nome;
    private String email;
    private String tel;
    private String cep;
    private String rua ;
    private String bairro;
    private String cidade;
    private String estado;
    private String numero;
    private int status;
    private String dataCadastro;
    private String ultimaCompra;

    /**
    * Construtor
    */
    public ModelFornecedores(){}

    /**
    * seta o valor de idFornecedor
    * @param pIdFornecedor
    */
    public void setIdFornecedor(int pIdFornecedor){
        this.idFornecedor = pIdFornecedor;
    }
    /**
    * @return pk_idFornecedor
    */
    public int getIdFornecedor(){
        return this.idFornecedor;
    }

    /**
    * seta o valor de doc
    * @param pDoc
    */
    public void setDoc(String pDoc){
        this.doc = pDoc;
    }
    /**
    * @return doc
    */
    public String getDoc(){
        return this.doc;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * @return nome
    */
    public String getNome(){
        return this.nome;
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
    * seta o valor de tel
    * @param pTel
    */
    public void setTel(String pTel){
        this.tel = pTel;
    }
    /**
    * @return tel
    */
    public String getTel(){
        return this.tel;
    }

    /**
    * seta o valor de cep
    * @param pCep
    */
    public void setCep(String pCep){
        this.cep = pCep;
    }
    /**
    * @return cep
    */
    public String getCep(){
        return this.cep;
    }

    /**
    * seta o valor de rua 
    * @param pRua 
    */
    public void setRua (String pRua ){
        this.rua  = pRua ;
    }
    /**
    * @return rua 
    */
    public String getRua (){
        return this.rua ;
    }

    /**
    * seta o valor de bairro
    * @param pBairro
    */
    public void setBairro(String pBairro){
        this.bairro = pBairro;
    }
    /**
    * @return bairro
    */
    public String getBairro(){
        return this.bairro;
    }

    /**
    * seta o valor de cidade
    * @param pCidade
    */
    public void setCidade(String pCidade){
        this.cidade = pCidade;
    }
    /**
    * @return cidade
    */
    public String getCidade(){
        return this.cidade;
    }

    /**
    * seta o valor de estado
    * @param pEstado
    */
    public void setEstado(String pEstado){
        this.estado = pEstado;
    }
    /**
    * @return estado
    */
    public String getEstado(){
        return this.estado;
    }

    /**
    * seta o valor de numero
    * @param pNumero
    */
    public void setNumero(String pNumero){
        this.numero = pNumero;
    }
    /**
    * @return numero
    */
    public String getNumero(){
        return this.numero;
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
    * seta o valor de dataCadastro
    * @param pDataCadastro
    */
    public void setDataCadastro(String pDataCadastro){
        this.dataCadastro = pDataCadastro;
    }
    /**
    * @return dataCadastro
    */
    public String getDataCadastro(){
        return this.dataCadastro;
    }

    /**
    * seta o valor de ultimaVenda
    * @param pUltimaCompra
    */
    public void setUltimaCompra(String pUltimaCompra){
        this.ultimaCompra = pUltimaCompra;
    }
    /**
    * @return ultimaVenda
    */
    public String getUltimaCompra(){
        return this.ultimaCompra;
    }

    @Override
    public String toString(){
        return "ModelFornecedores {" + "::idFornecedor = " + this.idFornecedor + "::doc = " + this.doc + "::nome = " + this.nome + "::email = " + this.email + "::tel = " + this.tel + "::cep = " + this.cep + "::rua  = " + this.rua  + "::bairro = " + this.bairro + "::cidade = " + this.cidade + "::estado = " + this.estado + "::numero = " + this.numero + "::status = " + this.status + "::dataCadastro = " + this.dataCadastro + "::ultimaCompra = " + this.ultimaCompra +  "}";
    }
}