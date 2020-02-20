
package frc.robot.commands;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ScissorLift;

public class ArticulateScissorLift extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    
    private final ScissorLift scissorSubsystem;
    private final DoubleSupplier moveDown;
    private final DoubleSupplier moveUp;

   /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ArticulateScissorLift(ScissorLift subsystem, DoubleSupplier down, DoubleSupplier up) {
    scissorSubsystem = subsystem;
    moveDown = down;
    moveUp = up;
    addRequirements(subsystem);
  }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
      if (moveUp.getAsDouble() > 0) {
        scissorSubsystem.moveUp();

      } else if (moveDown.getAsDouble() > 0) {
          scissorSubsystem.moveDown();
      } 
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