import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		TwoDArray();
		//shuffleNum();



	}

	
	
	public static void TwoDArray() {
		
		Random random = new Random();
		int[][] array2d = new int [5][5];
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i < 26; i++) {
			numbers.add(i);			
		}
	
		
		
		for(int i = 0; i < array2d.length; i++) {
			System.out.print("|");
			for(int j = 0; j < array2d[i].length; j++) {
				var index = random.nextInt(25-((i*5)+(j)));
				

				System.out.print(numbers.remove(index)+" ");
			}
			System.out.println("|");
		}


 
		
	}

}
