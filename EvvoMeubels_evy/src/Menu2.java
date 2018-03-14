import java.util.Scanner;

public class Menu2 {

	Scanner input = new Scanner(System.in);

	private int user;

	public void displayMenu() {
		System.out.println("Welkom Op Evvo Meubels\r\n" + "\r\n" + "----------------------------------\r\n" + "\r\n"
				+ "1 - Admin Login\r\n" + "2 - Werknemer Login\r\n" + "3 - Klant Login\r\n"
				+ "0 - Verlaat Evvo Meubels ");
		try {
			user = Integer.parseInt(input.nextLine());

			switch (user) {
			case 0:
				System.out.println("Thank you, Bye Bye!");
				break;
			case 1:
				displayAdminMenu();
				break;
			case 2:
				employeeLogin();
				break;
			case 3:
				System.out.println("Under Development");
				displayMenu();
				break;

			}

		} catch (NumberFormatException ex) {
			System.out.println("Enter a valid number! ");
			displayMenu();
		}

	}

	public void displayAdminMenu() {
		System.out.println("Admin Login\r\n" + "---------------------------\r\n" + "1-  Werknemer\r\n" + "2-  Klant\r\n"
				+ "3-  Bestelling\r\n" + "4-  Vacturen\r\n" + "5- Producten\r\n" + "0- Verlaat Admin Login ");
		try {
			user = Integer.parseInt(input.nextLine());

			switch (user) {
			case 0:
				displayMenu();
				break;
			case 1:
				System.out.println("Under Development");
				displayAdminMenu();
				break;
			case 2:
				System.out.println("Under Development");
				displayAdminMenu();
				break;
			case 3:
				System.out.println("Under Development");
				displayAdminMenu();
				break;
			case 4:
				System.out.println("Under Development");
				displayAdminMenu();
				break;
			case 5:
				System.out.println("Under Development");
				displayAdminMenu();
				break;

			}

		} catch (NumberFormatException ex) {
			System.out.println("Enter a valid number! ");
			displayAdminMenu();
		}

	}

	public void employeeLogin() {
		
		boolean userFound = false;
		
		String username = "";
		String password ="";

		System.out.println("Login Form ");
		System.out.println("Please enter your username: ");
		username = input.nextLine();
		System.out.println("Please enter your password: ");
		password = input.nextLine();
		
		if(userFound == true) {
			
			System.out.println(" Werknemer Page\n" + "1- Klanten\n"+ "2- Producten\n"+ "3- Bestellingen\n" +"0- Verlaat Admin Login ");
			
			try{
			user = Integer.parseInt(input.nextLine());
			
			switch(user){
			case 1:
				displayEmployeeCustomerMenu() ;
				break;
			case 2:
				displayEmployeeProducts() ;
				break;
			case 3:
				displayEmployeeOrdersMenu();
				break;
			
			}
			
			}catch (NumberFormatException ex) {
				System.out.println("Enter a valid number! ");
				displayAdminMenu();
			}
		}
		
		
		
	}
	
	public void displayEmployeeMenu() {
		
		System.out.println("Werknemer Login\r\n" + "---------------------------\r\n" + "1-  Klanten\r\n"
				+ "2-  Bestellingen\r\n" + "3-  Producten\r\n" + "4-  Vacaturen\r\n" + "0- Verlaat Medewerker Login ");

		try {
			user = Integer.parseInt(input.nextLine());

			switch (user) {
			case 0:
				displayAdminMenu();
				break;
			case 1:
				displayEmployeeCustomerMenu();
				break;

			case 2:
				displayEmployeeOrdersMenu();
				break;

			case 3:
				displayEmployeeProducts();
				break;

			case 4:
				displayEmployeeVacancies();
				break;

			case 5:
				System.out.println("Under Development");
				displayAdminMenu();
				break;

			}

		} catch (NumberFormatException ex) {
			System.out.println("Enter a valid number! ");
			displayEmployeeMenu();

		}

	}

