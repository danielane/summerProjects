/**A madLibs project dedicated to my camp
*by -- Dory aka danielane
**/

import java.util.Scanner;

public class IdTechlandia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Scanner to get input from user
				Scanner input = new Scanner(System.in);
				
				//Declaring variables
				String profession;
				String city;
				String fictionCity;
				String creature1;
				String verb;
				String animal;
				String instructor;
				String creature2;
				String creature3;
				String noun;
				String power;
				String adjective;
				String noun2;
				String userAnswer;
				
				int time;
				
				//ask some questions
				System.out.print("Hello welcome to Dory's MadLibs. Would you like to create a madlib? (yes/no)");
				userAnswer = input.nextLine();
				
				if (userAnswer.equals("yes")){
					
				
				System.out.print("Awesome! Let's begin.\n");
				System.out.print("Please enter a profession: ");
				profession = input.nextLine();
				
				System.out.print("Please enter a city: ");
				city = input.nextLine();
				
				System.out.print("Now enter the name of a fictional place: ");
				fictionCity = input.nextLine();
				
				System.out.print("Next, I would like you to enter a creature: ");
				creature1 = input.nextLine();
				
				System.out.print("The word I want you to enter is a verb: ");
				verb = input.nextLine();
				
				System.out.print("Please enter an animal next: ");
				animal = input.nextLine();
				
				System.out.print("Now type the name of an iDTech Instructor: ");
				instructor = input.nextLine();
				
				System.out.print("Now enter a different creature from before: ");
				creature2 = input.nextLine();
				
				System.out.print("Enter another creature please: ");
				creature3 = input.nextLine();
				
				System.out.print("Enter a noun. pretty please: ");
				noun = input.nextLine();
				
				System.out.print("Enter a magic power: ");
				power = input.nextLine();
				
				System.out.print("Enter an adjective now: ");
				adjective = input.nextLine();
				
				System.out.print("Would you please enter a number: ");
				time = input.nextInt();
				
				System.out.println("Great here is your MadLib!\n\n");
				System.out.print("Once there was a " + profession + " named Jukebox");
				System.out.print(" who lived in " + city + ", Michigan.\n");
				System.out.print("She often dreamed of her old life in the fantastic lands of " + fictionCity + ",\n where she would fight ");
				System.out.print( creature1 + " and " + verb + " around all day.\n");
				System.out.print( "One day she met a " + animal + " named " + instructor + "\nJukebox:\"Hello " + animal + ", what are you doing here");
				System.out.print(" in " + city + "\"?");
				System.out.print("\n");
				System.out.print(instructor + ":\"My name is " + instructor + " and I am from the magic land of iDTechlandia.\n");
				System.out.print("I have come to find the most beautiful " + creature3 + "and take them back to my land with me.\" \n");
				System.out.print("Jukebox: \"Well it's nice to meet you " + instructor + " do you have " + creature1);
				System.out.print(" in your land of iDTechlandia?\n");
				System.out.print(instructor + ":\"No! but we have " + creature2 + ".\" \n");
				System.out.print("Jukebox: \"Awesome! Can I come to iDTechlandia? I am not a " +  creature2 + ", ");
				System.out.print("But I can " + power + ".\n");
				System.out.print(instructor + ":\"Great we can take the " + adjective +  " " + noun +" and get there in " + time + " minutes. \"");
				System.out.print("Yay! Let's go!");
				}
				else
				{
					System.out.println("Okay goodbye!");
				}
				
				 
				
				//close the Scanner
				input.close();
				

	}//End of Main

}
