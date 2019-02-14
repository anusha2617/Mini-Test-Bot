/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot.subsystems;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.command.Subsystem;

import java.util.ArrayList;
import java.util.Arrays;

import org.usfirst.frc.team178.robot.RobotMap;
import org.usfirst.frc.team178.robot.RobotMap.SubsystemIndex;

/**
 * Add your docs here.
 */
public class Arduino extends Subsystem {
  protected I2C arduino;
  public boolean received;
  boolean sent;

  public Arduino(int address) {
    arduino = new I2C(I2C.Port.kOnboard, address); // check these values
  }

  public boolean sendMessage(String pattern) {
    //String message = subsystem.ordinal() + pattern;
    boolean sent = false;
    String message = pattern;
    message = message.toLowerCase();
    System.out.println(message);
    sent = !arduino.writeBulk(message.getBytes());//because true if aborted, false if worked
    System.out.println(arduino.addressOnly());

    return sent;
  }

  public byte[] receiveMessage(int address)//for which i2c address to read from 
  {
    byte[] dataFromArduino = new byte[2];//change based on type of data 
    received = !arduino.read(address, 2, dataFromArduino);//because true if aborted, false if worked
    for (byte b : dataFromArduino) {//gets data in bytes from arduino and converts to binary 
    String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
    System.out.print(s1 + ", ");
    } 
    System.out.println();

    return dataFromArduino;
  }

  public boolean checkIfReceived()
  {
    return received;
  }

  public boolean checkIfSent()
  {
    return sent;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}