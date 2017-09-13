package Problems;
import java.util.*;

public class problems26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [][]result=new int[count][2];
		for(int i=0;i<count;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			result[i][0]=gcd(a,b);
			result[i][1]=a*b/result[i][0];
		}
		for(int i=0;i<count;i++){
				System.out.print("("+result[i][0]+" "+result[i][1]+") ");
		}

	}
	
	public static int gcd(int a,int b){
		if(b==0){
			return a;
		}
		else{
			int r=a%b;
			return gcd(b,r);
		}
	}

}
