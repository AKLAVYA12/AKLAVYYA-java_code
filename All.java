package src;

import java.util.Scanner;

public class All {

	public static void main(String[] args) {
		System.out.println("1.even and odd / 2.Prime / 3.Factorial");
		System.out.println("Enter number: ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if(choice==1) {
			Evenodd Even_1 = new Evenodd();
			Even_1.Even1();
		}
		else if(choice==2) {
			Prime prime = new Prime();
			prime.Prime1();
		}
		else if(choice==3) {
			Factorial fact = new Factorial();
			fact.Fact1();
		}
		else {
			System.out.println("wrong choice try again");
		}
	}
}
class Evenodd {

	public void Even1() {
		Scanner show = new Scanner(System.in);
		System.out.println("Enter number:-");
		int user = show.nextInt();
		if(user%2==0) {
		   System.out.println("this is an even number: "+user);
		}
		else {
			System.out.println("this is an odd number: "+user);
		}
	}
		
	}
class Prime {

	public void Prime1() {
        Scanner show = new Scanner(System.in);
        System.out.println("enter number:-");
        int num = show.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (flag==false)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
}
class Factorial {

	public void Fact1() {
		int fact = 1;
		Scanner show = new Scanner(System.in);
		System.out.println("enter the number:-");
		int user = show.nextInt();
		for(int i = 1;i<=user;i++) {
			fact = fact*i;
		}
		System.out.println("the factorial is :- "+fact);
	}
}

