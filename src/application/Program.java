package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Seller obj = new Seller(1, "felipe", "ala@gmail.com",
				LocalDate.parse("2006-01-14"), 2000.0, new Department(1,"book"));
		System.out.println(obj);
	}

}
