package java_test;
import java.util.Random;
import java.util.Random;
import java.util.ArrayList;
public class Exercise_1 extends ArrayList<BinaryOperation_1> {
	private static final long serialVersionUID = 40225102;
	// private static final short OPERATION_NUMBER=200;
	private static final short COLUMN_NUMBER=5;
	
	private BinaryOperation_1 generateOperation(){
		Random random = new Random();
		int opValue = random.nextInt(2);
		if (opValue == 1){ 
			return  new AdditionOperation();
		}
		return  new SubstractOperation();
	}
	public void generateAdditionExercise( int operationCount){
		BinaryOperation_1 anOperation;
		while (operationCount > 0 ){
			do {anOperation = new AdditionOperation();
			}while (contains(anOperation));
			add(anOperation);
			operationCount--;
		}
	}
	public void generateBinaryExercise(int operationCount){
		BinaryOperation_1 anOperation;
		while (operationCount > 0 ){
			do{anOperation = generateOperation();
			}while (contains(anOperation));
			add(anOperation);
			operationCount--;
		}
	}
	public void generateSubstractExercise(int operationCount){
		BinaryOperation_1 anOperation;
		while (operationCount > 0 ){
			do{anOperation = new SubstractOperation();
			}while (contains(anOperation));
			add(anOperation);
			operationCount--;
		}
	}
	
	public void formattedDisplay (int columns){
		// 0 < columns 
		int column=1;  
		int count = 1;
		for(BinaryOperation_1 op: this) {
			if (column > columns){
				print("\n");
				column = 1;
			}
			print(""+count+"."+"   ");
			print(op.asString()+"\t");
			count++;
			column++;
		} 
		print("\n");
	}
	public void formattedDisplay(){
		formattedDisplay (COLUMN_NUMBER);
	}

	private static void print(String str){
		System.out.print(str);
	}
}
