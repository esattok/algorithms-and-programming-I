/**
 * This class determine department name and department code than compare them and convert it to string
 * @author Esad Ismail Tök
 * @version 02.05.2019
 */ 

public class Department {
  //Instance variables
  private String deptName;
  private String deptCode;
  
  //Constructors
  /**
   Constructor
   Initialize the Department name and code
   @param Department name
   @param Department code
   */
  public Department(String name, String code) {
    setDepartmentName( name );
    setDepartmentCode( code );
  }
  
  // accessor and mutator methods
  /**
   Sets Department Name
   */
  public void setDepartmentName( String name ) {
    deptName = name;
  }
  
  /**
   Sets Department Code
   */
  public void setDepartmentCode( String code ) {
    deptCode = code;
  }
  
  /**
   a method that returns the name of department
   @return Department's name
   */
  public String getdeptName() {
    return deptName;
  }
  
  /**
   a method that returns the code of department
   @return Department's code
   */
  public String getdeptCode() {
    return deptCode;
  }
  
  /**
   Compares two methods
   @param target Department which will be compared with other Department
   @return Return true if target Department is same. ıf not return false
   */
  public boolean equels( Department other ) {
    //variables
    String name1;
    String name2;
    
    name1 = getdeptName();
    name2 = other.getdeptName();
    if ( name1.compareTo( name2 ) == 0 ) {
      return true;
    }
    return false;
  }
  
  /**
   Method that returns the String representation of department
   @return String representation of Department
   */
  public String toString() {
    return "Dept Name: " + getdeptName() + "  Dept Code: " + getdeptCode();
  }
}
