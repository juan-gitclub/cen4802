import java.util.*;




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
}
