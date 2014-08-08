package task_3;

import java.util.Scanner;

public class Tanges {
	public static void main(String[]args){
		Tanges arr=new Tanges();
		arr.startApplication();
	}
public void startApplication(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first element");
	int a=sc.nextInt();
	System.out.println("Enter the last element");
	int b=sc.nextInt();
	System.out.println("Enter step");
	int h=sc.nextInt();
	double f=0;
	double x=0;
	System.out.print("x"+"   |   "+"F(x)"+"\n");
	f=Math.tan(2*a)-3;
	System.out.print(a+" | "+f+"\n");
	for(int i=a; i<=b-h;i+=h){
		x=i+h;
		f=Math.tan(2*x)-3;
		System.out.print(x+" | "+f+"\n");
		}
}
}
