/** 
 * This class defines CarGallery to make a car list and includes adding and deleting cars  
 * @Esad Ismail Tök
 * @09.05.2019
 */ 
import java.util.ArrayList; 
public class CarGallery{ 
  
  private String name; 
  private ArrayList<Car> cars; 
  /** 
   * Constructor
   * creating an Arraylist for Cars 
   * @param name  
   */ 
  public CarGallery(String name){ 
    this.name = name; 
    cars = new ArrayList<Car>(); 
  } 
  /** 
   * Getter method
   * @return name 
   */ 
  public String getName(){ 
    return this.name; 
  } 
  /** 
   * @return cars 
   * Car list of CarGallery 
   */ 
  public ArrayList<Car> getCarList(){ 
    return this.cars; 
  } 
  /** 
   * Setter method
   * @param name 
   */ 
  public void setName(String name){ 
    this.name = name; 
  } 
  /** 
   * Setter method
   * @param cars 
   */ 
  public void setCarList(ArrayList<Car> cars){ 
    this.cars = cars; 
  } 
  /** 
   * This method adds a Car to CarGallery 
   */ 
  public void addCar(Car car){ 
    cars.add(car); 
  } 
  /** 
   * This method removes a Car from CarGallery 
   */ 
  public void deleteCar(Car car){ 
    this.cars.remove(car); 
  } 
  /** 
   * This method converts car datas to string in CarGallery  
   */ 
  public String toString(){ 
    String s =  "Current Status of " + this.getName() + "\n"; 
    if ( cars.size() == 0 ) { 
      s += "There are no cars in the Gallery"; 
    } 
    else { 
      for(int i = 0;i < this.cars.size();i++){ 
        s += i + ":  " + this.cars.get(i).toString() + "\n"; 
      } 
    } 
    return s; 
  } 
}