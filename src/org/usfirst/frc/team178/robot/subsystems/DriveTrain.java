
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
<<<<<<< HEAD
	double Sideways;
	double UpandDown; 
	
=======
	DigitalInput Bumper;
>>>>>>> 1bb9e6cb492bd0e407e95418abc95998d3214460
	
	public DriveTrain(int v1, int v2)  {
		
		left = new Victor(v1);
		right = new Victor(v2);
		Bumper = new DigitalInput(0);
	}
	
	
	
			// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    }
    
    public void forward(double multiplier) {
    	left.set(multiplier);
    	right.set(-multiplier);
    }
    
    public void backward() {
    	left.set(-1);
    	right.set(1);
    	}
    
    public void stop() {
    	left.set(0);
    	right.set(0);
    }
    
    public void turnLeft(double multiplier) {
    	left.set(0);
    	right.set(multiplier);
    }
    
<<<<<<< HEAD
    public void turnRight(double multiplier) {
    	left.set(1);
    	right.set(multiplier);
=======
    public void turnRight() {
    	left.set(-1);
    	right.set(0);
>>>>>>> 1bb9e6cb492bd0e407e95418abc95998d3214460
    }
    
    public boolean getBumperValue() {
    	return Bumper.get(); 
    }
  
   
 }

