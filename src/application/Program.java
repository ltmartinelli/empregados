package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Department dept = new Department();

		System.out.print("Nome do Departamento: ");
		dept.name = sc.next();
		System.out.print("Dia do Pagamento: ");
		dept.payday = sc.nextInt();

		Address address = new Address();

		System.out.print("Email: ");
		address.email = sc.next();
		System.out.print("Telefone: ");
		address.phone = sc.next();

		dept.address = address;

		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();

		System.out.println();

		for (int i = 1; i <= n; i++) {

			Employee employee = new Employee();
			System.out.println("Dados do funcionário " + i);

			sc.nextLine();	
			System.out.print("Nome: ");
			employee.name = sc.nextLine();
						
			System.out.print("Salário: ");
			employee.salary = sc.nextDouble();
			
			System.out.println();
			
			dept.addEmployee(employee);
		}
		
		System.out.println();

		showReport(dept);

		sc.close();

	}

	private static void showReport(Department dept) {
		System.out.println("Folha de Pagamento:");
		System.out.printf("Departamento %s = R$ %.2f", dept.name, dept.payRoll());
		System.out.println();
		System.out.println("Pagamento realizado no dia "+ dept.payday);
		System.out.println("Funcionários:");
		for(Employee emp : dept.employeeList) {
			System.out.println(emp.name);
		}
		System.out.println("Para dúvidas, favor entrar em contato: " + dept.address.email);
	}

}
