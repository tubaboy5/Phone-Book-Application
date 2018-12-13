import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookApplication
{

	public static ArrayList<Contact> contacts = new ArrayList<Contact>();	
	public static void main(String[] args) 
	{		
//Adding Static Contact Information
		Contact johnDoe = new Contact("John" , "Doe" , "114 Market St, St Louis, MO, 63403" , "6366435698");
		contacts.add(johnDoe);
		Contact johnTan = new Contact("John" , "Tan" , "324 Main St, St Charles, MO,63303" , "8475390126");
		contacts.add(johnTan);
		Contact johnSmith = new Contact("John" , "Smith" , "574 Pole ave, St. Peters, MO, 63333" , "5628592375");
		contacts.add(johnSmith);
		displayMenu();
		

	}
	
	public static void displayMenu()
	{		
		Scanner input = new Scanner(System.in);
		int mainMenuChoice;
		int deleteUserInput;
		String searchString = " ";
		
		do
		{
//Static menu options		
		System.out.println("Welcome to your phonebook!");
		System.out.println("Choose one of the options below");
		System.out.println();
		System.out.println("1. Add a contact");
		System.out.println("2. Delete a contact");
		System.out.println("3. Search for a contact");
		System.out.println("4. Exit phonebook");
		System.out.println();
		System.out.print("What option would you like to choose? ");	
		mainMenuChoice = input.nextInt();
		System.out.println();
		input.nextLine();
		
		if(mainMenuChoice == 1)
		{
			addContact();
		}
		else if(mainMenuChoice == 2)
		{
			deleteContact();
		}
		else if(mainMenuChoice == 3)
		{
			searchForContact();
		}
		else if(mainMenuChoice == 4)
		{
			exitProgram();
		}
		else if(mainMenuChoice > 5 || mainMenuChoice < 1)
		{	
			System.out.println("That is an invalid option, please choose again");
		}
		System.out.println();
		}
		while (mainMenuChoice != 4);
	}
	
	public static void addContact()
	{	
		System.out.println("\nYou want to add a contact");
		
//User input 		
		Scanner name = new Scanner(System.in);
		System.out.println("Add an entry to your phonebook");
		System.out.print("Enter the person's first name: ");
		String firstName = name.nextLine();
		System.out.print("Enter the person's last name: ");
		String lastName = name.nextLine();
		System.out.print("Enter the person's address: ");
		String address = name.nextLine();
		System.out.print("Enter the person's phone number: ");
		String phoneNumber = name.nextLine();
		//
		
		contacts.add(new Contact(firstName, lastName, address, phoneNumber));
		
		yesNoAdd();
	}
	
	public static void yesNoAdd()
	{
		System.out.print("\nDo you want to add another contact? (y/n): ");
		Scanner yesNo = new Scanner(System.in);
		String inputChar = yesNo.next();

		
		if (inputChar.equals("y")) 
		{
			System.out.println("Let's add another contact");
			addContact();
		} 
		else if (inputChar.equals("n")) 
		{
			System.out.println("Back to main menu");
		}
		else 
		{
			System.out.println("Sorry, I didn't catch that. Please answer y/n");
			yesNoAdd();
		}
	}

	
	
	
	
	public static void deleteContact()
	{
		System.out.println("\nHere are the contacts in your address book");
//Display contents of arrayList Contact as lastname, firstname and put number by each one
		displayFormattedArray(contacts);
		
		System.out.print("\nWhat contact number would you like to delete? ");
//User input for the name they would like to delete 
		Scanner input = new Scanner(System.in);
		int deleteUserInput = input.nextInt();
		input.nextLine();
		System.out.println();
//Are you sure you want to delete that contact?		
		if (deleteUserInput <= contacts.size() && deleteUserInput >= 1)
		{
			System.out.print("Are you SURE you want to delete contact #" +deleteUserInput +" - " +contacts.get(deleteUserInput-1) +"? (y/n) ");
			Scanner yesNo = new Scanner(System.in);
			String inputChar = yesNo.next();
//Actually deleting the contact from the Array
			if (inputChar.equals("y")) 
			{
				System.out.println("\nContact #" +deleteUserInput +" - " +contacts.get(deleteUserInput-1) +" has been deleted\n");				
				contacts.remove(deleteUserInput-1);
			} 
			else if (inputChar.equals("n")) 
			{
				System.out.println("Let's go back to the main menu\n");
				displayMenu();
			}
			else 
			{
				System.out.println("Sorry, I didn't catch that. Please answer y/n");
				deleteContact();
			}
		} 
		else if (deleteUserInput > contacts.size() || deleteUserInput < 1) 
		{
			System.out.println("That isn't a vaild option. \n"
					+ "Please choose again.");
		}		
	}
	
	public static void displayFormattedArray (ArrayList<Contact> tobedisp)
	{
		for (int counter = 0; counter < contacts.size(); counter++) 
		{ 		      
		    System.out.println(counter+1 +". " +contacts.get(counter)); 		
		}   		
	}
	
	
	
	public static void searchForContact() 
	{
		System.out.println("\nEnter the info you would like to search your phonebook for");
		Scanner input = new Scanner(System.in);
		String searchString = input.nextLine();
		boolean result = false;
		for(int i = 0; i < contacts.size(); i++)
		{
			if(contacts.get(i).getFirstName().equals(searchString))
			{
			result = true;
			System.out.println();
			System.out.println(contacts.get(i).getFirstName() +" " +contacts.get(i).getLastName());
			System.out.println(contacts.get(i).getAddress());
			System.out.println(contacts.get(i).getTelephoneNumber());
			System.out.println();
			}
			else if(contacts.get(i).getLastName().equals(searchString))
			{
			result = true;
			System.out.println();
			System.out.println(contacts.get(i).getFirstName() +" " +contacts.get(i).getLastName());
			System.out.println(contacts.get(i).getAddress());
			System.out.println(contacts.get(i).getTelephoneNumber());
			System.out.println();
			}
			else if(contacts.get(i).getTelephoneNumber().equals(searchString))
			{
			result = true;
			System.out.println();
			System.out.println(contacts.get(i).getFirstName() +" " +contacts.get(i).getLastName());
			System.out.println(contacts.get(i).getAddress());
			System.out.println(contacts.get(i).getTelephoneNumber());							System.out.println();
			}
			
		}
		if(result)
		{
			displayMenu();
		}
		else if(!result)
		{
			System.out.println("\nThere are no matches for \"" +searchString +"\" in your address book.");
		}
	}
	
	public static void exitProgram()
	{
		System.out.println("Thank you.  Have a good day!");
	}
}