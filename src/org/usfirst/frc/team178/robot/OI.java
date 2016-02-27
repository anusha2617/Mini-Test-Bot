package org.usfirst.frc.team178.robot;

import org.usfirst.frc.team178.robot.commands.Onwards;
import org.usfirst.frc.team178.robot.subsystems.JoystickControl;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
//import org.usfirst.frc.team178.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
	
    Joystick stick = new Joystick(RobotMap.JoystickONE);
    // Button button = new JoystickButton(stick, buttonNumber);
    Button B1 = new JoystickButton(stick, 1);
    Button B2 = new JoystickButton(stick, 2);
    Button B3 = new JoystickButton(stick, 3);
    Button B4 = new JoystickButton(stick, 4);
    Button B5 = new JoystickButton(stick, 5);
    Button B6 = new JoystickButton(stick, 6);
    Button B7 = new JoystickButton(stick, 7);
    Button B8 = new JoystickButton(stick, 8);
	
	
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    public OI(){
    	//B1.whenPressed(new Onwards()); // multicommands can be put in a command extending command groups 
    	                               // to run mutliple commands from a single button press
    }
    public double getXValue(){
    	return stick.getX();
    
    }
    public double getYValue(){
    	return stick.getY();
    
    }
    public double getZValue(){
    	return stick.getTwist();
    
    }
	
	
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

