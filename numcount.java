package src.calculate;
import java.util.Random;
public class numcount {
	static int sum = 0;
	static int []a_temp = new int[50];
	static int []b_temp = new int[50];
	static int []c_temp = new int[50];
	static int []d_temp= new int[50];//��������������ʽ�Ӻ��ж��Ƿ��ظ�;
	public static boolean judge(int a,int b,int c,int d){/*�ж�ʽ���Ƿ��ظ�������Ƿ����100,����Ƿ�С��0*/
		for(int i = 0 ; i < sum ; i++){
			if(d<0 || d>100) return false;
			if(a == a_temp[i] && b == b_temp[i] && c == c_temp[i]) return false;
			/*�ж�ʽ���Ƿ��ظ�*/
			if(a == b_temp[i] && b == a_temp[i] && c == c_temp[i]) return false;
			/*����1-2��2-1*/
		}
		return true;
	}
	public static int getformula_random_2(int temp){/*��������ɵ�1��0����ʾ'+'��'-'*/
		temp = (int)(Math.random()*2);
		return temp;
	}
	public static int getformula_random_100(int temp){/*����0-100������*/
		temp = (int)(Math.random()*101);/*����0-100������*/
		return temp;
	}
	public static void main(String[] args) {
		 printheader();
		 getformula();
		 getanswer();
	  }
	 public static void printheader() {
		 System.out.println("------�������50��100���ڼӼ���----------");
	 }
	 public static void getformula() { /*�������ʽ�Ӻ��ж��Ƿ����Ҫ��*/
		 while(sum < 50){
				int a = 0,b = 0,c = 0,d = 0;
				a = getformula_random_100(a);
			    b = getformula_random_100(b);
			    c = getformula_random_2(c);/*��������ʽ��*/
				if(c == 1){/*��*/
				    d = a + b;
			    }
				else{/*��*/
					d = a - b;
				}
				if(judge(a, b, c, d)){/*a��ֵ��b��ֵ��c��ֵ��d��ֵ*/
					a_temp[sum] = a;
					b_temp[sum] = b;
					c_temp[sum] = c;
					d_temp[sum++] = d;/*��������+1*/
				}
			}	
		 for(int i = 0 ; i < sum ;i++){
				if(i!=0 && i%5 == 0){/*���ƻ���*/
					System.out.print("\n");		
				}	
				System.out.print((i+1)+" : "+a_temp[i]);/*���������ʽ*/
				if(c_temp[i] == 1){
					System.out.print(" + ");
				}
				else{
					System.out.print(" - ");
				}
				System.out.print(b_temp[i]+" = "+"   ");/*���������ʽ*/
			}
		 System.out.print('\n');
	 }
    public static void getanswer() {
    	System.out.println("-------------ϰ��ο���-------------");/*����������õ���ʽ�ӵĴ�*/
    	 while(sum < 50){
				int a = 0,b = 0,c = 0,d = 0;
				a = getformula_random_100(a);
			    b = getformula_random_100(b);
			    c = getformula_random_2(c);/*��������ʽ��*/
				if(c == 1){/*��*/
				    d = a + b;
			    }
				else{/*��*/
					d = a - b;
				}
				if(judge(a, b, c, d)){/*a��ֵ��b��ֵ��c��ֵ��d��ֵ*/
					a_temp[sum] = a;
					b_temp[sum] = b;
					c_temp[sum] = c;
					d_temp[sum++] = d;/*��������+1*/
				}
			}	
		 for(int i = 0 ; i < sum ;i++){
				if(i!=0 && i%5 == 0){/*���ƻ���*/
					System.out.print("\n");		
				}	
				System.out.print((i+1)+" : "+d_temp[i]+"   ");/*���ʽ�ӵĴ�*/
			}
		 System.out.print('\n');
    }
}
