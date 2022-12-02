public class Child extends Parent {

    public Child(int age ){
        // we are directly specifying call of paren't constructor
        super( age );
    }
    public Child() {
        super(0);
    }

    @Override
    public void show() {
     //   super.show();
        System.out.println( "Child's show ");
        setAge(10);
    }
    // won't compile becouse setAge is final 
   /* public void setAge( int age ) {

    }*/

}