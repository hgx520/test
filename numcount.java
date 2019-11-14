package src.calculate;
import java.util.Random;
public class numcount {
	static int sum = 0;
	static int []a_temp = new int[50];
	static int []b_temp = new int[50];
	static int []c_temp = new int[50];
	static int []d_temp= new int[50];//利用数组来储存式子和判断是否重复;
	public static boolean judge(int a,int b,int c,int d){/*判断式子是否重复，相加是否大于100,相减是否小于0*/
		for(int i = 0 ; i < sum ; i++){
			if(d<0 || d>100) return false;
			if(a == a_temp[i] && b == b_temp[i] && c == c_temp[i]) return false;
			/*判断式子是否重复*/
			if(a == b_temp[i] && b == a_temp[i] && c == c_temp[i]) return false;
			/*考虑1-2和2-1*/
		}
		return true;
	}
	public static int getformula_random_2(int temp){/*用随机生成的1和0来表示'+'和'-'*/
		temp = (int)(Math.random()*2);
		return temp;
	}
	public static int getformula_random_100(int temp){/*生成0-100的数字*/
		temp = (int)(Math.random()*101);/*生成0-100的数字*/
		return temp;
	}
	public static void main(String[] args) {
		 printheader();
		 getformula();
		 getanswer();
	  }
	 public static void printheader() {
		 System.out.println("------程序输出50道100以内加减法----------");
	 }
	 public static void getformula() { /*用来输出式子和判断是否符合要求*/
		 while(sum < 50){
				int a = 0,b = 0,c = 0,d = 0;
				a = getformula_random_100(a);
			    b = getformula_random_100(b);
			    c = getformula_random_2(c);/*以上生成式子*/
				if(c == 1){/*加*/
				    d = a + b;
			    }
				else{/*减*/
					d = a - b;
				}
				if(judge(a, b, c, d)){/*a的值，b的值，c的值，d的值*/
					a_temp[sum] = a;
					b_temp[sum] = b;
					c_temp[sum] = c;
					d_temp[sum++] = d;/*满足条件+1*/
				}
			}	
		 for(int i = 0 ; i < sum ;i++){
				if(i!=0 && i%5 == 0){/*控制换行*/
					System.out.print("\n");		
				}	
				System.out.print((i+1)+" : "+a_temp[i]);/*控制输出格式*/
				if(c_temp[i] == 1){
					System.out.print(" + ");
				}
				else{
					System.out.print(" - ");
				}
				System.out.print(b_temp[i]+" = "+"   ");/*控制输出格式*/
			}
		 System.out.print('\n');
	 }
    public static void getanswer() {
    	System.out.println("-------------习题参考答案-------------");/*用来输出最后得到的式子的答案*/
    	 while(sum < 50){
				int a = 0,b = 0,c = 0,d = 0;
				a = getformula_random_100(a);
			    b = getformula_random_100(b);
			    c = getformula_random_2(c);/*以上生成式子*/
				if(c == 1){/*加*/
				    d = a + b;
			    }
				else{/*减*/
					d = a - b;
				}
				if(judge(a, b, c, d)){/*a的值，b的值，c的值，d的值*/
					a_temp[sum] = a;
					b_temp[sum] = b;
					c_temp[sum] = c;
					d_temp[sum++] = d;/*满足条件+1*/
				}
			}	
		 for(int i = 0 ; i < sum ;i++){
				if(i!=0 && i%5 == 0){/*控制换行*/
					System.out.print("\n");		
				}	
				System.out.print((i+1)+" : "+d_temp[i]+"   ");/*输出式子的答案*/
			}
		 System.out.print('\n');
    }
}
