package draftProject;

/**
 * Program: NFL Draft Project
 * File: DefensivePlayer.java
 * Summary: This is my final project program (DefensivePlayer class).
 * Author: Erica Morgan
 * Date: 1/1/2018 
 */
//begin DefensivePlayer subclass
public class DefensivePlayer extends NFLPlayer {
	//declare defensive player variables
	private int combinedTackles;
	private int forcedFumbles;
	private int interceptionsThrown;
	
	public DefensivePlayer() {
	}
	//player constructor with variables
	public DefensivePlayer(String nameIn, String positionIn, int ageIn, double heightIn, double weightIn, 
			String collegeIn, int yearStartedIn, int experienceIn, String homeTownIn, String currentTeamIn, 
			int combinedTacklesIn, int forcedFumblesIn, int interceptionsThrownIn) {
		//inherit abstract class variables
		super(nameIn, positionIn, ageIn, heightIn, weightIn, collegeIn, yearStartedIn, experienceIn, homeTownIn, currentTeamIn);
		//assign values to private variables
		combinedTackles = combinedTacklesIn;
		forcedFumbles = forcedFumblesIn;
		interceptionsThrown = interceptionsThrownIn;
	}
		//get and set methods for new variables
	public void setCombinedTackles(int combinedTacklesIn) {
		this.combinedTackles = combinedTacklesIn;
	}
	public int getCombinedTackles() {
		return this.combinedTackles;
	}
	public void setForcedFumbles(int forcedFumblesIn) {
		this.forcedFumbles = forcedFumblesIn;
	}
	public int getForcedFumbles() {
		return this.forcedFumbles;
	}
	public void setInterceptionsThrown(int interceptionsThrownIn) {
		this.interceptionsThrown = interceptionsThrownIn;
	}
	public int getInterceptionsThrown() {
		return this.interceptionsThrown;
	}

}
