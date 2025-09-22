package basics_oop;

public class Statics_inClass__L5 {

    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and (((shared))).
        //			The class "owns" the static member
        Friend friend1 = new Friend("Sponegbob");
        System.out.println(Friend.numberOfFriends);
        
        Friend friend2 = new Friend("Patrick");
        System.out.println(Friend.numberOfFriends);
        
        Friend friend3 = new Friend("ippo");
        System.out.println(Friend.numberOfFriends);
    }
}
//**********************************************

class Friend {

    String name;

    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }
    
    static void displayFriends() {
    System.out.println("You have " + numberOfFriends + " friends");
}

}//**********************************************

