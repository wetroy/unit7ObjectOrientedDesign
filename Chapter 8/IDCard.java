
public class IDCard extends Card
{
    private String id;

    public IDCard(String n, String idNumber)
    {
        super(n);
        this.id = idNumber;
    }

    public String format()
    {
        String str = "";
        str += super.format();
        str += "\nID Number: " + this.id;
        return str;
    }

}
