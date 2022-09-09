package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		//int count = 0;
		
		String newText[] = text.split(" ");

		for (int i = 0; i <= newText.length-1; i++) {

			if(newText[i]!=null) 
				//System.out.println("The Word(1) to Check is :"+newText[i]);
			{
				
				for(int j = i+1; j<=newText.length-1; j++) {
					//System.out.println("The word(2) being checked with is : "+newText[j]);
					if(newText[i].equals(newText[j])) {
						
						//count++;
						newText[i] = newText[i].replace(newText[j], " ");
					}
										
				}
				
			}
		}
		//System.out.println("The Numbe of Matching Words are : "+count);
		for(int k=0; k<=newText.length-1;k++) {
		System.out.print(newText[k]);	
		}
		}
	}
