package org.usfirst.frc.team178.robot.commands;

import org.usfirst.frc.team178.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickDrive extends Command {

    public JoystickDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double X = Robot.oi.getXValue();
    	double Y = Robot.oi.getYValue();
    	if(Y>0.05){
	    	if(X<-0.05)
	    		Robot.drivetrain.manualControl(Y,Y+X);
	    	else if(X>0.05)
	    		Robot.drivetrain.manualControl(Y+X, Y);
	    	else
	    		Robot.drivetrain.manualControl(Y,Y);
    	}
    	else if(Y<-0.05){
	    	if(X<-0.05)
	    		Robot.drivetrain.manualControl(Y,Y-X);
	    	else if(X>0.05)
	    		Robot.drivetrain.manualControl(Y-X, Y);
	    	else
	    		Robot.drivetrain.manualControl(Y,Y);
    	}
    	else
    		Robot.drivetrain.stop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
