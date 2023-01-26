package school.mjc.stage0.loops.task2;



public class PowerOfTwo {
    public void printPower(int power) {
        int counter=0;
        int number=0;
        while(counter<=power){
            System.out.println(number+2);
            counter++;
        }
        if(power<0){
            System.out.println("too much power");
        }
    }
}
