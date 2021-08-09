/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Lucas
 */
public class Calculos {

    public static float taxaPagamento(float valor, float taxa) {
        
        float t;
        
        t = valor - valor/100 * taxa;
        
        return t;
    }

}
