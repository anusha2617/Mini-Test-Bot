/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot.subsystems;



import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.usfirst.frc.team178.robot.Robot;
import org.usfirst.frc.team178.robot.RobotMap;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Pixy extends Arduino {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static int lLoc;
  public static int rLoc;

  public Pixy(int address)//use robotmap values
  {
    super(I2C.Port.kOnboard, address);
    lLoc = 0;
    rLoc = 0;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  public byte[] receiveMessage(int address)
  {
    byte[] dataFromArduino = new byte[2];
    received = !arduino.read(address, 2, dataFromArduino);
    for (byte b : dataFromArduino) {//gets data in bytes from arduino and converts to binary 
      //String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
    //  System.out.print(s1 + ", ");
      } 
    //  System.out.println(": data from arduino");
      return dataFromArduino;
  }

  public static void updateTargetValues() {
    byte[] coordinatesFromPixy = Robot.pixy1.receiveMessage(RobotMap.pixy1Address);//gets first x value from pixy
    ByteBuffer bytebuffer1 = ByteBuffer.allocateDirect(4); //allocating 4 bytes for an integer in this ByteBuffer object
      bytebuffer1.order(ByteOrder.LITTLE_ENDIAN); //makes it so that it goes from least significant bit to most significant bit
      bytebuffer1.put(coordinatesFromPixy[1]);
      bytebuffer1.put(coordinatesFromPixy[0]);
      bytebuffer1.put((byte) 0x00);
      bytebuffer1.put((byte) 0x00);
      bytebuffer1.flip(); //flips order of the bytes we put in the bytebuffer and stages it to convert to base 10
      int x1 = bytebuffer1.getInt(); //converts base 2 value to base 10
    //break
   // int x2 = (int) coordinatesFromPixy[0];
    coordinatesFromPixy = Robot.pixy2.receiveMessage(RobotMap.pixy2Address);
    ByteBuffer bytebuffer2 = ByteBuffer.allocateDirect(4); //allocating 4 bytes for an integer in this ByteBuffer object
     bytebuffer2.order(ByteOrder.LITTLE_ENDIAN); //makes it so that it goes from least significant bit to most significant bit
     bytebuffer2.put(coordinatesFromPixy[1]);
     bytebuffer2.put(coordinatesFromPixy[0]);
     bytebuffer2.put((byte) 0x00);
     bytebuffer2.put((byte) 0x00);
     bytebuffer2.flip(); //flips order of the bytes we put in the bytebuffer and stages it to convert to base 10
     int x2 = bytebuffer2.getInt(); //converts base 2 value to base 10
  /*  String x1Binary = ((Byte) coordinatesFromPixy[0]).toString();
    System.out.println(x1Binary);
    int counter = 1;
    int x1 = 0;
    for (int i = x1Binary.length() - 1; i >= 0; i--) {//converts binary to base 10
      if (x1Binary.charAt(i) == '1') {
        x1 = x1 + counter;
      }
      counter = counter * 2;
    }
    counter = 0;
    
    // delay
    coordinatesFromPixy = Robot.pixy2.receiveMessage(RobotMap.pixy2Address);//gets second x value from pixy 
    String x2Binary = ((Byte) coordinatesFromPixy[0]).toString();
    counter = 1;
    int x2 = 0;
    for (int i = x2Binary.length() - 1; i >= 0; i--) {//converts binary to base 10
      if (x2Binary.charAt(i) == '1') {
        x2 = x2 + counter;
      }
      counter = counter * 2;
    } */
    lLoc = x1;
    rLoc = x2;
    
    if (x1 > x2)//determines which one is on the left 
    {
      lLoc = x2;
      rLoc = x1;
    }
    else 
    {
      lLoc = x1;
      rLoc = x2;
    }
  }

  public static int getLeft()
  {
    System.out.println("Left: " + lLoc);
    return lLoc;
  }

  public static int getRight()
  {
    System.out.println("Right: " + rLoc);
    return rLoc;
  }

}
