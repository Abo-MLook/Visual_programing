
package basics_oop;

class Food {

    String name;

    Food(String name) {
        this.name = name;
    }
}

//--------- main---------------------------------------
public class Objects_array__L3 {

    public static void main(String[] args) {

        //example of arrays int - char - String
        int[] numbers = new int[3];
        char[] character = new char[10];
        String[] strings = new String[20];

        //example of arrays of objects
        Food[] lunch_box = new Food[3];

        Food dish1 = new Food("rice");
        Food dish2 = new Food("chicken");
        Food dish3 = new Food("banana");

        lunch_box[0] = dish1;
        lunch_box[1] = dish2;
        lunch_box[2] = dish3;

        for (int i = 0; i < lunch_box.length; i++) {
            System.out.println(lunch_box[i].name);

        }

        // other way 
        Food[] lunch_box2 = {dish1, dish2, dish3};

    }

}
