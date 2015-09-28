
public class caesar {
	public static void main(String args[]) {
		
		String text = args[0];
		//input text
		int k = Integer.parseInt(args[1]);
		//defining the shift of the letter in the index
		char x[] = text.toCharArray();
	for (int i = 0; i < x.length; i++) {
		//add one to the letter according to the index
		int y = (int)x[i];
		//number of the letter to output in terms of the index
		int z = y + k%26;
		//letter after the entire shift of the unencrypted letter to integer to output encrypted letter

		if (y == 32) {
			z = y;
			//when the shift land on the space symbol
		}

 		if (y >= 65 && y <= 90 && z > 90) {
			z = (z - 90) + 64;
	}		//boundaries and loop for the uppercase letters 
		if (y >= 97 && y <= 122 && z > 122) {
			z = (z - 122) + 96;
			//boundaries and loop for the lowercase letters
		}
		
		System.out.print((char)z);
		//output characters
		
		}
		System.out.println();
	}
}