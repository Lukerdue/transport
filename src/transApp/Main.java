package transApp;

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
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}
