package Problems;
import java.util.*;
public class problems5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		int [] min=new int[count];
		for(int i=0;i<count;i++){
			min[i]=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			
			if(min[i]>b){
				min[i]=b;
			}
			if(min[i]>c){
				min[i]=c;
			}
		}
		for(int i:min){
			System.out.print(i+" ");
		}

	}

}
