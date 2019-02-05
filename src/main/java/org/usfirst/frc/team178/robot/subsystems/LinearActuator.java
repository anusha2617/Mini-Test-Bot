/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot.subsystems;

import org.usfirst.frc.team178.robot.RobotMap;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class LinearActuator extends Subsystem {
  public static PWMSpeedController actuator;

  public LinearActuator () {
    actuator = (PWMSpeedController) new PWM(RobotMap.linearActuator);
  }

  public void extend () {
    actuator.setInverted(true);
  }

  public void retract () {
    actuator.setInverted(false);
  }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
