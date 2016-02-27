package org.usfirst.frc.team178.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Kicker extends Subsystem {
	
	CANTalon KickerOne;
	CANTalon KickerTwo;
	
	Timer t;
	Encoder LeftEncoder;
	Encoder RightEncoder;
	
	double startPos;
	
	public Kicker(){
		KickerOne = new CANTalon(1);
		KickerTwo = new CANTalon(2);
		
		LeftEncoder = new Encoder(4,5);
		RightEncoder = new Encoder(7,8);
		
		t = new Timer();
		t.reset();
		t.stop();
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void runKicker(){
    	KickerOne.set(1.0);
    	KickerTwo.set(1.0);
    	t.start();
    	startPos = LeftEncoder.get();
    }
    
    public double endPosition(){
    	return LeftEncoder.get() - startPos;
    }
    
    public double endTime(){
    	return t.get();
    }
    
    public void timerStartUp(){
    	t.start();
    }
    
    public void timerShutOff(){
    	t.stop();jjfjkejrj
    	
    	
    	
    	t.reset();
    }
    public void shutDown(){
    	KickerOne.set(0.0);
    	KickerTwo.set(0.0);
    }
    
    public void restartProcedure(){
    	KickerOne.set(-0.1);
    	KickerTwo.set(-0.1);
    }    
}



