
import java.util.Arrays;
import java.util.List;

public class MainCountByFirst {
    public static void main(String[] args) {
        List <String> words = Arrays.asList("pepe", "coche", "copia");
        System.out.println("original: " + words);
        char startingLetter = 'p';

        long count = words.stream().filter(s -> s.startsWith(String.valueOf(startingLetter))).count();
        System.out.println("empiezan por" + " " + startingLetter + ": " + count);

        System.out.println("");
        
        char startingLetterSecond = 'c';
        long countSecond = words.stream().filter(s -> s.startsWith(String.valueOf(startingLetterSecond))).count();
        System.out.println("empiezan por" + " " + startingLetterSecond + ": " + countSecond);
    }
}
