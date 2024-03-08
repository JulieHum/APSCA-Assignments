public class Appliance
{
    private int color;
    private int uses;
    public void use ()
    {
        System.out.println("Appliance is in use.");
        uses++;
    }
    public int getUses()
    {
        return uses;
    }
}
