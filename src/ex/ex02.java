package ex;
import java.util.Scanner;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。
 * 公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021034 周宇晟
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int j=C(m,n);
		System.out.println(j);
	}
	
	public static int C(int v1 ,int v2)
	{
		int sum = 0;
		int x = 1;
		int y = 1;
		int z = 1;
		int a =v1-v2;
		while (v1>0)
		{
			x=x*v1;
			v1=v1-1;
		}
		while (v2>0)
		{
			y=y*v2;
			v2=v2-1;
		}
		while (a>0)
		{
			z=z*a;
			a=a-1;
		}
		sum = x/(y*z);
		return sum;
	}

}
