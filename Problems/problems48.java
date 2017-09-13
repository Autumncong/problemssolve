package Problems;
import java.util.*;

public class problems48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [] result=new int[count];
		for(int i=0;i<count;i++){
			int a=in.nextInt();
			while(a!=1){
				if(a%2==0){
					a=a/2;
				}
				else{
					a=3*a+1;
				}
				result[i]++;
			}
		}
		for(int i:result){
			System.out.print(i+" ");
		}

	}

}
