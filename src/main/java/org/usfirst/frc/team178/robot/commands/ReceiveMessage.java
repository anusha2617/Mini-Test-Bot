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
import org.usfirst.frc.team178.robot.subsystems.Arduino;

public class ReceiveMessage extends Command {
  
  OI oi;
  Arduino arduino;
  
  public ReceiveMessage() {

    }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    arduino = Robot.pixyArduino;
    oi = Robot.oi;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    arduino.receiveMessage();
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