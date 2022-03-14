package exerciciosDeHerancaPolimorfismo02;

public class TestaAnimal {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal cachorro = new Cachorro();
		Animal cavalo = new Cavalo();
		Animal preguica = new Preguica();
		
		animal.setEmiteSom("Animal emitindo som");
		cachorro.setEmiteSom("Cachorro emitindo som");
		cavalo.setEmiteSom("Cavalo emitindo som");
		preguica.setEmiteSom("Preguiça emitindo som");
		
		System.out.println(animal.emiteSom());
		System.out.println(cachorro.emiteSom());
		System.out.println(cavalo.emiteSom());
		System.out.println(preguica.emiteSom());
	}
}
