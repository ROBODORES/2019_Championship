/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;

public class LevelThree extends CommandGroup {
  public LevelThree() {
    requires(Robot.m_intakeArm);
    requires(Robot.m_arm);

    addSequential(new SetArm(SetArm.LevelThreeHeight));
    addSequential(new SetIntakeArm(SetIntakeArm.stowedAway));
  }
}
