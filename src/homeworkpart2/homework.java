package homeworkpart2;

public class homework {

	public static void main(String[] args) {
		int sum = 0;
		int loverbound = 1;
		int upperbound = 100;
	do {
		sum += loverbound;
		++loverbound;
		
	
		}while (loverbound <= upperbound);
	        double average = sum/upperbound;
	             System.out.println("This is your Total="+sum);
		         System.out.println("This is your average"+average);
		
	}

}
