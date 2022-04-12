package _08_clean_code_refactoring.exercise.tennis;

public class Tennis {
    public static String scoreName="";
    public static final int ONE = 1;
    public static final int DEUCE = 4;
    public static final int TWO = 2;
    public static final int THREE= 3;
    public static final int ZERO= 0;


    // đều điểm
    public static String deuce(int temp){
        switch ( temp) {
            case ZERO:
                scoreName = "Love-All";
                break;
            case ONE:
                scoreName = "Fifteen-All";
                break;
            case TWO:
                scoreName = "Thirty-All";
                break;
            case THREE:
                scoreName = "Forty-All";
                break;
            default:
                scoreName = "Deuce";
                break;
        }
        return scoreName;
    }
    // xét điểm lợi thế
    public static String advantage(int score1, int score2) {
        if ((score1 - score2) >= TWO) scoreName = "Win for player1";
        else if ((score1 - score2) == ONE) scoreName = "Advantage player1";
        else if ((score1 - score2) == -ONE) scoreName = "Advantage player2";
        else scoreName = "Win for player2";
        return scoreName;
    }
    public static String getPoint(int score1, int score2){
        int tempScore=0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = score1;
            else {
                scoreName += "-";
                tempScore = score2;
            }
            switch (tempScore) {
                case ZERO:
                    scoreName += "Love";
                    break;
                case ONE:
                    scoreName += "Fifteen";
                    break;
                case TWO:
                    scoreName += "Thirty";
                    break;
                case THREE:
                    scoreName += "Forty";
                    break;
            }
        }
        return scoreName;
    }
    public static String getSore(String player1Name,String player2Name,int score1,int score2){
        if (score1==score2){
            scoreName = deuce(score1);
        }else if (score1 >= DEUCE || score2 >=DEUCE){
            scoreName = advantage(score1,score2);
        }else {
            scoreName = getPoint(score1,score2);
        }
        return scoreName;
    }


}
