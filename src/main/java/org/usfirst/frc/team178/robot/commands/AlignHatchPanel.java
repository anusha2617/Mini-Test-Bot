/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team178.robot.OI;
import org.usfirst.frc.team178.robot.Robot;
import org.usfirst.frc.team178.robot.RobotMap;
import org.usfirst.frc.team178.robot.subsystems.Arduino;
import org.usfirst.frc.team178.robot.subsystems.LinearActuator;
import org.usfirst.frc.team178.robot.subsystems.Pixy;

public class AlignHatchPanel extends Command {
  Pixy pixy1;
  Pixy pixy2;
  OI oi;
  LinearActuator linearactuator;

  public AlignHatchPanel() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    oi = Robot.oi;
    pixy1 = Robot.pixy1;
    pixy2 = Robot.pixy2;
    linearactuator = Robot.linearactuator;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println("execute");
    double desiredavg = 157;//checks if the pixy is inbetween the two pieces of tape
    Pixy.updateTargetValues(); //refresh pixy values
  

    //get the locations of each of the reflective tape objects
    int firstLocation = Pixy.getLeft();
    int secondLocation = Pixy.getRight();

    double x1 = (double) firstLocation;
    double x2 = (double) secondLocation; 
    double avg = (x1 + x2)/2;

    while(avg > (desiredavg  + 2) || avg < (desiredavg - 2)){
      double diff = desiredavg-avg;
      if (diff>desiredavg){
        new MoveActuator(0,false); //change to new parameters
      } else {
        new MoveActuator(1, true);
      }
    }

  }



  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }
  

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}