package transApp;

public class Auto extends AbstractVehicle
{
    private String model;
    private int year;

    public Auto(int fuel, String model, int year)
    {
    	super(fuel);
    	this.model = model;
    	this.year = year;
    }

    @Override
    public String getName()
    {
    	return model;
    }

    @Override
    public String getPath()
    {
    	return "Road";
    }

    public int getYear()
    {
    	return year;
    }

    @Override
    public String toString()
    {
    	return "Auto: Model: " + model + " year: " + year + " fuel: " + fuel;
    }
}

