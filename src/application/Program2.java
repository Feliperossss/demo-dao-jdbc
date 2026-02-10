package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;



public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n=== test 1: department find by id ====\n\n");
		System.out.println("enter id for search teste: ");
		Department department =  departmentDao.findById(2);
		System.out.println("search complete: " + department);
		
		
		
		System.out.println("\n\n=== test 2: department find all ====\n\n");
		List<Department> list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n\n=== test 3: department insert ====\n\n");
		Department dep = new Department(null, "Cosmetics");
		departmentDao.insert(dep);
		System.out.println("insert complete");
		
		System.out.println("\n\n=== test 4: department update ====\n\n");
		Department dep2 = new Department(3, "Fashion week");
		departmentDao.update(dep2);
		System.out.println("update complete");
		
		sc.close();
		
	}
}
