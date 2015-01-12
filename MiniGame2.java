import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
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
    public List<MainContainer> containersnul = new ArrayList();
    public List<MainContainer> containerseen = new ArrayList();
    public List<MainContainer> containerstwee = new ArrayList();
    public List<MainContainer> containersdrie = new ArrayList();
    public List<MainContainer> allContainersOnBoat = new ArrayList();
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
    private void joinSeperateLists()
    {
        allContainersOnBoat.addAll(containersnul);
        allContainersOnBoat.addAll(containerseen);
        allContainersOnBoat.addAll(containerstwee);
        allContainersOnBoat.addAll(containersdrie);
    }

    public void removeFromList(int index){
        allContainersOnBoat.remove(index);
    }

    public List<MainContainer> getContainerList()
    {
        return allContainersOnBoat;
    }

    

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
        int counter = 0;
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
                MainContainer x = new MainContainer(sizeCont,colorCont);
                addToList(x,counter);
                addObject(x, Xmargin, YmarginTop);

                if (sizeCont == 1){           
                    MainContainer y =new MainContainer(sizeCont2,colorCont2);
                    addToList(y, counter);
                    addObject(y, Xmargin, YmarginBottom);
                } else if (sizeCont == 2){
                    MainContainer z =new MainContainer(sizeCont2,colorCont2);
                    addToList(z,counter);
                    addObject(z, Xmargin, YmarginBottom);
                }

                Xmargin = Xmargin + 32; 
            }
            counter++;
            Xmargin = 284;

            YtopSmall = YtopSmall + 144;
            YbottomSmall = YbottomSmall + 144;
            YtopLarge = YtopLarge + 144;
            YbottomLarge = YbottomLarge + 144;
        }  
        joinSeperateLists();
    }
    private void addToList(MainContainer main, int count)
    {
        switch(count){
            case 0 : containersnul.add(main); break;
            case 1 : containerseen.add(main);break;
            case 2 : containerstwee.add(main); break;
            case 3 : containersdrie.add(main); break;        
        }
    }   
}