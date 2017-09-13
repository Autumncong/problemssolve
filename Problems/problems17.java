package Problems;
import java.util.*;

public class problems17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [] a=new int[count];
		int seed=113;
		int limit=10000007;
		long result=0;
		
		for(int i=0;i<count;i++){
			a[i]=in.nextInt();
			result=(result+a[i])*seed;
			result=result%limit;
		}
		System.out.println(result);
		

	}

}
