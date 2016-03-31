package Assign_3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val;
		System.out.println("Calculator");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Which should perform");
		val = sc.nextInt();
		if(val==1){
			addition();
		}
		else if(val == 2){
			subtraction();
		}
		else if(val==3){
			multiplication();
		}
		else if(val==4){
			division();
		}

}
public static void addition(){
	int a1,a2;
	Scanner ad = new Scanner(System.in);
	System.out.print("Enter the first number : ");
	a1 = ad.nextInt();
	System.out.print("Enter the first number : ");
	a2 = ad.nextInt();
	ad.close();
	System.out.println("Sum of "+a1+" + "+a2+" = " + (a1+a2));
}
public static void subtraction(){
	int s1,s2;
	Scanner su = new Scanner(System.in);
	System.out.print("Enter the first number : ");
	s1 = su.nextInt();
	System.out.print("Enter the second number : ");
	s2 = su.nextInt();
	su.close();
	System.out.println("Diff of "+s1+" - "+s2+" = " + (s1-s2));
}
public static void multiplication(){
	int m1,m2;
	Scanner mu = new Scanner(System.in);
	System.out.print("Enter the first number : ");
	m1=mu.nextInt();
	System.out.print("Enter the second number : ");
	m2 = mu.nextInt();
	mu.close();
	System.out.println("Mul of "+m1+" X "+m2+" = "+(m1*m2));
}
public static void division(){
	double d1,d2;
	Scanner di=new Scanner(System.in);
	System.out.print("Enter the first value : ");
	d1 = di.nextDouble();
	System.out.print("Enter the seccond value : ");
	d2 = di.nextDouble();
	di.close();
	System.out.println("Div of "+d1+" / "+d2+" = "+(d1/d2));
	}
}