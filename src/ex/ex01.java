package ex;
import java.util.Scanner;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。
 * Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021034 周宇晟
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		String c = scn.next();
		square(n,c);
	}
	
	public static void square(int v1 , String v2){
		for(int i=1 ; i<=v1 ; i++)
		{
			for(int j=1 ; j<=v1 ; j++)
			{
				System.out.print(v2);
			}
			System.out.println();
		}
	}

}
