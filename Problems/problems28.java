package Problems;
import java.util.*;

public class problems28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [] resultnum=new int[count];
		String[] result=new String[count];
		
		for(int i=0;i<count;i++){
//			String str=in.nextLine();
//			String [] strnum=str.split(" ");
//			int [] num=new int[strnum.length];
//			for(int j=0;j<strnum.length;j++){
//				num[j]=Integer.parseInt(strnum[j]);
//			}
//			resultnum[i]=num[0]/num[1]/num[1];
			double a=in.nextDouble();
			double b=in.nextDouble();
			double c=a/b/b;
			if(c<18.5){
				result[i]="under";
			}
			else if(c<25){
				result[i]="normal";
			}
			else if(c<30){
				result[i]="over";
			}
			else{
				result[i]="obese";
			}
		}
		for(String str:result){
			System.out.print(str+" ");
		}

	}

}
