public class DogTown {
	public static void main(String args[]){
		Dog a = new Dog();

		//POLYMORPHISM: a superclass var is aloowed to hold
		//an object of a subclass type
		//instead of: Shiba b = new Shiba();
		Dog b = new Shiba();

		System.out.println("Dog: " + a.noise());
		System.out.println("Shiba: " + b.noise());
		System.out.println("============");

		//Polymorphism allows you to call subclass methods
		//from superclass vars
		//MOST usefull in arrays
		Dog [] kennel = new Dog [10];
		for(int i = 0; i < 10; i++){
			if(Math.random() < .5){
				kennel[i] = new Dog ();
			} 
			else {
				kennel[i] = new Shiba ();
			}
		}

		for(Dog d : kennel){
			System.out.println(d.noise());
		}
	}
}