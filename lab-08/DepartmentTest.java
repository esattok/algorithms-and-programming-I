/**
 * This class references using == symbol and .equals method.
 * @author Esad Ismail Tök
 * @version 02.05.2019
 */ 

public class DepartmentTest {
  
  /**
   * this method create and compare Department instances using "==" and .equals
   */ 
  public static void main( String[] args ) {
    
    /**
     * references which two of them to a single department instance, two of them with different properties
     * and two of them with two individual objects with same properties.
     */
    Department department1 = new Department( "Computer_Science", "CS" );
    Department department2 = new Department( "Computer_Science", "CS" );
    Department department3 = new Department( "Calculus I", "MATH" );
    Department department4 = department1;
    
// if department1 and department2 indicates same places in memory with == symbol, display output.
    if ( department1 == department2 ) {
      System.out.println( "Departemt 1 and 2 are equal ( == used )" );
    }
    
// if department1 and department2 indicates same places in memory with .equals method, display output.
    if ( department1.equals( department2 ) ) {
      System.out.println( "Department 1 and 2 are equal. ( .equals method used )" );
    }
    
    // if department1 and department3 indicates same places in memory with == symbol, display output.
    if ( department1 == department3 ) {
      System.out.println( "Department 1 and 3 are equal. ( == used )" );
    }
    
// if department1 and department3 indicates same places in memory with .equals method, display output.
    if ( department1.equals( department3 ) ) {
      System.out.println( "Department 1 and 3 are equal ( .equals method used )" );
    }
    
// if department1 and department4 indicates same places in memory with == symbol, display output.
    if ( department1 == department4 ) {
      System.out.println( "Department 1 and 4 are equal ( == used )");
    }
    
    // if department1 and department4 indicates same places in memory with .equals method, display output.
    if ( department1.equals( department4 ) ) {
      System.out.println( "Department 1 and 4 are equal. ( .equals() method used )" );
    }
    
    System.out.println( department4.toString() );
    
  }
}
