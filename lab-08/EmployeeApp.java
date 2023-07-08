/**
 * This class create a project and 3 employees who are assigned to the project, and 1 copy employee
 * then display the 4 employee. compare the department of all employees, and display employees with
 * matching departments.
 * @author Esad Ismail Tök
 * @version 02.05.2019
 */ 

public class EmployeeApp {
  public static void main( String[] args) {
    //variables
    int count = 1;
    
    // new project (project1)
    Project Project1 = new Project( "Orange XYZ Implementation", 20, 598, 487 );
    
    // Three employees and one employee who is the copy of the first
    Employee employee1 = new Employee( "Akar, Zeynep", 20, Project1, "Information Technology", "IT" );
    Employee employee2 = new Employee( "Doe, Joe", 18, Project1, "Human Resources", "HR" );
    Employee employee3 = new Employee( "Smith, John", 15, Project1, "Human Resources", "HR" );
    Employee employee4 = employee1;
    starSequence();
    
    // employee list including 4 employee will display
    System.out.println( "Employees: " );
    System.out.println( "" );
    System.out.println( employee1.toString() );
    System.out.println( employee2.toString() );
    System.out.println( employee3.toString() );
    System.out.println( employee4.toString() ); 
    System.out.println("------------------ end employee list ------------------");
    space();
    starSequence();
    
    // if departments of employee1 and employee2 match, display following statements.
    if ( employee1.equals(employee2) ) {
      System.out.println( "Employees with Matching Departments (" + count + ")" );
      space();
      System.out.println( employee1.toString() );
      System.out.println( employee2.toString() );
    }
    
    // if departments of employee1 and employee3 match, display following statements.
    if ( employee1.equals(employee3) ) {
      System.out.println( "Employees with Matching Departments (" + count + ")" );
      space();
      System.out.println( employee1.toString() );
      System.out.println( employee3.toString() );
      starSequence();
    }
    
    // if departments of employee1 and employee4 match, display following statements.
    if ( employee1.equals(employee4) ) {
      System.out.println( "Employees with Matching Departments (" + count + ")" );
      space();
      System.out.println( employee1.toString() );
      System.out.println( employee4.toString() );
      starSequence();
    }
    
    // if departments of employee2 and employee3 match, display following statements.
    if ( employee2.equals(employee3) ) {
      System.out.println( "Employees with Matching Departments (" + count + ")" );
      space();
      System.out.println( employee2.toString() );
      System.out.println( employee3.toString() );
      starSequence();
    }
    
    // if departments of employee2 and employee4 match, display following statements.
    if ( employee2.equals(employee4) ) {
      System.out.println( "Employees with Matching Departments (" + count + ")" );
      space();
      System.out.println( employee2.toString() );
      System.out.println( employee4.toString() );
      starSequence();
    }
    
    // if departments of employee3 and employee4 match, display following statements.
    if ( employee3.equals(employee4) ) {
      System.out.println( "Employees with Matching Departments (" + count + ")" );
      space();
      System.out.println( employee3.toString() );
      System.out.println( employee4.toString() );
      starSequence();
    }
  }
  
  /**
   * This method provides space between lines to ease seperating lines
   */ 
  public static void space() {
    System.out.println();
  }
  
  /**
   * This method provides a sequence of star to ease our usage of them.
   */ 
  public static void starSequence() {
    System.out.println( "********************************************" );
  }
}
