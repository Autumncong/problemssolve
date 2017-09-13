package Problems;
import java.util.*;

public class problems21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int count=in.nextInt();
		int [] number=new int[num];
		int [] result=new int[num];//计数
		int [] renum={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};//重复的数字本身
		
		for(int i=0;i<num;i++){
			number[i]=in.nextInt();
			for(int j=0;j<renum.length;j++){
				if(number[i]==renum[j]){
					result[j]++;
					continue;
				}
			}
		}
		
		for(int i=0;i<num;i++){
			if(result[i]!=0){
				System.out.print(result[i]+" ");
			}
		}

	}

}
