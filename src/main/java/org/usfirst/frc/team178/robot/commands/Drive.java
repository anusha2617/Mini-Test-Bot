/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team178.robot.*;
import org.usfirst.frc.team178.robot.subsystems.*;



public class Drive extends Command {

    private DriveTrain driveTrain;
    private OI oi;

    private double xVal;
    private double yVal;
    private double twistVal;

  public Drive() {
      // Use requires() here to declare subsystem dependencies
      requires(Robot.drivetrain);
  }

  // Called just before this Command runs the first time
  protected void initialize() {
      driveTrain = Robot.drivetrain;
      oi = Robot.oi;

      xVal = 0;
      yVal = 0;
      twistVal = 0;
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
      xVal = oi.getX();
      yVal = oi.getY();
      twistVal = oi.getTwist();

    if(Math.abs(yVal) > 0.1 || Math.abs(twistVal) > 0.1){
        driveTrain.drive(twistVal-yVal, twistVal+yVal);
    } else {
        driveTrain.drive(0, 0);
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
      return false;
  }

  // Called once after isFinished returns true
  protected void end() {
      driveTrain.drive(0, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
    driveTrain.drive(0, 0);
  }
}