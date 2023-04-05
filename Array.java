package src;
import java.util.Scanner;
public class Array {
	 static int user = 0;

	public static void main(String[] args) {
		int Arry[]=new int[10];
		System.out.println("Enter number of array elements:-");
		Scanner show = new Scanner(System.in);
	    user = show.nextInt();
		for(int i=0;i<user;i++) {
			System.out.println("Enter element: ");
			Scanner use = new Scanner(System.in);
			Arry[user++] = use.nextInt();
		}
		for(int z=0;z<user;z++) {
			System.out.println(Arry[z]);
		}
	}
}
