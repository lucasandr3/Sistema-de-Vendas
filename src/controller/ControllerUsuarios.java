package controller;

import model.ModelUsuarios;
import DAO.DAOUsuarios;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerUsuarios {

    private DAOUsuarios daoUsuarios = new DAOUsuarios();

    /**
    * grava Usuarios
    * @param pModelUsuarios
    * @return int
    */
    public int salvarUsuariosController(ModelUsuarios pModelUsuarios){
        return this.daoUsuarios.salvarUsuariosDAO(pModelUsuarios);
    }

    /**
    * recupera Usuarios
    * @param pIdUser
    * @return ModelUsuarios
    */
    public ModelUsuarios getUsuariosController(int pIdUser){
        return this.daoUsuarios.getUsuariosDAO(pIdUser);
    }

    /**
    * recupera uma lista deUsuarios
    * @param pIdUser
    * @return ArrayList
    */
    public ArrayList<ModelUsuarios> getListaUsuariosController(){
        return this.daoUsuarios.getListaUsuariosDAO();
    }

    /**
    * atualiza Usuarios
    * @param pModelUsuarios
    * @return boolean
    */
    public boolean atualizarUsuariosController(ModelUsuarios pModelUsuarios){
        return this.daoUsuarios.atualizarUsuariosDAO(pModelUsuarios);
    }

    /**
    * exclui Usuarios
    * @param pIdUser
    * @return boolean
    */
    public boolean excluirUsuariosController(int pIdUser){
        return this.daoUsuarios.excluirUsuariosDAO(pIdUser);
    }
    
    /**
     * valida login e senha do usuario
     * @param pModelUsuario
     * @return 
     */
    public boolean getValidarUsuarioController(ModelUsuarios pModelUsuario) {
        return this.daoUsuarios.getValidarUsuarioDao(pModelUsuario);
    }
    
    /**
    * recupera Usuario
    * @param pLogin
    * @return ModelUsuario
    */
    public ModelUsuarios getUsuarioController(String pLogin){
        return this.daoUsuarios.getUsuarioDAO(pLogin);
    }
}