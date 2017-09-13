package Problems;
import java.util.*;

public class problems7 {
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		String str=in.nextLine().toString();
		String [] strnum=str.split(" ");
		float [] num=new float[strnum.length];
		int [] result=new int[num.length];
		for(int i=0;i<strnum.length;i++){
			num[i]=Float.parseFloat(strnum[i]);
			//num[i]=Integer.parseInt(strnum[i]);
			result[i]=Math.round((num[i]-32)*5/9);
		}
		for(int i=1;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
		
	}

}
