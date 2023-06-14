public class Book {
    //price,title,author
    double price;
    String title;
    String author;

    public double getPrice(){
        return price;
    }
    public String afiseaza(){
        return "Cartea "+title+" are ca autor "+author;
    }

}
