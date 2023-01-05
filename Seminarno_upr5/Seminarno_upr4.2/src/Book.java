public class Book extends Stock{

    String author;
    String name;

    public Book(double price, int number,String author, String name) {
        super(price, number);
        this.author = author;
        this.name = name;

    }


    @Override
    public double checkPromo() {
        Double oldprice = this.getPrice();
        Double newprice = oldprice - (oldprice*0.15);
        return newprice;
    }
}
