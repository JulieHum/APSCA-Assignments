public class Main
{
    public static void main (String [] args)
    {
        Appliance toaster = new Appliance();
        Microwave panasonic = new Microwave();
        panasonic.use();
        System.out.println(panasonic.getUses());
    }
}
