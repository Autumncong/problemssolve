package Problems;
import java.util.*;

public class problems57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		double [] input=new double[count];
		double [] result=new double[count];
		
		for(int i=0;i<count;i++){
			String str=in.next();
			input[i]=Float.parseFloat(str);
		}
		result[0]=input[0];
		for(int j=1;j<count-1;j++){
			result[j]=(input[j-1]+input[j]+input[j+1])/3;
		}
		result[count-1]=input[count-1];
		for(double i:result){
			System.out.printf("%.7f ",i);
		}

	}

}
