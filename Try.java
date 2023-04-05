package src;

public class Try {
	  public static void main(String[] args) {
	    try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[3]);
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    } 
	  }
	}