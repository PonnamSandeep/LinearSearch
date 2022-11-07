package sandy;

import java.util.Arrays;

public class SearchinStrings {
	public static void main(String[] args) {
	String str ="Sandeep";
	char c = 'p';
	System.out.println(Arrays.toString(str.toCharArray())); //for string to break into char's
	System.out.println(SearchinStrings.search(str, c));
	}
	static boolean search(String str,char c){
		if(str.length()==0) {
			return false;
		}
		//for search
//		for(int i=0;i<str.length();i++) {
//			if(c==str.charAt(i)) {
//				return true;
//			}
//		}
//		return false;
		
//		------------------------------------------
		//for each
//		for (char ch: str.toCharArray()) {
//			if(ch==c) {
//				return true;
//			}
//		}
//		return false;
//		------------------------------------
		//for in a range
		for(int i=1;i<4;i++) {
			if(c==str.charAt(i)) {
				return true;
			}
		}
		return false;
		
	}
}
