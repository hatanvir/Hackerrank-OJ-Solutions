import java.io.ObjectInputStream.GetField;
import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	
	String getTitle(){
		return title;
	}
}

class MyBook extends Book{

	@Override
	void setTitle(String s) {
		title=s;
		getTitle();
	}
	
}

public class Java_Abstract_Class{
	
	static String s;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		s= sc.nextLine();
		
		MyBook ob = new MyBook();
		ob.setTitle(s);
		System.out.println("The title is: "+ob.getTitle());
		
	}
}
