import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Container here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainContainer extends Actor
{
    private int color;
    private int size;

    private int contGoneX;
    private int contGoneY;

    private boolean isGrabbed;
    private boolean wasGrabbed = false;
    private boolean mouseDown;

    private int currentImg;
    public int impSize;
    public int impColor;
    /**
     * Act - do whatever the Container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        checkHoveringTruck();
        checkDragging(size, color);

    }

    private void checkHoveringTruck()
    {
        if(isTouching(Containergame2.class))
        {            
            Containergame2 c = (Containergame2) getOneIntersectingObject(Containergame2.class);
            int truckType = c.t;  
            
            int containerType = convertType(impSize,impColor);            
            if(truckType == containerType && c.loaded == false)
            {                
                getWorld().removeObject(this);
                c.loaded = true;
                c.setContainer(containerType);
            
           }

        }

    }
    
    public int convertType(int size, int color)
    {
        if(size == 1 && color == 1){
            return 3;
        }
        else if(size == 1 && color == 2){
            return 2;
        }
        else if(size == 2 && color == 1){
            return 1;
        }
        else if(size == 2 && color == 2){
            return 0;
        }
        else{
            return 100;
        }
    }

    public MainContainer(int newSize, int newColor) {
        color = newColor;
        size = newSize;
        setImage(size, color);
        impSize = newSize;
        impColor = newColor;
    }
    

    public void setImage(int a, int b) 
    {
        setImage(new GreenfootImage("cont"+a+b+".png"));
    }    

    public void checkDragging(int c, int d) {

        if(Greenfoot.mousePressed(this) && !isGrabbed){
            // grab the object
            isGrabbed = true;
            wasGrabbed = true;
            
            contGoneX = this.getX();
            contGoneY = this.getY();
    
            // the rest of this block will avoid this object being dragged UNDER other objects
            World world = getWorld();
            MouseInfo mi = Greenfoot.getMouseInfo();
            world.removeObject(this);
            world.addObject(this, mi.getX(), mi.getY());
            
            setImage(new GreenfootImage("cont"+c+d+"drag.png"));
            return;
        }
        // check for actual dragging of the object
        if((Greenfoot.mouseDragged(this)) && isGrabbed){
            // follow the mouse
            MouseInfo mi = Greenfoot.getMouseInfo();
            setLocation(mi.getX(), mi.getY());

            return;
        }
        // check for mouse button release
        if(Greenfoot.mouseDragEnded(this) && isGrabbed && wasGrabbed){
            // release the object
            setImage(new GreenfootImage("cont"+c+d+".png"));
            isGrabbed = false;
            wasGrabbed = true;
            setLocation(contGoneX,contGoneY);
            return;
        }

    }
}
