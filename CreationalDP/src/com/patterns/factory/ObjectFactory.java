package com.patterns.factory;
import java.util.HashMap;
import java.util.Map;

import com.patterns.pojo.Employee;
import com.patterns.pojo.Person;
import com.patterns.pojo.Shopper;

/**
 * Factory to return objects of requested classes.
 * 
 * @author Nishant
 */
public class ObjectFactory {

	private static Map<String, Shopper> shopperObjects;

	static {
		shopperObjects = new HashMap<String, Shopper>();
	}

	public static Person getPerson(String name, String money, String personType) {
		Person person = null;
		if (personType == null) {
			return person;
		}
		if (personType.equalsIgnoreCase("employee")) {
			person = Employee.createSingletonInstance(name, money, name);
		} else if (personType.equalsIgnoreCase("shopper")) {
			if (shopperObjects.isEmpty()) {
				shopperObjects.put(personType.toLowerCase(), new Shopper(name, money));
				person = shopperObjects.get(personType.toLowerCase());
			} else {
				person = shopperObjects.get(personType.toLowerCase()).clone();
			}
		}
		return person;
	}
}
