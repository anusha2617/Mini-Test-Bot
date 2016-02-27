package org.usfirst.frc.team178.robot.commands;

import org.usfirst.frc.team178.robot.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Kick extends Command {

	boolean isTimer;
	
	
    public Kick() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.kicker);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	isTimer =  DriverStation.getInstance().getBatteryVoltage() < 8;
    	Robot.kicker.runKicker();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(isTimer){
    		if(Robot.kicker.endTime()<2.7){
    			return false;
    		}
    		else{
    			return true;
    		}
    		
    	}else{
    		if(Robot.kicker.endPosition() < 3.4){
    			return false;
    		}
    		else{
    			return true;
    		}
    	}
        
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.kicker.timerShutOff();
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
