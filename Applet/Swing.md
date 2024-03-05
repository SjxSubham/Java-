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
#### use of Checkbox using Swing
```
public class Checkbox extends jApplet{
    JCheckBox cb,cb2,cb3;
    public void init(){
        Container cp = get.ContentPane();
        cp.setLayout(new FlowLayout);
        cb = new JCheckBox("c");
        cb2 = new JCheckBox("C++");
        cb3 = new JCheckBox("java");

        cp.add(cb);
        cp.add(cb2);
        cp.add(cb3);
        }
    }
}
```
>>JCheckBox classs is used to cr8 a check box in swing

#### Programm to create Jradio button

```
public class Checkbox extends jApplet{
    JCheckBox cb,cb2,cb3;
    public void init(){
        Container cp = get.ContentPane();

        cp.setLayout(new FlowLayout());
        cb = new JRadioButton("c");
        cb2 = new JRadioButton("C++");
        cb3 = new JRadioButton("java");

        cp.add(cb);
        cp.add(cb2);
        cp.add(cb3);
        }
    }
```

    