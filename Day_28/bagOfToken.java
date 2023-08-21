public class bagOfToken {
    public int bagOfTokensScore(int[] tokens, int power) {
        int light=0,heavy=tokens.length-1;
        int score=0,maxScore=0;
        while(light<=heavy){
            if(power>=tokens[light]){
                power-=tokens[light];
                light++;score++;
                maxScore=Math.max(maxScore,score);
            }else if(score>=1){
                score--;
                power+=tokens[heavy];
                heavy--;
            }else{
                break;
            }
        }
        return maxScore;
    }
}
