package controller;

import model.ModelUnidades;
import DAO.DAOUnidades;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerUnidades {

    private DAOUnidades daoUnidades = new DAOUnidades();

    /**
    * grava Unidades
    * @param pModelUnidades
    * @return int
    */
    public int salvarUnidadesController(ModelUnidades pModelUnidades){
        return this.daoUnidades.salvarUnidadesDAO(pModelUnidades);
    }

    /**
    * recupera Unidades
    * @param pIdUnit
    * @return ModelUnidades
    */
    public ModelUnidades getUnidadesController(int pIdUnit){
        return this.daoUnidades.getUnidadesDAO(pIdUnit);
    }

    /**
    * recupera uma lista deUnidades
    * @param pIdUnit
    * @return ArrayList
    */
    public ArrayList<ModelUnidades> getListaUnidadesController(){
        return this.daoUnidades.getListaUnidadesDAO();
    }

    /**
    * atualiza Unidades
    * @param pModelUnidades
    * @return boolean
    */
    public boolean atualizarUnidadesController(ModelUnidades pModelUnidades){
        return this.daoUnidades.atualizarUnidadesDAO(pModelUnidades);
    }

    /**
    * exclui Unidades
    * @param pIdUnit
    * @return boolean
    */
    public boolean excluirUnidadesController(int pIdUnit){
        return this.daoUnidades.excluirUnidadesDAO(pIdUnit);
    }

    public ModelUnidades getUnidadeNomeController(String nomeUnidade) {
        return this.daoUnidades.getUnidadeNomeDAO(nomeUnidade);
    }
}