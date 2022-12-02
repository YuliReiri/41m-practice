
public class Parent {
    private int age;

   /*  public Parent() {

    }*/
    public Parent( int age ){
        this.age = age;
    }

    protected void show() {
        System.out.println("Parent's show ");
    }
    final public int getAge() {
        return age;
    }
    final public void setAge( int age ) {
        this.age = age;
    }
} 