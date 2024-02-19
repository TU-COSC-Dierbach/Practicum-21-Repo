///elijah Mari
//finished
class Main {
    public static void main(String[] args) {
  
      // Init values
      SingleValue value1 = new SingleValue(10);
      SingleValue value2 = new SingleValue(10);
      SingleValue value3 = value2;
  
      // Display values
      System.out.println("\nINITIAL VALUES");
      System.out.println("value1 = " + value1.getX());
      System.out.println("value2 = " + value2.getX());
      System.out.println("value3 = " + value3.getX());
      
      
      // Check for equivalent values
      System.out.println("\nCHECK FOR EQUALITY");
      
      if( value1.getX()==value2.getX() )
        System.out.println("value1 and value2 have the same value");
      else
        System.out.println("value1 and value2 do not have the same value");
  
      if( value1==value2 )
        System.out.println("value1 and value2 reference the same object");
      else
        System.out.println("value1 and value2 do not reference the same object");
  
      if( value2==value3 )
        System.out.println("value2 and value3 have the same value");
      else
        System.out.println("value2 and value3 do not have the same value");
      
      if( value2.equals(value3) )
        System.out.println("value2 and value3 reference the same object");
      else
        System.out.println("value2 and value3 do not reference the same object");
    }
  }