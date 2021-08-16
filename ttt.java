class ttt{
	
	public static int fact = 0;
	public static char [][] game = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
	
	public static void main(String[] args) {
	
		
		System.out.println("Welcome to Tic Tac Toe");
		System.out.println("Please choose a number between 1-9");

	
	}
	


	public static void checker (char [][] bd) {
			
		// veritcal 
		for (int i = 0; i <= 2; i++) {
			int s = 0;
			
			String [] checks = {"" ,"",""};
			
			for (int j = 0; j <=2; j++) {
				checks[s] = Character.toString(bd [j][i]);
				s++;
			}
							
			
			if (checks[0].equals("x") && checks[1].equals("x") && checks[2].equals("x")) {
				System.out.println("Player x has won");
				System.exit(0);
			}
			
			if (checks[0].equals("o") && checks[1].equals("o") && checks[2].equals("o")) {
				System.out.println("Player o has won");
				System.exit(0);
			}
						
		}
		
		// horizontal
		for (int i = 0; i <= 2; i++) {
			int s = 0;
			
			String [] checks = {"" ,"",""};
			
			for (int j = 0; j <=2; j++) {
				checks[s] = Character.toString(bd [i][j]);
				s++;
			}
							
			
			if (checks[0].equals("x") && checks[1].equals("x") && checks[2].equals("x")) {
				System.out.println("Player x has won");
				System.exit(0);
			}
			
			if (checks[0].equals("o") && checks[1].equals("o") && checks[2].equals("o")) {
				System.out.println("Player o has won");
				System.exit(0);
			}
						
		}
		
		
		
		String [] checks = {"" ,"",""};
		// diagonal right to left
		for (int i = 0, j = 0, s = 0; i <=2; i++, j++, s++) {
			
			checks[s] = Character.toString(bd [i][j]);	
				
		}
		
		if (checks[0].equals("x") && checks[1].equals("x") && checks[2].equals("x")) {
			System.out.println("Player x has won");
			System.exit(0);
		}
		
		if (checks[0].equals("o") && checks[1].equals("o") && checks[2].equals("o")) {
			System.out.println("Player o has won");
			System.exit(0);
		}
		
		
		//
		String [] checkss = {"" ,"",""};
		// diagonal left to right
		for (int i = 0, j = 2, s = 0; i <=2 ; i++, j--, s++) {
			
			checkss[s] = Character.toString(bd [i][j]);	
				
		}
		
		if (checkss[0].equals("x") && checkss[1].equals("x") && checkss[2].equals("x")) {
			System.out.println("Player x has won");
			System.exit(0);
		}
		
		if (checkss[0].equals("o") && checkss[1].equals("o") && checkss[2].equals("o")) {
			System.out.println("Player o has won");
			System.exit(0);
		}
		
		
		
		
		
				
	}
	
	
	// good 
	public static void cordinator (int i) {
	String fa = " ";
	char p = 'x';	
	fact++;
	
	int k = fact%2;
	if (k==0) {
		
		p='o';
	}
				
		if ( i >=10 || i <= 0 ) {	
			System.out.println("You must choose a number between 1-9");
		}
		
		else if (i <= 3) {
		
			if( fa.equals(Character.toString(game[0][i-1]))) {
				game [0][i-1] = p;
			}
			else {
				System.out.println("Something is Already there");
				fact--;
			}
			
			}
			
		else if (i >= 4 && i <=6) {
			
			
			if( fa.equals(Character.toString(game[1][i-4]))) {
				game [1][i-4] = p;
			}
			else {
				System.out.println("Something is Already there");
				fact--;
			}
			
		}
		else {
			
			if( fa.equals(Character.toString(game[2][i-7]))) {
				game [2][i-7] = p;
			}
			else {
				System.out.println("Something is Already there");
				fact--;
			}
			
		}
		
		checker(game);
					
		}
	
	
	// good
	public static void printer (char [][] a) {
		
		for (int i = 0; i < 3; i++ ) {
		
			for (int j = 0; j<3; j++) {
				System.out.print(a[i][j]);
				if (j<2) {
					System.out.print("|");
				}
				
			}
			System.out.println();
			
		}
		
		
	}
	
		
}

