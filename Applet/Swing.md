## Swing
#### Swing is an advanced version of applet for creating a swing programm we have to xtend J heirchy class
###### programm to display

>How to create a Label ?

#### Label using swing
```
import java.awt.*;
import javax.swing.*;
public class Label extends JApplet{
    public void init(){
        Container cp = getContentPane();
        JLabel j1 = new JLabel("Ayan",JLabel.LEFT);


        cp.add(j1);
    }
}
```
