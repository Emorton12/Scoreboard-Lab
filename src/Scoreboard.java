import java.util.ArrayList;

public class Scoreboard {
  private ArrayList<Integer> scores;
  private int maxCount;
  
  public Scoreboard(int maxScoreCount) {
    scores = new ArrayList<>(maxScoreCount);
    maxCount = maxScoreCount;
  }
  
  public void addScore(int score) {
    if (scores.size() == 0) {
      scores.add(score);
    }
    
    else if (scores.get(0) <= score) {
       scores.add(0, score);
    }
   else {
     scores.add(1, score);
   }
  }
  
  public boolean isHighScore(int score) {
    
    return true;
  }
  
  public int getScore(int position) {
    if (position < scores.size()) {
      return scores.get(position);
    }
    else {
      return;
    }
  }
  
  public int getNumScores() {
    return scores.size();
  }
}