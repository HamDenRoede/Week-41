public class Car

    //proper class setup =

    //Variables
    //Constructor
    //Getter and Setter
    //Tostring

{
    //initial variables
    private Driver driver;


    //a car
    //has-a
    private String make;
    private String model ;
    private String year;
    private String bodystyle;


    //constructor
    public Car(String make, String model, String year, String bodystyle)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodystyle = bodystyle;
    }


    //"getter and setter"
    public Driver getDriver()
    {
        return driver;
    }


    public void setDriver(Driver driver)
    {
        this.driver = driver;
    }


    //toString
    @Override
    public String toString()
    {
        return  "Make: " + make +
                ", Model: " + model + year +
                ", Bodystyle: " + bodystyle;
    }

}
