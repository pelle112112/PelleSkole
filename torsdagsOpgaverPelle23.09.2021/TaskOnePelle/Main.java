package TaskOnePelle;

class Main{

	String name;
	int age;


	public static void main(String[] args){
		
		Main account = new Main();
		account.name = "Pelle";
		account.age = 23;


		account.printFunction(account.name,account.age);


	}

	void printFunction(String name, int age){
		System.out.println("My name is " + name + ", I am " + age + " years old");
	}

}

