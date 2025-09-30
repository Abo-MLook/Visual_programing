package Access_modifer.pack2;

import Access_modifer.pack1.*;  // import all

public class C {

    String defualta = "this Massage is the defualt (no access modifer)";
    public String publicMassage = "this Massage is the public (public modifer)";
    protected String protectedMassage = "this Massage is the protected (protected modifer)";
    private String privateMassage = "this Massage is the private (private modifer)"; // access only here

}

// if we make  public class C  -->  class C  : it will be visable only in this backage whole class
