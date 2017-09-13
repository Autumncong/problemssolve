package Problems;
import java.util.*;

public class problems31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		String[] result=new String[count];
		
		for(int i=0;i<count;i++){
			String str=in.nextLine();
			String[] strnum=str.split(" ");
			int num=Integer.parseInt(strnum[0]);
			String strchar=strnum[1];
			//char [] charnum=strchar.toCharArray();
			if(num>=0){
				strchar=strchar.substring(num)+strchar.substring(0, num);
			}
			else{
				num=Math.abs(num);
				int size=strchar.length()-num;
				strchar=strchar.substring(size)+strchar.substring(0,size);
			}
			result[i]=strchar;
		}
		for(String i:result){
			System.out.print(i+" ");
		}

	}

}
