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
    	
<<<<<<< HEAD
    }

=======
    	
    	
    }
    
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
<<<<<<< HEAD
    	Robot.drivetrain.forward();
=======

/*    	Robot.drivetrain.forward();
    	SmartDashboard.putNumber("DISTANCE", Robot.drivetrain.getDistance() );
    	SmartDashboard.putNumber("Rotations", Robot.drivetrain.getRotations());*/

//    	Robot.drivetrain.forward(0.5);

>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
<<<<<<< HEAD
    	double passedTime = timeSinceInitialized();
=======
    	/*double passedTime = timeSinceInitialized();
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
    	if (passedTime >= 2) {
    		return true;
    	}
    	else {
    		return false;
<<<<<<< HEAD
    	}
    	
    /*	if (!Robot.drivetrain.getBumperValue() ) {
=======
    	}*/
    	
    	if (Robot.drivetrain.getBumperValue() ) {
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
    		return true;
    	}
    	else {
    		return false;
<<<<<<< HEAD
    	}*/
=======
    	}
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
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
