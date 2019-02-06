/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot.commands;

import org.usfirst.frc.team178.robot.Robot;
import org.usfirst.frc.team178.robot.subsystems.LinearActuator;

import edu.wpi.first.wpilibj.command.Command;

public class ExtendActuator extends Command {

  LinearActuator linearactuator;
  double currentPositon;

  public ExtendActuator() {
    //requires(Robot.linearactuator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    linearactuator = Robot.linearactuator;
    currentPositon = 0;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (currentPositon < 1 || currentPositon >= 0) {
      currentPositon = currentPositon + 0.01;
      linearactuator.set(currentPositon);
    }
    System.out.println(currentPositon);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
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
