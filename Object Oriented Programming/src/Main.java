/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Table table1 = new Table();
        table1.brand = "Damro";
        table1.length=180;
        table1.breadth = 80;
        table1.height=90;
        table1.material = "Wood";
        table1.num_of_seats = 4;
        table1.price = 18000;

        table1.printDetails();
    }
}

class Table(String brand,double length,
            double breadth, double height, int num_of_seats, double price, String material){
    String company;
    double len;
    double bre;
    double ht;
    int numOfSeat;
    double amnt;
    String type;
    this.company = brand;
    void printDetails(){
        System.out.println("BRAND : "+this.brand);
        System.out.println("HEIGHT : "+this.height);
        System.out.println("LENGTH : "+this.length);
        System.out.println("BREADTH : "+this.breadth);
        System.out.println("MATERIAL : "+this.material);
        System.out.println("MAXIMUM NUMBER OF SEATS : "+this.num_of_seats);
        System.out.println("MRP : "+this.price);
    }
}
 */

/* package codechef; // don't place package name! */

class Laptop{
    String brand;
    double price;
    int RAM;
    int Storage;
    String Os;

    Laptop(String brand,double price,int RAM,int Storage,String Os){
        this.brand = brand;
        this.price = price;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Os = Os;
    }

    Laptop(String brand){
        this.brand = brand;
    }

    Laptop(){
        this ("Not available",0,0,0,"Not available");
    }
    void showDetails(){
        System.out.println("Brand   : "+this.brand);
        System.out.println("Price   : "+this.price);
        System.out.println("RAM     : "+this.RAM);
        System.out.println("Storage : "+this.Storage);
        System.out.println("Os      : "+this.Os);
    }


}


class BinarySearch{

    BinarySearch(a,int b){
        int i=0;
        int low=0,high=a.length,mid;
        mid = (i+a.length)/2;
        if(b==a[mid]){
            System.out.println("Item found at "+mid);
        }
        else if(b>a[mid]){
            low = mid;
            for(i=low;i<high;i++){
                if(a[i]==b){
                    System.out.println("Item found at "+i);
                }
            }
        }
        else if(b<a[mid]){
            high = mid;
            for(i=low;i<high;i++){
                if(a[i]==b){
                    System.out.println("Item found at "+i);
                }
            }
        }


    }
}

public class Main {
    public static void main(String[] args) {
        //Laptop new1 = new Laptop("HP",60000,8,1000,"Windows");
        //new1.showDetails();
        //Laptop new2 = new Laptop();
        //new2.showDetails();
        BinarySearch new1 = new BinarySearch([1,21,44,56,78,96],78);
    }
}
