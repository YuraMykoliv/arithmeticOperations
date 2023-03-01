package Main.src;

public class Main {
    public static void main(String[] args) {
        byte b = 25;
        short s = 150;
        long l = 54217;
        double d = 12.648;
        float f = 277.642f;

        System.out.println("  b + s= " + (b + s));
        System.out.println("  b + l= " + (b + l));
        System.out.println("  b + d= " + (b + d));
        System.out.println("  b + f= " + (b + f));
        System.out.println("  b + b= " + (b + b));

        System.out.println("  s - b= " + (s - b));
        System.out.println("  s - l= " + (s - l));
        System.out.println("  s - d= " + (s - d));
        System.out.println("  s - f= " + (s - f));
        System.out.println("  s - s= " + (s - s));

        System.out.println("  l * b= " + (l * b));
        System.out.println("  l * s= " + (l * s));
        System.out.println("  l * d= " + (l * d));
        System.out.println("  l * f= " + (l * f));
        System.out.println("  l * l= " + (l * l));

        System.out.println("  f / b= " + (f / b));
        System.out.println("  f / s= " + (f / s));
        System.out.println("  f / l= " + (f / l));
        System.out.println("  f / d= " + (f / d));
        System.out.println("  f / f= " + (f / f));


    }
}