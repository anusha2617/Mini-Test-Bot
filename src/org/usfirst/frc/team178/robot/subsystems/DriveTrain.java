
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
<<<<<<< HEAD
	Ultrasonic Sensor;
	Encoder EncL;
	Encoder EncR;
	Joystick TriggerHappy;
=======
>>>>>>> 1bb9e6cb492bd0e407e95418abc95998d3214460
>>>>>>> 9514500474a10caeb81d5a6056b8f03119db34ba
	
	public DriveTrain(int v1, int v2)  {
		
		left = new Victor(v1);
		right = new Victor(v2);
		Bumper = new DigitalInput(0);
<<<<<<< HEAD
		Sensor = new Ultrasonic(9,9);
		EncL = new Encoder(0,1);
		EncR = new Encoder(2,3);
		TriggerHappy = new Joystick(3);
=======
>>>>>>> 9514500474a10caeb81d5a6056b8f03119db34ba
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
    
<<<<<<< HEAD
    public void spinLeft(double magn) {
    	left.set(0);
    	right.set(magn);
    }
    
    public void spinRight(double magn) {
    	left.set(-magn);
=======
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
>>>>>>> 9514500474a10caeb81d5a6056b8f03119db34ba
    	right.set(0);
>>>>>>> 1bb9e6cb492bd0e407e95418abc95998d3214460
    }
    
    public void manualControl(double L, double R){
    	left.set(-L);
    	right.set(R);
    }
    
    public boolean getBumperValue() {
    	return Bumper.get(); 
    }
<<<<<<< HEAD
    
    public double getDistance() {
    	return Sensor.pidGet();
    }
    
    public double getRotations() {
    	return (EncR.getRaw()+EncL.getRaw())/2;
    }
    
    public boolean getTurn() {
    	return TriggerHappy.getRawButton(2);
=======
  
>>>>>>> 9514500474a10caeb81d5a6056b8f03119db34ba
   
    }
 

}

