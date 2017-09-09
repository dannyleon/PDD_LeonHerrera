public interface Animal
{
	publc  void eat();
}

public class Dog implements Animal
{
	public void eat()
	{
		System.out.println("Dog is eating...");
	}
}
public class Cat implements Animal
{
	public void eat()
	{
		System.out.println("Cat is eating...");
	}
}

public class Fox implements Animal
{
	public void eat()
	{
		System.out.println("Fox is eating...");
	}
}

public class AnimalFactory
{
	pub Animal createAnimal(string animalType)
	{
		if(animalType==null)
		{
			return null;
		}

		if("Dog".equalsIgnoreCase(animalType))
		{
			retu new Dog();

		}else if ("Cat".equalsIgnoreCase(animalType))
		{
			return new Cat();

		}else if (("Fox".equalsIgnoreCase(animalType))
		{
			return new Fox();

		}
		return null;


	}
}

public class FactoryPatternTest
{
	//Before Factory Pattern
        /**Dog dog= new Dog();
        dog.eat();
        
        Cat cat = new Cat();
        cat.eat();
        */
        
        //After Factory Pattern
        
        String animalType = args[0];
        
        AnimalFactory animalfactory = new AnimalFactory();
        Animal animal = animalfactory.createAnimal(animalType);
        animal.eat();
}

























