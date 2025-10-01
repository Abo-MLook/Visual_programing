
package basics_oop.labs.lab1.ex1;

/**
 *
 * @author memom
 */
public class Person {
    private String lastname ;
    private String firstname ;

    public Person(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }
    
    
    void displaysPerson(){
        System.out.println("First name : " + firstname + "\nLast name : " + lastname);
    }
    
}
