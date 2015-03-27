
public class Billfold extends Card
{
    Card slot1;
    Card slot2;
    public Billfold(Card slot1, Card slot2)
    {
        this.slot1 = slot1;
        this.slot2 = slot2;
    }

    public void addCard(Card newCard)
    {
        if(slot1 == null)
        {
            slot1 = newCard;
        }
        else if(slot2 == null)
        {
            slot2 = newCard;
        }
    }
    
    public String formatCards()
    {
        String str = "";
        if(slot1 != null)
        {
            str += "\nSlot 1 Info:\n" + slot1.format();
        }
        if(slot2 != null)
        {
            str +="\nSlot 2 Info:\n" + slot2.format();
        }
        return str;
    }
    
    public int getExpiredCardCount()
    {
        int expCount = 0;
        if(slot1.isExpired())
        {
            expCount++;
        }
        if(slot2.isExpired())
        {
            expCount++;
        }
        return expCount;
    }
}
