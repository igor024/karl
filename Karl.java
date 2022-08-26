import kareltherobot.*;

public class Karl implements Directions, enums
{
    private UrRobot karl;
    private int numBeeper;
    
    public Karl(int x, int y, int numBeepers)
    {
        // initialise instance variables
        karl = new UrRobot(x, y, East, numBeepers);
        numBeeper = numBeepers;
    }
    
    public void turnRight()
    {
        karl.turnLeft();
        karl.turnLeft();
        karl.turnLeft();
    }
    
    public void turnLeft()
    {
        karl.turnLeft();
    }
    
    public void aboutFace()
    {
        karl.turnLeft();
        karl.turnLeft();
    }
    
    public void move(int amount)
    {
        for (int i = 0; i < amount; i++)
        {
            karl.move();
        }
    }
    
    public void placeBeeper()
    {
        if (numBeeper < 1)
        {
            System.out.print("ur literally alex stfu");
            return;
        }
        karl.putBeeper();
        numBeeper--;
    }
    
    public void pickBeeper()
    {
        karl.pickBeeper();
        numBeeper++;
    }
    
    
    public void drawShape(shapes shape, int scale, directions direction)
    {
        if (shape == shapes.square)
        {
            for (int i = 0; i < 4; i++)
            {
                placeBeeper();
                move(scale);
                if (direction == directions.right)
                {
                    turnRight();
                    
                }
                else
                {
                    turnLeft();
                }
            }
        }
        else if(shape == shapes.line)
        {
            for (int i = 0; i < scale; i++)
            {
                placeBeeper();
                if (i < scale - 1)
                {
                    move(1);
                }
            }
        }
    }
}
