
package basics_oop.labs.lab1.ex1;



public class Film {
    private String title , genre , id ;
   private Date date ;

    public Film(String title, String genre, String id, Date date) {
        this.title = title;
        this.genre = genre;
        this.id = id;
        this.date = date;
    }
   public Film(String title, String genre, String id, int d, int m, int y) {
        this(title,genre,id, new Date(d, m,y));
    }
   public String toString(){
       return "Film [" + "Title : "+ title + ",\tGenre : "+genre + "\t id:"+id + "\t" + date ;
   }
    void displayFilm(){
        System.out.println(this);  // this refer to same object wich we change it is addres to its values
    }
    
     public String getTitle() {
        return title;
    }
    
}
