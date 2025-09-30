package project1;

public class Animal {
	void sound() {
		System.out.println("Animal make a sound");
	}
}
	class Dog extends Animal {
		void sound() {
			System.out.println("Dog barks");
		}
		
		public static void main(String[] args) {
			Dog d = new Dog();
			d.sound(); 
		}
	}
