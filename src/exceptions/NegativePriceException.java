package exceptions;

public class NegativePriceException {

    public NegativePriceException(int price) {
        System.out.println("Price cannot be negative: " + price);
    }
}

//if (price < 0) {
//    throw new NegativePriceException(price);
//}