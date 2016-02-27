
package org.usfirst.frc.team178.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team178.robot.Robot;

/**
 *
 */


public class Drive extends Command {

    double rightPower;
    double leftPower;
    double distance;
	
    public Drive(double right, double left, double dist) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);
        
        
        rightPower = right;
        leftPower = left;
        distance = dist;
    }
    
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.manualControl(leftPower, rightPower);
       	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(Robot.drivetrain.getRotations()<distance)
        	return false;
        else
        	return true;
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
