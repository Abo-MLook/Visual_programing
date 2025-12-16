/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.lab.ex1;


public  class Point {
    int x,y;
    
    public Point(int x,int y){this.x=x;this.y = y;}
    
    void scale(int dx,int dy){
    this.x +=dx;
    this.y +=dy;
    }
    
    public String toString(){return "("+this.x + " , "+this.y+")";}

    
    
    
}
