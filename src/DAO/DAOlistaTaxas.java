package DAO;

import model.ModellistaTaxas;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOlistaTaxas extends ConexaoMySql {

    /**
    * grava listaTaxas
    * @param pModellistaTaxas
    * @return int
    */
    public int salvarlistaTaxasDAO(ModellistaTaxas pModellistaTaxas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO list_tax ("
                    + "id,"
                    + "id_tax,"
                    + "qt_parc,"
                    + "taxa_v"
                + ") VALUES ("
                    + "'" + pModellistaTaxas.getId() + "',"
                    + "'" + pModellistaTaxas.getIdTax() + "',"
                    + "'" + pModellistaTaxas.getQtParc() + "',"
                    + "'" + pModellistaTaxas.getTaxaV() + "'"
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
    * recupera listaTaxas
    * @param pId
    * @return ModellistaTaxas
    */
    public ModellistaTaxas getlistaTaxasDAO(int pId){
        ModellistaTaxas modellistaTaxas = new ModellistaTaxas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "id_tax,"
                    + "qt_parc,"
                    + "taxa_v"
                 + " FROM"
                     + " list_tax"
                 + " WHERE"
                     + " id = '" + pId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modellistaTaxas.setId(this.getResultSet().getInt(1));
                modellistaTaxas.setIdTax(this.getResultSet().getInt(2));
                modellistaTaxas.setQtParc(this.getResultSet().getInt(3));
                modellistaTaxas.setTaxaV(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modellistaTaxas;
    }

    /**
    * recupera uma lista de listaTaxas
        * @return ArrayList
    */
    public ArrayList<ModellistaTaxas> getListalistaTaxasDAO(){
        ArrayList<ModellistaTaxas> listamodellistaTaxas = new ArrayList();
        ModellistaTaxas modellistaTaxas = new ModellistaTaxas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "id_tax,"
                    + "qt_parc,"
                    + "taxa_v"
                 + " FROM"
                     + " list_tax"
                + ";"
            );

            while(this.getResultSet().next()){
                modellistaTaxas = new ModellistaTaxas();
                modellistaTaxas.setId(this.getResultSet().getInt(1));
                modellistaTaxas.setIdTax(this.getResultSet().getInt(2));
                modellistaTaxas.setQtParc(this.getResultSet().getInt(3));
                modellistaTaxas.setTaxaV(this.getResultSet().getString(4));
                listamodellistaTaxas.add(modellistaTaxas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodellistaTaxas;
    }

    /**
    * atualiza listaTaxas
    * @param pModellistaTaxas
    * @return boolean
    */
    public boolean atualizarlistaTaxasDAO(ModellistaTaxas pModellistaTaxas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE list_tax SET "
                    + "id = '" + pModellistaTaxas.getId() + "',"
                    + "id_tax = '" + pModellistaTaxas.getIdTax() + "',"
                    + "qt_parc = '" + pModellistaTaxas.getQtParc() + "',"
                    + "taxa_v = '" + pModellistaTaxas.getTaxaV() + "'"
                + " WHERE "
                    + "id = '" + pModellistaTaxas.getId() + "'"
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
    * exclui listaTaxas
    * @param pId
    * @return boolean
    */
    public boolean excluirlistaTaxasDAO(int pId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM list_tax "
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


    public ArrayList<ModellistaTaxas> getListalistaIDTaxasDAO(int idTaxaDetalhes) {
        ArrayList<ModellistaTaxas> listamodellistaTaxas = new ArrayList();
        ModellistaTaxas modellistaTaxas = new ModellistaTaxas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "id_tax,"
                    + "qt_parc,"
                    + "taxa_v"
                 + " FROM"
                    + " list_tax WHERE id_tax = "+idTaxaDetalhes+""
                + ";"
            );

            while(this.getResultSet().next()){
                modellistaTaxas = new ModellistaTaxas();
                modellistaTaxas.setId(this.getResultSet().getInt(1));
                modellistaTaxas.setIdTax(this.getResultSet().getInt(2));
                modellistaTaxas.setQtParc(this.getResultSet().getInt(3));
                modellistaTaxas.setTaxaV(this.getResultSet().getString(4));
                listamodellistaTaxas.add(modellistaTaxas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodellistaTaxas;
    }
}