public class Pineaple extends Fruit {
    
    private int cellulose;
    public void setCellulose( int cellulose ) {
        this.cellulose = cellulose; 
    }
    public int getCellulose() {
        return cellulose; 
    }
    
    @Override
    public void grow() {
        System.out.println("I'm growing ");
    }

    public Pineaple() {
        System.out.println( "Constructor of class Pineaple " );
        System.out.println( "Hashcode is: " + this.hashCode());
        System.out.println( "Hashcode Superclass is: " +
            super.hashCode() ) ;
        System.out.println( 
            "Class name is: " + this.getClass().getName() ); 
        System.out.println( 
            "Super class name is: " + super.getClass().getName());     
    }
    // returns leve of cellulose 
    @Override
    public String toString() {
        return super.toString() + "\ncellulose is: " + cellulose;
    }
    public void addToSugar( int a, int m){
        setSugar( (getSugar() + a )*m );
    }
    public void addToSugar( int a ) {
        //setSugar( getSugar() + a );
        int res = getSugar() + a;
        setSugar( res );
    }

// Fruit.toString()
// Pineaple.toString()
// Fruit <- Pineaple

   // Object <- Fruit <- Pineaple <- BlackPinaple

   // Fruit <- Apple - одиночное наследование

   // A; A <- B; A<-C; A<-U;
   // Fruit; Fruit <- Pineaple; Fruit <- Aplle; - Иерархическое наследование 
    // В Ява нет множественного наследования но есть множественная имплементация интерфейсов
}