package Inheritance;

public class ClothingProduct extends Product{
    private String size;
    private String fabric;

    //Constructor
    public ClothingProduct(String size, String fabric){
        super(name, price, quantity); // calling the super class constructor
        this.size=size;
        this.fabric=fabric;
    }
    
    //setter and getter
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size=size;
    }
    
    public String getFabric(){
        return fabric;
    }
    public void setFabric(String fabric){
        this.fabric=fabric;
    }
    
    //display methods
    public void displayDetails(){
        super.displayDetails();
        // System.out.println("Name= "+super.name);
        System.out.println("Size: "+size);
        System.out.println("Fabric: "+fabric);
    }
    
}
