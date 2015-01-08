import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SoundControl extends Actor    
{    
    static GreenfootSound BGM = new GreenfootSound("SeaSound.mp3");    
           
    public void act()
    {
      
    }
    
    public void setImageON()
    {
        getWorld().addObject(new isON(), 774, 786);
        getWorld().removeObject(this);
    
    }
    
    public void setImageOFF()
    {
        getWorld().addObject(new isOFF(), 774, 786);
        getWorld().removeObject(this);
    
    }
    
    public static void startBGM(){
        BGM.play();
    }
    
    public static void stopBGM(){
        BGM.stop();
    }
    public void HigherVolume(){
    BGM.setVolume(10);
    }
    
}
