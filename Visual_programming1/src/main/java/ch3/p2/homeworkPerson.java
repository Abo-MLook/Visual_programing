/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3.p2;

import java.io.*;





public class homeworkPerson implements Serializable {

    private String name;
    private String firstname;
    private int birthday;

    public homeworkPerson(String name, String firstname, int birthday) {
        this.name = name;
        this.firstname = firstname;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", firstname=" + firstname + ", birthday=" + birthday + "]";
    }
    
    public String getname(){
    return name;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    
    
    
}
