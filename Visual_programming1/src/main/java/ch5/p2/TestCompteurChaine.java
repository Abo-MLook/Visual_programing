/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.p2;

public class TestCompteurChaine {

    public static void main(String[] args) {

       
        Thread tc = new Thread(new CompteurThread("Compteur 1", 3));

     
        Thread tcc = new Thread(new CompteurChaine("Compteur 2", 3, tc));

   
        tcc.start();
    }
}
