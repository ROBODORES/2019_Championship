/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SetIntake extends Command {
  public static int stop = 0;
  public static int intake = 1;
  public static int outtake = 2;
  public static int shuttle = 3;

  int state;

  public SetIntake(int state) {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_intake);
    requires(Robot.m_hatchGrabber);

    this.state = state;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.m_intake.stop();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    switch(state) {
      case 0:
      setoStop();
      break;
      case 1:
      setoIntake();
      break;
      case 2:
      setoOuttake();
      break;
      case 3:
      ballShuttle();
      break;
    }
  }

  void setoStop() {
    boolean hatchMode = Robot.m_oi.toggleSwitch.getRawButton(1);
    if (hatchMode) {
      Robot.m_intake.stop();
    } else {
      Robot.m_intake.stop();
      Robot.m_hatchGrabber.set(Robot.m_hatchGrabber.in);
    }
  }

  void setoIntake() {
    boolean hatchMode = Robot.m_oi.toggleSwitch.getRawButton(1);
    if (hatchMode) {
      Robot.m_intake.stop();
      Robot.m_hatchGrabber.set(Robot.m_hatchGrabber.out);
    } else {
      Robot.m_intake.intake();
      Robot.m_hatchGrabber.set(Robot.m_hatchGrabber.in);
    }
  }

  void setoOuttake() {
    boolean hatchMode = Robot.m_oi.toggleSwitch.getRawButton(1);
    if (hatchMode) {
      Robot.m_intake.stop();
      Robot.m_hatchGrabber.set(Robot.m_hatchGrabber.in);
    } else {
      Robot.m_intake.expel();
      Robot.m_hatchGrabber.set(Robot.m_hatchGrabber.in);
    }
  }

  void ballShuttle(){
    Robot.m_intake.expel();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_intake.stop();
    //Robot.m_hatchGrabber.set(false);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
