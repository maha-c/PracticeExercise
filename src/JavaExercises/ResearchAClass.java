package JavaExercises;

//Using Math class
public class ResearchAClass {
    public static void main(String[] args) {

        //Generate a random number between 1 and 100
        double num = Math.random() * 100 + 1;
        System.out.println("Random number between 1 and 100 is: " + num);

        //Round off
        double roundedNum = Math.ceil(num);
        System.out.println("Rounded Number is: " + roundedNum);

        //Find squareRoot of that number

        double sqNum = Math.sqrt(roundedNum);
        System.out.println("Square root of rounded number is: " +sqNum);

    }
}
