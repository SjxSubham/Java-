## Event Handleing in java
### **Event** - An event mybe defined as an occurance of something.when an event occurs in java those events are actually captured what we called as Listeners. this listeners contains abstract method which we need to define. Whenever a perticular appears appropiate methods will be executed

##### Write a programm to display use of `Key Event`
```
public class event extends Applet implements keylistener{
    String msg="";
    int x = 10, y =10;
    public void init (){
        addKeyListener(this);
        requestFocus();

    }
    public void keyPressed (keyEvent ke){
        showStstus("Key is pressed");

    }
    public void {
        keyReleased(KeyEvent ke){
            showStatus("Key is Released");
        }
    }
    public void keyTyped(KeyEvent ke){
        msg+=ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(msg,x,y);
    }
}

```
>> For event handling the package is required is `java.awt.event.*`
