package ex;
import java.util.Scanner;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維
 * 陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021034 周宇晟
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("共輸入幾個數?");
		int n = scn.nextInt();
		int data[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("第"+(i+1)+"個數");
			data[i]=scn.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			int a = data[j] ;
			System.out.println(arr(a));
		}
	}
	
	public static int arr(int a) {
		a=a*a;
		return a;
	}

}
