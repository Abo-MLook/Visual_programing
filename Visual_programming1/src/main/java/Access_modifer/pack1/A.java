
package Access_modifer.pack1;
import Access_modifer.pack2.*;

public class A {
 
    protected String protectedMassageA = "this Massage is the protected (protected modifer)"; // access by this package or subclass of any other backage

    
    
    public static void main(String[] args) {
        C o = new C();
       // System.out.println(o.defualta);      // can not be access in this package only in that package
        System.out.println(o.publicMassage);  // can be access form another package because it is public
       // System.out.println(o.protectedMassage); //  can not be access in this package only in that package or subclass
    }
}
