package Problems;
import java.util.*;

public class problems27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		String str=in.nextLine();
		String [] strnum=str.split(" ");
		int size=strnum.length;
		int [] num=new int[size];
		for(int i=0;i<count;i++){
			num[i]=Integer.parseInt(strnum[i]);
		}
		
		int total=0;//����
		int flag=0;
		int swap=0;//�ܵĽ�������
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
				int temp=0;
				if(num[j]>num[j+1]){
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					swap++;
				}
			}
			total++;
			if(swap==flag){
				break;
			}
			flag=swap;
			//������swapû�����ӣ��򵽴�Ϊֹ
			
		}
		System.out.println(total+" "+swap);
	}

}
