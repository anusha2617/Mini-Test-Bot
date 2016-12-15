<<<<<<< HEAD
 
=======

>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
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
	DigitalInput Bumper;
=======

	double Sideways;
	double UpandDown; 
	

	DigitalInput Bumper;

	Ultrasonic Sensor;
	Encoder EncL;
	Encoder EncR;
	Joystick TriggerHappy;


>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
	
	public DriveTrain(int v1, int v2)  {
		
		left = new Victor(v1);
		right = new Victor(v2);
		Bumper = new DigitalInput(0);
<<<<<<< HEAD
=======

		Sensor = new Ultrasonic(9,9);
		EncL = new Encoder(0,1);
		EncR = new Encoder(2,3);
		TriggerHappy = new Joystick(3);

>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
	}
	
	
	
			// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    }
    
<<<<<<< HEAD
    public void drive(int leftnum, int rightnum){
    	left.set(leftnum);
    	right.set(rightnum);
    }
    public void forward() {
    	left.set(1);
    	right.set(-1);
=======
    public void forward(double multiplier) {
    	left.set(multiplier);
    	right.set(-multiplier);
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
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
    public void turnLeft() {
    	left.set(0);
    	right.set(1);
    }
    
    public void turnRight() {
    	left.set(-1);
    	right.set(0);
=======

    public void spinLeft(double magn) {
    	left.set(0);
    	right.set(magn);
    }
    
    public void spinRight(double magn) {
    	left.set(-magn);
    }
/*    public void turnLeft(double multiplier) {
    	left.set(0);
    	right.set(multiplier);
    }
*/    

    public void turnRight(double multiplier) {
    	left.set(1);
    	right.set(multiplier);
    }
    
    public void turnLeft(double multiplier){
    	right.set(1);
    	left.set(multiplier);
    }
/*
    public void turnRight() {
    	left.set(-1);

    	right.set(0);

    }
*/
    public void manualControl(double L, double R){
    	left.set(-L);
    	right.set(R);
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
    }
    
    public boolean getBumperValue() {
    	return Bumper.get(); 
    }
<<<<<<< HEAD
  
   
 }
=======

    
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
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9

