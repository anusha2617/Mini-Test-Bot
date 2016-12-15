
package org.usfirst.frc.team178.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team178.robot.Robot;

/**
 *
 */
<<<<<<< HEAD
public class Drive extends Command {

    public Drive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);
    }

=======


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
    
    
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
<<<<<<< HEAD
=======
    	Robot.drivetrain.manualControl(leftPower, rightPower);
       	
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
<<<<<<< HEAD
        return false;
=======
        if(Robot.drivetrain.getRotations()<distance)
        	return false;
        else
        	return true;
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
    }

    // Called once after isFinished returns true
    protected void end() {
<<<<<<< HEAD
=======
    	Robot.drivetrain.stop();
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
