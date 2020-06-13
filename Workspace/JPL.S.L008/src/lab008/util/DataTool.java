package lab008.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lab008.model.Employee;

public class DataTool {
	public static List readerData() {
		List listEmployee = new ArrayList<Employee>();
		try {
			FileReader reader = new FileReader(Constant.LOCATION + Constant.FILE_NAME_READER);
			BufferedReader br = new BufferedReader(reader);
			String line;
			try {
				while (((line = br.readLine()) != null) && !("".equals(line))) {
					String name = line;
					String phone = (line = br.readLine());
					String age = (line = br.readLine());
					Employee emp = new Employee(name, phone, age);
					listEmployee.add(emp);

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listEmployee;
	}

	public static void inputData(List listEmployee, Scanner scanner) {
		for (Object o : listEmployee) {
			Employee curr = (Employee) o;
			System.out.println("Input ID " + curr.getEmployeeName() + " :");
			String id = scanner.nextLine();
			System.out.println("Input Salary " + curr.getEmployeeName() + " :");
			double salary = Double.parseDouble(scanner.nextLine());
			curr.setId(id);
			curr.setSalary(salary);

		}
	}

	public static void writeData(List listEmployee) throws IOException {

		FileWriter fileWriter = new FileWriter(Constant.LOCATION + Constant.FILE_NAME_WRITER);
		for (Object object : listEmployee) {
			Employee curr = (Employee) object;
			fileWriter.write(curr + "\n");
		}

		fileWriter.close();

	}

}
