package transApp;

public class Horse implements Vehicle, Animal
{
    private int fuel = 0;
    private String name;

    public Horse(String name)
    {
        this.name = name;
    }
    
    public String getPath()
    {
        return "Grass";
    }

    public void move(int qty)
    {   
        fuel = fuel - qty;
    }

    public int getFuelLevel()
    {
        return fuel;
    }

    public void addFuel(int qty)
    {
        fuel = fuel + qty;
    }

    public void eat(int i)
    {
        addFuel(i);
    }

    public String speak()
    {
        return "Neigh";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Horse----- \nName: "+name+"\nFuel: "+fuel;
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub

    }
}
