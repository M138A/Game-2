import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class isOFF extends SoundControl
{
   
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(this))
        {
            setImageON();
            startBGM();
        }
        
    }

}
