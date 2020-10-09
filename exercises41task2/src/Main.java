import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

    public class Main<numberOfFloors>

{


    public static void main(String[] args)
    {
    Room room1 = new Room(4, 1, 6, 10);
    Room room2 = new Room(5, 2, 8, 14);
    Room room3 = new Room(6, 2, 12, 16);


    //I need to make turn these 3 rooms into a collection - Arrays perhaps
    ArrayList<Room> rooms = new ArrayList<Room>();
    rooms.add(room1);
    rooms.add(room2);
    rooms.add(room3);


    Building building1 = new Building(rooms,2,2,true);




        System.out.println("Total number of lamps= "room1.getNumberOfLamps() + room2.getNumberOfLamps() + room3.getNumberOfLamps());

    }

    //Stuck on this point. Need to figure out how if statements work in intellij
    //I probably need to use the boolean in the Building class
    int numberOfFloors = 2;
        if (numberOfFloors > rooms)

    {
        System.out.println("This is an odd building.");
    }
}
