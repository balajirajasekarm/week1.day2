package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
			
		String testArr[] = test.split(" ");
		//int x = testArr.length;
		//System.out.println(x);
		
		for(int i = 0; i <= testArr.length-1; i++) {
			if(i%2==0) {
					System.out.println(testArr[i]);
				}else {
					String oddArr = testArr[i];
					//System.out.println(oddArr);
					char[] newoddArr = oddArr.toCharArray();
					
					//System.out.println(newoddArr);
					//System.out.println(newoddArr.length);
					
					for(int j = newoddArr.length-1; j>= 0 ; j--) {
						//System.out.println(newoddArr[j]);
						System.out.println(newoddArr[j]);
					
					}
					
				}
			}
			
			}
		}



