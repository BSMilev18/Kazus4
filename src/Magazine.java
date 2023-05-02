public abstract class Magazine{

    private String title;
    private String author;
    private double price;

    public abstract void getDetail();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}