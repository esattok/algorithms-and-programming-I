/** 
 * This class develops a driven menu for adding and removing galleries and cars to galleries  
 * @Esad Ismail Tök 
 * @09.05.2019
 */ 
import java.util.ArrayList; 
import java.util.Scanner; 
public class CarGalleryApp{ 
  ArrayList<CarGallery> galleryList = new ArrayList<CarGallery>(); 
  
  /** 
   * prints the gallery list in the wanted format 
   */ 
  public void printGalleryList() { 
    if(galleryList.size() == 0){ 
      System.out.println("Car Gallery is currently empty"); 
    }
    else{ 
      System.out.println("Current status of Gallery List");
      System.out.println();
      for(int i = 0; i < galleryList.size();i++){ 
        System.out.println(i + ": " + galleryList.get(i).getName()); 
      }
      System.out.println();
    } 
  } 
  
  /** 
   * adding a gallery to GalleryList 
   *  
   * @params galleryName represents the gallerys name 
   * @params galleryList represents the gallerys list of Gallery Objects 
   */ 
  public void addGallery(String galleryName){ 
    CarGallery cargal = new CarGallery(galleryName); 
    galleryList.add(cargal); 
  } 
  
  /** 
   * removing a gallery from GalleryList 
   *  
   * @params id represents the index of the gallery that we need to remove from galleryList ArrayList 
   */ 
  public void removeGallery(int id){ 
    galleryList.remove(id); 
  } 
  
  /** 
   * adding a car to a gallery 
   *  
   * @params gallery represents a CarGallery Objecy 
   */ 
  public void addCar(CarGallery gallery, String brand, String model, int price){ 
    Car car = new Car(brand, model, price); 
    gallery.addCar(car); 
  } 
  
  /** 
   * selling a car from a gallery 
   *  
   * @params gallery represents CarGallery Object which we wish to sell the car from 
   * @params carId represents the car index in CarGallery cars ArrayList 
   */ 
  public void sellCar(CarGallery gallery, int carId){ 
    gallery.getCarList().remove(carId); 
  } 
  
  /** 
   * developing driven menu  
   */ 
  public static void main(String[] arg){ 
    Scanner input = new Scanner(System.in); 
    CarGalleryApp object = new CarGalleryApp(); 
    int choice; 
    
    do{ 
      System.out.println("Welcome to the Car Gallery. Please enter your choice"); 
      System.out.println("(1)Add Gallery"); 
      System.out.println("(2)Remove Gallery"); 
      System.out.println("(3)Add Car"); 
      System.out.println("(4)Sell Car"); 
      System.out.println("(5)Exit"); 
      System.out.print("Choice: "); 
      choice = input.nextInt(); 
      
      for(int i = 0;i < 50;i++){ 
        System.out.print("*"); 
      } 
      System.out.println(); 
      object.printGalleryList(); 
      
      if(object.galleryList.size() == 0 && (choice == 2 || choice == 3 || choice == 4)){ 
        System.out.println("There are no galleries"); 
      } 
      // Adding a gallery 
      if(choice == 1){ 
        System.out.print("Please enter gallery name: "); 
        String carGallery = input.next(); 
        object.addGallery(carGallery); 
        object.printGalleryList(); 
        for(int i = 0;i < 50;i++){ 
          System.out.print("*"); 
        }
        System.out.println();
      }
      
      // Removing a gallery 
      else if(object.galleryList.size() != 0 && choice == 2){ 
        System.out.print("Plese enter gallery id that will be removed: "); 
        int id = input.nextInt(); 
        System.out.println();
        object.removeGallery(id); 
        object.printGalleryList(); 
        for(int i = 0;i < 50;i++){ 
          System.out.print("*"); 
        }
        System.out.println();
      }
      
      // Add a car to a gallery
      else if(object.galleryList.size() != 0 && choice == 3){  
        
        System.out.print("Please enter gallery id: "); 
        int galleryId = input.nextInt(); 
        System.out.println();
        
        System.out.print("Please enter car brand: "); 
        String brand = input.next(); 
        
        System.out.print("Please enter car model: "); 
        String model = input.next(); 
        
        System.out.print("Please enter car price: "); 
        int price = input.nextInt(); 
        
        CarGallery gallery = object.galleryList.get(galleryId); 
        
        object.addCar(gallery, brand, model, price); 
        System.out.println();
        System.out.println(gallery);
        for(int i = 0;i < 50;i++){ 
          System.out.print("*"); 
        }
        System.out.println();
      }
      
      // Sell a car
      else if(object.galleryList.size() != 0 && choice == 4){  
        System.out.print("Please enter gallery id: "); 
        int galleryId = input.nextInt(); 
        CarGallery gallery = object.galleryList.get(galleryId); 
        System.out.println(gallery); 
        
        System.out.print("Please enter car id which is sold: "); 
        int carId = input.nextInt(); 
        
        object.sellCar(gallery, carId); 
        System.out.println(gallery);
        for(int i = 0;i < 50;i++){ 
          System.out.print("*"); 
        }
        System.out.println();
      }
      
      else if(choice == 5){ 
        System.out.println("End of Car Gallery"); 
      } 
    }
    while(choice != 5); 
  } 
}  
