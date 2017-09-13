package Problems;

import java.util.Scanner;

public class problems67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [] result=new int[5];
//		int []a={610,34,0,1346269,10946};
		for(int i=0;i<count;i++){
			int num=in.nextInt();
			int numfcb=0;
			int counter=0;
			while(numfcb!=num){
				counter++;
				numfcb=fcb(counter);
			}
			result[i]=counter;
		}
		for(int i:result){
        	System.out.print(i+" ");
        }

	}
	
	public static int fcb(int a){
		int result=0;
		if(a==0){
			result=0;
		}
		else if(a==1){
			result=1;
		}
		else{
			//result=Integer.parseInt(fcb(a-1))+Integer.parseInt(fcb(a-2));
			result=fcb(a-1)+fcb(a-2);
		}
		return result;
	}

}