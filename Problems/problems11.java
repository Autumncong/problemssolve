package Problems;
import java.util.*;

public class problems11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String countstr=in.nextLine();
		int count=Integer.parseInt(countstr);//测试用例个数
		
		int [] result=new int[count];//结果输出
		
		for(int i=0;i<count;i++){//数据处理
//			String str=in.nextLine();
//			String [] strnum=str.split(" ");
//			int [] num=new int[strnum.length];
//			for(int j=0;j<strnum.length;j++){
//				num[j]=Integer.parseInt(strnum[j]);
//			}
//			int c=num[0]*num[1]+num[2];
			int a=in.nextInt();
			int b=in.nextInt();
			int d=in.nextInt();
			int c=a*b+d;
			while(c!=0){//求一个数字，各个位相加之和
				result[i]=result[i]+c%10;
				c=c/10;
			}
		}
		
		for(int i:result){
			System.out.print(i+" ");
		}

	}

}
