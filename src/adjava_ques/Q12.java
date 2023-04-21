package adjava_ques;
import java.io.Serializable;

class CricketScore implements Serializable {
    private String teamA;
    private String teamB;
    private int teamAScore;
    private int teamBScore;
    private int oversPlayed;

    public CricketScore() {}

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public int getTeamAScore() {
        return teamAScore;
    }

    public void setTeamAScore(int teamAScore) {
        this.teamAScore = teamAScore;
    }

    public int getTeamBScore() {
        return teamBScore;
    }

    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }

    public int getOversPlayed() {
        return oversPlayed;
    }

    public void setOversPlayed(int oversPlayed) {
        this.oversPlayed = oversPlayed;
    }
}

public class Q12 {
        public static void main(String[] args) {
            CricketScore cricketScore = new CricketScore();
            cricketScore.setTeamA("India");
            cricketScore.setTeamB("Pakistan");
            cricketScore.setOversPlayed(50);
            cricketScore.setTeamAScore(187);
            cricketScore.setTeamBScore(187);

            System.out.println("Cricket Score Details:");
            System.out.println("Team A: "+cricketScore.getTeamA()+" Scored: " + cricketScore.getTeamAScore());
            System.out.println("Team B: "+cricketScore.getTeamB()+ " Scored: "+ cricketScore.getTeamBScore());
            System.out.println("Overs: " + cricketScore.getOversPlayed());
        }
    }
    
