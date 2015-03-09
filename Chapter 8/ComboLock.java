
public class ComboLock
{
    private int num1;
    private int num2;
    private int num3;
    private int currentNum;
    private boolean firstRight;
    private boolean firstLeft;
    private boolean secondRight;
    public ComboLock(int secret1, int secret2, int secret3)
    {
        num1 = secret1;
        num2 = secret2;
        num3 = secret3;
        currentNum = 0;
    }

    public void reset()
    {
        currentNum = 0;
    }

    public void turnLeft(int ticks)
    {
        currentNum += ticks;
        while(currentNum > 39)
        {
            currentNum -= 40;
        }
        if(currentNum == num2)
        {
            firstLeft = true;
        }
        else
        {
            firstLeft = false;
        }
    }

    public void turnRight(int ticks)
    {
        currentNum -= ticks;
        while(currentNum < 0)
        {
            currentNum += 40;
        }
        if(firstRight == false)
        {
            if(currentNum == num1)
            {
                firstRight = true;
            }
            else
            {
                firstRight = false;
            }
        }
        else
        {
            if(currentNum == num3)
            {
                secondRight = true;
            }
            else
            {
                secondRight = false;
            }
        }
        }
    
    public boolean open()
    {
        if(firstLeft && firstRight && secondRight == true)
        {
            System.out.println("The lock opens");
            return true;
        }
        else
        {
            System.out.println("The lock does not open");
            return false;
        }

    }
}
