package Problems;
import java.util.*;

public class problems156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [][] result=new int[count][16];
		String wen="?";
		
		for(int i=0;i<count;i++){
			String str=in.nextLine();
			if(str.indexOf(wen)==-1){//û���ʺ�
				result[i]=swap(str);
			}
			else{
				result[i]=havewen(str);
			}
		}

		for(int i=0;i<count;i++){
			for(int j=0;j<16;j++){
				System.out.print(result[i][j]);
			}
			System.out.print(" ");
		}
	}
	
	public static int [] havewen(String str){
		String wen="?";
		String [] strnum=new String[16];
		int [] num=new int[16];
		int charat=0;//�ʺ�����
		int sum=0;//���ʺ�������
		int all=0;//�ʺŴ���ֵ
		
		for(int i=0;i<16;i++){
			strnum[i]=str.substring(i,i+1);
			if(strnum[i].indexOf(wen)==-1){//�����ʺţ�תΪ����
				num[i]=Integer.parseInt(strnum[i]);
			}
			else{//���ʺţ���Ϊ0��ͬʱ�����ʺ�����
				num[i]=0;
				charat=i;
			}
		}
		sum=sum(num);
		if(sum%10!=0){
			all=10-sum%10;
		}
		else{
			all=0;
		}
		if(charat%2==0){//����ʺ���ż��λ
			//int temp=(all+9)/2;
			if((all%2)!=0){
				num[charat]=(all+9)/2;
			}
			else{
				num[charat]=(all)/2;;
			}
		}
		else{
			num[charat]=all;
		}
		return num;
	}
	
	public static int [] swap(String str){
		String [] strnum=new String[16];
		int [] num=new int[16];
		int sum=0;
		
		for(int i=0;i<16;i++){//�õ�ÿ��λ������
			strnum[i]=str.substring(i,i+1);
			num[i]=Integer.parseInt(strnum[i]);
		}
		sum=sum(num);
		if(sum%10==0){//��������valid��ֱ�ӷ���
			return num;
		}
		else{
			int [] numother=new int[16];
			for(int i=0;i<15;i++){
				int temp=0;
				numother=num.clone();
				
				temp=numother[i];
				numother[i]=numother[i+1];
				numother[i+1]=temp;
				
				if(sum(numother)%10==0){
					break;
				}
			}
			return numother;
		}
	}
	
	public static int sum(int [] num){
		int sum=0;
		for(int i=0;i<16;i++){
			if(i%2==0){
				if(num[i]*2>=10){
					sum=sum+num[i]*2-9;
				}
				else{
					sum=sum+num[i]*2;
				}
			}
			else{
				sum=sum+num[i];
			}
		}
		return sum;
	}

}
