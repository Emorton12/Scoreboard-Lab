import junit.framework.TestCase;

public class ScoreboardTest extends TestCase {
  public void testEmptyScoreboard() {
    Scoreboard sb = new Scoreboard(10);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(0, sb.getScore(0));
    assertEquals(0, sb.getNumScores());
  }
  public void testSecondScoreBeforeFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(12);
    sb.addScore(15);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(15, sb.getScore(0));
    assertEquals(12, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  public void testSecondScoreAfterFirst() {
    Scoreboard sb = new Scoreboard (10);
    
    sb.addScore(12);
    sb.addScore(9);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(12, sb.getScore(0));
    assertEquals(9, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  public void testThirdScoreBeforeFirst() {
    Scoreboard sb = new Scoreboard (10);
    
    sb.addScore(44);
    sb.addScore(33);
    
    sb.addScore(50);

    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(44, sb.getScore(1));
    assertEquals(33, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
  }
                  
  public void testThirdScoreInMiddle() {
    Scoreboard sb = new Scoreboard (10);
    
    sb.addScore(33);
    sb.addScore(50);

    sb.addScore(44);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(44, sb.getScore(1));
    assertEquals(33, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
  }

  public void testThirdScoreLast() {
    Scoreboard sb = new Scoreboard (10);
    
    sb.addScore(44);
    sb.addScore(50);

    sb.addScore(33);

    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(44, sb.getScore(1));
    assertEquals(33, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
  }

  public void testOneEntry() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
  }
}
