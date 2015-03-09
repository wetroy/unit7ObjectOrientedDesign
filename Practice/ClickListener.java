import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickListener 
{
    private int count;
    //private String name;
    
    //public ClickListener(String theName)
    //{
    //     count = 0;
    //    this.name = theName;
    //}
    
    public void actionPerformed(ActionEvent event)
    {
        //count++;
        
        //if(count == 1)
        //{
        //    System.out.println("Button " + name + " was clicked 1 time");
        //}
        //else
        //{
        //    System.out.println("Button " + name + " was clicked " + count + " times");
        //}
        
        label.setText("Button " + event.getActionCommand()+ " was clicked");
    }
}
