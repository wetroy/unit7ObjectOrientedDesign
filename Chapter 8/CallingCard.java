
public class CallingCard extends Card
{
    private String cardNum;
    private String pin;
    
    public CallingCard(String n, String cardNum, String pinNum)
    {
        super(n);
        this.cardNum = cardNum;
        this.pin = pinNum;
    }

    public String format()
    {
        String str = "";
        str += super.format();
        str += "\nCard Number: " + this.cardNum + "\nPIN: " + this.pin;
        return str;
    }

}
