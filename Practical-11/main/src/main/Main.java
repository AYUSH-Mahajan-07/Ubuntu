/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */

class Technology{
    private int year;
    private String Name;
    private String type;

Technology(int year,String Name,String type){
    this.Name = Name;
    this.year = year;
    this.type = type;
}

//to print
    public String toString() {
        return "Name: " + Name + "  year: " + year +  "  type: " + type;
    }

}

class Electronics extends Technology{
    private boolean Portable;
    private String powerSource;

    Electronics(boolean Portable, String powerSource,int year,String Name,String type){
        super(year, Name, type);
        this.Portable = Portable;
        this.powerSource = powerSource;
    }

    public String toString() {
        return super.toString() + ", Portable: " + Portable + ", power source: " + powerSource;
    }
}

class Computer extends Electronics{
    private String operatingSystem;
    Computer(String operatingSystem, boolean Portable, String powerSource,int year,String Name,String type){
        super(Portable,powerSource,year,Name,type);
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return super.toString() + ", Operating System: " + operatingSystem;
    }
}

class Appliances extends Electronics{
    private boolean smartTechnology;
    Appliances(boolean smartTechnology, boolean Portable, String powerSource,int year,String Name,String type){
        super(Portable,powerSource,year,Name,type);
        this.smartTechnology = smartTechnology;
}

public String toString() {
    return super.toString() + ", Smart: " + smartTechnology;
}
}
class Smartphone extends Electronics{ 
    private String brand;
    Smartphone(String brand, boolean Portable, String powerSource,int year,String Name,String type){
        super(Portable,powerSource,year,Name,type);
        this.brand = brand;
    }

    public String toString() {
        return super.toString() + ", brand: " + brand;
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer Computer = new Computer("Windows", true, "Electric", 2024, "Laptop", "Computing");
        Appliances Appliances = new Appliances(true, false, "Electric", 2024, "Tv", "home Appliance");
        Smartphone Smartphone = new Smartphone("Apple", true, "Battery", 2024, "iPhone", "Communication");

        System.out.println("Computer Details: " + Computer);
        System.out.println("Appliance Details: " + Appliances);
        System.out.println("Smartphone Details: " + Smartphone);
    }
    
}
