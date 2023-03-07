package exceptions;

public class InvalidPlayerRangeException {

    public InvalidPlayerRangeException(int minP, int maxP) {
        System.out.println("Minimum number of players (" + minP + ") cannot be greater than maximum number of players (" + maxP+ ")");
  
    }

}

//if (minP > maxP) {
//    throw new InvalidPlayerRangeException(minP, maxP);
//}