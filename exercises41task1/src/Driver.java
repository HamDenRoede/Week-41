public class Driver
{
    //variables

    // has-a
    // name
    // and age
    private String name;
    private int age;


    //constructor
    public Driver(String name, int age)
    {
        this.name = "Jonas";
        this.age = age;
    }


    //toString
    public String toString()
    {
        return "is driven by " + name;
    }
}
