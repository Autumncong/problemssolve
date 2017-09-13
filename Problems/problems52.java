package Problems;
import java.util.*;

public class problems52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		char [] result=new char[count];
		for(int i=0;i<count;i++){
			int []a=new int[3];
			for(int j=0;j<3;j++){
				a[j]=in.nextInt();
			}
			a=busort(a);
			if(a[0]*a[0]+a[1]*a[1]==a[2]*a[2]){
				result[i]='R';
			}
			else if(a[0]*a[0]+a[1]*a[1]>a[2]*a[2]){
				result[i]='A';
			}
			else{
				result[i]='O';
			}
			
		}
		for(char c:result){
			System.out.print(c+" ");
		}

	}
	public static int [] busort(int [] numbers){
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
