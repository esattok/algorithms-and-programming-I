/** 
 * This class includes the definition of car object and it's properties  
 * @Esad Ismail Tök 
 * @09.05.2019
 */ 
public class Car{ 
  
  private String brand; 
  private String model; 
  private int price; 
  /** 
   * Constructor for taking properties as parameters   
   *  
   * @param String brand,model 
   * @param int price 
   */ 
  public Car(String brand, String model, int price){ 
    this.brand = brand; 
    this.model = model; 
    this.price = price; 
  } 
  /** 
   * Constructor to take an instance of Car class with same properties 
   */ 
  public Car(Car car){ 
    this.brand = car.getBrand(); 
    this.model = car.getModel(); 
    this.price = car.getPrice(); 
  } 
  /** 
   * Getter method
   * @return brand 
   */ 
  public String getBrand(){ 
    return this.brand; 
  } 
  /** 
   * Getter method
   * @return model 
   */ 
  public String getModel(){ 
    return this.model; 
  } 
  /** 
   * Getter method
   * @return price 
   */ 
  public int getPrice(){ 
    return this.price; 
  } 
  /** 
   * Setter method
   * @param brand 
   */ 
  public void setBrand(String s){ 
    this.brand = s; 
  } 
  /** 
   * Setter method
   * @param model 
   */ 
  public void setModel(String s){ 
    this.model = s; 
  } 
  /** 
   * Setter method
   * @param price 
   */ 
  public void setPrice(int i){ 
    this.price = i; 
  } 
  /** 
   * A method to convert Car datas to string 
   */ 
  public String toString(){ 
    return this.getBrand() + ", " + this.getModel() + ", $" + this.getPrice(); 
  } 
}