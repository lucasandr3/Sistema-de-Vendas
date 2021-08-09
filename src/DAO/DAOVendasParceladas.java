package DAO;

import model.ModelVendasParceladas;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Lucas Vieira
*/
public class DAOVendasParceladas extends ConexaoMySql {

    /**
    * grava VendasParceladas
    * @param pModelVendasParceladas
    * @return int
    */
    public int salvarVendasParceladasDAO(ModelVendasParceladas pModelVendasParceladas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO vendas_parceladas ("
                    + "id_venda_parcelada,"
                    + "id_venda,"
                    + "id_cliente,"
                    + "quantidade_parcelas,"
                    + "valor_parcela,"
                    + "juros,"
                    + "vencimento"
                + ") VALUES ("
                    + "'" + pModelVendasParceladas.getIdVendaParcelada() + "',"
                    + "'" + pModelVendasParceladas.getIdVenda() + "',"
                    + "'" + pModelVendasParceladas.getIdCliente() + "',"
                    + "'" + pModelVendasParceladas.getQuantidadeParcelas() + "',"
                    + "'" + pModelVendasParceladas.getValorParcela() + "',"
                    + "'" + pModelVendasParceladas.getJuros() + "',"
                    + "'" + pModelVendasParceladas.getVencimento() + "'"
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
    * recupera VendasParceladas
    * @param pIdVendaParcelada
    * @return ModelVendasParceladas
    */
    public ModelVendasParceladas getVendasParceladasDAO(int pIdVendaParcelada){
        ModelVendasParceladas modelVendasParceladas = new ModelVendasParceladas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda_parcelada,"
                    + "id_venda,"
                    + "id_cliente,"
                    + "quantidade_parcelas,"
                    + "valor_parcela,"
                    + "juros,"
                    + "vencimento"
                 + " FROM"
                     + " vendas_parceladas"
                 + " WHERE"
                     + " id_venda_parcelada = '" + pIdVendaParcelada + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasParceladas.setIdVendaParcelada(this.getResultSet().getInt(1));
                modelVendasParceladas.setIdVenda(this.getResultSet().getInt(2));
                modelVendasParceladas.setIdCliente(this.getResultSet().getInt(3));
                modelVendasParceladas.setQuantidadeParcelas(this.getResultSet().getInt(4));
                modelVendasParceladas.setValorParcela(this.getResultSet().getInt(5));
                modelVendasParceladas.setJuros(this.getResultSet().getFloat(6));
                modelVendasParceladas.setVencimento(this.getResultSet().getString(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasParceladas;
    }

    /**
    * recupera uma lista de VendasParceladas
        * @return ArrayList
    */
    public ArrayList<ModelVendasParceladas> getListaVendasParceladasDAO(){
        ArrayList<ModelVendasParceladas> listamodelVendasParceladas = new ArrayList();
        ModelVendasParceladas modelVendasParceladas = new ModelVendasParceladas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda_parcelada,"
                    + "id_venda,"
                    + "id_cliente,"
                    + "quantidade_parcelas,"
                    + "valor_parcela,"
                    + "juros,"
                    + "vencimento"
                 + " FROM"
                     + " vendas_parceladas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasParceladas = new ModelVendasParceladas();
                modelVendasParceladas.setIdVendaParcelada(this.getResultSet().getInt(1));
                modelVendasParceladas.setIdVenda(this.getResultSet().getInt(2));
                modelVendasParceladas.setIdCliente(this.getResultSet().getInt(3));
                modelVendasParceladas.setQuantidadeParcelas(this.getResultSet().getInt(4));
                modelVendasParceladas.setValorParcela(this.getResultSet().getInt(5));
                modelVendasParceladas.setJuros(this.getResultSet().getFloat(6));
                modelVendasParceladas.setVencimento(this.getResultSet().getString(7));
                listamodelVendasParceladas.add(modelVendasParceladas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasParceladas;
    }

    /**
    * atualiza VendasParceladas
    * @param pModelVendasParceladas
    * @return boolean
    */
    public boolean atualizarVendasParceladasDAO(ModelVendasParceladas pModelVendasParceladas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE vendas_parceladas SET "
                    + "id_venda_parcelada = '" + pModelVendasParceladas.getIdVendaParcelada() + "',"
                    + "id_venda = '" + pModelVendasParceladas.getIdVenda() + "',"
                    + "id_cliente = '" + pModelVendasParceladas.getIdCliente() + "',"
                    + "quantidade_parcelas = '" + pModelVendasParceladas.getQuantidadeParcelas() + "',"
                    + "valor_parcela = '" + pModelVendasParceladas.getValorParcela() + "',"
                    + "juros = '" + pModelVendasParceladas.getJuros() + "',"
                    + "vencimento = '" + pModelVendasParceladas.getVencimento() + "'"
                + " WHERE "
                    + "id_venda_parcelada = '" + pModelVendasParceladas.getIdVendaParcelada() + "'"
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
    * exclui VendasParceladas
    * @param pIdVendaParcelada
    * @return boolean
    */
    public boolean excluirVendasParceladasDAO(int pIdVendaParcelada){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM vendas_parceladas "
                + " WHERE "
                    + "id_venda_parcelada = '" + pIdVendaParcelada + "'"
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