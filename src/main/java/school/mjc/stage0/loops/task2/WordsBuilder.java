package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter=0;
        String word="";
        while(counter<chars.length+1){
            word+=chars[counter];
            counter++;
        }
        System.out.println(word);
    }
}
