package application;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n=== test 1: seller find by id ====\n\n");
		System.out.println("enter id for search teste: ");
		sellerDao.findById(sc.nextInt());
		System.out.println("search complete");
		
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n\n=== test 2: seller find by department ====\n\n");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, "Eletronics"));
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n=== test 3: seller find all ====\n\n");
		List<Seller> list2 = sellerDao.findAll();
		for(Seller obj: list2) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n=== test 4: seller insert ====\n\n");
		Seller newSeller = new Seller(
				null,"felipe","felipe@gmail.com", LocalDate.parse("2006-02-23"),2000.0,new Department(2, "Eletronics"));
		
		sellerDao.insert(newSeller);
		System.out.println("insert complete");
		
		System.out.println("\n\n=== test 5: seller update ====\n\n");
		
		
		Seller newSeller2 = new Seller(4,"adaWong","ada@gmail.com", LocalDate.parse("1995-02-23"),2000.0,new Department(2, "Eletronics"));
		sellerDao.update(newSeller2 );
		System.out.println("update complete");
	
		System.out.println("\n\n=== test 6: seller delete  ====\n\n");
		
		System.out.println("enter id for delete teste: ");
		sellerDao.deleteById(sc.nextInt());
		System.out.println("delete complete");
		
		
		sc.close();
	}


	
}
