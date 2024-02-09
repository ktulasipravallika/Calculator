package in.javahome.myweb.controller;
/*
 * Calculator Class to calculate and return
 * the correct values for
 * addition, subtraction, multiplication, division.
 */
public class Calculator {

	/* Method to perform Addition
	 * @param i
	 * @param j
	 * @return int
	 */
	public int add(int i, int j){
		return i+j;
	}

	/* Method to perform Multiplication
	 * @param i
	 * @param j
	 * @return int
	 */

	public int multiply(int i, int j){
		return i*j;
	}

	/* Method to perform Subtraction
	 * @param i
	 * @param j
	 * @return int
	 */

	public int sub(int i, int j){
		return i-j;
	}

	/* Method to perform Division
	 * @param i
	 * @param j
	 * @return int
	 */

	public double division(int dividend, int divisor){
		if (divisor == 0) {
			if (dividend == 0) {
				throw new ArithmeticException("Division of 0 by 0 is undefined");
			} else {
				throw new ArithmeticException("Division by zero is not allowed");
			}
		}
		return (double)dividend/divisor;
	}
}
