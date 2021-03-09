package day13;

public class Prog7 {

}
interface Hungry<E> { 
	void munch(E x); 
}

interface Carnivore<E extends Animal> extends Hungry<E> {} 

interface Herbivore<E extends Plant> extends Hungry<E> {} 

abstract class Plant {} 

class Grass extends Plant {} 

abstract class Animal {} 

class Sheep extends Animal implements Herbivore<Plant> { 
	public void munch(Sheep x) {} 
	@Override
	public void munch(Plant x) {
		// TODO Auto-generated method stub
		
	}
} 
class Wolf extends Animal implements Carnivore<Sheep> { 
	public void munch(Sheep x) {} 
} 