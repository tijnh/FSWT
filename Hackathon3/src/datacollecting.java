import java.util.Scanner;


public class datacollecting {
	int userinput;
	int state;
//Constructor
	public datacollecting(int input) {
		int userinput = input;

	}
	
//UserBuffer

//positive negative checker
	public int numbercheck(int i, int state) {
		if (i < 0) {
			state = -1;
			return i;
		}else if(i >0) {
			state = 1;
			return i;
		}
	}
	
//user counter
	public int usercounter(int usernumber) {
		int total;
		total = usernumber + 1;
		return total;
	}
	
//user positive counter
	public int positivecounter(int positiveusers) {
		int sum1;
		sum1 = positiveusers +1;
		return sum1;
	}
	
//user negative counter
	public int negativecounter(int negativeusers) {
		int sum2;
		sum2 = negativeusers +1;
		return sum2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//make a total of positive number and negative number
		int positivetotal = 0;
		int negativetotal = 0;
		
		//make variables that keep the number of users
		int positiveusers = 0;
		int negativeusers = 0;
		//make an instance of the DCS

		
		System.out.println("Please input a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		
		datacollecting dcs = new datacollecting(input);
		int number = dcs.userinput;
		int state = 0;
		state = dcs.numbercheck(number, state);
		
		//check the summation of the positive users
		if (state == 1) {
			positivetotal = positivetotal + dcs.userinput;
			positiveusers++;
		}else {
			negativetotal = negativetotal + dcs.userinput;
			negativeusers++;
		}
		System.out.println("positivetotal");
		System.out.println(positivetotal);
		System.out.println("negativetotal");
		System.out.println(negativetotal);
		System.out.println("Positive users");
		System.out.println(positiveusers);
		System.out.println("Negative users");
		System.out.println(negativeusers);
		
	}

}
