package lotto;

public class Score implements Comparable<Score> {
    public final int winningNumberCount;
    public final int bonusNumberCount;

    public Score(int winningNumberCount, int bonusNumberCount) {
        this.winningNumberCount = winningNumberCount;
        this.bonusNumberCount = bonusNumberCount;
    }

    @Override
    public int compareTo(Score score) {
        if(this.winningNumberCount != score.winningNumberCount){
            return this.winningNumberCount - score.winningNumberCount;
        }
        return this.bonusNumberCount - score.bonusNumberCount;
    }
}
