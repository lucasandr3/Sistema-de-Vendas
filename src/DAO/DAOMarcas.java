package DAO;

import conexoes.ConexaoMySql;
import model.ModelMarcas;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOMarcas extends ConexaoMySql {

    /**
    * grava Marcas
    * @param pModelMarcas
    * @return int
    */
    public int salvarMarcasDAO(ModelMarcas pModelMarcas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO marcas ("
                    + "id,"
                    + "title,"
                    + "is_active"
                + ") VALUES ("
                    + "'" + pModelMarcas.getId() + "',"
                    + "'" + pModelMarcas.getTitle() + "',"
                    + "'" + pModelMarcas.getIsActive() + "'"
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
    * recupera Marcas
    * @param pId
    * @return ModelMarcas
    */
    public ModelMarcas getMarcasDAO(int pId){
        ModelMarcas modelMarcas = new ModelMarcas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "title,"
                    + "is_active"
                 + " FROM"
                     + " marcas"
                 + " WHERE"
                     + " id = '" + pId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelMarcas.setId(this.getResultSet().getInt(1));
                modelMarcas.setTitle(this.getResultSet().getString(2));
                modelMarcas.setIsActive(this.getResultSet().getInt(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelMarcas;
    }

    /**
    * recupera uma lista de Marcas
        * @return ArrayList
    */
    public ArrayList<ModelMarcas> getListaMarcasDAO(){
        ArrayList<ModelMarcas> listamodelMarcas = new ArrayList();
        ModelMarcas modelMarcas = new ModelMarcas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "title,"
                    + "is_active"
                 + " FROM"
                     + " marcas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelMarcas = new ModelMarcas();
                modelMarcas.setId(this.getResultSet().getInt(1));
                modelMarcas.setTitle(this.getResultSet().getString(2));
                modelMarcas.setIsActive(this.getResultSet().getInt(3));
                listamodelMarcas.add(modelMarcas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelMarcas;
    }

    /**
    * atualiza Marcas
    * @param pModelMarcas
    * @return boolean
    */
    public boolean atualizarMarcasDAO(ModelMarcas pModelMarcas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE marcas SET "
                    + "id = '" + pModelMarcas.getId() + "',"
                    + "title = '" + pModelMarcas.getTitle() + "',"
                    + "is_active = '" + pModelMarcas.getIsActive() + "'"
                + " WHERE "
                    + "id = '" + pModelMarcas.getId() + "'"
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
    * exclui Marcas
    * @param pId
    * @return boolean
    */
    public boolean excluirMarcasDAO(int pId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM marcas "
                + " WHERE "
                    + "id = '" + pId + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public ModelMarcas getMarcasNomeMarcaDAO(String nomeMarca) {
        ModelMarcas modelMarcas = new ModelMarcas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "title,"
                    + "is_active"
                 + " FROM"
                     + " marcas"
                 + " WHERE"
                     + " title = '" + nomeMarca + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelMarcas.setId(this.getResultSet().getInt(1));
                modelMarcas.setTitle(this.getResultSet().getString(2));
                modelMarcas.setIsActive(this.getResultSet().getInt(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelMarcas;
    }
}