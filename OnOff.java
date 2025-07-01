import java.util.Scanner;
public class OnOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Light on  off");
		String s1 = sc.nextLine();
		int on=Integer.parseInt(s1);
		int off=Integer.parseInt(s1);
		if(on==0) {
			System.out.println("Light on");
			
		}
		else {
			System.out.println("Light off");
		}

	}

}
