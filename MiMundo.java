import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MiMundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiMundo extends World
{
public static int puntos = 0;
    /**
     * Constructor for objects of class MiMundo.
     * 
     */
    public MiMundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
    }
    
    public void act()
    {
        if (getObjects(diamante.class).size()<2 && Greenfoot.getRandomNumber(50)==0)
        {
        spawn();
        addObject(new diamante(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        
        if (getObjects(plata.class).size()<6 && Greenfoot.getRandomNumber(50)==0)
        {
        spawn1();
        addObject(new plata(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        
        if (getObjects(oro.class).size()<5 && Greenfoot.getRandomNumber(50)==0)
        {
        spawn2();
        addObject(new oro(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        
        if (getObjects(cofre.class).size()<4 && Greenfoot.getRandomNumber(50)==0)
        {
        spawn3();
        addObject(new cofre(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        
        if (getObjects(bomba.class).size()<20 && Greenfoot.getRandomNumber(50)==20)
        {
        spawn3();
        addObject(new bomba(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        
        showText("Puntaje: " + puntos, 100, 30);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new adventurer(), 600,  300);
        puntos = 0;
    }
    
    public void spawn()
    {
        for(int b = 2; b > 0; b --)
        {
            if(Greenfoot.getRandomNumber(50) == 0)
            {
     
                int x = Greenfoot.getRandomNumber(100);
                int y = Greenfoot.getRandomNumber(300);
                addObject(new diamante(), x, y);
            }
        }
    }
    
    public void spawn1()
    {
        for(int b = 6; b > 0; b --)
        {
            if(Greenfoot.getRandomNumber(50) == 0)
            {
     
                int x = Greenfoot.getRandomNumber(300);
                int y = Greenfoot.getRandomNumber(100);
                addObject(new plata(), x, y);
            }
        }
    }
    
    public void spawn2()
    {
        for(int b = 5; b > 0; b --)
        {
            if(Greenfoot.getRandomNumber(50) == 0)
            {
     
                int x = Greenfoot.getRandomNumber(100);
                int y = Greenfoot.getRandomNumber(300);
                addObject(new oro(), x, y);
            }
        }
    }
    
    public void spawn3()
    {
        for(int b = 4; b > 0; b --)
        {
            if(Greenfoot.getRandomNumber(50) == 0)
            {
     
                int x = Greenfoot.getRandomNumber(100);
                int y = Greenfoot.getRandomNumber(400);
                addObject(new cofre(), x, y);
            }
        }
    }
    
    public void spawn4()
    {
        for(int b = 20; b > 0; b --)
        {
            if(Greenfoot.getRandomNumber(50) == 20)
            {
     
                int x = Greenfoot.getRandomNumber(100);
                int y = Greenfoot.getRandomNumber(200);
                addObject(new bomba(), x, y);
            }
        }
    }
}
