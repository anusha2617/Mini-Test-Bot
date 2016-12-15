package org.usfirst.frc.team178.robot;

//import org.usfirst.frc.team178.robot.commands.CloseClaw;
<<<<<<< HEAD
import org.usfirst.frc.team178.robot.commands.Onwards;
import org.usfirst.frc.team178.robot.commands.Stop;
=======
import org.usfirst.frc.team178.robot.commands.*;
>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
//import org.usfirst.frc.team178.robot.commands.Pickup;
//import org.usfirst.frc.team178.robot.commands.Place;
//import org.usfirst.frc.team178.robot.commands.PrepareToPickup;
//import org.usfirst.frc.team178.robot.commands.SetDistanceToBox;
//import org.usfirst.frc.team178.robot.commands.SetWristSetpoint;
import org.usfirst.frc.team178.robot.commands.TurnLeft;
import org.usfirst.frc.team178.robot.commands.TurnRight;
import org.usfirst.frc.team178.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous extends CommandGroup {

	public Autonomous() {
<<<<<<< HEAD
    	addSequential(new Onwards());
        addSequential(new TurnRight());
        addSequential(new Onwards());
        addSequential(new TurnRight());
        addSequential(new Onwards());
        addSequential(new TurnRight());
        addSequential(new Onwards());
        addSequential(new Stop());
=======
		
    	addSequential(new Onwards());

       /* addSequential(new TurnLeft());
        addSequential(new Onwards());
        addSequential(new TurnRight());*/


        addSequential(new Reverse());
        //addParallel(new enc());

>>>>>>> 3fe2544e395fdba9f413f3fa0279624aff3f58f9
    }
}
