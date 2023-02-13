package arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class arraydemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a;
		a=new int[20];
		System.out.println("enter the number of elements:");
		int n=input.nextInt();
		System.out.println(n);
		for(int i=0;i<n;i++) {
			System.out.println("eneter the "+(i+1)+" th element:");
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		

	//	ArrayList numList=new ArrayList<>();
	}

}
