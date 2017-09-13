package Problems;
import java.util.*;

public class problems13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=1776;
//		int sum=0;
//		while(n>0){
//			sum=sum+n%10;
//			n=n/10;
//		}
//		System.out.println(sum);
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [] result=new int[count];
		
		for(int i=0;i<count;i++){
			int a=in.nextInt();
			String str=Integer.toString(a);
			int b=str.length();
			int size=b;
			for(int j=0;j<b;j++){
				result[i]=result[i]+(a%10)*size;
				a=a/10;
				size=size-1;
			}
			
		}
		for(int i:result){
			System.out.print(i+" ");
		}

	}

}
