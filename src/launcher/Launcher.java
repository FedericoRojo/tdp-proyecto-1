package launcher;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	Student alumno = new Student( 136205, "Rojo", "Federico", "federojo10@gmail.com", "https://github.com/FedericoRojo", "/images/Screenshot_1.png");
            public void run() {
            	SimplePresentationScreen s = new SimplePresentationScreen(alumno);
            	s.setVisible(true);
            }
        });
    }
}
