
package basics_oop.labs.lab1.ex1;


public class Organize {
    private int nbfilm = 0 ,maxfilm ;
    private Film[] tabfilms;

    public Organize(int maxfilm) {
        this.maxfilm = maxfilm;
        this.tabfilms = new Film[maxfilm];
    }
    
    
    
    
    
    
    void addfilm(Film f){
     if(nbfilm ==maxfilm){
         System.out.println("List is full sorry");
         return;
     }
    
    tabfilms[nbfilm] = f;
    nbfilm++;
    
    }
    
    void display_list(){
     if(this.nbfilm == 0 ){
         System.out.println("The list is empty");
     }
     
     for(int i = 0; i < nbfilm; i++) {
        System.out.println(tabfilms[i]);
    }
    
    }
    
    
    void searchMovie(String nameFilm){
     if(this.nbfilm == 0 ){
         System.out.println("The list is empty, so nothing to search for");
     }
     
     for(int i = 0; i < nbfilm; i++){
         if(tabfilms[i].getTitle() == nameFilm){
             System.out.println("Film exist\n"+tabfilms[i]);
             return;
         }
     }
     
        System.out.println("Sorry , it is not there");
    
    }

   
    
    
}
