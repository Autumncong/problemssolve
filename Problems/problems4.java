package Problems;
import java.util.*;
public class problems4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		int [] min=new int[count];
		for(int i=0;i<count;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			min[i]=a;
			if(min[i]>b){
				min[i]=b;
			}
		}
		for(int i:min){
			System.out.print(i+" ");
		}
		//System.out.println(count);

	}

}