	public void displayEmployeeCustomerMenu() {

		System.out.println("Werknemer | Klant\r\n" + "---------------------------\r\n" + "1- Klant Toevoegen\r\n"
				+ "2- Klant Verwijderen\r\n" + "3- Klant Aanpassen\r\n" + "4- Klant Totaal\r\n"
				+ "0- Verlaat Medewerker| Klant");

		try {
			user = Integer.parseInt(input.nextLine());
			switch (user) {
			case 0:
				displayEmployeeMenu();
				break;
			case 1:
				System.out.println("Under Development");

				break;

			case 2:
				displayEmployeeOrdersMenu();
				break;

			case 3:
				System.out.println("Under Development");
				displayEmployeeCustomerMenu();
				break;

			case 4:
				System.out.println("Under Development");
				displayEmployeeCustomerMenu();
				break;

			case 5:
				System.out.println("Under Development");
				displayEmployeeCustomerMenu();
				break;

			}
		} catch (NumberFormatException ex) {
			System.out.println("Enter a valid number!");
			displayEmployeeCustomerMenu();
		}
	}

	public void displayEmployeeOrdersMenu() {
		System.out.println("Werknemer|  Bestellingen\r\n" + "---------------------------\r\n"
				+ "1- Bestelling Toevoegen\r\n" + "2- Bestelling Verwijderen\r\n" + "3- Bestelling anpassen\r\n"
				+ "4- Bestelligen Totaal\r\n" + "0- Verlaat Medewerker | Bestellingen");

		try {
			user = Integer.parseInt(input.nextLine());
			switch (user) {
			case 0:
				displayEmployeeMenu();
				break;
			case 1:
				System.out.println("Under Development");
				displayEmployeeCustomerMenu();
				break;

			case 2:
				System.out.println("Under Development");
				displayEmployeeCustomerMenu();
				break;

			case 3:
				System.out.println("Under Development");
				displayEmployeeCustomerMenu();
				break;

			case 4:
				System.out.println("Under Development");
				displayEmployeeCustomerMenu();
				break;

			case 5:
				System.out.println("Under Development");
				displayEmployeeCustomerMenu();
				break;

			}
		} catch (NumberFormatException ex) {
			System.out.println("Enter a valid number!");
			displayEmployeeOrdersMenu();
		}
	}

	public void displayEmployeeVacancies() {
		System.out.println("Werkenemer |  Vacaturen\r\n" + "---------------------------\r\n"
				+ "1- Maak nieuwe Vacaturen\r\n" + "2- Openstaande Vacturen\r\n" + "3- Betaalde Vacaturen\r\n"
				+ "4- Totaal Vacaturen\r\n" + "0- Verlaat Medewerker  | Vacaturen");

		try {
			user = Integer.parseInt(input.nextLine());
			switch (user) {
			case 0:
				displayEmployeeMenu();
				break;
			case 1:
				System.out.println("Under Development");
				displayEmployeeVacancies();
				break;

			case 2:
				System.out.println("Under Development");
				displayEmployeeVacancies();
				break;

			case 3:
				System.out.println("Under Development");
				displayEmployeeVacancies();
				break;

			case 4:
				System.out.println("Under Development");
				displayEmployeeVacancies();
				break;

			case 5:
				System.out.println("Under Development");
				displayEmployeeVacancies();
				break;

			}
		} catch (NumberFormatException ex) {
			System.out.println("Enter a valid number!");
			displayEmployeeVacancies();
		}
	}

	public void displayEmployeeProducts() {
		System.out.println("Werkenemer|  Producten\r\n" + "---------------------------\r\n" + "1- Meubel Toevoegen\r\n"
				+ "2- Meubel Aanpassen\r\n" + "3- Meublel Verwijderen\r\n" + "4- Totale Meubels\r\n"
				+ "0- Verlaat Medewerker| Producten");
		try {
			user = Integer.parseInt(input.nextLine());
			switch (user) {
			case 0:
				displayEmployeeMenu();
				break;
			case 1:
				System.out.println("Under Development");
				displayEmployeeProducts();
				break;

			case 2:
				System.out.println("Under Development");
				displayEmployeeProducts();
				break;

			case 3:
				System.out.println("Under Development");
				displayEmployeeProducts();
				break;

			case 4:
				System.out.println("Under Development");
				displayEmployeeProducts();
				break;

			case 5:
				System.out.println("Under Development");
				displayEmployeeProducts();
				break;

			}
		} catch (NumberFormatException ex) {
			System.out.println("Enter a valid number!");
			displayEmployeeProducts();
		}
		
	}
}
