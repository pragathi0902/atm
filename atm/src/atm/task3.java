package atm;

import java.util.Scanner;

public class task3 {
	static void bal(int a) {
		System.out.println("current balance:"+a);
		
	}
	static void dep(int b) {
		System.out.println("deposit section");
		Scanner z=new Scanner(System.in);
		System.out.println("enter the amount:");
		int d=z.nextInt();
		System.out.println("your current balance is::"+(b+d));
	}
	static void with(int c) {
		System.out.println("withdrawal");
		Scanner z=new Scanner(System.in);
		System.out.println("enter the amount:");
		int f=z.nextInt();
		System.out.println("your current balance is::"+(c-f));
		
	}
	

	public static void main(String[] args) {
		System.out.println("----ATM----");
		Scanner o=new Scanner(System.in);
		System.out.println("enter pin:");
		int pin=o.nextInt();
		
		int pi=456;
		int bal=10000;
		if(pi==pin) {
			System.out.println("login");
			System.out.println("1)balance\n2)deposit\n3)withdraw");
			
			for(int i=0;i<=3;i++) {
	
				System.out.println("enter option::");
				Scanner t=new Scanner(System.in);
				int op=t.nextInt();
			
			
			if(op==1) {
				bal(bal);
			}
			else if(op==2) {
				dep(bal);
			}
			else if(op==3) {
				with(bal);
				
			}
			else {
				System.out.println("invalid");
			}

			}
			
		}
	

	}

}

