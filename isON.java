import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class isON extends SoundControl
{
      
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(this) )
        {
            setImageOFF();
            stopBGM();
        }
        if (Greenfoot.isKeyDown("a")){
            HigherVolume();
            System.out.print(BGM.getVolume() + "\n");
        }

    }
}
