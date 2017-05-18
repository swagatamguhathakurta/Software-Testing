
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class TestDriver 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("Driver for Vending Machine");
		VendingMachine vendingmachine = new VendingMachine();
		Scanner values;
		String value=null;
		//char choice;
		int i=1,m=0,temp=1,returnValue;
		while(temp==1)
		{

			System.out.println("0. coin()");
			System.out.println("1. small_cup()");
			System.out.println("2. large_cup()");
			System.out.println("3. sugar()");
			System.out.println("4. tea()");
			System.out.println("5. insert_large_cups(int n)");
			System.out.println("6. insert_small_cups(int)");
			System.out.println("7. set_price(int p)");
			System.out.println("8. cancel()");
			System.out.println("9. dispose()");
			System.out.println("Testing-related methods");
			System.out.println("a. Show_variables()");
			System.out.println("q. Quit Vending Machine class driver");

			Scanner keyboard = new Scanner(System.in);
			String choice= keyboard.nextLine();
			
			
			switch (choice) 
			{
				case "0": // coin
					System.out.print("\tcoin selected\n");
					returnValue = vendingmachine.coin();
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					System.out.println("The value returned by the method:"+returnValue);
					break;

				case "4": // tea
					System.out.print("\ttea\n");
					returnValue = vendingmachine.tea();
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					System.out.println("The value returned by the method:"+returnValue);
					//				Sugar=1;
					break;
				case "3": // sugar
					returnValue = vendingmachine.sugar();
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					System.out.println("The value returned by the method:"+returnValue);
					break;
				case "1": // small cup
					System.out.print("Small Cups Selected\n");
					returnValue = vendingmachine.small_cup();
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					System.out.println("The value returned by the method:"+returnValue);
					break;
				case "2": // Large Cup
					System.out.print("large Cups Selected \n");
					returnValue = vendingmachine.large_cup();
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					System.out.println("The value returned by the method:"+returnValue);
					break;
				case "5": // Insert Large Cup
					System.out.print("\tinsert large cup\n");
					 values = new Scanner(System.in);
					 value= values.nextLine();
					System.out.println("Enter value  of parameter k: "+value);
					returnValue = vendingmachine.insert_large_cups(Integer.parseInt(value));
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					System.out.println("The value returned by the method:"+returnValue);
					break;
				case "6": // Insert small Cup
					System.out.print("\tinsert small cup\n");
					values = new Scanner(System.in);
					 value= values.nextLine();
					System.out.println("Enter value  of parameter k1: "+value);
					returnValue = vendingmachine.insert_small_cups(Integer.parseInt(value));
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					System.out.println("The value returned by the method:"+returnValue);
					break;
				case "7": // Set price
					System.out.print("\tset price\n");
					values = new Scanner(System.in);
					value= values.nextLine();
					System.out.println("Enter Price: "+value);
					returnValue = vendingmachine.set_price(Integer.parseInt(value));
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					System.out.println("The value returned by the method:"+returnValue);
					break;
				case "8": // cancel
					System.out.print("\tcancel\n");
					returnValue = vendingmachine.cancel();
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					System.out.println("The value returned by the method:"+returnValue);
					break;

				case "9": //Set dispose
					System.out.print("dispose\n");
					returnValue=vendingmachine.dispose();
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					vendingmachine = new VendingMachine();
					break;
				case "a": //show variables
					System.out.print("show_variables() testing-related method\n");
					vendingmachine.Variables();
					vendingmachine.CurrentState();
					break;

				case "q":
					System.exit(0);

				default:System.out.println("Invalid Input");
				break;
			}
		}

	}
}


