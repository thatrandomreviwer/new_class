import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Bug dude = new Bug(); //instantiate
        Bug dudeTheSecond = new Bug();
        Bug dudeTheThird = new Bug();

        dude.speak();
        dude.sayName();
        dudeTheSecond.sayName();

        int ans = dudeTheThird.multiplier(7, 12);
        out.println("the answer is " + ans);
    }
}