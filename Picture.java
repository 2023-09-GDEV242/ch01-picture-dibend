/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  David DiBenedetto, Michael Kšlling, and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Person person;
    private Circle sun;
    private Square ground;
    private Triangle mountain1;
    private Triangle mountain2;
    private Triangle mountain3;
    private Triangle mountain4;
    
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sun = new Circle();
        ground = new Square();
        mountain1 = new Triangle();
        mountain2 = new Triangle();
        mountain3 = new Triangle();
        mountain4 = new Triangle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sun.moveVertical(-50);
            ground.moveHorizontal(-500);
            
            mountain1.moveVertical(-50);
            mountain2.moveVertical(-40);
            mountain3.moveVertical(-45);
            mountain4.moveVertical(-48);
            
            mountain2.moveHorizontal(30);
            mountain3.moveHorizontal(-30);
            mountain4.moveHorizontal(-60);
            
            sun.makeVisible();
            ground.changeSize(1000);
            ground.makeVisible();
            mountain1.makeVisible();
            mountain2.makeVisible();
            mountain3.makeVisible();
            mountain4.makeVisible();
            this.setColor();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sun.changeColor("black");
        ground.changeColor("black");
        mountain1.changeColor("black");
        mountain2.changeColor("black");
        mountain3.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sun.changeColor("yellow");
        ground.changeColor("green");
        mountain1.changeColor("green");
        mountain2.changeColor("green");
        mountain3.changeColor("green");
    }
}
