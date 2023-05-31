package manager;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		Operator op = getObject("op.ser");
		if(op == null)
		{
			op = new Operator(input);
		}
		selectMenu(input, op);
		putObject(op,"Operator.ser");
	}

	public static void selectMenu(Scanner input, Operator op) {
		int num = 0;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				System.out.println();
				switch (num) {
				case 1:
					op.menu();
					logger.log("View Menu");
					break;
				case 2:
					op.add_menu();
					logger.log("Add Menu");
					break;
				case 3:
					op.delet_menu();
					logger.log("Delet Menu");
					break;
				case 4:
					op.adress();
					logger.log("Go to adress item");
					break;
				default:
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please put an Integer between 1 and 4.");
				System.out.println();
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}

	}

	public static void showMenu() {
		System.out.println("1. Show menu");
		System.out.println("2. Add menu");
		System.out.println("3. Delet menu");
		System.out.println("4. Adress");
		System.out.println("5. Exit");
		System.out.print("select number 1-5 : ");
	}

	public static Operator getObject(String filename) {
		Operator op = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			op = (Operator) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return op;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return op;
	}

	public static void putObject(Operator op, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(op);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}
