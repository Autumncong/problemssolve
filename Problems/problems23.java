package Problems;
import java.util.*;

public class problems23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		int a=in.nextInt();
		while(a!=-1){
			list.add(a);
			a=in.nextInt();
		}
		int total=0;
		int result=0;
		Integer []num=list.toArray(new Integer[list.size()]);
		
		for(int i=0;i<num.length-1;i++){
			int temp=0;
			if(num[i]>num[i+1]){
				temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
				total++;
			}
		}
		
		for(int i=0;i<num.length;i++){
			result=(result+num[i])*113%10000007;
		}
		System.out.println(total+" "+result);

	}

}
