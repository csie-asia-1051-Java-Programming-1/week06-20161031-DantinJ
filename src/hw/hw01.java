package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float v1 = scn.nextFloat();
		int type = scn.nextInt();
		System.out.println(fun(v1,type));
	}

	public static float fun(float v1 , int type){
		float n = 0;
		if(type == 1)
		{
			n=(v1-32)*5/9;
		}
		else if (type == 2)
		{
			n=(v1*9/5)+32;
		}
		return n;
	}
}
