/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4277.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
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
    
}
