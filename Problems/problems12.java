package Problems;
import java.util.*;

public class problems12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		int [][] output=new int[count][4];
		for(int i=0;i<count;i++){
			int [] input=new int[8];
			String str=in.nextLine();
			String [] strnum=str.split(" ");
			for(int j=0;j<8;j++){
				input[j]=Integer.parseInt(strnum[j]);
				//System.out.print(input[j]+" ");
			}

			int day=input[4]-input[0];
			int hour=input[5]-input[1];
			int minite=input[6]-input[2];
			int second=input[7]-input[3];
			int tosecond=hour*3600+minite*60+second;
			if(tosecond>=0){
				output[i][0]=day;
				output[i][1]=tosecond/3600;
				output[i][2]=(tosecond-output[i][1]*3600)/60;
				output[i][3]=(tosecond-output[i][1]*3600-output[i][2]*60);
			}
			else{
				day=day-1;
				tosecond=tosecond+24*3600;
				output[i][0]=day;
				output[i][1]=tosecond/3600;
				output[i][2]=(tosecond-output[i][1]*3600)/60;
				output[i][3]=(tosecond-output[i][1]*3600-output[i][2]*60);
			}
			
		}
		for(int i=0;i<count;i++){
			System.out.print("(");
			for(int j=0;j<3;j++){
				System.out.print(output[i][j]+" ");
			}
			System.out.print(output[i][3]);
			System.out.print(") ");
		}

	}

}
