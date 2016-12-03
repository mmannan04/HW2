package Strings;

public class Human {

	public static void main(String[] args) {
		
		String st = "I am a person";
		
		String st1 = "you arenot a person";
		
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
		System.out.println(st.indexOf('m'));
		System.out.println(st.length());
		System.out.println(st.compareTo(st1));
		System.out.println(st.endsWith(st1));
		System.out.println(st1.length());
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		System.out.println(st1.toCharArray());
		System.out.println(st.toCharArray());
		System.out.println(st.codePointAt(3));
		System.out.println(st1.codePointAt(4));
		System.out.println(st.codePointBefore(5));
		System.out.println(st1.codePointAt(3));
		System.out.println(st.codePointAt(6));
		System.out.println(st.trim());
		System.out.println(st.lastIndexOf(7));
		System.out.println(st1.lastIndexOf(st));
		System.out.println(st.startsWith(st1));
		System.out.println(st1.startsWith(st));
		System.out.println(st.replace(st, st));
		System.out.println(st.equals(st1));
		System.out.println(st1.hashCode());
		System.out.println(st.hashCode());
	
		

	}

}
