package Problems;
import java.util.*;

public class problems18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		float []result=new float[count];
		for(int i=0;i<count;i++){
			int num=in.nextInt();
			int numcount=in.nextInt();
			float r=1;
			for(int j=0;j<numcount;j++){
				r=calculate(r,num);
			}
			result[i]=r;
		}
		for(double i:result){
			System.out.print(i);
			System.out.print(" ");
		}

	}
	
	public static float calculate(float r,int x){
		r=(r+x/r)/2;
		return r;
	}

}
