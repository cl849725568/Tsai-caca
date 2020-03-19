package lambda;

public class CalculatorTest {
    public static void main(String[] args) {
        //类型声明
        Calculator add = (int a, int b) -> a + b;
        //不用类型声明
        Calculator subtract = (a, b) -> a - b;
        //在大括号中返回语句
        Calculator multiply = (a, b) -> {
            return a * b;
        };
        //不用大括号
        Calculator divide = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("error");
            }
            return -1; //这里不加return就报错
        };

        int resutl = add.calculator(10, 10);
        System.out.println(resutl);

        int result2 = divide.calculator(20, 0);
        System.out.println(result2);

    }
}

