/*
 * Angus Henry
 * This is testing classes and stuff
 */

package dogtester;

/**
 *
 * @author anhen3335
 */
public class DogTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Dog dog1 = new Dog("Rover", "Spaniel", 8, 4);
    Dog dog2 = new Dog("Spot", "Border Collie");
    // dog4 is my test
    Dog dog4 = new Dog("Alexander", "German Sheperd", 346, 3245);
    Dog dog3 = new Dog();

    //Print the details of each dog
    System.out.println(dog1.toString());
    System.out.println("--------------------------");

    System.out.println(dog2.toString());
    System.out.println("--------------------------");

    //toString() is called by default, no need to write it!
    System.out.println(dog3);
    System.out.println("--------------------------");
    
    // test to see if things work 
    System.out.println(dog4);
    System.out.println("--------------------------");

    //dog1 barks friendly, dog2 barks angry
    dog1.barkFriendly();
    dog2.barkAngry();
    // look, now dog4 is barking. WHaaaaaaAAAAAAAAAAaaaaAAAAAAAAa!
    dog4.barkAngry();
    }
    
}
