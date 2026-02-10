package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n=== test 1: seller find by id ====\n\n");
		System.out.println("enter id for search teste: ");
		Department department =  departmentDao.findById(2);
		System.out.println("search complete: " + department);
		
		
		
		sc.close();
		
	}
}
