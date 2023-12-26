package calculator;
import java.util.ArrayList;
public class email {
	public static void main(String[] args) {
	
	ArrayList<String>emailID = new ArrayList<String>();
	
	emailID.add("simon.2@gmail.com");
	emailID.add("dany54@gmail.com");
	emailID.add("surabhi@gmail.com");
	emailID.add("prabhu7@gmail.com");
	
	String searchElement = "surabhi@gmail.com";
	for(int i=0; i<emailID.size();i++) {
		System.out.println(emailID.get(i));
		if(searchElement==emailID.get(i)) {
			System.out.println("\n");
			System.out.println("emailID"   +searchElement+   "found");
			break;
			
		}
	}
	}
}
	


