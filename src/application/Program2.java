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
		
		System.out.println("\n=== TEST 2: department insertion ===");
		Department newDep = new Department(null, "capilar");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New Id = " + newDep.getId());
		
		System.out.println("\n=== TEST 3: department update ===");
		department = departmentDao.findById(1);
		department.setName("Fragances");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("\n=== TEST 3: department delete ===");
		System.out.println("Enter id for delete test: ");
		Integer id = sc.nextInt();
		departmentDao.deleteById(id );
		System.out.println("Delete completed!");
		
		sc.close();

	}

}
