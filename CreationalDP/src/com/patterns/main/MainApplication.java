package com.patterns.main;
import com.patterns.factory.ObjectFactory;
import com.patterns.pojo.Employee;
import com.patterns.pojo.Shopper;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("Creating employee for first tme");
		Employee employee1 = (Employee) ObjectFactory.getPerson("Professor", "10000000", "employee");
		System.out.println(employee1);

		System.out.println("-------------------------------------------");
		
		System.out.println("Creating employee for second time");
		Employee employee2 = (Employee) ObjectFactory.getPerson("Professor", "10000000", "employee");
		System.out.println(employee2);

		System.out.println("-------------------------------------------");

		System.out.println("Is both the instance same = " + (employee1 == employee2));

		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");

		System.out.println("Creating shopper for first time");
		Shopper shopper1 = (Shopper) ObjectFactory.getPerson("Tokyo", "200", "shopper");

		System.out.println(shopper1);

		System.out.println("-------------------------------------------");

		System.out.println("Creating object for second time");
		Shopper shopper2 = (Shopper) ObjectFactory.getPerson("Moscow", "500", "shopper");
		System.out.println(shopper2);

		System.out.println("-------------------------------------------");

		System.out.println("Is both the objects same = " + (shopper1 == shopper2));

	}
}
