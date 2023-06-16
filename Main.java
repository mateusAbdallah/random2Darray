import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		TwoDArray();

	}

	
	
	public static void TwoDArray() {
		int [][] array2D = new int[5][5];
		Random random = new Random();
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for(int i = 0; i<26; i++){

			numbers.add(i);
		}
		//System.out.print(numbers);

		for(int i = 0; i < array2D.length; i++){
			for(int j = 0; j < array2D[i].length; j++){
				var index = random.nextInt(25 - ((i*5)+(j)));
				System.out.print(numbers.remove(index)+" ");
			}
			System.out.println();
		}




 
		
	}

}
