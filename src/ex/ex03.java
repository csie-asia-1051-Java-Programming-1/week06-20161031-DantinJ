package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白
 * 分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		String a = scn.next();
		decomp(a);
	}

	public static void decomp(String v1)
	{
		for(int x=0 ; x<v1.length();x++)
			{
				System.out.print(v1.charAt(x)+" ");
			}
		
	}
}

