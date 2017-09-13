package Problems;
import java.util.*;

public class problems6 {
	public static void main(String [] args){
		long start=System.currentTimeMillis();
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		int [] num=new int[count];
		
//		for(int i=0;i<count;i++){
//			double a=in.nextDouble();
//			double b=in.nextDouble();
//			double result=a/b;
//			//System.out.print(result);
//			num[i]=(int)Math.round(result);
//		}
//		for(int i:num){
//			System.out.print(i+" ");
//		}
		
		for(int i=0;i<count;i++){
			double a=in.nextDouble();
			double b=in.nextDouble();
			double result=a/b;
			int intresult=(int)result;
			if(Math.abs(result-intresult)>=0.5){
				if(intresult>=0){
					intresult++;
				}
				else{
					intresult--;
				}
			}
			num[i]=intresult;
		}
		for(int i:num){
			System.out.print(i+" ");
		}
		
		long end=System.currentTimeMillis();
		System.out.println(end-start);

	}

}

