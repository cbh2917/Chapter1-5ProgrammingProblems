public class ScoreCalculator {
	public static double CalScore(int [] score, double [] weight) {
		double avgScore;
		double totalScore=0;
			for(int i=0; i<score.length; i++){
				totalScore+=score[i]*weight[i];
			}
			avgScore = totalScore/score.length;
			return avgScore;
	}
}
