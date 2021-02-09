package transApp;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
    private static void workWithData()
    {
        System.out.println("Welcome to Lambda's Animal Kingdom!");

        Horse seabiscuit = new Horse("Seabiscuit");
        Horse affirmed = new Horse("Affirmed");
        Horse joe = new Horse("Joe");

        seabiscuit.eat(10);
        affirmed.eat(5);
        for(int i = 0; i<5; i++){
            seabiscuit.move(1);
        }
        System.out.println(seabiscuit);

        System.out.println("\n\n");

        Cow bessie = new Cow("Bessie", 10);
        bessie.addFuel(5);
        
        Cow betty = new Cow("Betty", 5);
        betty.addFuel(2);

        Cow cad = new Cow("Cad", 10);
        Cow seattle = new Cow("Seattle", 15);
        Cow banger = new Cow("Banger", 5);

        Auto vw = new Auto(2000, "VolksWaggen", 2021);
        Auto toyota = new Auto(1000, "Toyota", 2020);
        Auto mustand = new Auto(3000, "Mustang", 2030);
        vw.move(5);
        mustand.move(12);

        List<AbstractVehicle> myList = new ArrayList<>();
        myList.add(bessie);
        myList.add(betty);
        myList.add(cad);
        myList.add(seattle);
        myList.add(banger);
        myList.add(vw);
        myList.add(toyota);
        myList.add(mustand);

        System.out.println(myList.toString());

        System.out.println();

    }
    public static void main(String[] args)
    {
        workWithData();
    }
}
