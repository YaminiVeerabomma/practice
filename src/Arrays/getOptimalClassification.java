package Arrays;

public class getOptimalClassification {
    public static void main(String[] args) {
//        int[] scores = {60,50,50,50,60};
//        String labels = "01010";
    	int[] scores = {50,30,70,60,40};
        String labels = "10010";
        char[] l = labels.toCharArray();
        int n = scores.length;

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) { 
                if(scores[j] > scores[j+1]) {
                    
            
                    int temp1 = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp1;

                    char temp2 = l[j];
                    l[j] = l[j+1];
                    l[j+1] = temp2;
                }
            }
        }
        int maxCorrect = 0;
        for(int i = 0; i <= n; i++){
            int X;

            if(i == 0)
                X = scores[0] - 1;         // 1) Below smallest
            else if(i == n)
                X = scores[n-1] + 1;       // 6) Above largest
            else
                X = (scores[i-1] + scores[i]) / 2; // 2,3,4,5 middle thresholds

            int correct = 0;

            for(int k = 0; k < n; k++){
                int predicted;
                if(scores[k] >= X)
                    predicted = 1;
                else
                    predicted = 0;

                if ((predicted == 0 && l[k] == '0') || (predicted == 1 && l[k] == '1'))
                    correct++;

            }
            maxCorrect = Math.max(maxCorrect, correct);
        }
        System.out.println( maxCorrect);
       
    }
}
