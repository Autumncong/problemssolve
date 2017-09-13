package Problems;
import java.util.Scanner;
public class problems3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		int [] sum=new int[count];
		for(int i=0;i<count;i++){
//			for(int j=0;j<2;j++){
//				int a=in.nextInt();
//				sum[i]=sum[i]+a;
//			}
			int a=in.nextInt();
			int b=in.nextInt();
			sum[i]=a+b;
		}
		for(int i:sum){
			System.out.print(i+" ");
			//System.out.print(" ");
		}

	}

}
