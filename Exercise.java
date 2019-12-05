package java_test;
public class Exercise {
		private static final short Operation_Number=50;
		private static String operationList[]=new String[Operation_Number]; 
		private int[] resultArr =new int[50];
		public static boolean generateBinaryExercise(String str){
			for(int i=0;i<operationList.length;i++){
				if(str.equals(operationList[i])){
					return false;
				}
			}
					return true;
		}
		/*输出等式及答案*/
		void formateAndDisplay(){
			int i=0,j=0;
			System.out.println("------程序输出50道100以内加减法----------:");
			/*当生成的等式数量小于50时执行*/
			while(i<50){
				/*实例化BinaryOperation().generateBinaryOperation()对象*/
				BinaryOperation add =new BinaryOperation().generateBinaryOperation();
				/*将生成的无结果的等式传入formate数组中*/
				String formate=add.asString();
				/*调用generateBinaryExercise判断生成的等式与数组中是否重复*/
				if(generateBinaryExercise(formate)){
					//如果不重复将其传入数组中
					operationList[j++]=formate;
					//将等式答案传入resultArr数组中
					resultArr[i++]=add.getResult();		
					System.out.print("第"+(i)+"题:"+formate+"\t");
					/*每五个等式换行*/
				if(i%5==0){
					System.out.println();
				  }
				}		
			}
			/*输出等式答案*/
			System.out.println();
			System.out.println("-------------习题参考答案-------------：");
			for(i=0;i<resultArr.length;i++){
				System.out.print("第"+(i+1)+"题答案:"+resultArr[i]+"\t");
				if((i+1)%5==0){
					System.out.println();
				}
			}
		}		
	}


