package lab008.view;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import lab008.model.Employee;
import lab008.util.DataTool;

public class Test {
	public static List listEmployee;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			menu();
			System.out.println("Enter your choice : ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch(choice) {
			case 1 :
				listEmployee = DataTool.readerData();
				System.out.println("Length of employee : " + listEmployee.size());
				for (Object o : listEmployee) {
					Employee emp = (Employee) o;
					System.out.println("Information Employee : " +emp.getEmployeeName());
				}
			case 2 :
				DataTool.inputData(listEmployee, scanner);
			case 3 :
				try {
					DataTool.writeData(listEmployee);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 4 :
				System.out.println("Exit");
				flag = false;
				break;
			}
			
				
		}
		
	}
	
	
	public static void menu() {
		System.out.println("******************************");
		System.out.println("******Choice the option*******");
		System.out.println("******************************");
		System.out.println("1.ReadData");
		System.out.println("2.InputData");
		System.out.println("3.WriteData");
		System.out.println("4.Exit");
	}

}
