package DAO;

import conexoes.ConexaoMySql;
import model.ModelCliente;
import java.util.ArrayList;

/**
 *
 * @author Lucas Vieira
 */
public class DAOCliente extends ConexaoMySql {

    /**
     * grava Cliente
     *
     * @param pModelCliente
     * @return int
     */
    public int salvarClienteDAO(ModelCliente pModelCliente) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO clients ("
                    + "id_cliente,"
                    + "name,"
                    + "email,"
                    + "phone,"
                    + "birthdate,"
                    + "address,"
                    + "address_number,"
                    + "address_neighb,"
                    + "address_city,"
                    + "address_state,"
                    + "address_zipcode,"
                    + "internal_obs,"
                    + "date_create,"
                    + "status"
                    + ") VALUES ("
                    + "'" + pModelCliente.getIdCliente() + "',"
                    + "'" + pModelCliente.getName() + "',"
                    + "'" + pModelCliente.getEmail() + "',"
                    + "'" + pModelCliente.getPhone() + "',"
                    + "'" + pModelCliente.getBirthdate() + "',"
                    + "'" + pModelCliente.getAddress() + "',"
                    + "'" + pModelCliente.getAddressNumber() + "',"
                    + "'" + pModelCliente.getAddressNeighb() + "',"
                    + "'" + pModelCliente.getAddressCity() + "',"
                    + "'" + pModelCliente.getAddressState() + "',"
                    + "'" + pModelCliente.getAddressZipcode() + "',"
                    + "'" + pModelCliente.getInternalObs() + "',"
                    + "'" + pModelCliente.getDateCreate() + "',"
                    + "'" + pModelCliente.getStatus() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Cliente
     *
     * @param pIdCliente
     * @return ModelCliente
     */
    public ModelCliente getClienteDAO(int pIdCliente) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_cliente,"
                    + "name,"
                    + "email,"
                    + "phone,"
                    + "birthdate,"
                    + "address,"
                    + "address_number,"
                    + "address_neighb,"
                    + "address_city,"
                    + "address_state,"
                    + "address_zipcode,"
                    + "internal_obs,"
                    + "date_create,"
                    + "status"
                    + " FROM"
                    + " clients"
                    + " WHERE"
                    + " id_cliente = '" + pIdCliente + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setName(this.getResultSet().getString(2));
                modelCliente.setEmail(this.getResultSet().getString(3));
                modelCliente.setPhone(this.getResultSet().getString(4));
                modelCliente.setBirthdate(this.getResultSet().getString(5));
                modelCliente.setAddress(this.getResultSet().getString(6));
                modelCliente.setAddressNumber(this.getResultSet().getString(7));
                modelCliente.setAddressNeighb(this.getResultSet().getString(8));
                modelCliente.setAddressCity(this.getResultSet().getString(9));
                modelCliente.setAddressState(this.getResultSet().getString(10));
                modelCliente.setAddressZipcode(this.getResultSet().getString(11));
                modelCliente.setInternalObs(this.getResultSet().getString(12));
                modelCliente.setDateCreate(this.getResultSet().getString(13));
                modelCliente.setStatus(this.getResultSet().getInt(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
     * recupera uma lista de Cliente
     *
     * @return ArrayList
     */
    public ArrayList<ModelCliente> getListaClienteDAO() {
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_cliente,"
                    + "name,"
                    + "email,"
                    + "phone,"
                    + "birthdate,"
                    + "address,"
                    + "address_number,"
                    + "address_neighb,"
                    + "address_city,"
                    + "address_state,"
                    + "address_zipcode,"
                    + "internal_obs,"
                    + "date_create,"
                    + "status"
                    + " FROM"
                    + " clients"
                    + " WHERE"
                    + " status = '0'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente = new ModelCliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setName(this.getResultSet().getString(2));
                modelCliente.setEmail(this.getResultSet().getString(3));
                modelCliente.setPhone(this.getResultSet().getString(4));
                modelCliente.setBirthdate(this.getResultSet().getString(5));
                modelCliente.setAddress(this.getResultSet().getString(6));
                modelCliente.setAddressNumber(this.getResultSet().getString(7));
                modelCliente.setAddressNeighb(this.getResultSet().getString(8));
                modelCliente.setAddressCity(this.getResultSet().getString(9));
                modelCliente.setAddressState(this.getResultSet().getString(10));
                modelCliente.setAddressZipcode(this.getResultSet().getString(11));
                modelCliente.setInternalObs(this.getResultSet().getString(12));
                modelCliente.setDateCreate(this.getResultSet().getString(13));
                modelCliente.setStatus(this.getResultSet().getInt(14));
                listamodelCliente.add(modelCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
     * atualiza Cliente
     *
     * @param pModelCliente
     * @return boolean
     */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE clients SET "
                    + "id_cliente = '" + pModelCliente.getIdCliente() + "',"
                    + "name = '" + pModelCliente.getName() + "',"
                    + "email = '" + pModelCliente.getEmail() + "',"
                    + "phone = '" + pModelCliente.getPhone() + "',"
                    + "birthdate = '" + pModelCliente.getBirthdate() + "',"
                    + "address = '" + pModelCliente.getAddress() + "',"
                    + "address_number = '" + pModelCliente.getAddressNumber() + "',"
                    + "address_neighb = '" + pModelCliente.getAddressNeighb() + "',"
                    + "address_city = '" + pModelCliente.getAddressCity() + "',"
                    + "address_state = '" + pModelCliente.getAddressState() + "',"
                    + "address_zipcode = '" + pModelCliente.getAddressZipcode() + "',"
                    + "internal_obs = '" + pModelCliente.getInternalObs() + "',"
                    + "date_create = '" + pModelCliente.getDateCreate() + "',"
                    + "status = '" + pModelCliente.getStatus() + "'"
                    + " WHERE "
                    + "id_cliente = '" + pModelCliente.getIdCliente() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Cliente
     *
     * @param pIdCliente
     * @return boolean
     */
    public boolean excluirClienteDAO(int pIdCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM clients "
                    + " WHERE "
                    + "id_cliente = '" + pIdCliente + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean desativarClienteDAO(int codigoCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE clients SET status = 1"
                    + " WHERE "
                    + "id_cliente = '" + codigoCliente + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ArrayList<ModelCliente> getListaClienteInativosDAO() {
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_cliente,"
                    + "name,"
                    + "email,"
                    + "phone,"
                    + "birthdate,"
                    + "address,"
                    + "address_number,"
                    + "address_neighb,"
                    + "address_city,"
                    + "address_state,"
                    + "address_zipcode,"
                    + "internal_obs,"
                    + "date_create,"
                    + "status"
                    + " FROM"
                    + " clients"
                    + " WHERE"
                    + " status = '1'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente = new ModelCliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setName(this.getResultSet().getString(2));
                modelCliente.setEmail(this.getResultSet().getString(3));
                modelCliente.setPhone(this.getResultSet().getString(4));
                modelCliente.setBirthdate(this.getResultSet().getString(5));
                modelCliente.setAddress(this.getResultSet().getString(6));
                modelCliente.setAddressNumber(this.getResultSet().getString(7));
                modelCliente.setAddressNeighb(this.getResultSet().getString(8));
                modelCliente.setAddressCity(this.getResultSet().getString(9));
                modelCliente.setAddressState(this.getResultSet().getString(10));
                modelCliente.setAddressZipcode(this.getResultSet().getString(11));
                modelCliente.setInternalObs(this.getResultSet().getString(12));
                modelCliente.setDateCreate(this.getResultSet().getString(13));
                modelCliente.setStatus(this.getResultSet().getInt(14));
                listamodelCliente.add(modelCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    public boolean ativarClienteDAO(int codigoCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE clients SET status = 0"
                    + " WHERE "
                    + "id_cliente = '" + codigoCliente + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
     public ModelCliente getClienteNomeDAO(String pClienteNome) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_cliente,"
                    + "name,"
                    + "email,"
                    + "phone,"
                    + "birthdate,"
                    + "address,"
                    + "address_number,"
                    + "address_neighb,"
                    + "address_city,"
                    + "address_state,"
                    + "address_zipcode,"
                    + "internal_obs,"
                    + "date_create,"
                    + "status"
                    + " FROM"
                    + " clients"
                    + " WHERE"
                    + " name = '" + pClienteNome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setName(this.getResultSet().getString(2));
                modelCliente.setEmail(this.getResultSet().getString(3));
                modelCliente.setPhone(this.getResultSet().getString(4));
                modelCliente.setBirthdate(this.getResultSet().getString(5));
                modelCliente.setAddress(this.getResultSet().getString(6));
                modelCliente.setAddressNumber(this.getResultSet().getString(7));
                modelCliente.setAddressNeighb(this.getResultSet().getString(8));
                modelCliente.setAddressCity(this.getResultSet().getString(9));
                modelCliente.setAddressState(this.getResultSet().getString(10));
                modelCliente.setAddressZipcode(this.getResultSet().getString(11));
                modelCliente.setInternalObs(this.getResultSet().getString(12));
                modelCliente.setDateCreate(this.getResultSet().getString(13));
                modelCliente.setStatus(this.getResultSet().getInt(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }
}
