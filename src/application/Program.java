package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class Program {

	public static void main(String[] args) {
		
		System.out.println("\n\n=== test 1: seller find by id ====\n\n");
		SellerDao sellerDao = DaoFactory.createSellerDao();
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
		
		List<Seller> list3 = sellerDao.findAll();
		for(Seller obj: list3) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n=== test 5: seller update ====\n\n");
		
		
		Seller newSeller2 = new Seller(4,"adaWong","ada@gmail.com", LocalDate.parse("1995-02-23"),2000.0,new Department(2, "Eletronics"));
		sellerDao.update(newSeller2 );
		
		
		List<Seller> list4 = sellerDao.findAll();
		for(Seller obj: list4) {
			System.out.println(obj);
		}
		
		
		
		
		
	}


	
}
