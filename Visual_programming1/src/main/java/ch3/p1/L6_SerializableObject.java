/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3.p1;


import java.io. *;
public class L6_SerializableObject implements Serializable {
 private int abscissa, ordinate;
 public L6_SerializableObject (int x, int y) {
 abscissa = x;
 ordinate= y;
 }
 public int getAbscissa(){
 return abscissa;
 }
}