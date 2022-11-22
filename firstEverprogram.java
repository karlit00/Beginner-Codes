/* this program allows a user to enter their 
    username and password, when successfully entered the user
    can play two games (rock paper scissors or lotto)
    */

//username: p1rat3
//password: imthecaptainnow

import java.util.Scanner;
public class Log {

	public static void main(String[] args) {
		
		Scanner login = new Scanner(System.in);
		
		//private info
		String un= "p1rat3";
		String pw= "imthecaptainnow";
		
		System.out.println("Input username: ");
		String username = login.nextLine();
		
		System.out.println("Input password: ");
		String password = login.nextLine();
		
		if(username.equals(un) && password.equals(pw)){
			System.out.println("Logged in! \n\n_________________________________________");
			System.out.println("Welcome Marcus!\n");
			System.out.println("[1] Play Rock,Paper,Scissor");
			System.out.println("[2] Play Lotto");
			
			Scanner demand = new Scanner(System.in);
			int command= demand.nextInt();
			
			
			//Inside the System
			switch(command) {
			
			case 1:
				
			System.out.println("(0)scissor, (1)rock, (2)paper");
			Scanner game = new Scanner(System.in);
			int user = game.nextInt();
			
			int computer = (int)(Math.random()*3);
			
			System.out.print("The computer is ");
			switch(computer) {
			case 0: System.out.print("scissor.");
			break;
			case 1: System.out.print("rock.");
			break;
			case 2: System.out.print("paper.");
			break;
			
			}
			
			System.out.print(" You are ");
			switch(user) {
			case 0: System.out.print("scissor.");
			break;
			case 1: System.out.print("rock.");
			break;
			case 2: System.out.print("paper.");
			break;
			
			}
			if(user == computer) {
				System.out.println(" Draw");
			}else {
				boolean win = (user == 0 && computer == 2)||(user == 1 && computer == 0)||
					(user == 2 && computer == 1);
				if(win) {
					System.out.println(" You win!");
				}else {
					System.out.println(" You lose!");
				}
				}break;
				
			case 2: 
				
				String lottery = "" + (int)(Math.random()*10) + (int)(Math.random()*10);
				
				System.out.println("Enter lottery bet (two digits): ");
				Scanner scan = new Scanner(System.in);
				String guess = scan.nextLine();
				
				char lotterydig1 = lottery.charAt(0);
				char lotterydig2 = lottery.charAt(1);
				
				char guessdig1 = guess.charAt(0);
				char guessdig2 = guess.charAt(1);
				
				System.out.println("The lottery digit is " + lottery);
				
				if(lottery == guess) { 
					System.out.println("Exact match; You won $10,000!");
					}
				else if(lotterydig1 == guessdig2 && lotterydig2 == guessdig1){
					System.out.println("Match all digits; You won $3,000!");
				}
				else if (lotterydig1 == guessdig1 || lotterydig2 == guessdig2 || 
						lotterydig1 == guessdig2 || lotterydig2 == guessdig1) {
					System.out.println("Matched 1 digit; You won $1,000!");
				}else {
					System.out.println("Try again next time.");
				} break;
				
			}
		}else {
			System.out.println("Access Denied");
		}
		
		
		
		
		
		
	}

}
