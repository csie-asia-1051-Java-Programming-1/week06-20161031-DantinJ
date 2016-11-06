package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int type = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(kg(type,n));
	}
	public static double kg(int type ,int n){
		double x =0;
		if(type==1)
		{
			x=(n-170)*0.6+62;
		}
		else if(type==2)
		{
			x=(n-158)*0.5+52;
		}
		return x;
	}
}
