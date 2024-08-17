import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        // Convert the input strings to BigInteger
        BigInteger i = new BigInteger(num1);
        BigInteger j = new BigInteger(num2);
        
        // Multiply the BigInteger values
        BigInteger product = i.multiply(j);
        
        // Convert the product back to a string and return it
        return product.toString();
    }
}
