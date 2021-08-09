package DAO;

import model.ModelTaxas;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOTaxas extends ConexaoMySql {

    /**
    * grava Taxas
    * @param pModelTaxas
    * @return int
    */
    public int salvarTaxasDAO(ModelTaxas pModelTaxas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO taxas ("
                    + "id_tax,"
                    + "type,"
                    + "brand,"
                    + "op,"
                    + "who"
                + ") VALUES ("
                    + "'" + pModelTaxas.getIdTax() + "',"
                    + "'" + pModelTaxas.getType() + "',"
                    + "'" + pModelTaxas.getBrand() + "',"
                    + "'" + pModelTaxas.getOp() + "',"
                    + "'" + pModelTaxas.getWho() + "'"
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
    * recupera Taxas
    * @param pIdTax
    * @return ModelTaxas
    */
    public ModelTaxas getTaxasDAO(int pIdTax){
        ModelTaxas modelTaxas = new ModelTaxas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_tax,"
                    + "type,"
                    + "brand,"
                    + "op,"
                    + "who"
                 + " FROM"
                     + " taxas"
                 + " WHERE"
                     + " id_tax = '" + pIdTax + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelTaxas.setIdTax(this.getResultSet().getInt(1));
                modelTaxas.setType(this.getResultSet().getString(2));
                modelTaxas.setBrand(this.getResultSet().getString(3));
                modelTaxas.setOp(this.getResultSet().getString(4));
                modelTaxas.setWho(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelTaxas;
    }

    /**
    * recupera uma lista de Taxas
        * @return ArrayList
    */
    public ArrayList<ModelTaxas> getListaTaxasDAO(){
        ArrayList<ModelTaxas> listamodelTaxas = new ArrayList();
        ModelTaxas modelTaxas = new ModelTaxas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_tax,"
                    + "type,"
                    + "brand,"
                    + "op,"
                    + "who"
                 + " FROM"
                     + " taxas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelTaxas = new ModelTaxas();
                modelTaxas.setIdTax(this.getResultSet().getInt(1));
                modelTaxas.setType(this.getResultSet().getString(2));
                modelTaxas.setBrand(this.getResultSet().getString(3));
                modelTaxas.setOp(this.getResultSet().getString(4));
                modelTaxas.setWho(this.getResultSet().getString(5));
                listamodelTaxas.add(modelTaxas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelTaxas;
    }

    /**
    * atualiza Taxas
    * @param pModelTaxas
    * @return boolean
    */
    public boolean atualizarTaxasDAO(ModelTaxas pModelTaxas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE taxas SET "
                    + "id_tax = '" + pModelTaxas.getIdTax() + "',"
                    + "type = '" + pModelTaxas.getType() + "',"
                    + "brand = '" + pModelTaxas.getBrand() + "',"
                    + "op = '" + pModelTaxas.getOp() + "',"
                    + "who = '" + pModelTaxas.getWho() + "'"
                + " WHERE "
                    + "id_tax = '" + pModelTaxas.getIdTax() + "'"
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
    * exclui Taxas
    * @param pIdTax
    * @return boolean
    */
    public boolean excluirTaxasDAO(int pIdTax){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM taxas "
                + " WHERE "
                    + "id_tax = '" + pIdTax + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}