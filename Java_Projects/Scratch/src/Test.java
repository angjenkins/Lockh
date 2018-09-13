import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class Test {
	public static void main(String[] args){
		String s1 = "Dog";
		System.out.println("s1.hashcode(dog value) = " + s1.hashCode());
		s1 = "Dog";
		System.out.println("s1.hashcode(cat value) = " + s1.hashCode());
	}
}
