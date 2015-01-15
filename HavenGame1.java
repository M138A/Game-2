import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Haven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HavenGame1 extends Actor
{
    /**
     * Act - do whatever the Haven wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String harbor;
    /**
     * Act - do whatever the Havenfoot2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HavenGame1(String harborstuff) {
        harbor = harborstuff;
        setImage();
    
    }
    
    public void setImage() {
        
        if (harbor == "havencolission") {
            setImage(new GreenfootImage("havencolission.png"));
        }
        if (harbor == "havenfooter") {
            setImage(new GreenfootImage("havenfooter.png"));
        }
        if (harbor =="rightbalk") {
            setImage(new GreenfootImage("rightbalk1.png"));
        }
        if (harbor =="rightbalk") {
            setImage(new GreenfootImage("rightbalk1.png"));
        }
        if (harbor == "havenbreak") {
              setImage(new GreenfootImage("Havenbreak.png"));
        }

    }
}
