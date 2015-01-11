
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
    
	//Axes
    int LX = 1;
    int LY = 2;
    int triggers = 3;
    int RX = 4;
    int RY = 5;
    int DP = 6;
	
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
        	talon1.set(stick1.getRawAxis(LX));
        	
        	try {
				Thread.sleep(10L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

    /**
     * Runs during test mode
     */
    public void test() {
    	
    }
}
