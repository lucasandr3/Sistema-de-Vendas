package controller;

import model.ModelCategorias;
import DAO.DAOCategorias;
import java.util.ArrayList;

/**
*
* @author Lucas Vieira
*/
public class ControllerCategorias {

    private DAOCategorias daoCategorias = new DAOCategorias();

    /**
    * grava Categorias
    * @param pModelCategorias
    * @return int
    */
    public int salvarCategoriasController(ModelCategorias pModelCategorias){
        return this.daoCategorias.salvarCategoriasDAO(pModelCategorias);
    }

    /**
    * recupera Categorias
    * @param pIdCat
    * @return ModelCategorias
    */
    public ModelCategorias getCategoriasController(int pIdCat){
        return this.daoCategorias.getCategoriasDAO(pIdCat);
    }

    /**
    * recupera uma lista deCategorias
    * @param pIdCat
    * @return ArrayList
    */
    public ArrayList<ModelCategorias> getListaCategoriasController(){
        return this.daoCategorias.getListaCategoriasDAO();
    }

    /**
    * atualiza Categorias
    * @param pModelCategorias
    * @return boolean
    */
    public boolean atualizarCategoriasController(ModelCategorias pModelCategorias){
        return this.daoCategorias.atualizarCategoriasDAO(pModelCategorias);
    }

    /**
    * exclui Categorias
    * @param pIdCat
    * @return boolean
    */
    public boolean excluirCategoriasController(int pIdCat){
        return this.daoCategorias.excluirCategoriasDAO(pIdCat);
    }

    public ModelCategorias getCategoriaNomeController(String nomeCategoria) {
        return this.daoCategorias.getCategoriaNomeDAO(nomeCategoria);
    }
}