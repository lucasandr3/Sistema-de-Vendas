package DAO;

import model.ModelFornecedores;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOFornecedores extends ConexaoMySql {

    /**
    * grava Fornecedores
    * @param pModelFornecedores
    * @return int
    */
    public int salvarFornecedoresDAO(ModelFornecedores pModelFornecedores){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO fornecedores ("
                    + "id_fornecedor,"
                    + "doc,"
                    + "nome,"
                    + "email,"
                    + "tel,"
                    + "cep,"
                    + "rua,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "numero,"
                    + "status,"
                    + "data_cadastro,"
                    + "ultima_compra"
                + ") VALUES ("
                    + "'" + pModelFornecedores.getIdFornecedor() + "',"
                    + "'" + pModelFornecedores.getDoc() + "',"
                    + "'" + pModelFornecedores.getNome() + "',"
                    + "'" + pModelFornecedores.getEmail() + "',"
                    + "'" + pModelFornecedores.getTel() + "',"
                    + "'" + pModelFornecedores.getCep() + "',"
                    + "'" + pModelFornecedores.getRua () + "',"
                    + "'" + pModelFornecedores.getBairro() + "',"
                    + "'" + pModelFornecedores.getCidade() + "',"
                    + "'" + pModelFornecedores.getEstado() + "',"
                    + "'" + pModelFornecedores.getNumero() + "',"
                    + "'" + pModelFornecedores.getStatus() + "',"
                    + "'" + pModelFornecedores.getDataCadastro() + "',"
                    + "'" + pModelFornecedores.getUltimaCompra() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Fornecedores
    * @param pIdFornecedor
    * @return ModelFornecedores
    */
    public ModelFornecedores getFornecedoresDAO(int pIdFornecedor){
        ModelFornecedores modelFornecedores = new ModelFornecedores();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fornecedor,"
                    + "doc,"
                    + "nome,"
                    + "email,"
                    + "tel,"
                    + "cep,"
                    + "rua,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "numero,"
                    + "status,"
                    + "data_cadastro,"
                    + "ultima_compra"
                 + " FROM"
                     + " fornecedores"
                 + " WHERE"
                     + " id_fornecedor = '" + pIdFornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedores.setIdFornecedor(this.getResultSet().getInt(1));
                modelFornecedores.setDoc(this.getResultSet().getString(2));
                modelFornecedores.setNome(this.getResultSet().getString(3));
                modelFornecedores.setEmail(this.getResultSet().getString(4));
                modelFornecedores.setTel(this.getResultSet().getString(5));
                modelFornecedores.setCep(this.getResultSet().getString(6));
                modelFornecedores.setRua (this.getResultSet().getString(7));
                modelFornecedores.setBairro(this.getResultSet().getString(8));
                modelFornecedores.setCidade(this.getResultSet().getString(9));
                modelFornecedores.setEstado(this.getResultSet().getString(10));
                modelFornecedores.setNumero(this.getResultSet().getString(11));
                modelFornecedores.setStatus(this.getResultSet().getInt(12));
                modelFornecedores.setDataCadastro(this.getResultSet().getString(13));
                modelFornecedores.setUltimaCompra(this.getResultSet().getString(14));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedores;
    }

    /**
    * recupera uma lista de Fornecedores
        * @return ArrayList
    */
    public ArrayList<ModelFornecedores> getListaFornecedoresDAO(){
        ArrayList<ModelFornecedores> listamodelFornecedores = new ArrayList();
        ModelFornecedores modelFornecedores = new ModelFornecedores();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fornecedor,"
                    + "doc,"
                    + "nome,"
                    + "email,"
                    + "tel,"
                    + "cep,"
                    + "rua,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "numero,"
                    + "status,"
                    + "data_cadastro,"
                    + "ultima_compra"
                 + " FROM"
                     + " fornecedores WHERE status = 0"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedores = new ModelFornecedores();
                modelFornecedores.setIdFornecedor(this.getResultSet().getInt(1));
                modelFornecedores.setDoc(this.getResultSet().getString(2));
                modelFornecedores.setNome(this.getResultSet().getString(3));
                modelFornecedores.setEmail(this.getResultSet().getString(4));
                modelFornecedores.setTel(this.getResultSet().getString(5));
                modelFornecedores.setCep(this.getResultSet().getString(6));
                modelFornecedores.setRua (this.getResultSet().getString(7));
                modelFornecedores.setBairro(this.getResultSet().getString(8));
                modelFornecedores.setCidade(this.getResultSet().getString(9));
                modelFornecedores.setEstado(this.getResultSet().getString(10));
                modelFornecedores.setNumero(this.getResultSet().getString(11));
                modelFornecedores.setStatus(this.getResultSet().getInt(12));
                modelFornecedores.setDataCadastro(this.getResultSet().getString(13));
                modelFornecedores.setUltimaCompra(this.getResultSet().getString(14));
                listamodelFornecedores.add(modelFornecedores);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedores;
    }

    /**
    * atualiza Fornecedores
    * @param pModelFornecedores
    * @return boolean
    */
    public boolean atualizarFornecedoresDAO(ModelFornecedores pModelFornecedores){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE fornecedores SET "
                    + "id_fornecedor = '" + pModelFornecedores.getIdFornecedor() + "',"
                    + "doc = '" + pModelFornecedores.getDoc() + "',"
                    + "nome = '" + pModelFornecedores.getNome() + "',"
                    + "email = '" + pModelFornecedores.getEmail() + "',"
                    + "tel = '" + pModelFornecedores.getTel() + "',"
                    + "cep = '" + pModelFornecedores.getCep() + "',"
                    + "rua = '" + pModelFornecedores.getRua () + "',"
                    + "bairro = '" + pModelFornecedores.getBairro() + "',"
                    + "cidade = '" + pModelFornecedores.getCidade() + "',"
                    + "estado = '" + pModelFornecedores.getEstado() + "',"
                    + "numero = '" + pModelFornecedores.getNumero() + "',"
                    + "status = '" + pModelFornecedores.getStatus() + "',"
                    + "data_cadastro = '" + pModelFornecedores.getDataCadastro() + "',"
                    + "ultima_compra = '" + pModelFornecedores.getUltimaCompra() + "'"
                + " WHERE "
                    + "id_fornecedor = '" + pModelFornecedores.getIdFornecedor() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Fornecedores
    * @param pIdFornecedor
    * @return boolean
    */
    public boolean excluirFornecedoresDAO(int pIdFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM fornecedores "
                + " WHERE "
                    + "id_fornecedor = '" + pIdFornecedor + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public ArrayList<ModelFornecedores> getListaFornecedoresInativosDAO() {
         ArrayList<ModelFornecedores> listamodelFornecedores = new ArrayList();
        ModelFornecedores modelFornecedores = new ModelFornecedores();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fornecedor,"
                    + "doc,"
                    + "nome,"
                    + "email,"
                    + "tel,"
                    + "cep,"
                    + "rua,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "numero,"
                    + "status,"
                    + "data_cadastro,"
                    + "ultima_compra"
                 + " FROM"
                     + " fornecedores WHERE status = 1"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedores = new ModelFornecedores();
                modelFornecedores.setIdFornecedor(this.getResultSet().getInt(1));
                modelFornecedores.setDoc(this.getResultSet().getString(2));
                modelFornecedores.setNome(this.getResultSet().getString(3));
                modelFornecedores.setEmail(this.getResultSet().getString(4));
                modelFornecedores.setTel(this.getResultSet().getString(5));
                modelFornecedores.setCep(this.getResultSet().getString(6));
                modelFornecedores.setRua (this.getResultSet().getString(7));
                modelFornecedores.setBairro(this.getResultSet().getString(8));
                modelFornecedores.setCidade(this.getResultSet().getString(9));
                modelFornecedores.setEstado(this.getResultSet().getString(10));
                modelFornecedores.setNumero(this.getResultSet().getString(11));
                modelFornecedores.setStatus(this.getResultSet().getInt(12));
                modelFornecedores.setDataCadastro(this.getResultSet().getString(13));
                modelFornecedores.setUltimaCompra(this.getResultSet().getString(14));
                listamodelFornecedores.add(modelFornecedores);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedores;
    }
}