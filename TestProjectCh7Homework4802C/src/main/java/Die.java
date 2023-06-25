import java.util.Random;
public class Die {
    Random rand = new Random(); //Create new random object
    int newValue = 0;

    public Die() {
        this.newValue = rand.nextInt(6) + 1; //Creates a die with numbers 1-6
    }

    public Die(int num) {
        this.newValue = rand.nextInt(num) + 1; //Creates a die with overloaded constructors that sets numbers 1-num

    }

    public void Roll() {
        this.newValue = rand.nextInt(6) + 1; //Sets die object to new random number 1-6

    }

    public int GetRoll() {
        return this.newValue; //Gets the current value on the die
    }
}
