package application;

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
	}
	
}
