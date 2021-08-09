/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


/**
 *
 * @author DEV
 */
public class Formatador {
    
    /**
     * converte a virgula de uma string para ponto
     * @param pString
     * @return double
     */
    public double converterVirgulaParaPonto(String pString){
        String retorno = new String();
        int tamanhoString = pString.length();
        for(int i = 0; i < tamanhoString; i++){
            if(pString.charAt(i) == ','){
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }
    
    public double converterPontoParaVirgulaPDV(String pString){
        String retorno = new String();
        int tamanhoString = pString.length();
        for(int i = 0; i < tamanhoString; i++){
            if(pString.charAt(i) == ','){
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }
    
    public float converterPontoParaVirgula(String pString){
        String retorno = new String();
        int tamanhoString = pString.length();
        for(int i = 0; i < tamanhoString; i++){
            if(pString.charAt(i) == '.'){
                retorno += ',';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return Float.parseFloat(retorno);
    }
    
    public float converterPontoParaVirgula(float pValor){
        String retorno = new String();
        String c = String.valueOf(pValor);
        int tamanhoString = c.length();
        for(int i = 0; i < tamanhoString; i++){
            if(c.charAt(i) == '.'){
                retorno += ',';
            } else {
                retorno += c.charAt(i);
            }
        }
        return Float.parseFloat(retorno);
    }

    public String converterPontoParaVirgulaTable(String soma) {
        String retorno = new String();
        int tamanhoString = soma.length();
        for(int i = 0; i < tamanhoString; i++){
            if(soma.charAt(i) == '.'){
                retorno += ',';
            } else {
                retorno += soma.charAt(i);
            }
        }
        return "R$ "+retorno;
    }
    
    public String converterVirgulaParaPontoLucas(String soma) {
        String retorno = new String();
        int tamanhoString = soma.length();
        for(int i = 0; i < tamanhoString; i++){
            if(soma.charAt(i) == '.'){
                retorno += ',';
            } else {
                retorno += soma.charAt(i);
            }
        }
        return retorno;
    }
}
