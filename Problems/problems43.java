package Problems;
import java.util.*;

public class problems43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [] result=new int[count];
		
		for(int i=0;i<count;i++){
			double a=in.nextDouble();
			double b=a*6;
			int c=(int)Math.floor(b);
			result[i]=c+1;
		}
		for(int i:result){
			System.out.print(i+" ");
		}

	}

}
