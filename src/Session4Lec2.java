public class Session4Lec2 {
    public static void main(String[] args) {
        int base = 3;
        System.out.println("Factorial of " + base + " is : " + fact(base));
    }

    public static Integer fact(int number) {
        Integer result = null;
        if (number == 1 || number == 0) {
            result = 1;
        } else if (number > 1) {
            result = (number * fact(number - 1));
        }

        return result;
    }
}
