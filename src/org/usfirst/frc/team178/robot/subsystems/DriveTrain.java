
package org.usfirst.frc.team178.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team178.robot.RobotMap;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	Victor left;
	Victor right;
	DigitalInput Bumper;
	
	public DriveTrain(int v1, int v2)  {
		
		left = new Victor(v1);
		right = new Victor(v2);
		Bumper = new DigitalInput(0);
	}
	
	
	
			// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    }
    
    public void forward() {
    	left.set(1);
    	right.set(-1);
    }
    
    public void backward() {
    	left.set(-1);
    	right.set(1);
    	}
    
    public void stop() {
    	left.set(0);
    	right.set(0);
    }
    
    public void turnLeft() {
    	left.set(0);
    	right.set(1);
    }
    
    public void turnRight() {
    	left.set(-1);
    	right.set(0);
    }
    
    public boolean getBumperValue() {
    	return Bumper.get(); 
    }
  
   
 }

