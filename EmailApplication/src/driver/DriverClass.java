package driver;

import java.util.Scanner;

import model.Department;
import model.Employee;
import service.CredentialService;

public class DriverClass {



	public static void main(String[] args) 
	{
		int choice;
		Employee employee= new Employee("Jatin","Kukade");
		System.out.println("Enter Department:");
		System.out.println("1)Technical\n2)Legal\n3)HR\n4)Finance");
		Scanner sc= new Scanner(System.in);
		choice= sc.nextInt();
		Department dept= new Department();
		CredentialService cs= new CredentialService();
		switch(choice)
		{
		case 1:dept.setDeptName("Technical");
		String Email= cs.generateEmail(employee, dept);
		String Password= cs.generatePassword();
		cs.showCredentials(Email, Password);
		break;
		case 2:dept.setDeptName("Legal");
		String Email2= cs.generateEmail(employee, dept);
		String Password2= cs.generatePassword();
		cs.showCredentials(Email2, Password2);
		break;
		case 3:dept.setDeptName("HR");
		String Email3= cs.generateEmail(employee, dept);
		String Password3= cs.generatePassword();
		cs.showCredentials(Email3, Password3);
		break;
		case 4:dept.setDeptName("Finance");
		String Email4= cs.generateEmail(employee, dept);
		String Password4= cs.generatePassword();
		cs.showCredentials(Email4, Password4);
		break;
		default:System.out.println("Invalid option");
		}



	}

}
