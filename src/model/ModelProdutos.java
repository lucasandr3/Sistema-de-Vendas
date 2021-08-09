package model;
/**
*
* @author Lucas Vieira
*/
public class ModelProdutos {

    private int idProd;
    private String novo_cod;
    private String nome_prod;
    private String marca;
    private String categoria;
    private String unidade;
    private double cost;
    private double preco;
    private int quantidade;
    private int alert;
    private String validateProd;
    private String imagem;

    /**
    * Construtor
    */
    public ModelProdutos(){}

    /**
    * seta o valor de idProd
    * @param pIdProd
    */
    public void setIdProd(int pIdProd){
        this.idProd = pIdProd;
    }
    /**
    * @return pk_idProd
    */
    public int getIdProd(){
        return this.idProd;
    }

    /**
    * seta o valor de novo_cod
    * @param pNovo_cod
    */
    public void setNovo_cod(String pNovo_cod){
        this.novo_cod = pNovo_cod;
    }
    /**
    * @return novo_cod
    */
    public String getNovo_cod(){
        return this.novo_cod;
    }

    /**
    * seta o valor de nome_prod
    * @param pNome_prod
    */
    public void setNome_prod(String pNome_prod){
        this.nome_prod = pNome_prod;
    }
    /**
    * @return nome_prod
    */
    public String getNome_prod(){
        return this.nome_prod;
    }

    /**
    * seta o valor de marca
    * @param pMarca
    */
    public void setMarca(String pMarca){
        this.marca = pMarca;
    }
    /**
    * @return marca
    */
    public String getMarca(){
        return this.marca;
    }

    /**
    * seta o valor de categoria
    * @param pCategoria
    */
    public void setCategoria(String pCategoria){
        this.categoria = pCategoria;
    }
    /**
    * @return categoria
    */
    public String getCategoria(){
        return this.categoria;
    }

    /**
    * seta o valor de unidade
    * @param pUnidade
    */
    public void setUnidade(String pUnidade){
        this.unidade = pUnidade;
    }
    /**
    * @return unidade
    */
    public String getUnidade(){
        return this.unidade;
    }

    /**
    * seta o valor de cost
    * @param pCost
    */
    public void setCost(double pCost){
        this.cost = pCost;
    }
    /**
    * @return cost
    */
    public double getCost(){
        return this.cost;
    }

    /**
    * seta o valor de preco
    * @param pPreco
    */
    public void setPreco(double pPreco){
        this.preco = pPreco;
    }
    /**
    * @return preco
    */
    public double getPreco(){
        return this.preco;
    }

    /**
    * seta o valor de quantidade
    * @param pQuantidade
    */
    public void setQuantidade(int pQuantidade){
        this.quantidade = pQuantidade;
    }
    /**
    * @return quantidade
    */
    public int getQuantidade(){
        return this.quantidade;
    }

    /**
    * seta o valor de alert
    * @param pAlert
    */
    public void setAlert(int pAlert){
        this.alert = pAlert;
    }
    /**
    * @return alert
    */
    public int getAlert(){
        return this.alert;
    }

    /**
    * seta o valor de validateProd
    * @param pValidateProd
    */
    public void setValidateProd(String pValidateProd){
        this.validateProd = pValidateProd;
    }
    /**
    * @return validateProd
    */
    public String getValidateProd(){
        return this.validateProd;
    }
    
    /**
     * @return the imagem
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString(){
        return "ModelProdutos {" + "::idProd = " + this.idProd + "::novo_cod = " + this.novo_cod + "::nome_prod = " + this.nome_prod + "::marca = " + this.marca + "::categoria = " + this.categoria + "::unidade = " + this.unidade + "::cost = " + this.cost + "::preco = " + this.preco + "::quantidade = " + this.quantidade + "::alert = " + this.alert + "::validateProd = " + this.validateProd + "::imagem = " + this.imagem + "}";
    }
}