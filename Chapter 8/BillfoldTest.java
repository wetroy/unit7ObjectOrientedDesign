public class BillfoldTest
{
    public static void main(String[] args)
    {
        DriverLicense license = new DriverLicense("Fin Malone", "1947");
        CallingCard call = new CallingCard("Billy Troy", "12345", "7195");
        Billfold wallet = new Billfold(license, null);
        System.out.println(wallet.formatCards());
        wallet.addCard(call);
        System.out.println(wallet.formatCards());
    }
}
