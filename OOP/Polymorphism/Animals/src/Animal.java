
abstract class Animal {
	
	String name;
	
	public Animal (String name) {
		this.name = name;
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping");
	};
	
	abstract public void makeSound();

}
