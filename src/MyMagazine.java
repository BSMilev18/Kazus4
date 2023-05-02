public class MyMagazine extends Magazine {

    public MyMagazine(String title, String author, double price){}

    @Override
    public void getDetail(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }
}
