# Creational Design Pattern
You have three instances: Person, Employee and Shopper.

class Person {

    constructor(name='unnamed person')  {
        this.name = name;
    }
}

class Shopper extends Person {

    constructor(name, money=0) {
        super(name);
        this.money = money;
        this.employed = false;
    }
}

class Employee extends Shopper {

    constructor(name, money=0, employer='') {
        super(name, money);
        this.employerName = employer;
        this.employed = true;
    }
}

You need to create Shopper Alex Banks and Employee Eve Porcello, each has 100 moneys,
But you can’t just create them with simple initialization.

const eve = new Employee('Eve Porcello', ...);

You need to delegate initialization logic to another instance, which you need to design and implement, based on your Creational patterns’ knowledge. Also, Employee should be initialized only once – if you try to initialize new instance of it, previously created object should be returned (also, make sense to warn about it in the console).
