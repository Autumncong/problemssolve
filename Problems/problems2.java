package Problems;

import java.util.Scanner;

public class problems2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int sum=0;
		int count=in.nextInt();
		for(int i=0;i<count;i++){
			int a=in.nextInt();
			sum=sum+a;
		}
		System.out.println(sum);
	}
}
