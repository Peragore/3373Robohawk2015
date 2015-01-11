
package org.usfirst.frc.team3373.robot;


import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;


public class Robot extends SampleRobot {
	
	SuperJoystick stick1 = new SuperJoystick(0);
	SuperJoystick stick2 = new SuperJoystick(1);
    
	Talon motor1 = new Talon(0);
	Talon motor2 = new Talon(1);
	
	AnalogInput pot = new AnalogInput(0);
	
	DigitalInput limitSwitch = new DigitalInput(1);
	
	Relay motor3 = new Relay(0);
	Relay motor4 = new Relay(1);
	
	
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
    	
    	
    	boolean isRunning = false;
    	
    	while (isOperatorControl() && isEnabled()) {
        	
        	if(limitSwitch.get()){
        		isRunning = !isRunning; //Toggles between on and off modes if you hit limit switch
        	}
        	if(!isRunning){
        		motor1.set(0);
        		motor2.set(0);
        		motor3.set(Relay.Value.kOff);
        		motor4.set(Relay.Value.kOff);
        	}
        	
        	if(isRunning){
        		
        		if(stick1.isAHeld()){
        			motor1.set(0.75);
        		} else{
        			motor1.set(0);
        		}
        		
        		if(stick1.isBHeld()){
        			motor2.set(-0.75);
        		} else{
        			motor2.set(0);
        		}
        	
        		if(pot.getVoltage() >= 2){
        			motor3.set(Relay.Value.kForward);
        			motor4.set(Relay.Value.kForward);
        		} else{
            		motor3.set(Relay.Value.kOff);
            		motor4.set(Relay.Value.kOff);        			
        		}
        	
        	
        	}
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
