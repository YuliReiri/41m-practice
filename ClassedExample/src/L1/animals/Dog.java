package L1.animals;

class Dog1 {

}

class Dog2 {

}

public class Dog {

   class DogHart {

   } 
   public DogHart getDogHart() {
        return new DogHart();
   }

    private String color;
    private String name;
    private String owner;
    private int age;

   public void setColor( String color ) {
        this.color = color;
   }
   public String getColor() {
        return color;
   }
   public void setName( String name ) {
        this.name = name;
   }
   public String getName() {
        return name;
   }
   public int getAge() {
        return age;
   }
   public void setAge( int age ) {
        this.age = age; 
   }
   public void setOwner( String owner ) {
        this.owner = owner;
   } 
   public String getOwner(){
        return owner;
   }
   public Dog() {
        color = "";
        name = "";
        owner ="";
        age = 0;
    }
    public Dog(String owner, int age) {
        this.owner = owner;
        this.age = age;
    }
    public Dog(String color, String name ) {
        this.color = color;
       // this.age = age;
        this.name = name;
    }

    void bark( int timeMs, int frequency ) {

        return ;
    }
    public void printDogState() {
        System.out.println("Dog's name : " + name );
        System.out.println("Dogs's owner: " + owner);
        System.out.println("Dog's color: " + color);
        System.out.println("Dog's age: " + age );
    }

    public boolean eat() {
        
        return false;
    }
    public boolean sleep() {
        return false;
    }
}