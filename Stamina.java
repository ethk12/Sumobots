package frc.robot;

import edu.wpi.first.wpilibj.Timer;

public class Stamina {

     // Parameters of the Stamina System.
     private double max_stamina; // Maximum amount of stamina
     private double stamina;     // Current amount of stamina
     private double depletion;   // How much stamina is consumed per second
     private double recovery;    // How much stamina is restored per second while resting
     private double rest;        // How many seconds of rest until stamina begins to be recovered

     /*
      * Constructor
      * max_stam -> Maximum amount of stamina
      * depl     -> How much stamina is consumed per second
      * recov    -> How much stamina is restored per second
      * rtime    -> How long it takes for stamina to start recovering
     */
     public Stamina(double max_stam, double depl, double recov, double rtime) {
          max_stamina = max_stam;
          stamina = max_stam;
          depletion = depl;
          recovery = recov;
          rest = rtime;
     }

     
}