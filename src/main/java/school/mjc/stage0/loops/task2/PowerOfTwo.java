package school.mjc.stage0.loops.task2;

import static java.lang.Math.*;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter=0;
        while(counter<=power){
            System.out.println(pow(2,power));
            counter++;
        }
        if(power<0){
            System.out.println("too much power");
        }
    }
}
