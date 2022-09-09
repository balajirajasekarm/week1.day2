package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstSet[] = {3,2,11,4,6,7};
		int secondSet[] = {1,2,8,4,9,7};
		
		for(int i = 0; i < firstSet.length; i++) {
			
			for(int x = 0; x < secondSet.length; x++) {
				
				if(firstSet[i]==secondSet[x]) {
					System.out.println(firstSet[i]);
					//System.out.println(secondSet[x]);
				}
			}
		}

	}

}
