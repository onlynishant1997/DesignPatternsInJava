package com.patterns.pojo;

/**
 * Shopper implementing Cloneable to apply Prototype pattern.
 * 
 * @author Nishant
 */
public class Shopper extends Person implements Cloneable {
	protected String money;
	protected boolean employed;

	public Shopper() {
	}

	public Shopper(String name, String money) {
		super(name);
		this.money = money;
		this.employed = false;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public boolean isEmployed() {
		return employed;
	}

	public void setEmployed(boolean employed) {
		this.employed = employed;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public Shopper clone() {
		System.out.println("Cloning the old object");
		Shopper shopper = null;
		try {
			shopper = (Shopper) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return shopper;
	}

	@Override
	public String toString() {
		return "Shopper [money=" + money + ", employed=" + employed + ", name=" + name + "]";
	}

}
