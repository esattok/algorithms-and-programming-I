  
 class ProjectApp { 
  
 public static void main(String[] args) { 
   Project p1 = new Project("ArcTech Business Solution", 480, 20, 1920); 
   Project p2 = new Project(" SunMarkets POS Implementation", 240, 20, 960); 
    
   Project p3 = new Project(" HealthTech Hospital", 40, 20, 240); 
    
    
    
    
    
   System.out.println(p1.toString()); 
   System.out.println(); 
    
   System.out.println(p2.toString()); 
    
   System.out.println(); 
   System.out.println(p3.toString()); 
 
   System.out.println(); 
 
   int compare = p1.compare(p2); 
    
   if (compare == 1) { 
    System.out.println("Project with higer cost:"); 
    System.out.println(p2); 
    } else if (compare == -1) { 
     System.out.println("Project with higer cost:"); 
    System.out.println(p1); 
    } 
    
    
   p1.setPersonHours(450); 
   p1.setRatePerHour(500); 
   p1.setProjectType(); 
    
   System.out.println(); 
   System.out.println(p1); 
    
    
   p2.deactivateProject(); 
   System.out.println("\n" + p2); 
 } 
 
} 

public class Project { 
 
 private final double TAX = 0.19; 
 private final int OVERHEAD = 30000; 
 private final int EMP_HOURS_WORK = 40; 
 
 private static int projectCounter = 1000; 
 
 private String projectId; 
 private char projectType; 
 private String projectName; 
 private double personHours; 
 private double ratePerHour; 
 private int projectWeeks; 
 
 
 public Project(String projectName, double personHours, double ratePerHour, int projectWeeks) { 
  this.projectName = projectName; 
  setPersonHours(personHours); 
  setRatePerHour(ratePerHour); 
  setProjectType(); 
  setProjectWeeks(projectWeeks); 
  setProjectId(); 
 
 } 
 
 public String getProjectId() { 
  return projectId; 
 } 
 
 public void setProjectId() { 
  projectCounter++; 
  this.projectId = "2019-" + (projectCounter); 
 } 
 
 public String getProjectName() { 
  return projectName; 
 } 
 
 public void setProjectName(String projectName) { 
  this.projectName = projectName; 
 } 
 
 public char getProjectType() { 
  return projectType; 
 } 
 
 public void setProjectType() { 
  double cost = calculateCost(); 
 
  if (cost > 500000) { 
   this.projectType = 'm'; 
  } else if (cost > 100000 && cost <= 500000) { 
   this.projectType = 'a'; 
  } else if (cost > 0 && cost <= 100000) { 
   this.projectType = 's'; 
  } else { 
   this.projectType = 'i'; 
  } 
 } 
 
 public double getPersonHour() { 
  return personHours; 
 } 
 
 public void setPersonHours(double personHours) { 
  if (personHours > 0) { 
   this.personHours = personHours; 
  } else { 
   this.personHours = 0; 
  } 
 } 
 
 public double getRatePerHour() { 
  return ratePerHour; 
 } 
 
 public void setRatePerHour(double ratePerHour) { 
  if (ratePerHour > 0) { 
   this.ratePerHour = ratePerHour; 
  } else { 
   this.ratePerHour = 0; 
  } 
 } 
 
 public int getProjectWeeks() { 
  return projectWeeks; 
 } 
 
 public void setProjectWeeks(int projectWeeks) { 
  if (projectWeeks > 0) { 
   this.projectWeeks = projectWeeks; 
  } else { 
   this.projectWeeks = 0; 
  } 
 } 
 
 public void deactivateProject() { 
  this.projectType = 'i'; 
 } 
 
 private double calculateCost() { 
 
  double humanResourceCost = (personHours * ratePerHour); 
 
  double cost = humanResourceCost; 
  if (humanResourceCost >= 20000) 
   cost += OVERHEAD; 
  cost += cost * TAX; 
   
   
  return cost; 
 } 
  
 private int calculatePersonResource() { 
  int personResource = projectWeeks/this.EMP_HOURS_WORK; 
  return personResource; 
 } 
  
 public int compare(Project target) { 
  double targetProjectCost = target.calculateCost(); 
  double thisProjectCost = this.calculateCost(); 
   
  if (targetProjectCost > thisProjectCost) { 
   return 1; 
  } else if (targetProjectCost < thisProjectCost) { 
   return -1; 
  } else { 
   return 0; 
  } 
 } 
 
 @Override 
 public String toString() { 
  String toString = "Project Name: " + projectName + "\n" + 
    "Project ID: " + projectId + "\n"; 
  if(projectType != 'i') { 
   toString = toString + 
     "Project Type: " + projectType + "\n" + 
     "Team Size: " + calculatePersonResource() + "\n" + 
     "Estimated Project Cost: " + calculateCost(); 
  } 
   
  return toString; 
 } 
  
  
 
} 
 

