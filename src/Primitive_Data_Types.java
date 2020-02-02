
public class Primitive_Data_Types {

	public static void main(String[] args) {
		//first variable
		String firstName = "Derek";
		char middleInitial = 'L';
		String lastName = "Miller";
		int age = 37;
		int numberOfFriends = 400;
		double amountOfMoneyInWallet = 100.00;
		double itemPrice = 95.55;
		
		//first performing operations
		double moneyDifference = amountOfMoneyInWallet - itemPrice;
		double friendsPerYear = numberOfFriends / age;
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		
		//second variable
		String aFirstName = "Azmortiel";
		char aMiddleInitial = 'R';
		String aLastName = "Cain";
		int aAge = 907;
		int aNumberOfFriends = 1500;
		double amountOfMoney = 2000.00;
		double aItemPrice = 199.99;
		
		//second performing operations
		double aMoneyDifference = amountOfMoney - aItemPrice;
		double aFriendsPerYear = aNumberOfFriends / aAge;
		String aFullName = aFirstName + " " + aMiddleInitial + " " + aLastName;
		
		
		System.out.println("First Money Difference: " + moneyDifference);
		System.out.println("First Friends per year: " + friendsPerYear);
		System.out.println("First Full Name: " + fullName);
		System.out.println("Second Money Difference: " + aMoneyDifference);
		System.out.println("Second Friends Per Year: " + aFriendsPerYear);
		System.out.println("Second Full Name: " + aFullName);
		
	}

}
