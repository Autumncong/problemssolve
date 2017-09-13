package Problems;
import java.util.*;

public class problems30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String [] strnum=str.split(" ");
		for(int i=strnum.length-1;i>=0;i--){
			char [] num=strnum[i].toCharArray();
			for(int j=num.length-1;j>=0;j--){
				System.out.print(num[j]);
			}
			System.out.print(" ");
		}

	}

}
