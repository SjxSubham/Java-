import java.awt.*;
import java.applet.Applet;
import java.awt.Graphics;

class class1{
    public void paint(Graphics g) {
        g.drawRect(200,400,14,12);  //to Print 'Hello' Dynamacilly
        g.drawString("Hello",20,20);    //To create A normal Rectangle
        g.fillRect(200,400,40,40); // To create a filled rectangle
        g.drawOval(100,100,20,20); //To create an Oval
    }
}