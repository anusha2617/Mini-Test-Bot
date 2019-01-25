/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team178.robot.commands.*;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 * Add your docs here.
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
		setDefaultCommand(new Drive());
    }
    
    public void drive(double leftnum, double rightnum){
    	left.set(leftnum);
    	right.set(rightnum);
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
