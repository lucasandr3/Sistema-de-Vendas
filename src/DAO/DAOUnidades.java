package DAO;

import conexoes.ConexaoMySql;
import java.sql.SQLException;
import model.ModelUnidades;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOUnidades extends ConexaoMySql {

    /**
    * grava Unidades
    * @param pModelUnidades
    * @return int
    */
    public int salvarUnidadesDAO(ModelUnidades pModelUnidades){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO units ("
                    + "id_unit,"
                    + "unit_name,"
                    + "is_active"
                + ") VALUES ("
                    + "'" + pModelUnidades.getIdUnit() + "',"
                    + "'" + pModelUnidades.getUnitName() + "',"
                    + "'" + pModelUnidades.getIsActive() + "'"
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
    * recupera Unidades
    * @param pIdUnit
    * @return ModelUnidades
    */
    public ModelUnidades getUnidadesDAO(int pIdUnit){
        ModelUnidades modelUnidades = new ModelUnidades();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_unit,"
                    + "unit_name,"
                    + "is_active"
                 + " FROM"
                     + " units"
                 + " WHERE"
                     + " id_unit = '" + pIdUnit + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUnidades.setIdUnit(this.getResultSet().getInt(1));
                modelUnidades.setUnitName(this.getResultSet().getString(2));
                modelUnidades.setIsActive(this.getResultSet().getInt(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUnidades;
    }

    /**
    * recupera uma lista de Unidades
        * @return ArrayList
    */
    public ArrayList<ModelUnidades> getListaUnidadesDAO(){
        ArrayList<ModelUnidades> listamodelUnidades = new ArrayList();
        ModelUnidades modelUnidades = new ModelUnidades();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_unit,"
                    + "unit_name,"
                    + "is_active"
                 + " FROM"
                     + " units"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUnidades = new ModelUnidades();
                modelUnidades.setIdUnit(this.getResultSet().getInt(1));
                modelUnidades.setUnitName(this.getResultSet().getString(2));
                modelUnidades.setIsActive(this.getResultSet().getInt(3));
                listamodelUnidades.add(modelUnidades);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUnidades;
    }

    /**
    * atualiza Unidades
    * @param pModelUnidades
    * @return boolean
    */
    public boolean atualizarUnidadesDAO(ModelUnidades pModelUnidades){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE units SET "
                    + "id_unit = '" + pModelUnidades.getIdUnit() + "',"
                    + "unit_name = '" + pModelUnidades.getUnitName() + "',"
                    + "is_active = '" + pModelUnidades.getIsActive() + "'"
                + " WHERE "
                    + "id_unit = '" + pModelUnidades.getIdUnit() + "'"
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
    * exclui Unidades
    * @param pIdUnit
    * @return boolean
    */
    public boolean excluirUnidadesDAO(int pIdUnit){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM units "
                + " WHERE "
                    + "id_unit = '" + pIdUnit + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public ModelUnidades getUnidadeNomeDAO(String nomeUnidade) {
        ModelUnidades modelUnidades = new ModelUnidades();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_unit,"
                    + "unit_name,"
                    + "is_active"
                 + " FROM"
                     + " units"
                 + " WHERE"
                     + " unit_name = '" + nomeUnidade + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUnidades.setIdUnit(this.getResultSet().getInt(1));
                modelUnidades.setUnitName(this.getResultSet().getString(2));
                modelUnidades.setIsActive(this.getResultSet().getInt(3));
            }
        }catch(SQLException e){
        }finally{
            this.fecharConexao();
        }
        return modelUnidades;
    }
}