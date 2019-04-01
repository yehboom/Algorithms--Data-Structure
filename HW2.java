import algs11.*;

import stdlib.StdOut;

import java.util.Arrays;


class HW2 {

    /**
     * As a model, here is a minValue function, both iteratively and recursively
     */
    /** iterative version */
    public static double minValueI (double[] list) {
        double minSoFar = list[0];
        int i = 1;
        while (i < list.length) {
            if (list[i] < minSoFar) minSoFar = list[i];
            i++;
        }
        return minSoFar;
    }

    /** recursive version */
    public static double minValue (double[] list) {
        return minValueHelper (list, 1, list[0]);
    }
     static double minValueHelper (double[] list, int i, double minSoFar) {
        if (i < list.length) {
            if (list[i] < minSoFar) {
                return minValueHelper (list, i + 1, list[i]);
            } else {
                return minValueHelper (list, i + 1, minSoFar);
            }
        } else {
            return minSoFar;
        }
    }

    /**
     * PROBLEM 1: Translate the following sum function from iterative to
     * recursive
     */
    public static double sumI (double[] a) {
        double result = 0.0;
        int i = 0;
        while (i < a.length) {
            result = result + a[i];
            i = i + 1;
        }
        return result;
    }
    public static double sum (double[] a) {
    	return sumHelper(a, 0, 0);
    }
    public static double sumHelper (double[] arr, double tally, int i) {
    	\\ TODO
    }

    /** PROBLEM 2: Do the same translation for this in-place reverse function */
    public static void reverseI (double[] a) {
        int N = a.length;
        int i = 0;
        while (i < N / 2) {
            double lo = a[i];
            double hi = a[N - 1 - i];
            a[i] = hi;
            a[N - i - 1] = lo;
            i = i + 1;
        }
    }
    public static void reverse (double[] a) {
    	reverseHelper(a, 0);
    }
    public static void reverseHelper (double[] a, int i) {
    	// TODO
    }

    

    /**
     * PROBLEM 3: Run runTerrible for one hour. You can stop the program using
     * the red "stop" square in eclipse. Fill in the OUTPUT line below with the
     * numbers you saw LAST --- edit the line, replacing the two ... with what
     * you saw:
     * 
     * OUTPUT: terribleFibonacci(54)=86267571272
     *
     * Comment: the code uses "long" variables, which are like "int", but
     * bigger. It's because fibonacci numbers get really big really fast.
     */
    public static void runTerrible () {
        for (int N = 0; N < 100; N++)
            StdOut.printf ("terribleFibonacci(%2d)=%d\n", N, terribleFibonacci (N));
    }
    public static long terribleFibonacci (int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return terribleFibonacci (n - 1) + terribleFibonacci (n - 2);
    }

    /**
     * PROBLEM 4: The implementation of terribleFibonacci is TERRIBLE! Write a
     * more efficient version of fibonacci which computes each fibonacci number
     * between 0 and n at most once.
     * 
     * Comment: You will want to use a local variable of type "long" rather than
     * type "int", for the reasons discussed above.
     */
    public static void runFibonacci () {
        for (int N = 0; N < 100; N++)
            StdOut.printf ("fibonacci(%2d)=%d\n", N, fibonacci (N));
    }
    public static long fibonacci (int n) {
    	// TODO
    }

    public static void main (String[] args) {
        // recursive sum
        double total = sum(new double[] {1,2,3,4,5});
        StdOut.printf("total (15): %f\n", total);
        
    	// recursive doubling
    	double[] rev = new double[] {1,2,3,3,2,4,5};
    	reverse(rev);
    	System.out.println(Arrays.toString(rev));   	
    	
    	
    	
    	// runTerrible
//    	runTerrible();
    	
    	// fibonacci
    	runFibonacci();
    	
    	
    }

}
