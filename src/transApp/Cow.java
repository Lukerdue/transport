package transApp;

public class Cow extends AbstractVehicle
{
    private String name;
    public Cow(String name, int fuel)
    {
    	super(fuel);
    	this.name = name;
    }
    public Cow(String name)
    {
    	// super();
    	this.name = name;
    }
    @Override
    public String getPath()
    {
    	return "Grass";
    }
    @Override
    public String getName()
    {
    	return name;
    }
    @Override
    public String toString()
    {
    	return "Cow: Name: " + name + " fuel: " + fuel;
    }

}
