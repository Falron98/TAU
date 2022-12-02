package pl.edu.pjwstk;

public class App {
    public String play(int number){

        if(number <= 0) {
            IllegalArgumentException cause = new IllegalArgumentException();
            throw new IllegalArgumentException(cause);
        }
        else if (number % 15 == 0){
            return "FizzBuzz";
        }
        else if(number % 3 == 0){
            return "Fizz";
        }
        else if (number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
