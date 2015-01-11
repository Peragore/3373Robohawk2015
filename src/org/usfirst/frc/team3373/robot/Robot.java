
package org.usfirst.frc.team3373.robot;


import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;


public class Robot extends SampleRobot {
	Talon talon1 = new Talon(1);
	SuperJoystick stick1 = new SuperJoystick(0);
	SuperJoystick stick2 = new SuperJoystick(1);
    
	public Robot() {

    } 

    /**
     * Drive left & right motors for 2 seconds then stop
     */
    public void autonomous() {

    }

    /**
     * Runs the motors with arcade steering.
     */
    public void operatorControl() {
        while (isOperatorControl() && isEnabled()) {
        	
        }
    }

    /**
     * Runs during test mode
     */
    public void test() {
    	
    }
}
