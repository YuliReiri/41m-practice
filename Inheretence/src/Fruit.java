import java.util.Arrays;

abstract public class Fruit  {

   // public String[] vitamins;
   // public int sugar;
    private String[] vitamins;
    private int sugar;

    abstract void grow();

    public Fruit() {
        System.out.println( "Constructor of class Fruit" );
        System.out.println( "Hash code:" + this.hashCode() );
        System.out.println( 
            "Class name: " + this.getClass().getName()); 
    }
    public String[] getVitamins() {
        return vitamins;
    }
    public int getSugar() {
        return sugar;
    }
    public void setVitamins( String[] vitamins ) {
        this.vitamins = vitamins;
    }
    public void setSugar( int sugar ) {
        this.sugar = sugar;
    }
    public String toString() {
        return "reference is: " + super.toString() + String.format(
            "\nsugar: %d\nvitamins %s", sugar,
            Arrays.toString( vitamins ));
        
    }
}