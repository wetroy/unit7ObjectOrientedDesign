import javax.swing.JFrame;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class TriangleViewer
{
    /**
     * Default constructor for objects of class TriangleViewer
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(800,800);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TriangleComponent component = new TriangleComponent();
        frame.add(component);
        
        MouseListener listener = new ClickListener();
        component.addMouseListener(listener);
        
        
        frame.setVisible(true);
    }
}
