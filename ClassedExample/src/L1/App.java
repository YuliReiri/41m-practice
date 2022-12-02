package L1;

import L1.animals.Dog;
import L1.animals.*;
import L1.plants.Tree;

public class App {
    public static void main(String[] args) throws Exception {
        
        L1.animals.Dog dog1;
        Dog dog2 = null;

        dog1 = new L1.animals.Dog("Sasha", 2);
        dog2 = new Dog("Irina", "Pit");
        Cat cat1 = new Cat();

        dog1.printDogState();
        Tree tree1 = new Tree(dog1);

        dog1.printDogState();
        L1.animals.Dog dog3 = new Dog();


       // dog3.color = "red";
       // dog3.bark(10, 2);

       // System.out.println("Dog3 state of sleep: " + dog3.sleep());

     //  System.out.println("Reference to dog1 is :" );
     //  System.out.println( dog1 );
     //  System.out.println( dog2 );

       dog1 = dog2;

        System.out.println( dog1.getOwner());
        dog1.setOwner("Nata");
        System.out.println( dog1.getOwner());

    }
}
