package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive){

        if(multiplyByAndToInclusive>0) {
            int counter=0;
            while (counter <= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        }
        if(multiplyByAndToInclusive<0){
            int counterStart=0;
            int counterEnd=multiplyByAndToInclusive*(-1);
            while(counterStart <=counterEnd){
                System.out.println(counterStart*multiplyByAndToInclusive);
                counterStart++;
            }
        }
    }
}
