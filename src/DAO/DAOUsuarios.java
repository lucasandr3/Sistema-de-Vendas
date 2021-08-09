package DAO;

import conexoes.ConexaoMySql;
import model.ModelUsuarios;
import java.util.ArrayList;

/**
 *
 * @author Lucas Vieira
 */
public class DAOUsuarios extends ConexaoMySql {

    /**
     * grava Usuarios
     *
     * @param pModelUsuarios
     * @return int
     */
    public int salvarUsuariosDAO(ModelUsuarios pModelUsuarios) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO users ("
                    + "id_user,"
                    + "id_permissao,"
                    + "name,"
                    + "email,"
                    + "password,"
                    + "pass_discount,"
                    + "pass_cancel_sale,"
                    + "status,"
                    + "date_create"
                    + ") VALUES ("
                    + "'" + pModelUsuarios.getIdUser() + "',"
                    + "'" + pModelUsuarios.getIdPermissao() + "',"
                    + "'" + pModelUsuarios.getName() + "',"
                    + "'" + pModelUsuarios.getEmail() + "',"
                    + "'" + pModelUsuarios.getPassword() + "',"
                    + "'" + pModelUsuarios.getPassDiscount() + "',"
                    + "'" + pModelUsuarios.getPassCancelSale() + "',"
                    + "'" + pModelUsuarios.getStatus() + "',"
                    + "'" + pModelUsuarios.getDateCreate() + "'"
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
     * recupera Usuarios
     *
     * @param pIdUser
     * @return ModelUsuarios
     */
    public ModelUsuarios getUsuariosDAO(int pIdUser) {
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_user,"
                    + "id_permissao,"
                    + "name,"
                    + "email,"
                    + "password,"
                    + "pass_discount,"
                    + "pass_cancel_sale,"
                    + "status,"
                    + "date_create"
                    + " FROM"
                    + " users"
                    + " WHERE"
                    + " id_user = '" + pIdUser + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuarios.setIdUser(this.getResultSet().getInt(1));
                modelUsuarios.setIdPermissao(this.getResultSet().getInt(2));
                modelUsuarios.setName(this.getResultSet().getString(3));
                modelUsuarios.setEmail(this.getResultSet().getString(4));
                modelUsuarios.setPassword(this.getResultSet().getString(5));
                modelUsuarios.setPassDiscount(this.getResultSet().getString(6));
                modelUsuarios.setPassCancelSale(this.getResultSet().getString(7));
                modelUsuarios.setStatus(this.getResultSet().getInt(8));
                modelUsuarios.setDateCreate(this.getResultSet().getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuarios;
    }

    /**
     * recupera uma lista de Usuarios
     *
     * @return ArrayList
     */
    public ArrayList<ModelUsuarios> getListaUsuariosDAO() {
        ArrayList<ModelUsuarios> listamodelUsuarios = new ArrayList();
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_user,"
                    + "id_permissao,"
                    + "name,"
                    + "email,"
                    + "password,"
                    + "pass_discount,"
                    + "pass_cancel_sale,"
                    + "status,"
                    + "date_create"
                    + " FROM"
                    + " users"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuarios = new ModelUsuarios();
                modelUsuarios.setIdUser(this.getResultSet().getInt(1));
                modelUsuarios.setIdPermissao(this.getResultSet().getInt(2));
                modelUsuarios.setName(this.getResultSet().getString(3));
                modelUsuarios.setEmail(this.getResultSet().getString(4));
                modelUsuarios.setPassword(this.getResultSet().getString(5));
                modelUsuarios.setPassDiscount(this.getResultSet().getString(6));
                modelUsuarios.setPassCancelSale(this.getResultSet().getString(7));
                modelUsuarios.setStatus(this.getResultSet().getInt(8));
                modelUsuarios.setDateCreate(this.getResultSet().getString(9));
                listamodelUsuarios.add(modelUsuarios);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUsuarios;
    }

    /**
     * atualiza Usuarios
     *
     * @param pModelUsuarios
     * @return boolean
     */
    public boolean atualizarUsuariosDAO(ModelUsuarios pModelUsuarios) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE users SET "
                    + "id_user = '" + pModelUsuarios.getIdUser() + "',"
                    + "id_permissao = '" + pModelUsuarios.getIdPermissao() + "',"
                    + "name = '" + pModelUsuarios.getName() + "',"
                    + "email = '" + pModelUsuarios.getEmail() + "',"
                    + "password = '" + pModelUsuarios.getPassword() + "',"
                    + "pass_discount = '" + pModelUsuarios.getPassDiscount() + "',"
                    + "pass_cancel_sale = '" + pModelUsuarios.getPassCancelSale()+ "',"
                    + "status = '" + pModelUsuarios.getStatus() + "',"
                    + "date_create = '" + pModelUsuarios.getDateCreate() + "'"
                    + " WHERE "
                    + "id_user = '" + pModelUsuarios.getIdUser() + "'"
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
     * exclui Usuarios
     *
     * @param pIdUser
     * @return boolean
     */
    public boolean excluirUsuariosDAO(int pIdUser) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM users "
                    + " WHERE "
                    + "id_user = '" + pIdUser + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean getValidarUsuarioDao(ModelUsuarios pModelUsuario) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_user,"
                    + "id_permissao,"
                    + "name,"
                    + "email,"
                    + "password,"
                    + "pass_discount,"
                    + "pass_cancel_sale,"
                    + "status,"
                    + "date_create"
                    + " FROM"
                    + " users"
                    + " WHERE"
                    + " email = '" + pModelUsuario.getEmail() + "' AND password = '" + pModelUsuario.getPassword() + "'"
                    + ";"
            );

            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Usuario
     *
     * @param pIdUsuario
     * @return ModelUsuario
     */
    public ModelUsuarios getUsuarioDAO(String pLogin) {
        ModelUsuarios modelUsuario = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "users.id_user,"
                    + "users.name,"
                    + "users.email,"
                    + "users.pass_discount,"
                    + "users.pass_cancel_sale,"
                    + "permission_groups.nome_group"
                    + " FROM"
                    + " users "
                    + "INNER JOIN permission_groups ON(users.id_permissao = permission_groups.id_group) "
                    + "WHERE"
                    + " email = '" + pLogin + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario.setIdUser((this.getResultSet().getInt(1)));
                modelUsuario.setName(this.getResultSet().getString(2));
                modelUsuario.setEmail(this.getResultSet().getString(3));
                modelUsuario.setPassDiscount(this.getResultSet().getString(4));
                modelUsuario.setPassCancelSale(this.getResultSet().getString(5));
                modelUsuario.setFuncao(this.getResultSet().getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }
}
