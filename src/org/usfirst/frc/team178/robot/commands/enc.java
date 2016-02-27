package org.usfirst.frc.team178.robot.commands;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class enc extends Command {

	Encoder right;
	Encoder left;
    public enc() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	right = new Encoder(1, 2, false, EncodingType.k2X);
    	left = new Encoder(3,4, false, EncodingType.k2X);
    	
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("RIGHT " + right.getDistance());
    	System.out.println("LEFT  " + left.getDistance());
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
