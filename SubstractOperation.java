package java_test;

public class SubstractOperation extends BinaryOperation_1 {
	public SubstractOperation() {	
		generateBinaryOperation('-');		
	}	
	boolean checkingCalculation(int anInteger){
		return anInteger >= LOWER;
	}
	int calculate(int left, int right){
		return left-right;
	}		
}
