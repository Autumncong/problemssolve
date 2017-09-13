package Problems;
import java.util.*;

public class problems24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [] number=new int[count];
		
		for(int i=0;i<count;i++){
			int num=in.nextInt();
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(num);
			int temp=num;
			int flag=0;
			int counter=0;
			while(flag!=1){
				counter++;
				temp=temp*temp/100%10000;
				list.add(temp);
				for(int j=0;j<list.size()-1;j++){
					if(temp==list.get(j)){
						flag=1;
						break;
					}
				}
			}
			number[i]=counter;
		}
		for(int i:number){
			System.out.print(i+" ");
		}

	}
	
}
