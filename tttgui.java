
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;


public class tttgui implements ActionListener{
	
	
	public int cc = 0;
	public static int fact = 0;
	public static char [][] game = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
	JFrame frame;
	JPanel panel;
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");		
	
	
	public tttgui() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
	    frame.setLayout(new GridLayout(3,3,2,2));  
		frame.setSize(500,500);
		frame.setVisible(true);
		
		
		
			     
		
	}
	
	
	public void actionPerformed(ActionEvent e) { 
		
		if (e.getSource() == b1) {
			if (cordinator(1)) {
			if (cc <= 0) {
				b1.setBackground(Color.RED);
				b1.setOpaque(true);
			cc++;
				
			}
			else {
				b1.setBackground(Color.BLUE);
				b1.setOpaque(true);
				cc--;
			}
			}
		}
		
		
		else if (e.getSource() == b2) {
			if (cordinator(2)) {
			if (cc <= 0) {
				b2.setBackground(Color.RED);
				b2.setOpaque(true);
			cc++;
				
			}
			else {
				b2.setBackground(Color.BLUE);
				b2.setOpaque(true);
				cc--;
			}
			}
		}
		
		
		else if (e.getSource() == b3) {
			if (cordinator(3)) {
			if (cc <= 0) {
				b3.setBackground(Color.RED);
				b3.setOpaque(true);
			cc++;
			}
			else {
				b3.setBackground(Color.BLUE);
				b3.setOpaque(true);
				cc--;
			}
			}
		}
		
		
		else if (e.getSource() == b4) {
			if (cordinator(4)) {
			if (cc <= 0) {
				b4.setBackground(Color.RED);
				b4.setOpaque(true);
			cc++;
				
			}
			else {
				b4.setBackground(Color.BLUE);
				b4.setOpaque(true);
				cc--;
			}
			}
		}
		
		
		else if (e.getSource() == b5) {
			if(cordinator(5)) {
			
			if (cc <= 0) {
				b5.setBackground(Color.RED);
				b5.setOpaque(true);
			cc++;
				
			}
			else {
				b5.setBackground(Color.BLUE);
				b5.setOpaque(true);
				cc--;
			}
			}
		}
		
		
		else if (e.getSource() == b6) {
			if (cordinator(6)) {
			if (cc <= 0) {
				b6.setBackground(Color.RED);
				b6.setOpaque(true);
			cc++;
				
			}
			else {
				b6.setBackground(Color.BLUE);
				b6.setOpaque(true);
				cc--;
			}
			}
			
		}
		
		
		else if (e.getSource() == b7) {
			if(cordinator(7)){
			if (cc <= 0) {
				b7.setBackground(Color.RED);
				b7.setOpaque(true);
			cc++;
				
			}
			else {
				b7.setBackground(Color.BLUE);
				b7.setOpaque(true);
				cc--;
			}
			}
		}
		
		
		else if (e.getSource() == b8) {
			if(cordinator(8)) {
			if (cc <= 0) {
				b8.setBackground(Color.RED);
				b8.setOpaque(true);
			cc++;
				
			}
			else {
				b8.setBackground(Color.BLUE);
				b8.setOpaque(true);
				cc--;
			}
			}
		}
		
		
		else if (e.getSource() == b9) {
			if(cordinator(9)) {
			if (cc <= 0) {
				b9.setBackground(Color.RED);
				b9.setOpaque(true);
			cc++;
				
			}
			else {
				b9.setBackground(Color.BLUE);
				b9.setOpaque(true);
				cc--;
			}
			}
			
		}
		
		
		
			
				
	}
	
	
	public static void main(String[] args) {
	
		new tttgui();
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
		
		
		String [][] nowin = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
		 	
		int nw = 0;
		for (int i = 0; i < 3; i++) {
			
			for (int j =0; j < 3; j++) {
				nowin[i][j] = Character.toString(bd [i][j]);
				if (nowin[i][j].equals("o") || nowin[i][j].equals("x")) {
					nw++;
				}
			}
			
		}
		if (nw == 9) {	
			System.out.println("No Win");
			System.exit(0);
		}
		
								
	}
	
	
	// good 
	public static boolean cordinator (int i) {
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
				return false;
			}
			
			}
			
		else if (i >= 4 && i <=6) {
			
			
			if( fa.equals(Character.toString(game[1][i-4]))) {
				game [1][i-4] = p;
			}
			else {
				System.out.println("Something is Already there");
				fact--;
				return false;
			}
			
		}
		else {
			
			if( fa.equals(Character.toString(game[2][i-7]))) {
				game [2][i-7] = p;
			}
			else {
				System.out.println("Something is Already there");
				fact--;
				return false;
			}
			
		}
		
		printer(game);
		System.out.println();
		
		
		checker(game);
					
		return true;
		}
	
	
	// good
	public static void printer (char [][] a) {
		int f = 0;
		for (int i = 0; i < 3; i++ ) {
		
			for (int j = 0; j<3; j++) {
				System.out.print(a[i][j]);
				if (j<2) {
					System.out.print("|");
				}
				
			}
			System.out.println();
			f++;
			if(f<3) {
				System.out.println("-+-+-");
			}
			
			
		}
		
		
	}
	
		
}

