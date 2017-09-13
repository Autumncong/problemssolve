package Problems;
import java.util.*;

public class problems10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [][] result=new int[count][2];
		for(int i=0;i<count;i++){
			int[] a=new int[4];
			String str=in.nextLine();
			String []strnum=str.split(" ");
			for(int j=0;j<4;j++){
				a[j]=Integer.parseInt(strnum[j]);
			}
		    result[i][0]=(a[3]-a[1])/(a[2]-a[0]);
		    result[i][1]=a[1]-a[0]*result[i][0];
		}
		for(int i=0;i<count;i++){
			System.out.print("(");
			System.out.print(result[i][0]+" ");
			System.out.print(result[i][1]+")"+" ");
		}

	}

}
