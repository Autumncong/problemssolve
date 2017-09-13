package Problems;

import java.util.*;
public class problems15 {
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		String input=in.nextLine().toString();
		String [] inputarray=input.split(" ");
		int [] number=new int[inputarray.length];
		for(int i=0;i<inputarray.length;i++){
			number[i]=Integer.parseInt(inputarray[i]);
		}
		
		int [] a=busort(number);
		System.out.print(a[a.length-1]+" "+a[0]);
	}
	public static int[] busort(int [] numbers){//Ã°ÅÝÅÅÐò
		int temp=0;
		int size=numbers.length;
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
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

/*¼òµ¥±È½Ï
 * public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String input=in.nextLine().toString();
		//System.out.println(input);
		String [] stringarray=input.split(" ");
		int [] num=new int[stringarray.length];
		for(int i=0;i<stringarray.length;i++){
			num[i]=Integer.parseInt(stringarray[i]);
		}
//		for(int i:num){
//			System.out.print(i+" ");
//		}
		
		int temp=0;
		int min=num[0];
		int max=num[0];
		for(int i=0;i<num.length;i++){
			if(min>num[i]){
				min=num[i];
			}
			if(max<num[i]){
				max=num[i];
			}
		}
		System.out.print(max+" "+min);
	}
}
 */
