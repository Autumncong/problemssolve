package Problems;
import java.util.*;

public class problems9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [] result=new int[count];
		
		for(int i=0;i<count;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			if(a+b>c&&b+c>a&&c+a>b&&a-b<c&&b-c<a&&c-a<b){
				result[i]=1;
			}
			else{
				result[i]=0;
			}
		}
		for(int i:result){
			System.out.print(i+" ");
		}

	}

}
