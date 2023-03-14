public class Disco {
  //ATRIBUTOS///////////////////////////////////////////////////////////
    private String code = "LIBRE", author, title, genre;
    private int duration;





  //MÉTODOS/////////////////////////////////////////////////////////////
    //Constructor///////////////////
    public Disco() {}

    public Disco(String code, String author, String title, String genre, int duration) {
      this.code = code;
      this.author = author;
      this.title = title;
      this.genre = genre;
      this.duration = duration;
    }

  //Getter////////////////////////
    public String getCode() {return this.code;}
    public String getAuthor() {return this.author;}
    public String getTitle() {return this.title;}
    public String getGenre() {return this.genre;}
    public int getDuration() {return this.duration;}



    //Setter///////////////////////
    public void setCode(String c) {this.code = c;}
    public void setAuthor(String a) {this.author = a;}
    public void setTitle(String t) {this.title = t;}
    public void setGenre(String g) {this.genre = g;}
    public void setDuration(int d) {this.duration = d;}



    public String toString() {
        String cadena = "\n________________________________" +
                "\nCódigo: " + this.code +
                "\nAutor: " + this.author +
                "\nTítulo: " + this.title +
                "\nGénero " + this.genre +
                "\nDuración: " + this.duration +
                "\n--------------------------------\n";


        return cadena;
    }
}
