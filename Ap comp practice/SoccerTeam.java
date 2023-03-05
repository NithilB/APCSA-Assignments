public class SoccerTeam{

 private int wins;
 private int losses;
 private int ties;
 private static int games;
 private static int goals;

 public SoccerTeam(){
   wins = 0;
   losses = 0;
   ties = 0;
   games = 0;
   goals = 0;
}

 public void played(SoccerTeam other, int myScore, int otherScore){

     if (myScore > otherScore){
     this.wins++;
     other.losses++;
     goals += (myScore + otherScore);
   } else if (myScore < otherScore){
     this.losses++;
     other.wins++;
     goals += (myScore + otherScore);
   } else if (myScore == otherScore){
     this.ties++;
     other.ties++;
     goals += (myScore + otherScore);
   }
   games++;

}

 public int getPoints(){
   int w = wins;
   w *= 3;
   int t = ties;
   t *= 1;
   int l = losses;
   l *= 0;
   int x = 0;
   x = w + t;
   return x;
}

 public int getWins(){
   return wins;
}

 public int getTies(){
   return ties;
}

 public int getLosses(){
   return losses;
}

 public void reset(){
  wins = 0;
  ties = 0;
  losses = 0;
  //return 0;
}

 public static int getTotalGames(){
   return games;
 }

 public static int getTotalGoals(){
   return goals;
 }

 public static int startTournament(){
   games = 0;
   goals = 0;
   return 0;
 }
}