public class Bicycle extends Vehicle
{
    // instance variables (aka attributes, aka fields)
    private int gears;

    public Bicycle(String name, int wheels, int gears)
    {
        super(name, wheels);
        this.gears = gears;
    }

    // getter methods for instance variables
    public int gearCount()
    {
        return gears;
    }

    // public methods (aka behaviors)
    public void ringBell()
    {
        // write some code here to honk, etc.
        System.out.println("ring ring! Get outta the way!");
    }
}