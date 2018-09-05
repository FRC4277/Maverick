/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4277.robot;

import org.usfirst.frc4277.Maverick.commands.DriveForward;
import org.usfirst.frc4277.Maverick.commands.Intake;
import org.usfirst.frc4277.Maverick.commands.Shoot;
import org.usfirst.frc4277.Maverick.commands.TipDown;
import org.usfirst.frc4277.Maverick.commands.TipUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
    public JoystickButton tipper_up;
    public JoystickButton tipper_down;
    public JoystickButton shoot;
    public JoystickButton intake;
    public Joystick joystick;
    
    public OI() {

        joystick = new Joystick(0);
        
        intake = new JoystickButton(joystick, 2);
        intake.whileHeld(new Intake());
        shoot = new JoystickButton(joystick, 1);
        shoot.whileHeld(new Shoot());
        tipper_down = new JoystickButton(joystick, 4);
        tipper_down.whileHeld(new TipDown());
        tipper_up = new JoystickButton(joystick, 6);
        tipper_up.whileHeld(new TipUp());


        // SmartDashboard Buttons
        SmartDashboard.putData("DriveForward", new DriveForward());
        SmartDashboard.putData("Tip Up", new TipUp());
        SmartDashboard.putData("Tip Down", new TipDown());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("intake", new Intake());

    }
    public Joystick getJoystick() {
        return joystick;
    }
}
