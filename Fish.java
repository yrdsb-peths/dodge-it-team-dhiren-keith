import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-10);
        
        if(getX() <= 0) {
            resetFish();
        }
        
        if(isTouching(Hero.class))
        {
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, 300,200);
            getWorld().removeObject(this);
        }
    }
    public void resetFish() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600,100);
        } else {
            setLocation(600,300);
        }
    }
}
