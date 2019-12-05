package java_test;
import java.util.Random;
public class BinaryOperation {
		static final int Upper=100;
		static final int Lower=0;
		//初始化等式左边数值、右边数值、符号和结果
		private int left_operand=0,right_operand=0;
		private char operator='+';
		private int value=0;
		/*创建含有三个参数的函数将传入左边数值、右边数值、符号；
		将左边数值、右边数值、符号、结果进行赋值*/
		private void construst(int left,int right,char op){
			left_operand=left;
			right_operand=right;
			operator=op;
			//如果传入的符号是加号则结果相加
			if(op=='+'){
				value=left+right;
			}
			else{
				value=left-right;
			}
		}
		
		//创建生成加法函数
		public BinaryOperation generateAdditionOperation(){
			Random random=new Random();
			int left,right,result;
			//随机生成100以内的整数
			left =random.nextInt(Upper+1);
			//保证生成的结果数值在100以内
			do{
				right=random.nextInt(Upper+1);
				result=left+right;
			}while(result>Upper);
			BinaryOperation bop =new BinaryOperation();
			bop.construst(left, right, '+');
			return bop;					
		}
		
		//创建生成减法函数
		public BinaryOperation generateSubstractOperation(){
			Random random=new Random();
			int left,right,result;
			left =random.nextInt(Upper+1);
			//保证生成的结果数值大于100
			do{
				right=random.nextInt(Upper+1);
				result=left-right;
			}while(result<Lower);
			BinaryOperation bop =new BinaryOperation();
			//调用construct函数
			bop.construst(left, right, '-');
			return bop;					
		}
		
		/*随机生成0和1 ，如果生成的结果为1调用generateAdditionOperation函数，进行加法运算；
		如果生成的结果为0调用generateSubstractOperation函数，进行减法运算*/
		public BinaryOperation generateBinaryOperation(){
			Random random =new Random();
			int Binary;
			Binary=random.nextInt(2);
			BinaryOperation add=new BinaryOperation();
			//调用generateAdditionOperation函数
			if(Binary==1){	
				return add.generateAdditionOperation();
			}
			//调用generateSubstractOperation函数
			else{
				return add.generateSubstractOperation();
			}
		}
		
		/*返回左边数值、右边数值、符号、运算结果*/
		public int getLeftOperand(){
			return left_operand;
		}
		public int getRightOperand(){
			return right_operand;
		}
		public char getOperator(){
			return operator;	
		}
		public int getResult(){
			return value;
		}
		
		//输出等式左边
		public String toString(){
			String str=new String(left_operand+""+operator+right_operand);
			return str.toString();
		}
		//输出等式左边加符号
		public String asString(){
			String str=new String(left_operand+""+operator+right_operand+"=");
			return str.toString();
		}
		////输出全部等式
		public String fullString(){
			String str=new String(left_operand+""+operator+right_operand+"="+value);
			return str.toString();
		}
	}


