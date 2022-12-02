public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Pineaple pineaple = new Pineaple();
        pineaple.setSugar(10);
        pineaple.setVitamins( new String[] { "A", "B"});
        pineaple.setCellulose( 3 );
        //System.out.println( pineaple);
        System.out.println( 
            pineaple.toString());

        pineaple.addToSugar( 3 );

        System.out.println( 
            pineaple.toString() );

        pineaple.addToSugar(1, 2);

        System.out.print( pineaple );

        Summator summator = new Summator();

        String res1 = summator.sum("Ira ", "Vanya");
        int res2 = summator.sum( 10, 20 );
        double res3 = summator.sum( 12.1 , 18.5);
        double res4 = summator.sum( 11.555, 6);

        // %s - it means string variable
        // %d - means integer variable 
        // %f - means float variable 
        String  inputString = 
            "\nresult 1 is: %s\nresult 2 is: %d\nresult 3 is : %f\n";
        String outputString = 
                String.format(inputString, res1, res2, res3);
        System.out.println( outputString );

       // Fruit fruit = new Fruit();
       // fruit.setSugar(10);
       // System.out.print( fruit );

       Fruit someFruit = pineaple;
       someFruit.grow();
       pineaple.grow();

      // Parent p1 = new Parent( 13 );
      // Parent p2 = (Parent) new Child();

      // p1.show();
       //p2.show();
    }
}
