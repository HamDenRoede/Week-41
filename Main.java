public class Main
{
    public static void main(String[] args)
    {
        //psvm + tab
        //this is our new "void setup / void draw"

        Driver driver1 = new Driver("Jonas", 28);
        Car car1 = new Car ("Ford", "Focus", "2018", "Sedan");
        car1.setDriver(driver1);

        Car car2 = new Car ("Lamborghini", "Aventador", "2012", "Convertible");
        car2.setDriver(driver1);

        //sout +  tap = print

        //System.out.println(car1);  // How to print on seperate lines
        //System.out.println(car1.getDriver().toString());
        System.out.println(car1.toString() + " "+ driver1.toString()); // <-- how to print on 1 line


        //System.out.println(car2);
        //System.out.println(car2.getDriver().toString());
        System.out.println(car2.toString() + " "+ driver1.toString());
    }
}
