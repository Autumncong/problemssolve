package Problems;
import java.util.*;
//该程序有个bug，如果所给数组有两个数是一样的，那该怎么办

public class problems29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int []num=new int[count];
		int []result=new int[count];
		for(int i=0;i<count;i++){
			num[i]=in.nextInt();
		}
		int []flag=num.clone();
		flag=bubblesort(flag);
		for(int i=0;i<count;i++){
			for(int j=0;j<count;j++){
				if(flag[i]==num[j]){
					result[i]=j+1;
					break;
				}
			}
		}
//		for(int i:num){
//			System.out.print(i+" ");
//		}
//		for(int i:flag){
//			System.out.print(i+" ");
//		}
		for(int i:result){
			System.out.print(i+" ");
		}

	}
	
	public static int[] bubblesort(int [] numbers){
		for(int i=0;i<numbers.length-1;i++){
			for(int j=0; j<numbers.length-i-1;j++){
				int temp=0;
				if(numbers[j]>numbers[j+1]){
					temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		return numbers;
	}

}
