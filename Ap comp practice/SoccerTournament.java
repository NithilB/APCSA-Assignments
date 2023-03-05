public class SoccerTournament{
  public static void main (String [] args){

    SoccerTeam team1 = new SoccerTeam();
    SoccerTeam team2 = new SoccerTeam();
    SoccerTeam team3 = new SoccerTeam();
    SoccerTeam team4 = new SoccerTeam();

    SoccerTeam.startTournament();

    team1.played( team2, 2, 1 );
    team1.played( team3, 3, 5 );
    team1.played( team4, 1, 0 );

    team2.played( team3, 2, 5 );
    team2.played( team4, 3, 0 );

    team3.played( team4, 4, 4 );

    System.out.print("There were a total of " + SoccerTeam.getTotalGames() + " games in the tournament, throughout which ");
    System.out.println(SoccerTeam.getTotalGoals() + " goals were scored.\n\n");

    System.out.print("Team 1 finished with " + team1.getWins() + " wins, " + team1.getLosses() + " losses, and ");
    System.out.println(team1.getTies() + " ties, for a total of " + team1.getPoints() + " points.");

    System.out.print("Team 2 finished with " + team2.getWins() + " wins, " + team2.getLosses() + " losses, and ");
    System.out.println(team2.getTies() + " ties, for a total of " + team2.getPoints() + " points.");

    System.out.print("Team 3 finished with " + team3.getWins() + " wins, " + team3.getLosses() + " losses, and ");
    System.out.println(team3.getTies() + " ties, for a total of " + team3.getPoints() + " points.");

    System.out.print("Team 4 finished with " + team4.getWins() + " wins, " + team4.getLosses() + " losses, and ");
    System.out.println(team4.getTies() + " ties, for a total of " + team4.getPoints() + " points.");

    System.out.println("\n\nResetting Team 1:");
    team1.reset();

    System.out.print("Team 1 finished with " + team1.getWins() + " wins, " + team1.getLosses() + " losses, and ");
    System.out.println(team1.getTies() + " ties, for a total of " + team1.getPoints() + " points.\n");

 System.out.println("\n\nResetting Tournament:");
 SoccerTeam.startTournament();
 System.out.print("There were a total of " + SoccerTeam.getTotalGames() + " games in the tournament, throughout which ");
    System.out.println(SoccerTeam.getTotalGoals() + " goals were scored.\n\n");
  }
}