import java.awt.*;
import java.applet.Applet;
import java.awt.Graphics;

class class1{
    public void paint(Graphics g) {
        g.drawRect(200,400,14,12);  //to Print 'Hello' Dynamacilly
        g.drawString("Hello",20,20);    //To create A normal Rectangle
        g.fillRect(200,400,40,40); // To create a filled rectangle
        g.drawOval(100,100,20,20); //To create an Oval
        g.setColor(Color.red);  //use to set colour
        
        //To provide custom colour in Applet
        // Color ob = new Color(Red,Grenn,Blue);
       /*  Red --> 0 t0 255
            green--> 0 to 255
            Blue --> 0 to 255
            */
        
            
        Color ob = new Color(56,32,78);


        g.setColor(ob);
    }
}