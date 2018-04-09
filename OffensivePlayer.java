package draftProject;

/**
 * Program: NFL Draft Project
 * File: OffensivePlayer.java
 * Summary: This is my final project program (OffensivePlayer class).
 * Author: Erica Morgan
 * Date: 1/1/2018 
 */
//begin OffensivePlayer subclass
public class OffensivePlayer extends NFLPlayer {
	//declare offensive player variables
	private int passingTouchdowns;
	private int rushingTouchdowns;
	private int totalPoints;
	
	public OffensivePlayer() {
	}
	//constructor with variables
	public OffensivePlayer(String nameIn, String positionIn, int ageIn, double heightIn, double weightIn, 
			String collegeIn, int yearStartedIn, int experienceIn, String homeTownIn, String currentTeamIn, 
			int passingTouchdownsIn, int rushingTouchdownsIn, int totalPointsIn) {
		//inherit abstract class variables
		super(nameIn, positionIn, ageIn, heightIn, weightIn, collegeIn, yearStartedIn, experienceIn, homeTownIn, currentTeamIn);
		//assign values to private variables
		passingTouchdowns = passingTouchdownsIn;
		rushingTouchdowns = rushingTouchdownsIn;
		totalPoints = totalPointsIn;
	}
	//get and set methods for new variables
	public void setPassingTouchdowns(int passingTouchdownsIn) {
		this.passingTouchdowns = passingTouchdownsIn;
	}
	public int getPassingTouchdowns() {
		return this.passingTouchdowns;
	}
	public void setRushingTouchdowns(int rushingTouchdownsIn) {
		this.rushingTouchdowns = rushingTouchdownsIn;
	}
	public int getRushingTouchdowns() {
		return this.rushingTouchdowns;
	}
	public void setTotalPoints(int totalPointsIn) {
		this.totalPoints = totalPointsIn;
	}
	public int getTotalPoints() {
		return this.totalPoints;
	}

}
