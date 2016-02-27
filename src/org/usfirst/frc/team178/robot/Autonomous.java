package org.usfirst.frc.team178.robot;

//import org.usfirst.frc.team178.robot.commands.CloseClaw;
import org.usfirst.frc.team178.robot.commands.*;
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
    	addSequential(new Onwards());
        addSequential(new Reverse());
        //addParallel(new enc());
    }
}
