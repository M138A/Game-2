import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MiniGame1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiniGame2 extends World
{
    public boolean loadedTrucksCanMove = false;
    private int Counter = 0;
    private int Xmargin = 284;

    private int YtopSmall = 184;
    private int YbottomSmall = 268;
    private int YtopLarge = 202;
    private int YbottomLarge = 248;
    private int YmarginTop;
    private int YmarginBottom;
   
    private int colorCont;
    private int sizeCont;
    private int sizeCont2;
    private int colorCont2;
    /**
     * Constructor for objects of class MiniGame1.
     * 
     */
    public MiniGame2()
    {    
        // Create a new world with 900x900 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 
        prepare();
        prepareWorld();
        
    }   

    private void prepareWorld()
    {
        Truck x = new Truck(4);
        addObject(x, 108,900);
        Train t = new Train();
        addObject(t, 40,900);
        
    }
    private void prepare()
    {
        for (int u = 0; u < 4; u++) {
            for (int i = 0; i < 5; i++) {
                colorCont = Greenfoot.getRandomNumber(2) + 1;
                sizeCont = Greenfoot.getRandomNumber(2) + 1;
                colorCont2 = Greenfoot.getRandomNumber(2) + 1;
                
                if (sizeCont == 1){
                    YmarginTop = YtopSmall;
                    YmarginBottom = YbottomLarge;
                    sizeCont2 = 2;
                } else if (sizeCont == 2){
                    YmarginTop = YtopLarge;
                    YmarginBottom = YbottomSmall;
                    sizeCont2 = 1;
                }
                addObject(new MainContainer(sizeCont,colorCont), Xmargin, YmarginTop);
                
                if (sizeCont == 1){
                    addObject(new MainContainer(sizeCont2,colorCont2), Xmargin, YmarginBottom);
                } else if (sizeCont == 2){
                    addObject(new MainContainer(sizeCont2,colorCont2), Xmargin, YmarginBottom);
                }
                
                Xmargin = Xmargin + 32; 
            }
            
            Xmargin = 284;
            
            YtopSmall = YtopSmall + 144;
            YbottomSmall = YbottomSmall + 144;
            YtopLarge = YtopLarge + 144;
            YbottomLarge = YbottomLarge + 144;
        }
    }
    
    
}
