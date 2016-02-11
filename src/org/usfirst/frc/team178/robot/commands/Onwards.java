package org.usfirst.frc.team178.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team178.robot.Robot;

/**
 *
 */
public class Onwards extends Command {
	

    public Onwards() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.forward();
    	SmartDashboard.putNumber("DISTANCE", Robot.drivetrain.getDistance() );
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	/*double passedTime = timeSinceInitialized();
    	if (passedTime >= 2) {
    		return true;
    	}
    	else {
    		return false;
    	}*/
    	
    	if (Robot.drivetrain.getBumperValue() ) {
    		return false;
    	}
    	else {
    		return true;
    	}
    	
    	
    	
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
