public class Main {
    public static void main(String[] args) {
// i understand it now
        System.out.println("hello sendy");

        if (args.length != 2) {
            System.out.println("please run with only two command line arguments; x y");
            return;
        }

        MathOperation m = (int a, int b) -> {
            int ret = 0;
            for(int i = a; i <=b; i++) {
                ret += i;
            }
            return ret;
        };
        int x = m.calculate(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        System.out.println("result: " + x);
		// Sendy y Faris
    }
}
