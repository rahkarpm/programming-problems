package training;

/**
 * Fibonacci Utility class, provides methods to find Fibonacci series value of a given
 * <strong>non-negative position without, single and double recursion</strong>.
 *
 * @author Prakhar
 */
public class Fibonacci
{

    /**
     * Find Fibonacci series value at given position without recursion
     *
     * @param - fibSeriesPosition, non-negative number position
     */
    public int fib(int fibSeriesPosition)
    {
        if (fibSeriesPosition < 0)
        {
            throw new IllegalArgumentException(
                "Position should be a non-negative number but found:" + fibSeriesPosition);
        }

        int nFib_0 = 0;
        int nFib_1 = 1;

        // Handles the case of postion input of 0,1.
        int nFibRes = fibSeriesPosition;

        int idxPos;
        for (idxPos = 2; idxPos <= fibSeriesPosition; idxPos++)
        {
            nFibRes = nFib_0 + nFib_1;
            nFib_0 = nFib_1;
            nFib_1 = nFibRes;
        }

        return nFibRes;
    }

    /**
     * Find Fibonacci series value at given position recursively.
     *
     * @param - fibSeriesPosition, non-negative number position
     */
    public int fibUsingDoubleRecursion(int fibSeriesPosition)
    {
        if (fibSeriesPosition < 0)
        {
            throw new IllegalArgumentException(
                "Position should be a non-negative number but found:" + fibSeriesPosition);
        }

        if (fibSeriesPosition <= 1)
        {
            return fibSeriesPosition;
        }

        return (fibUsingDoubleRecursion(fibSeriesPosition - 1) + fibUsingDoubleRecursion(
            fibSeriesPosition - 2));
    }

    /**
     * Find Fibonacci series value at given position with single recursion.
     *
     * @param - fibSeriesPosition, non-negative number position
     */
    public int fibUsingSingleRecursion(int fibSeriesPosition)
    {
        return fibUsingSingleRecursion(fibSeriesPosition, new int[1]);
    }

    private int fibUsingSingleRecursion(int pos, int[] anPrevFib)
    {
        if (pos < 0)
        {
            throw new IllegalArgumentException();
        }

        if (pos <= 1)
        {
            anPrevFib[0] = 0;
            return pos;
        }

        int nFib_0 = fibUsingSingleRecursion(pos - 1, anPrevFib);
        int nFib_1 = anPrevFib[0];

        anPrevFib[0] = nFib_0;
        return (nFib_0 + nFib_1);
    }
}
