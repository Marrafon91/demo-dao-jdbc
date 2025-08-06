package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(2);
		System.out.println("===== TEST 1: department findById =====");
		System.out.println(department);
		
		System.out.println("\n===== TEST 2: department findByDepartment =====");
		
		
		
		
		sc.close();
	}

}
