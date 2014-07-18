/** A Very short Text Adventure Program, designed to teach kids about Getting input 
 * and if-then-else statements
 * 
 */

/**
 * @author danielane
 *
 */
import java.util.Scanner;

public class adventure {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Scanner to get input from user 
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		String userinput1;
		String userinput2;
		String userinput3;
		
		String intro;
		String question1;
		String response1;
		String response2;
		String nameQues;
		String name;
		String youswamaway;
		
		//Initialize String variables
		intro = "Welcome to Dory's Adventure Game! Are you ready to play?(Type yes/no)";
		nameQues = "What is your name?";
		question1 = "You are swimming in the East Australian Current. You see a mystertious bluefish\nDo you 'approach' the fish? or 'swim' away? (Type approach/swim)";
		response1 = "Well that's boring.";
		response2 = "You have a new friend";
		youswamaway = "Now you find yourself in front of a very creepy trench. Do you swim over it or under it?(Type 'over'/'under'";
		
		//Begin Game		
		System.out.println(intro);
		userinput1 = input.nextLine();
		System.out.println(nameQues);
		name = input.nextLine();
		
		//First response "yes"
		if (userinput1.equals("yes")){
			System.out.println("Great!\n");
			
			//Question about the EAC
			System.out.println(question1);
			userinput2 = input.nextLine();
			
			//If they approach the fish, begin dialogue
			if (userinput2.equals("approach"))
			{
				System.out.println(response2);
				System.out.println("\n" + "BlueFish: Hi my name is Dory what's your name? Hi my name is " + name + " \n Dory: Nice to meet you " + name + " Will you help me find my friend? (Please Type 'yes'/'no')");
				
				//Still in the approach == yes
				//Do they want to help Dory?
				userinput3 = input.nextLine();
				if (userinput3.equals("yes"))
				{
					System.out.println("Awesome let's go!");
				} 
				else 
				{
					System.out.println("Fine, be that way!");
				} }
				
				//What if they swam away?
				else {
				System.out.println(response1);
			} }
			
			//And if they did not want to play in the first place?
			else {
				System.out.println("Okay, " + name + " you don't have to play. Have a nice day :)");
			}
			
		
		
input.close();
	}

}
