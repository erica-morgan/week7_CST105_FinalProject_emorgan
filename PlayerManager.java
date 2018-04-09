package draftProject;

/**
 * Program: NFL Draft Project
 * File: PlayerManager.java
 * Summary: This is my final project program (PlayerManager class).
 * Author: Erica Morgan
 * Date: 3/30/2018 (revised)
 */
import java.util.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PlayerManager extends Application { // Begin PlayerManager class

	Stage roster = new Stage(); // create roster stage

	// Create NFLPlayer ArrayList
	private static ArrayList<NFLPlayer> PLAYER_LIST = new ArrayList<NFLPlayer>();

	// Create search text field
	public TextField searchField = new TextField();

	@Override // Start application
	public void start(Stage primaryStage) {
		createPlayers();
		roster.setTitle("NFL Draft");
		showRoster();
	}

	// Show Roster Page
	public void showRoster() {
		BorderPane pane = new BorderPane();
		pane.setTop(getLogo(), getRoster(), getSearchBar());
		GridPane center = new GridPane();
		center.setPadding(new Insets(10, 10, 10, 10));
		roster.setScene(new Scene(pane, 750, 600));
		roster.show();
	}

	// Show Defense Menu
	private void showDefense() {
		BorderPane pane = new BorderPane();
		pane.setTop(getLogo(), getRoster(), getSearchBar());

		VBox VBox = new VBox(20);
		VBox.setPadding(new Insets(10, 10, 10, 10));
		//allow user to select player for open position
		Button AvailableOff = new Button("All Positions Available");
		AvailableOff.setId("allOff");
		AvailableOff.setMaxWidth(Double.MAX_VALUE);
		AvailableOff.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());
		//back button
		Button Back = new Button();
		Back.setText("Previous Page");
		Back.setId("back to roster");
		Back.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());
		//buttons for each position
		Button LB = new Button("LB");
		LB.setId("LB");
		LB.setMaxWidth(Double.MAX_VALUE);
		LB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());

		Button CB = new Button("CB");
		CB.setId("CB");
		CB.setMaxWidth(Double.MAX_VALUE);
		CB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());

		Button S = new Button("S");
		S.setId("S");
		S.setMaxWidth(Double.MAX_VALUE);
		S.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());

		HBox DefensePosition = new HBox();
		DefensePosition.setSpacing(100);
		DefensePosition.setPadding(new Insets(5, 5, 5, 5));
		// add defense nodes to scene
		DefensePosition.getChildren().addAll(AvailableOff, LB, CB, S);

		VBox.getChildren().addAdd(Back, getSearchBar(), new Label("Select"), defenseType);
		pane.setCenter(VBox);
		roster.setScene(new Scene(pane, 750, 600));
		roster.show();
	}

	// Defensive Players
	private void listDefensivePlayers(String selection) {
		BorderPane pane = new BorderPane();
		pane.setTop(getLogo());
		
		VBox VBox = new VBox();
		VBox.setPadding(new Insets(10,5,5,5));
		
		Button back = new Button();
		back.setText("Back to Defensive Players");
		back.setId("Back to Defensive Players");
		back.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());
		
		GridPane playerList = new GridPane();
		playerList.setAlignment(Pos.TOP_LEFT);
		playerList.setPadding(new Insets(5,5,5,5));
		int i = 1;
		
		playerList.add(new Label("Name"), 0,0);
		playerList.add(new Label("Position"),1,0);
		playerList.add(new Label("Age"),2,0);
		playerList.add(new Label("Height"),3,0);
		playerList.add(new Label("Weight"),4,0);
		playerList.add(new Label("BMI"),5,0);
		playerList.add(new Label("College"),6,0);
		playerList.add(new Label("Starting Age"),7,0);
		playerList.add(new Label("Start Year"),8,0);
		playerList.add(new Label("Experience"),9,0);
		playerList.add(new Label("Home Town"),10,0);
		playerList.add(new Label("Team"),11,0);
		playerList.add(new Label("Combined Tackels"),12,0);
		playerList.add(new Label("Forced Fumbles"),13,0);
		playerList.add(new Label("Interceptions Thrown"),14,0);
		
		if (selection == "allDefensivePlayers") {
			for (DefensivePlayer object: defensivePlayers) {
				if(object.getStatus() == "available") {
					Label name = new Label(object.getName());
					Label position = new Label(object.getPosition());
					Label age = new Label(object.getAge());
					Label height = new Label(object.getHeight());
					Label weight = new Label(object.getWeight());
					Label bmi = new Label(object.getBmi());
					Label college = new Label(object.getCollege());
					Label startingAge = new Label(object.getStartingAge());
					Label startYear = new Label(object.getStartYear());
					Label experience = new Label(object.getExperience());
					Label homeTown = new Label(object.getHomeTown());
					Label team = new Label(object.getTeam());
					Label combinedTackles = new Label(object.getCombinedTackles()();
					Label forcedFumbles = new Label(object.getForcedFumbles()();
					Label interceptionsThrown = new Label(object.getInterceptionsThrown()();
					
					Button select = new Button()
					select.setText("Add to Roster");
					select.setId("selectDefensive" + object.getName());
					select.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());
					
					playerList.add(name, 0, i);
					playerList.add(position, 1, i);
					playerList.add(age, 2, i);
					playerList.add(height, 3, i);
					playerList.add(weight, 4, i);
					playerList.add(bmi, 5, i);
					playerList.add(college, 6, i);
					playerList.add(startingAge, 7, i);
					playerList.add(startYear, 8, i);
					playerList.add(experience, 9, i);
					playerList.add(homeTown, 10, i);
					playerList.add(team, 11, i);
					playerList.add(combinedTackles, 12, i);
					playerList.add(forcedFumbles, 13, i);
					playerList.add(interceptionsThrown, 14, i);
					i++;
				}
			}
		}
		else {
			for (DefensivePlayer object: defensivePlayers) {
				if(object.getStatus() == "available" && object.getPosition() == selection) {
					Label name = new Label(object.getName());
					Label position = new Label(object.getPosition());
					Label age = new Label(object.getAge());
					Label height = new Label(object.getHeight());
					Label weight = new Label(object.getWeight());
					Label bmi = new Label(object.getBmi());
					Label college = new Label(object.getCollege());
					Label startingAge = new Label(object.getStartingAge());
					Label startYear = new Label(object.getStartYear());
					Label experience = new Label(object.getExperience());
					Label homeTown = new Label(object.getHomeTown());
					Label team = new Label(object.getTeam());
					Label combinedTackles = new Label(object.getCombinedTackles()();
					Label forcedFumbles = new Label(object.getForcedFumbles()();
					Label interceptionsThrown = new Label(object.getInterceptionsThrown()();
					
					Button select = new Button()
					select.setText("Add to Roster");
					select.setId("selectDefensive" + object.getPosition() + " " + object.getName());
					select.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());
					
					playerList.add(name, 0, i);
					playerList.add(position, 1, i);
					playerList.add(age, 2, i);
					playerList.add(height, 3, i);
					playerList.add(weight, 4, i);
					playerList.add(bmi, 5, i);
					playerList.add(college, 6, i);
					playerList.add(startingAge, 7, i);
					playerList.add(startYear, 8, i);
					playerList.add(experience, 9, i);
					playerList.add(homeTown, 10, i);
					playerList.add(team, 11, i);
					playerList.add(combinedTackles, 12, i);
					playerList.add(forcedFumbles, 13, i);
					playerList.add(interceptionsThrown, 14, i);
					i++;
					}
				}
			}
		}
				VBox.getChildren().addAll(Back, getSearchBar(), list);
				pane.setCenter(VBox);
				
				ScrollPane scrollBar = new ScrollPane(pane);
				scrollBar .setFitToWidth(true);
				
				roster.setScene(new Scene(scrollBar,700,600));
				roster.show();
				
				
				//Show Offense Menu
	private void showOffense() {
		BorderPane pane = new BorderPane();
		pane.setTop(getLogo(), getRoster(), getSearchBar());

		VBox VBox = new VBox(20);
		VBox.setPadding(new Insets(10, 10, 10, 10));

		Button AvailableOff = new Button("All Positions Available");
		AvailableOff.setId("allOff");
		AvailableOff.setMaxWidth(Double.MAX_VALUE);
		AvailableOff.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());

		Button Back = new Button();
		Back.setText("Previous Page");
		Back.setId("back to roster");
		Back.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());

		Button QB = new Button("QB");
		QB.setId("QB");
		QB.setMaxWidth(Double.MAX_VALUE);
		QB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());

		Button RB = new Button("RB");
		RB.setId("RB");
		RB.setMaxWidth(Double.MAX_VALUE);
		RB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());

		Button WR = new Button("WR");
		WR.setId("WR");
		WR.setMaxWidth(Double.MAX_VALUE);
		WR.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());

		HBox OffensePosition = new HBox();
		OffensePosition.setSpacing(100);
		OffensePosition.setPadding(new Insets(5, 5, 5, 5));
		// add offense nodes to scene
		OffensePosition.getChildren().addAll(AvailableOff, QB, RB, WR);

		VBox.getChildren().addAdd(Back, getSearchBar(), new Label("Select"), offenseType);
		pane.setCenter(VBox);
		roster.setScene(new Scene(pane, 750, 600));
		roster.show();
	}

	// Offensive Players
	private void listOffensivePlayers(String selection) {
					BorderPane pane = new BorderPane();
					pane.setTop(getLogo());
					
					VBox VBox = new VBox();
					VBox.setPadding(new Insets(10,5,5,5));
					
					Button back = new Button();
					back.setText("Back to Offensive Players");
					back.setId("Back to Offensive Players");
					back.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler());
					
					GridPane playerList = new GridPane();
					playerList.setAlignment(Pos.TOP_LEFT);
					playerList.setPadding(new Insets(5,5,5,5));
					int i = 1;
					
					playerList.add(new Label("Name"), 0,0);
					playerList.add(new Label("Position"),1,0);
					playerList.add(new Label("Age"),2,0);
					playerList.add(new Label("Height"),3,0);
					playerList.add(new Label("Weight"),4,0);
					playerList.add(new Label("BMI"),5,0);
					playerList.add(new Label("College"),6,0);
					playerList.add(new Label("Starting Age"),7,0);
					playerList.add(new Label("Start Year"),8,0);
					playerList.add(new Label("Experience"),9,0);
					playerList.add(new Label("Home Town"),10,0);
					playerList.add(new Label("Team"),11,0);
					playerList.add(new Label("Passing Touchdowns"),12,0);
					playerList.add(new Label("Rushing Touchdowns"),13,0);
					playerList.add(new Label("Total Points"),14,0);
					
					if (selection == "allOffensivePlayers") {
						for (DefensivePlayer object: offensivePlayers) {
							if(object.getStatus() == "available") {
								Label name = new Label(object.getName());
								Label position = new Label(object.getPosition());
								Label age = new Label(object.getAge());
								Label height = new Label(object.getHeight());
								Label weight = new Label(object.getWeight());
								Label bmi = new Label(object.getBmi());
								Label college = new Label(object.getCollege());
								Label startingAge = new Label(object.getStartingAge());
								Label startYear = new Label(object.getStartYear());
								Label experience = new Label(object.getExperience());
								Label homeTown = new Label(object.getHomeTown());
								Label team = new Label(object.getTeam());
								Label passingTouchdowns = new Label(object.getPassingTouchdowns());
								Label rushingTouchdowns = new Label(object.getRushingTouchdowns());
								Label totalPoints = new Label(object.getTotalPoints());
								
								Button select = new Button();
								select.setText("Add to Roster");
								select.setId("selectOffensive" + object.getName());
								select.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
								
								playerList.add(name, 0, i);
								playerList.add(position, 1, i);
								playerList.add(age, 2, i);
								playerList.add(height, 3, i);
								playerList.add(weight, 4, i);
								playerList.add(bmi, 5, i);
								playerList.add(college, 6, i);
								playerList.add(startingAge, 7, i);
								playerList.add(startYear, 8, i);
								playerList.add(experience, 9, i);
								playerList.add(homeTown, 10, i);
								playerList.add(team, 11, i);
								playerList.add(passingTouchdowns, 12, i);
								playerList.add(rushingTouchdowns, 13, i);
								playerList.add(totalPoints, 14, i);
								i++;
							}
						}
					}
					else {
						for (OffensivePlayer object: offensivePlayers) {
							if(object.getStatus() == "available" && object.getPosition() == selection) {
								Label name = new Label(object.getName());
								Label position = new Label(object.getPosition());
								Label age = new Label(object.getAge());
								Label height = new Label(object.getHeight());
								Label weight = new Label(object.getWeight());
								Label bmi = new Label(object.getBmi());
								Label college = new Label(object.getCollege());
								Label startingAge = new Label(object.getStartingAge());
								Label startYear = new Label(object.getStartYear());
								Label experience = new Label(object.getExperience());
								Label homeTown = new Label(object.getHomeTown());
								Label team = new Label(object.getTeam());
								Label passingTouchdowns = new Label(object.getPassingTouchdowns()();
								Label rushingTouchdowns = new Label(object.getRushingTouchdowns()();
								Label totalPoints = new Label(object.getTotalPoints()();
								
								Button select = new Button()
								select.setText("Add to Roster");
								select.setId("selectOffensive" + object.getPosition() + " " + object.getName());
								select.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
								
								playerList.add(name, 0, i);
								playerList.add(position, 1, i);
								playerList.add(age, 2, i);
								playerList.add(height, 3, i);
								playerList.add(weight, 4, i);
								playerList.add(bmi, 5, i);
								playerList.add(college, 6, i);
								playerList.add(startingAge, 7, i);
								playerList.add(startYear, 8, i);
								playerList.add(experience, 9, i);
								playerList.add(homeTown, 10, i);
								playerList.add(team, 11, i);
								playerList.add(passingTouchdowns, 12, i);
								playerList.add(rushingTouchdowns, 13, i);
								playerList.add(totalPoints, 14, i);
								i++;
					}
	}
					}

	// Create Search Bar

	// Return to Roster

	//

	// Create PlayerManager method
	public PlayerManager() {
		createPlayers();
	}

	// List of players and statistics and add to ArrayList
	public static void createPlayers() {
		NFLPlayer tbrady = new OffensivePlayer("Tom Brady", "QB", 40, 76, 225, "Michigan", 2000, 19, "San Mateo, CA",
				"New England Patriots", 488, 17, 102);
		NFLPlayer khunt = new OffensivePlayer("Kareem Hunt", "RB", 22, 70, 216, "Toledo", 2017, 2, "Elyria, OH",
				"Kansas City Chiefs", 0, 8, 66);
		NFLPlayer abrown = new OffensivePlayer("Antonio Brown", "WR", 29, 70, 181, "Central Michigan", 2010, 9,
				"Miami, FL", "Pittsburgh Steelers", 1, 0, 392);
		NFLPlayer apeterson = new OffensivePlayer("Adrian Peterson", "RB", 33, 73, 217, "Oklahoma", 2007, 12,
				"Palestine, TX", "Minnesota Vikings", 0, 99, 626);
		NFLPlayer nfoles = new OffensivePlayer("Nick Foles", "QB", 29, 78, 243, "Arizona", 2012, 7, "Austin, TX",
				"Philadelphia Eagles", 61, 5, 30);
		NFLPlayer bbortles = new OffensivePlayer("Blake Bortles", "QB", 25, 77, 236, "UCF", 2014, 5,
				"Altamonte Springs, FL", "Jacksonville Jaguars", 90, 7, 50);
		NFLPlayer ccarson = new OffensivePlayer("Chris Carson", "RB", 23, 71, 218, "Oklahoma State", 2017, 2,
				"Biloxi, MS", "Seattle Seahawks", 0, 0, 6);
		NFLPlayer kallen = new OffensivePlayer("Keenan Allen", "WR", 25, 74, 211, "California", 2013, 6,
				"Greensboro, NC", "Los Angeles Chargers", 0, 0, 138);
		NFLPlayer athielen = new OffensivePlayer("Adam Thielen", "WR", 27, 74, 200, "Minnesota State", 2014, 5,
				"Detroit Lakes, MI", "Minnesota Vikings", 0, 0, 66);

		NFLPlayer pbrown = new DefensivePlayer("Preston Brown", "LB", 25, 73, 251, "Louisville", 2014, 5,
				"Cincinnati, Oh", "Cincinnati Bengals", 512, 2, 3);
		NFLPlayer cjones = new DefensivePlayer("Chandler Jones", "LB", 28, 78, 265, "Syracuse", 2012, 7,
				"Rochester, NY", "Arizona Cardinals", 319, 16, 1);
		NFLPlayer kbyard = new DefensivePlayer("Kevin Byard", "S", 24, 71, 212, "Middle Tennessee", 2016, 3,
				"Lithonia, GA", "Tennessee Titans", 145, 0, 8);
		NFLPlayer jschobert = new DefensivePlayer("Joe Schobert", "LB", 24, 73, 245, "Wisconsin", 2016, 3,
				"Waukesha, WI", "Cleveland Browns", 172, 3, 1);
		NFLPlayer dslay = new DefensivePlayer("Darius Slay", "CB", 27, 72, 190, "Mississippi State", 2013, 6,
				"Brunswick, GA", "Detroit Lions", 258, 1, 14);
		NFLPlayer mpeters = new DefensivePlayer("Marcus Peters", "CB", 25, 72, 197, "Washington", 2015, 4,
				"Oakland, CA", "Los Angeles Rams", 151, 6, 19);
		NFLPlayer abouye = new DefensivePlayer("A.J. Bouye", "CB", 26, 72, 191, "UCF", 2013, 6, "Dallas, TX",
				"Jacksonville Jaguars", 196, 1, 12);
		NFLPlayer eweddle = new DefensivePlayer("Eric Weddle", "S", 33, 71, 200, "Utah", 2007, 12, "Fontana, CA",
				"Baltimore Ravens", 1002, 8, 29);
		NFLPlayer hsmith = new DefensivePlayer("Harrison Smith", "S", 29, 74, 214, "Notre Dame", 2012, 7, "Augusta, GA",
				"Minnesota Vikings", 490, 3, 17);

		PLAYER_LIST.add(tbrady);
		PLAYER_LIST.add(khunt);
		PLAYER_LIST.add(abrown);
		PLAYER_LIST.add(pbrown);
		PLAYER_LIST.add(cjones);
		PLAYER_LIST.add(kbyard);
		PLAYER_LIST.add(apeterson);
		PLAYER_LIST.add(nfoles);
		PLAYER_LIST.add(bbortles);
		PLAYER_LIST.add(ccarson);
		PLAYER_LIST.add(kallen);
		PLAYER_LIST.add(athielen);
		PLAYER_LIST.add(jschobert);
		PLAYER_LIST.add(dslay);
		PLAYER_LIST.add(mpeters);
		PLAYER_LIST.add(abouye);
		PLAYER_LIST.add(eweddle);
		PLAYER_LIST.add(hsmith);

	}

	/*// create toString method
	public String toString() {
		String playerList = "";
		for (NFLPlayer player : PLAYER_LIST)
			playerList += (player.getName() + " " + "\n");
		return playerList;*/
	

					
}
