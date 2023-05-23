public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);

        int b = calc.minus.apply(1, 1);
        calc.println.accept(b);

        int c = calc.devide.apply(a, b); //эта строка выдает ошибку, если b равен 0,
                // поэтому добавила блок try/catch в метод devide;
        calc.println.accept(c);

        int v = calc.multiply.apply(c, 5);
        calc.println.accept(v);

        int x = calc.pow.apply(6);
        calc.println.accept(x);

        int w = calc.abs.apply(-45);
        calc.println.accept(w);

        boolean z = calc.isPositive.test(-9);
        calc.println.accept(z);
    }

}