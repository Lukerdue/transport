package transApp;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
    private static List<AbstractVehicle> filterVehicles(List<AbstractVehicle> theList, CheckVehicle tester)
    {
        List<AbstractVehicle> tempList = new ArrayList<>();

        for(AbstractVehicle v : theList ){
            if(tester.test(v)){
                tempList.add(v);
            }
        }
        return tempList;
    }
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

        System.out.println();
        myList.sort((v1, v2)->v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach(v-> System.out.println(v.getName()));

        List<AbstractVehicle> filteredList = filterVehicles(myList, (v)->v.getFuelLevel()<0);
        filteredList.forEach(v->System.out.println(v));

        System.out.println("\n\n");
        filteredList = filterVehicles(myList, (v)-> (v.getFuelLevel()>0) && (v instanceof Cow ));
        filteredList.forEach((v)->System.out.println(v));

    }
    public static void main(String[] args)
    {
        workWithData();
    }
}
