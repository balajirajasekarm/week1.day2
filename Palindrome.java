package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "dad";
		String text1 = "";
		System.out.println("Given Text is : " +text);
		System.out.println("Given Text1 is : " +text1);
		//char[] textArr = text.toCharArray();
				
		for(int i = text.length()-1; i >= 0 ; i--) {
		 text1 = text1+text.charAt(i);
		 }
		System.out.println("Appended Text is : "+text1);
		if(text.equalsIgnoreCase(text1)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
