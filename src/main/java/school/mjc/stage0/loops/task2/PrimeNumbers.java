package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter=2;
        while(counter<=printToInclusive){
            if(!(printToInclusive%counter==0)){
                System.out.println(counter);
            }
        }
    }
}
