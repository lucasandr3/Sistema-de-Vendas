package DAO;

import conexoes.ConexaoMySql;
import model.ModelCategorias;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOCategorias extends ConexaoMySql {

    /**
    * grava Categorias
    * @param pModelCategorias
    * @return int
    */
    public int salvarCategoriasDAO(ModelCategorias pModelCategorias){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO categorias ("
                    + "id_cat,"
                    + "name_cat,"
                    + "status"    
                + ") VALUES ("
                    + "'" + pModelCategorias.getIdCat() + "',"
                    + "'" + pModelCategorias.getNameCat() + "',"
                    + "'" + pModelCategorias.getStatus() + "'"
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
    * recupera Categorias
    * @param pIdCat
    * @return ModelCategorias
    */
    public ModelCategorias getCategoriasDAO(int pIdCat){
        ModelCategorias modelCategorias = new ModelCategorias();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cat,"
                    + "name_cat,"
                    + "status"    
                 + " FROM"
                     + " categorias"
                 + " WHERE"
                     + " id_cat = '" + pIdCat + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCategorias.setIdCat(this.getResultSet().getInt(1));
                modelCategorias.setNameCat(this.getResultSet().getString(2));
                modelCategorias.setStatus(this.getResultSet().getInt(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCategorias;
    }

    /**
    * recupera uma lista de Categorias
        * @return ArrayList
    */
    public ArrayList<ModelCategorias> getListaCategoriasDAO(){
        ArrayList<ModelCategorias> listamodelCategorias = new ArrayList();
        ModelCategorias modelCategorias = new ModelCategorias();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cat,"
                    + "name_cat,"
                    + "status"    
                 + " FROM"
                     + " categorias"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCategorias = new ModelCategorias();
                modelCategorias.setIdCat(this.getResultSet().getInt(1));
                modelCategorias.setNameCat(this.getResultSet().getString(2));
                modelCategorias.setStatus(this.getResultSet().getInt(3));
                listamodelCategorias.add(modelCategorias);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCategorias;
    }

    /**
    * atualiza Categorias
    * @param pModelCategorias
    * @return boolean
    */
    public boolean atualizarCategoriasDAO(ModelCategorias pModelCategorias){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE categorias SET "
                    + "id_cat = '" + pModelCategorias.getIdCat() + "',"
                    + "name_cat = '" + pModelCategorias.getNameCat() + "',"
                    + "status = '" + pModelCategorias.getStatus() + "'"
                + " WHERE "
                    + "id_cat = '" + pModelCategorias.getIdCat() + "'"
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
    * exclui Categorias
    * @param pIdCat
    * @return boolean
    */
    public boolean excluirCategoriasDAO(int pIdCat){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM categorias "
                + " WHERE "
                    + "id_cat = '" + pIdCat + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public ModelCategorias getCategoriaNomeDAO(String nomeCategoria) {
       ModelCategorias modelCategorias = new ModelCategorias();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cat,"
                    + "name_cat,"
                    + "status"
                 + " FROM"
                     + " categorias"
                 + " WHERE"
                     + " name_cat = '" + nomeCategoria + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCategorias.setIdCat(this.getResultSet().getInt(1));
                modelCategorias.setNameCat(this.getResultSet().getString(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCategorias;
    }
}