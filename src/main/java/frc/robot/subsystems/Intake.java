/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class Intake extends Subsystem {
  VictorSPX armIntakeMotor = null;
  VictorSPX lowerIntakeMotor = null;

  public Intake() {
    armIntakeMotor = new VictorSPX(RobotMap.armIntakeMotor);
    lowerIntakeMotor = new VictorSPX(RobotMap.intakeRollerMotor);
  }

  public void set(double speed) {
    armIntakeMotor.set(ControlMode.PercentOutput, speed);
  }

  public void intake() {
    double intakeSpeed = 0.7;
    set(-intakeSpeed);
    double lowerIntakeSpeed = 0.5;
    lowerIntakeMotor.set(ControlMode.PercentOutput, -intakeSpeed);
  }

  public void expel() {
    double expelSpeed = 0.8;
    set(expelSpeed);
    double lowerExpelSpeed = 0.5;
    lowerIntakeMotor.set(ControlMode.PercentOutput, expelSpeed);
  }

  public void stop() {
    set(0.0);
    lowerIntakeMotor.set(ControlMode.PercentOutput, 0.0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new SetArmIntake());
  }
}
