import java.util.*;


/**
 * 
 * @author juanalbarran
 * @version 1.0
 * 
 *
 */

public class main {

	public static void main(String[] args) {

		int nthTerm;

		nthTerm = fibonacciSec(10);

		System.out.println("The nth term of the Fibonacci sequence is " + nthTerm);

	}

	public static int fibonacciSec(int num) {

		if (num > 0) {

			return num + fibonacciSec(num - 1);

		} else {

			return 0;

		}
	}
	
	/**
	 * 
	 * @param nthTerm holds the arithmetic sequence 
	 * 
	 * @param num inputs desired term to execute the sequence formula
     *
	 *
	 * <p> fibonacciSec function takes the desired term as a parameter 
	 * and executes the formula until it reaches 0
	 * 
	 *
	 */
	
}