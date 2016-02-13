package org.usfirst.frc.team178.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Sensors extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Ultrasonic Sensor;
	DigitalInput Bumper;
	
	public Sensors()  {
		
		Bumper = new DigitalInput(0);
		Sensor = new Ultrasonic(9,9);
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
  
    }
    public boolean getBumperValue() {
    	return Bumper.get(); 
    }
    
    public double getDistance() {
    	return Sensor.pidGet();
    }
    
    
    
}

