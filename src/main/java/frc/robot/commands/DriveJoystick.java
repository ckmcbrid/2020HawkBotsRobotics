package frc.robot.commands;

import frc.robot.subsystems.DriveBase;
import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveJoystick extends CommandBase {
    
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final DriveBase driveBase;
    private final DoubleSupplier driveForward;
    private final DoubleSupplier driveRotate;
    
    public DriveJoystick(DriveBase subsystem, DoubleSupplier forward, DoubleSupplier rotation) {
        driveBase = subsystem;
        driveForward = forward;
        driveRotate = rotation;
        addRequirements(subsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        driveBase.arcadeDrive(driveForward.getAsDouble(), driveRotate.getAsDouble());
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}