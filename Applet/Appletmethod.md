/*
 * Applet method 
 * public void init()
 * public void start()
 * public void stop()
 * public void Destroy()
 * public void paint(Graphics)
 */
### **ini**t - the init method is also called as the initialization method
### this method is responsible for loading the applet into the computer's memory

### This methos is called only life cycle of Applet

### **Start** - the start method  is called just after the init method 
### this method is responsible for brewing th eapplet on the screen. this method can be called multiple times

### **Stop** - The stop methhod is responsible for running th eapplet at the background in the backgriund of the screen. 
### like a start method a astp met can be called multiple times

### **Paint** - The paint method is responsible for drawing anything in an applet.the paint method can also be called multiple times.
### The paint method can be called using the repaint method.


### **Destry** - The destroy Methhod is rsponsible for unloading the applet from the computer memory once it's operation is over.
###  Like init method the destroy method can be called i th eentire life cycle of the applet

init()
    |
start()
    |
do some work
    |
stop()
    |
destroy()




 