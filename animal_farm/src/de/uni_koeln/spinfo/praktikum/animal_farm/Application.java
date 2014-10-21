package de.uni_koeln.spinfo.praktikum.animal_farm;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse horse1 = new Horse();
		Horse horse2 = new Horse();
		
		horse1.age = 20;
		horse1.name = "Huby";
		
		System.out.println("Das Pferd heiﬂt " + horse1.name + " und ist " + horse1.age + " Jahre alt.");
		
		Huhn huhn = new Huhn();
		
		huhn.anzahl = 400;
		huhn.printAnzahl();
	}

}
