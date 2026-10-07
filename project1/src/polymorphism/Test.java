package polymorphism;

public class Test {

	public static void main(String[] args) {
		Animal an = new Animal();
		an.sound();
		Dog dg = new Dog();
		dg.sound();
		Cat ca = new Cat();
		ca.sound();
		
		//or Upcasting
		
		Animal a = new Dog();
		a.sound();
		a = new Cat();
		a.sound();

	}

}
