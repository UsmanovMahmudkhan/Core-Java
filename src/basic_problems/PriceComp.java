package basic_problems;

/**
 * Pass Book object to a method to compare two books’ prices.
 */
public class PriceComp {
    public static void main(String[] args) {
        Books_price b1=new Books_price(12);
        Books_price b2=new Books_price(12);
        Books_price.compare(b1,b2);
    }

}

class Books_price{
    int price;

    public Books_price(int price) {
        this.price = price;
    }

    static void compare(Books_price test1, Books_price test2){
        if(test1.price == test2.price){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }
    }


}
