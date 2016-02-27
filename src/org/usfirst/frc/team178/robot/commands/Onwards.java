package org.usfirst.frc.team178.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
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
<<<<<<< HEAD
    	Robot.drivetrain.forward();
    	SmartDashboard.putNumber("DISTANCE", Robot.drivetrain.getDistance() );
    	SmartDashboard.putNumber("Rotations", Robot.drivetrain.getRotations());
=======
    	Robot.drivetrain.forward(0.5);
>>>>>>> 9514500474a10caeb81d5a6056b8f03119db34ba
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
    		return true;
    	}
    	else {
    		return false;
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
