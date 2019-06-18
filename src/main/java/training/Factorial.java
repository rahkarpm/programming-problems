package training;


/**
 * Factorial Utility class,
 * provides methods to compute factorial of a <strong>non-negative number recursively and non-recursively</strong>.
 *
 * <p><strong>Result scope is bounded by <tt>Integer.MAX_VALUE</tt>,
 * any number whose factorial crosses given result boundary is not accepted. </strong></p>
 *
 * @author Prakhar
 */
public class Factorial {

    // Max number whose Factorial can be expressed as a int.
    private static final int MAX_ALLOWED_NUMBER = calculateMAXAllowedInteger();

    private static int calculateMAXAllowedInteger() {
        int intLimit = Integer.MAX_VALUE;
        int maxAllowedInt = 1;
        
        while (intLimit > 0) {
            maxAllowedInt++;
            intLimit = intLimit / maxAllowedInt;
        }
        
        return maxAllowedInt - 1;
    }

    /**
     * Compute factorial non- recursively
     * <pre>
     *  factorial(n) = 1, if n=0
     *                 n * (n-1) * (n-2) * .... * 1
     * </pre>
     * @param number - number for which factorial to be computed.
     * @return <tt>int</tt> Factorial of <tt>number</tt>
     * @throws IllegalArgumentException - for <tt> number < 0 </tt>  or <tt>@return</tt> is too large for <tt>int</tt>
     */
    public int factorial(int number) throws IllegalArgumentException {
        
        if (number < 0 || number > MAX_ALLOWED_NUMBER) {
            throw new IllegalArgumentException(
                    "Number should be greater or equal to 0 and less or equal to  " + MAX_ALLOWED_NUMBER +
                            " but found : "+number);
        }
        
        int factorial = 1;
        for(;number>1;number--){
            factorial *= number;
        }
        
        return factorial;
    }

    /**
     * Compute factorial recursively
     * <pre>
     *  factorial(n) = 1, if n=0
     *                 n * factorial(n - 1)
     * </pre>
     * @param number - number for which factorial to be computed.
     * @return <tt>int</tt> Factorial of <tt>number</tt>
     * @throws IllegalArgumentException - for <tt> number < 0 </tt>  or <tt>@return</tt> is too large for <tt>int</tt>
     */
    public int factorialUsingRecursion(final int number) throws IllegalArgumentException {
        
        if (number < 0 || number > MAX_ALLOWED_NUMBER) {
            throw new IllegalArgumentException(
                    "Number should be greater or equal to 0 and less or equal to  " + MAX_ALLOWED_NUMBER +
                            " but found : "+number);
        }
        
        //Factorial of 0 is always 1.
        if (number == 0) {
            return 1;
        }
        
        return number * factorialUsingRecursion(number - 1);
    }
}
