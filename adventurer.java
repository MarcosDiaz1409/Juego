import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class adventurer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class adventurer extends Actor
{
    private int speed = 4;
    public int golpes = 0;
    /**
     * Act - do whatever the adventurer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        image();
        if (Greenfoot.isKeyDown("left"))
        {
           setLocation(getX()-speed, getY()); 
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
           setLocation(getX()+speed, getY());
        }
      
        if (Greenfoot.isKeyDown("up"))
        {
           setLocation(getX(), getY()-speed);
        }

        if (Greenfoot.isKeyDown("down"))
        {
           setLocation(getX(), getY()+speed); 
        }
        
    }
    
    public void image()
    {
        GreenfootImage image = getImage();
        image.scale(70,90);
        setImage(image);
    }
}
