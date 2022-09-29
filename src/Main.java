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


        //anytime you need to use a method from the Math clas
        //just start Math. and let the list pop up
        //Math.


        //random numbers (rng)
        //pseudorandom numbers (png)


        //Math.random(); == 0.0 up to but not including 1


        // (int)(Math.random() * [range] + lower)
        //                upper - lower + 1
        int value = (int)(Math.random()*20 +1);

        out.println("you rolled: " + value);
    }
}