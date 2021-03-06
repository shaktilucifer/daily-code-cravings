// Declare your class here. Do not use the 'public' access modifier.
import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book{
    // Declare the price instance variable
    int price;
       /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    MyBook(String title, String author, int price){
        super(title,author);
        this.title = title;
        this.author = author;
        this.price = price;
    }
     
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    public void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
    }
    
}  
