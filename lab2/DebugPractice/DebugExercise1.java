/**
 * Exercise for learning how the debug, breakpoint, and step-into
 * feature work.
 */


public class DebugExercise1 {

    /**
     * we have static method and static variable,but we also specify class to be static
     * in java we can set a class be static if it's nested class.
     * static can't reference another class
     */

    public static class Dog{
        public int size;

        public Dog(int sizeInBounds){
            size=sizeInBounds;
        }

        public void noise() {
            if (size < 10) {
                System.out.println("yip!!");
            } else {
                System.out.println("bark!!");
            }
        }


    }

    public static int divideThenRound(int top, int bottom) {
        int quotient = top / bottom;
        int result = Math.round(quotient);
        return result;
    }

    public static void main(String[] args) {
        Dog d=new Dog(10);
        d.noise();

        int t = 10;
        int b = 2;
        int result = divideThenRound(t, b);
        System.out.println("round(" + t + "/" + b + ")=" + result);

        int t2 = 9;
        int b2 = 4;
        int result2 = divideThenRound(t2, b2);
        System.out.println("round(" + t2 + "/" + b2 + ")=" + result2);

        int t3 = 3;
        int b3 = 4;
        int result3 = divideThenRound(t3, b3);
        System.out.println("round(" + t3 + "/" + b3 + ")=" + result3);
    }


}
