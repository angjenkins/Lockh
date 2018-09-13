import org.apache.commons.codec.binary.Base64;
public class BasicAuthTest {
	static CharSequence invalids="\\/ \t\"\'?";
	public static void main(String[] args) {
		//byte[] encodedBytes = Base64.encodeBase64("mahan:welc".getBytes());
		byte[] encodedBytes = Base64.encodeBase64("p3user1:FileUpl0ad#".getBytes());
		System.out.println("encodedBytes " + new String(encodedBytes));
		byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
		System.out.println("decodedBytes " + new String(decodedBytes));
		
		String test="vv\"";
		System.out.println("hasInvalid->"+hasInvalid(invalids,test));
		

	}
	
	private static boolean hasInvalid(CharSequence s,String str){
		for (int i=0;i<s.length();i++){
			System.out.println("checking for->"+s.charAt(i));
			if (str.contains(s.charAt(i)+""))
				return true;
		}
		return false;
		
	}

}
