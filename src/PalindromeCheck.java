
public class PalindromeCheck {

	public static void main(String[] args) {

	String s = "aabbccd"; 
	int size = s.length();
	String reverse = ""; 
	
	for (int i = s.length(); i >= 0; i--) {
		reverse += s.charAt(i); 
	}
	
	if (!reverse.equalsIgnoreCase(s)) {
		
	}
	
	while(!reverse.equalsIgnoreCase(s)) {
		s = s.substring(0, s.length()-1);
		for (int i = s.length(); i >= 0; i--) {
			reverse += s.charAt(i); 
		}
		if (reverse.equalsIgnoreCase(s)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	while(!reverse.equalsIgnoreCase(s)) {
		String last = s.
		s = s.concat(last);
		for (int i = s.length(); i >= 0; i--) {
			reverse += s.charAt(i); 
		}
		if (reverse.equalsIgnoreCase(s)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	}

}
