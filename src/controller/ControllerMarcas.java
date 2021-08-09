package controller;

import model.ModelMarcas;
import DAO.DAOMarcas;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerMarcas {

    private DAOMarcas daoMarcas = new DAOMarcas();

    /**
    * grava Marcas
    * @param pModelMarcas
    * @return int
    */
    public int salvarMarcasController(ModelMarcas pModelMarcas){
        return this.daoMarcas.salvarMarcasDAO(pModelMarcas);
    }

    /**
    * recupera Marcas
    * @param pId
    * @return ModelMarcas
    */
    public ModelMarcas getMarcasController(int pId){
        return this.daoMarcas.getMarcasDAO(pId);
    }

    /**
    * recupera uma lista deMarcas
    * @param pId
    * @return ArrayList
    */
    public ArrayList<ModelMarcas> getListaMarcasController(){
        return this.daoMarcas.getListaMarcasDAO();
    }

    /**
    * atualiza Marcas
    * @param pModelMarcas
    * @return boolean
    */
    public boolean atualizarMarcasController(ModelMarcas pModelMarcas){
        return this.daoMarcas.atualizarMarcasDAO(pModelMarcas);
    }

    /**
    * exclui Marcas
    * @param pId
    * @return boolean
    */
    public boolean excluirMarcasController(int pId){
        return this.daoMarcas.excluirMarcasDAO(pId);
    }

    public ModelMarcas getMarcasNomeController(String nomeMarca) {
        return this.daoMarcas.getMarcasNomeMarcaDAO(nomeMarca);
    }
}