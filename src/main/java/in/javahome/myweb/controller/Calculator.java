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

	public int division(int i, int j){
		return i/j;
	}
}
