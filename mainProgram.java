
/**
 * first karel program
 *
 * @author (dotan)
 * @version (8/24/22)
 */

import kareltherobot.*;

public class mainProgram implements enums //Directions needed for Karel
{
    public static void main(String args[]) {
        World.setVisible(true);
        
        //UrRobot karel = new UrRobot(1,1, East, 4); //location: x , facing, #beepers (negative is infinite)
        
        Karl robot = new Karl(4,4,4);
        
        
        robot.drawShape(shapes.square, 4, directions.left);
        
        robot.placeBeeper();
    }
}
