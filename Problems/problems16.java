package Problems;
import java.util.*;

public class problems16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		float [] resultd=new float[count];
		//double [] resultd=new double[count];
		int [] result=new int[count];
		
		for(int i=0;i<count;i++){
			String str=in.nextLine();
			String [] strnum=str.split(" ");
			int size=strnum.length;
			int [] num=new int[size];
			float sum=0;
			for(int j=0;j<size;j++){
				num[j]=Integer.parseInt(strnum[j]);
				sum=sum+num[j];
			}
			resultd[i]=sum/(size-1);
			//System.out.println(sum);
			
			//System.out.println(size);
			
			//System.out.println(resultd[i]);
			result[i]=Math.round(resultd[i]);
		}
		
		for(int i:result){
			System.out.print(i+" ");
		}

	}

}
