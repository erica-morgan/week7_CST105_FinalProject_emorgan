package draftProject;

/**
 * Program: NFL Draft Project
 * File: NFL_Draft_Main.java
 * Summary: This is my final project program (Main Class).
 * Author: Erica Morgan
 * Date: 3/30/2018 (revised)
 */

public class Driver {
	//add main method and test constructors, getters, and setters.
	public static void main(String[] args) {
		
		OffensivePlayer player = new OffensivePlayer();
		player.setName("Tom Brady");
		System.out.println("Testing: " + player.getName());
					
		DefensivePlayer kbyard = new DefensivePlayer("Kevin Byard", "S", 24, 1.8034, 96.1616, "Middle Tennessee", 2016, 3, "Lithonia, GA", "Tennessee Titans", 145, 0, 8);
		kbyard.setAge(25);
					
		System.out.println("Testing: " + kbyard.getName() + " is not " + kbyard.getAge() + " years old, but his bmi is " + kbyard.getBmi() + ".");
						
	}
	

}
