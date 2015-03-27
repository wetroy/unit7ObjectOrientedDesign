import java.util.Calendar;
import java.util.GregorianCalendar;
public class DriverLicense extends Card
{
    private String expireYear;
    
    public DriverLicense(String n, String expireYear)
    {
        super(n);
        this.expireYear = expireYear;
    }

    public String format()
    {
        String str = "";
        str += super.format();
        str += "\nExpire Year: " + this.expireYear;
        return str;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        if( Integer.parseInt(expireYear) < year)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
