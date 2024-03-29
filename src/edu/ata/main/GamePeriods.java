/*
 * Team 4334 - Alberta Tech Alliance - FRC Robot Code
 * 2012-2013 Season
 *
 * This code is intended for use for Team 4334, and should not be distributed to
 * other FRC teams without full consent from the proper team authorities. To learn
 * more about the programming team, rules, conventions or any other information about
 * our code, please contact Joel (joelgallant236@gmail.com).
 *
 * This code is hosted on github on https://github.com/joelg236/4334
 *
 * Before making changes, adding files or doing anything on git, please ensure that
 * you are authorized to do so, and know what you are doing.
 *
 * If you would like to use a piece of code in this project, please ask us first,
 * through chief delphi (joelg236) or email (joelgallant236@gmail.com).
 *
 * "It should be noted that no ethically-trained software engineer would ever
 * consent to write a DestroyBaghdad procedure. Basic professional ethics would
 * instead require him to write a DestroyCity procedure, to which Baghdad could
 * be given as a parameter." - Nathaniel Borenstein
 *
 * Please write code properly, and have fun doing so!
 *
 * The liscense for the code is available at robot-code/license.txt
 */
package edu.ata.main;

import edu.ata.automation.driving.robot.Robot;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * This is the 'main' class of the robot code. All instructions are rooted to
 * this class. The VM will automatically instantiate and call the methods within
 * this class. Please ensure not to create alternate constructors of this class,
 * as the WPIlibj uses the default public (no arguments) constructor by
 * convention.
 *
 * <p> <b> The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. </b>
 *
 * <p> If you change the name of this class or the package after creating this
 * project, you must also update the manifest file in the resource directory.
 */
public final class GamePeriods extends IterativeRobot {

    private final Robot robot;

    /**
     * Creates the object. <i> Should only be used by the VM.</i> The
     * {@link GamePeriods} object is automatically instantiated by the class
     * loader. It assumes a public constructor with no arguments.
     */
    public GamePeriods() {
        this(Robot.getDefaultRobot());
    }

    /**
     * For testing purposes. Can run a robot that is passed from the
     * constructor.
     *
     * @param robot robot to use
     */
    public GamePeriods(Robot robot) {
        super();
        this.robot = robot;
    }

    /**
     * Method called when the robot is first started.
     */
    public void robotInit() {
        this.robot.init();
    }

    /**
     * Method that is run once before disabled period starts.
     *
     * <p> Should not be necessary, but exists just in case. (Possible use -
     * displaying data from the robot)
     */
    public void disabledInit() {
        robot.disabled();
    }

    /**
     * Method that is run once before autonomous period starts.
     *
     * <p> Should be used to start autonomous mode. Is only run once when
     * autonomous is started.
     */
    public void autonomousInit() {
        robot.autonomous();
    }

    /**
     * Method that is run once teleoperated disabled period starts.
     *
     * <p> Should be used to start teleoperated mode. Is only run once when
     * teleop is started.
     */
    public void teleopInit() {
        robot.teleop();
    }
}
