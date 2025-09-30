
package Access_modifer.pack2;

// import Access_modifer.pack1.A;  import class A
import Access_modifer.pack1.*;  // import all

public class Asub extends A {
    
    public static void main(String[] args) {
        C oc = new C();
        System.out.println(oc.defualta); // can be access because in same package
        
        A oa = new A();
        System.out.println(oa.protectedMassageA);
        
    }
}
