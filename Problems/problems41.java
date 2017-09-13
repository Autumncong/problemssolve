package Problems;
import java.util.*;

public class problems41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [] result=new int[count];
		
		for(int i=0;i<count;i++){
			String str=in.nextLine();
			String[] instr=str.split(" ");
			int [] number=new int[instr.length];
			for(int j=0;j<instr.length;j++){
				number[j]=Integer.parseInt(instr[j]);
			}
			result[i]=bubblesort(number)[1];
			
		}
		for(int i:result){
			System.out.print(i+" ");
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);

	}
	
	public static int[] bubblesort(int [] num){
		int temp=0;
		int size=num.length;
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-1-i;j++){
				if(num[j]>num[j+1]){
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		return num;
	}
	
}
