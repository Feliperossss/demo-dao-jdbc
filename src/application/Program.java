package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class Program {

	public static void main(String[] args) {
		
		System.out.println("=== test 1: seller find by id ====");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== test 2: seller find by department ====");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, "Eletronics"));
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
	}
	
}
