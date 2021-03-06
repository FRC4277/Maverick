// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4277.Maverick;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController tippertip;
    public static SpeedController shooterleft_shooter;
    public static SpeedController shooterright_shooter;
    public static SpeedController driveTrainfront_right_motor;
    public static SpeedController driveTrainback_right_motor;
    public static SpeedControllerGroup driveTrainSpeedControllerGroupright;
    public static SpeedController driveTrainfront_left_motor;
    public static SpeedController driveTrainback_left_motor;
    public static SpeedControllerGroup driveTrainSpeedControllerGroupleft;
    public static DifferentialDrive driveTrainDifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        tippertip = new Talon(4);
        LiveWindow.addActuator("Tipper", "tip", (Talon) tippertip);
        tippertip.setInverted(false);
        shooterleft_shooter = new Talon(5);
        LiveWindow.addActuator("Shooter", "left_shooter", (Talon) shooterleft_shooter);
        shooterleft_shooter.setInverted(false);
        shooterright_shooter = new Spark(6);
        LiveWindow.addActuator("Shooter", "right_shooter", (Spark) shooterright_shooter);
        shooterright_shooter.setInverted(false);
        driveTrainfront_right_motor = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "front_right_motor", (Talon) driveTrainfront_right_motor);
        driveTrainfront_right_motor.setInverted(false);
        driveTrainback_right_motor = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "back_right_motor", (Talon) driveTrainback_right_motor);
        driveTrainback_right_motor.setInverted(false);
        driveTrainSpeedControllerGroupright = new SpeedControllerGroup(driveTrainfront_right_motor, driveTrainback_right_motor  , driveTrainback_right_motor);
        LiveWindow.addActuator("DriveTrain", "Speed Controller Group right", driveTrainSpeedControllerGroupright);
        
        driveTrainfront_left_motor = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "front_left_motor", (Talon) driveTrainfront_left_motor);
        driveTrainfront_left_motor.setInverted(false);
        driveTrainback_left_motor = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "back_left_motor", (Talon) driveTrainback_left_motor);
        driveTrainback_left_motor.setInverted(false);
        driveTrainSpeedControllerGroupleft = new SpeedControllerGroup(driveTrainfront_left_motor, driveTrainback_left_motor  );
        LiveWindow.addActuator("DriveTrain", "Speed Controller Group left", driveTrainSpeedControllerGroupleft);
        
        driveTrainDifferentialDrive = new DifferentialDrive(driveTrainSpeedControllerGroupleft, driveTrainSpeedControllerGroupright);
        LiveWindow.addActuator("DriveTrain", "Differential Drive", driveTrainDifferentialDrive);
        driveTrainDifferentialDrive.setSafetyEnabled(true);
        driveTrainDifferentialDrive.setExpiration(0.1);
        driveTrainDifferentialDrive.setMaxOutput(1.0);


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
