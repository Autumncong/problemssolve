package Problems;
import java.util.*;

public class problems20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yuan="aeiouy";
		Scanner in=new Scanner(System.in);
		String countstr=in.nextLine();
		int count=Integer.parseInt(countstr);//���������ĸ���
		int [] num=new int[count];//��������
		
		for(int i=0;i<count;i++){
			String str=in.nextLine().toString().toLowerCase();//�����ÿһ��תΪСд
			char [] strnum=str.toCharArray();
			
			for(int j=0;j<strnum.length;j++){
//				if(strnum[j]=='a'|| strnum[j]=='e'|| strnum[j]=='i'|| strnum[j]=='o'|| strnum[j]=='u'|| strnum[j]=='y'){
//					num[i]++;
//				}
				if(yuan.indexOf(strnum[j])!=-1){
					num[i]++;
				}
			}
		}
		for(int i:num){
			System.out.print(i+" ");
		}

	}

}
