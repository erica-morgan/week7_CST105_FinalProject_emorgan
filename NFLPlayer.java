package draftProject;
/**
 * Program: NFL Draft Project
 * File: NFLPlayer.java
 * Summary: This is my final project program (NFLPlayer class).
 * Author: Erica Morgan
 * Date: 3/30/2018 (revised)
 */

//begin player class
//**Update** change to abstract class
public abstract class NFLPlayer {
//declare global instance variables
	private String name;
	private String position;
	private int age;
	private double height;
	private double weight; 
	private String college;
	private int yearStarted;
	private int experience;
	private String homeTown;
	private String currentTeam;
	
	
	//empty constructor
	public NFLPlayer () { }
	//player constructor that accepts all parameters
	public String toString() {
		String NFLPlayer = "";
		for (NFLPlayer player : playerList)
			playerList += (player.getName() + " " + "\n");
		return playerList;
	}
	public NFLPlayer (String nameIn, String positionIn, int ageIn, double heightIn, double weightIn, 
					String collegeIn, int yearStartedIn, int experienceIn, String homeTownIn, String currentTeamIn) {
		//assign the value of _In to the _class instance variable
		name = nameIn;
		position = positionIn;
		age = ageIn;
		height = heightIn;
		weight = weightIn;
		college = collegeIn;
		yearStarted = yearStartedIn;
		experience = experienceIn;
		homeTown = homeTownIn;
		currentTeam = currentTeamIn;
	}
	//getters and setters for all parameters
	
			
		
		public void setName(String nameIn) {
			this.name = nameIn;
		}
		public String getName() {
			return this.name;
		}
		public void setPosition (String positionIn) {
			this.position = positionIn;
		}
		public String getPosition() {
			return this.position; 
		}
		public void setAge(int ageIn) {
			this.age = ageIn;
		}
		public int getAge() {
			return this.age;
		}
		public void setHeight(double heightIn) {
			this.height = heightIn;
		}
		public double getHeight() {
			return this.height;
		}
		public void setWeight(double weightIn) {
			this.weight = weightIn;
		}
		public double getWeight() {
			return this.weight;
		}
		public double getBmi() {
			return ((weight *703)/(height * height));
		}
		public void setCollege(String collegeIn) {
			this.college = collegeIn;
		}
		public String getCollege() {
			return this.college;
		}
		public void setYearStarted (int yearStartedIn) {
			this.yearStarted = yearStartedIn;
		}
		public int getYearStarted () {
			return this.yearStarted;
		}
		public int getAgeStarted () {
			return (age - experience);
		}
		public void setExperience(int experienceIn) {
			this.experience = experienceIn;
		}
		public int getExperience() {
			return this.experience;
		}
		public void setHomeTown(String homeTownIn) {
			this.homeTown = homeTownIn;
		}
		public String getHomeTown() {
			return this.homeTown;
		}
		public void setCurrentTeam(String currentTeamIn) {
			this.currentTeam = currentTeamIn;
		}
		public String getCurrentTeam() {
			return this.currentTeam;
		}
}

