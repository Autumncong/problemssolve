package Problems;
import java.util.*;

public class problems8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [] num=new int[count];
		for(int i=0;i<count;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			num[i]=a*c+b*(c-1)*c/2;
		}
		for(int i:num){
			System.out.print(i+ " ");
		}

	}

}
