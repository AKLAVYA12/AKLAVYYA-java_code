package src;
import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
      Calculater show = new Calculater();
      show.Calcu();
	}
}
class Calculater{
	public void Calcu() {
		int user,a,b,c;
		System.out.println("______The Calculater______");
		System.out.println("1.+ 2.- 3./ 4.% 5.x");
		System.out.println("Enter number first :-");
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();
		System.out.println("Enter first element:-");
		Scanner scanner1 = new Scanner(System.in);
		a = scanner1.nextInt();
		System.out.println("Enter first element:-");
		Scanner scanner2 = new Scanner(System.in);
		b = scanner2.nextInt();
		if(user==1) {
			c = a + b;
			System.out.println(c);
		}
		else if(user == 2) {
			c = a - b;
			System.out.println(c);
		}
		else if(user == 3) {
			c = a / b;
			System.out.println(c);
		}
		else if(user == 4) {
			c = a % b;
			System.out.println(c);
		}
		else if(user == 5) {
			c = a * b;
			System.out.println(c);
		}
		else {
			System.out.println("Enter valid statement");
		}
	}
}