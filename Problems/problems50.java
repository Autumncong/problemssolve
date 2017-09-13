package Problems;
import java.util.*;

public class problems50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=Integer.parseInt(in.nextLine());
		char[] result=new char[count];
		
		for(int i=0;i<count;i++){
			String strin=in.nextLine();
			List<String> list=new ArrayList();
			for(int j=0;j<strin.length();j++){
				char temp=strin.charAt(j);
				String tempstr=null;
				if(temp>=65&&temp<=90||temp>=97&&temp<=122){
					tempstr=String.valueOf(temp);
					list.add(tempstr);
				}				
			}
			String[] tempchar=new String[list.size()];
			list.toArray(tempchar);
			for(int k=0;k<tempchar.length;k++){
				tempchar[k]=tempchar[k].toLowerCase();
			}
			for(int j=0,k=tempchar.length-1;j<(tempchar.length+1)/2;j++,k--){
				if(tempchar[j].equals(tempchar[k])){
					result[i]='Y';
				}
				else{
					result[i]='N';
					break;
				}
			}
		}
		for(char i:result){
			System.out.print(i+" ");
		}

	}

}
