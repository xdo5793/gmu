public class ag1Team {

   public static int MAX_PLAYERS_PER_TEAM =  3;
   public static double MINIMUM_PLAYER_GPA =  2.0;
   public static double MAXIMUM_PLAYER_GPA =  4.0;

   private String name;
   private String email;
   private String[] playerNames; // way to use array as instance variable
   private double[] playerGpas;
   private int numPlayers;

   public ag1Team(String email) {
      if (email == null || email.equals("")) {
         throw new IllegalArgumentException("Must provide email");
      }
      
      this.playerNames = new String[MAX_PLAYERS_PER_TEAM]; // must instantiate in order to get/set values
      this.playerGpas = new double[MAX_PLAYERS_PER_TEAM];  // must instantiate in order to get/set values
      this.email = email;
   
   }
   
   public String getName() {
      return this.name;}
   public String getEmail() {
      return this.email;}
   
   //***
   // accessor methods for name value from IMP - one player , NOT an array
   // only interfaces by setAplayer > getplayerGpas[] > getplayerGpa
   public String getPlayerName(int index) {
   
      if (index < 0 || index >= this.getNumPlayers()) {
         throw new IllegalArgumentException("Player name does not exist at specified index");
      }
      return this.playerNames[index];
   
   }
   
   //***
   // accessor for GPA value from IMP - one player, NOT an array
   // only interfaces by setAplayer > getplayerGpas[] > getplayerGpa
   public double getPlayerGpa(int index) {
   
      if (index < 0 || index >= this.getNumPlayers()) {
         throw new IllegalArgumentException("Player GPA does not exist at specified index");
      }
      return this.playerGpas[index];
   
   }
   
   public int getNumPlayers() {
      return this.numPlayers;}
   
   //***
   // accessor for array of names from IMP - all players
   // only interfaces by setAplayer > getplayerGpas[] > getplayerGpa
   public String[] getPlayerNames() {
      String[] tempArray = new String[MAX_PLAYERS_PER_TEAM];
   
      for (int x = 0; x < this.getNumPlayers() ; x++) {
         tempArray[x] = this.getPlayerName(x); // temp array set to INDEX of playerNames array
      }
   
      return tempArray;
   }
   
   //***
   // accessor for array of GPAS from IMP - all players
   // only interfaces by setAplayer > getplayerGpas[] > getplayerGpa
   public double[] getPlayerGpas() {
      double[] tempArray = new double[MAX_PLAYERS_PER_TEAM];
   
      for (int x = 0; x < this.getNumPlayers() ; x++) {
         tempArray[x] = this.getPlayerGpa(x); // temp array set to INDEX of playerNames array
      }
   
      return tempArray;
   }
   
   public void setName(String name) {
      if (name == null || name.equals("")) {
         throw new IllegalArgumentException("Must provide team name");
      }
      this.name = name;
   }
   
   public void setEmail(String email) {
      if (email == null || email.equals("")) {
         throw new IllegalArgumentException("Must provide team name");
      }
      this.email = email;
   }
   
   
   // On line 70, a mutator is created to set an individual player. 
   // creates a funnel for eligible values to be placed into the arrays
   public void setAPlayer(String name, double gpa) {
   
      if(this.numPlayers >= MAX_PLAYERS_PER_TEAM) {
         throw new IllegalArgumentException("Limit of players has been reached");
      }
      if(name == null || name.equals("")) {
         throw new IllegalArgumentException("Player name is required");
      }
      if (gpa < MINIMUM_PLAYER_GPA || gpa > MAXIMUM_PLAYER_GPA) {
         throw new IllegalArgumentException("Player GPA must be within guidelines");
      }
   
      this.playerNames[numPlayers] = name;
      this.playerGpas[numPlayers++] = gpa;
   
   }
   
   
   // Lastly, the toString method is created. In this case, the team name, contact email, and all player details are included 
   //as a way to return a String representation of what a BasketballTeam looks like.

   
   public String toString() {
      String output = "Team: " + this.getName() + "\n";
      output+= "Contact: " + this.getEmail() + "\n";
   
      if (this.getNumPlayers() > 0) {
         output += "Players: \n";
         for(int x = 0 ; x < this.getNumPlayers() ; x++) {
            output += this.getPlayerName(x) + "\n";
         }
      
      
      } else {
         output += "No players entered";
      }
   
      return output;
   }
         
   
   
   


}