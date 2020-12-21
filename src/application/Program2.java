package application;

import java.sql.SQLException;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

import model.entities.Department;

public class Program2 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== TEST 1: department insertion ===");
		Department newDep = new Department(18, "capilar");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New Id = " + newDep);
		
		
		
		
		
		
		
		sc.close();

	}

}
