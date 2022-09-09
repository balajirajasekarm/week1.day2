package week1.day2;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";		
		char[] tesArr = test.toCharArray();
		
		for (int i = 0;i < tesArr.length; i++) {
						
			if(i%2==0) {
				System.out.println(tesArr[i]);
			}else {
				tesArr[i]=Character.toUpperCase(tesArr[i]);
				System.out.println(tesArr[i]);
				
			}
			

			
		}
		
	}

}
