/**
 * This class includes employee name, daily rate, department and project. Calculates salary and
 * convert them to string
 * @author Esad Ismail Tök
 * @version 02.05.2019
 */ 

public class Employee {
//Constant data member
  private static final int WORKING_DAYS = 270; 
  
  //Instance data members 
  private String employeeName; 
  private double dailyRate; 
  private Department department; 
  private Project project; 
  
  /**
   * Constructor method
   * initialize the employee name, rate and project. Also takes the departmentname and code
   * as parameters, initializes a new department using the ones passed as a parameter.
   */
  public Employee( String Employee_name, double daily_rate, Project project, String department_name, String department_code ) { 
    department = new Department (department_name, department_code); 
    setemployeeName( Employee_name ); 
    setdailyRate( daily_rate ); 
    setproject( project ); 
  } 
  
  public Employee copyConstructor( Employee project1 ) { 
    Employee employee = project1; 
    return employee; 
  } 
  
// accessor and mutator methods
  /**
   * sets employee name
   */ 
  public void setemployeeName( String name ) { 
    employeeName = name; 
  } 
  
  /**
   * sets daily rate
   */ 
  public void setdailyRate( double rate ) { 
    dailyRate = rate; 
  } 
  
  /**
   * sets project
   */ 
  public void setproject( Project project ) { 
    this.project = project; 
  } 
  
  /** 
   gets employee's Name 
   @return employee Name 
   */ 
  public String getemployeeName() { 
    return employeeName; 
  } 
  
  /** 
   gets daily rate of the employee 
   @return daily rate of the employee 
   */ 
  public double getdailyRate() { 
    return dailyRate; 
  } 
  
  /** 
   gets department of the employee 
   @return department of the employee 
   */ 
  public Department getdepartment() { 
    return department; 
  } 
  
  /** 
   gets project 
   @return project 
   */ 
  public Project getproject() { 
    return project; 
  } 
  
  /** 
   * Calculates and returns yearly salary 
   * @return yearly salary 
   */ 
  public double calculateYearlySalary() { 
    return WORKING_DAYS * getdailyRate(); 
  } 
  
  /** 
   @return a String representation of an Employee( Employee name and annual Salary) 
   */ 
  public String toString() { 
    return "Employee Name: " + getemployeeName() + " Yearly Salary: " + calculateYearlySalary() + "\n" + 
      "Dept Name " + department.getdeptName() + "Dept Code " + department.getdeptCode() + "\n" + 
      project.toString() + "\n";    
  } 
}