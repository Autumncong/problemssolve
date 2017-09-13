package Problems;
import java.math.BigInteger;
import java.util.*;

public class problems14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//String initint=in.nextLine();
		//BigInteger init=new BigInteger(initint);
		List<String> list=new ArrayList();
		while(true){
			String str=in.nextLine();
			list.add(str);
			if(str.indexOf("%")!=-1){
				break;
			}
		}
		
		String initint=list.get(0);
		BigInteger init=new BigInteger(initint);
		for(int i=1;i<list.size();i++){
			String a=list.get(i);
			char c=a.charAt(0);
			String number=a.substring(2);
			BigInteger num=new BigInteger(number);
			
			if(c=='+'){
				init=init.add(num);
			}
		    if(c=='*'){
				init=init.multiply(num);
			}
			if(c=='%'){
				init=init.remainder(num);
			}
		}
		System.out.println(init);

	}

}
