import java.util.Scanner;
public class PassFail {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks m1");
		String s1 =sc.nextLine();
		System.out.println("Enter the marks m2");	
		String s2 =sc.nextLine();
		System.out.println("Enter the marks m3");
		String s3 =sc.nextLine();
		
		int m1=Integer.parseInt(s1);
		int m2=Integer.parseInt(s2);
		int m3=Integer.parseInt(s3);
		if(m1>60 && m2>65 && m3>63) {
			System.out.println("you Are first class");
		}
		else {
			System.out.println("You are fail");
		}
	}

}
