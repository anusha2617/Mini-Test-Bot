
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
	Ultrasonic Sensor;
	Encoder EncL;
	Encoder EncR;
	Joystick TriggerHappy;
	
	public DriveTrain(int v1, int v2)  {
		
		left = new Victor(1);
		right = new Victor(3);
		Bumper = new DigitalInput(0);
		Sensor = new Ultrasonic(9,9);
		EncL = new Encoder(0,1);
		EncR = new Encoder(2,3);
		TriggerHappy = new Joystick(3);
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
    
    public void spinLeft(double magn) {
    	left.set(0);
    	right.set(magn);
    }
    
    public void spinRight(double magn) {
    	left.set(-magn);
    	right.set(0);
    }
    
    public void manualControl(double L, double R){
    	left.set(-L);
    	right.set(R);
    }
    
    public boolean getBumperValue() {
    	return Bumper.get(); 
    }
    
    public double getDistance() {
    	return Sensor.pidGet();
    }
    
    public double getRotations() {
    	return (EncR.getRaw()+EncL.getRaw())/2;
    }
    
    public boolean getTurn() {
    	return TriggerHappy.getRawButton(2);
   
    }
 

}

