/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Melida.model;

/**
 *
 * @author LABMM07
 */
public class Tes {

    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
            System.out.println(1 / 0);
        } catch (java.lang.Exception ex) {
            System.out.println("Error   :" + ex.getMessage());
        }
    }
}
