/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot.commands;

import org.usfirst.frc.team178.robot.Robot;

import org.usfirst.frc.team178.robot.OI;
import org.usfirst.frc.team178.robot.subsystems.Arduino;
import org.usfirst.frc.team178.robot.subsystems.LinearActuator;

import edu.wpi.first.wpilibj.command.Command;

public class ConvertPixyValues extends Command {
  OI oi;
  Arduino arduino;
  LinearActuator linearactuator;
  public ConvertPixyValues() {

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    oi = Robot.oi;
    arduino = Robot.arduino;
    linearactuator = Robot.linearactuator;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    byte[] coordinatesFromPixy = arduino.receiveMessage();
    String xBinary = ((Byte) coordinatesFromPixy[0]).toString();
    String yBinary = ((Byte) coordinatesFromPixy[1]).toString();
    int counter = 1;
    int x = 0;
    int y = 0;
    for (int i = xBinary.length(); i >= 0; i--) {
      if (xBinary.charAt(i) == '1') {
        x = x + counter;
      }
      counter = counter * 2;
    }
    counter = 0;
    for (int i = yBinary.length(); i >= 0; i--) {
      if (yBinary.charAt(i) == '1') {
        y = y + counter;
      }
      counter = counter * 2;
    }
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
