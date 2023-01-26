package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive){

        if(multiplyByAndToInclusive>0) {
            int counter=1;
            while (counter <= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        }
        if(multiplyByAndToInclusive<0){
            int counter=multiplyByAndToInclusive*(-1);
            while(counter>multiplyByAndToInclusive&&counter>0){
                System.out.println(counter*multiplyByAndToInclusive);
                counter--;
            }
        }
    }
}
