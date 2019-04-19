/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
public class RobotMap {

  // Joysticks
  public static final int leftStickPort = 0;
  public static final int rightStickPort = 1;
  public static final int sideStickPort = 2;
  public static final int toggleSwitchPort = 3;

  public static final int gearSwitcherButton = 5;

  //SparkMaxs
  public static final int leftMotor = 1;
  public static final int leftMotorFollower = 3;
  public static final int rightMotor = 0;
  public static final int rightMotorFollower = 2;

  //VictorSPXs
  public static final int armMotor = 10;
  public static final int wristMotor = 9;
  public static final int armIntakeMotor = 11;
  public static final int liftMotor = 6;
  public static final int intakeArmMotor = 8;
  public static final int intakeRollerMotor = 7;
  public static final int armMotorFollower = 12;
  public static final int intakeArmMotorFollower = 13;
  public static final int wristMotorFollower = 14;

  //Encoder Ports
  public static final int armSourceA = 0;
  public static final int armSourceB = 1;
  public static final int intakeSourceA = 3;
  public static final int intakeSourceB = 4;

  //Limit Switches
  public static final int intakeHallEffect = 2;
  public static final int liftHallEffect = 9;

  //Solenoids
  public static final int hatchSolenoid = 0;
  public static final int gearSwitcher = 3;

  public static final int pcm_id = 4;

  //LEDs
  public static final int blinkinPort = 9;
}
