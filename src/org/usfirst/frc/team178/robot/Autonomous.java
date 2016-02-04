package org.usfirst.frc.team178.robot;

import org.usfirst.frc.team178.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous extends CommandGroup{
	public Autonomous()
	{
		DriveTrain Vroomvroom= new DriveTrain();
		
		Vroomvroom.backward();
		Vroomvroom.forward();
	}

}
