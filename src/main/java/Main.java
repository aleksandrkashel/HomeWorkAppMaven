public class Main {
    public static void main(String[] args) {

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing() {
        int a = 8;
        int b = 3;
        if(a + b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 30;
        if (value < 0){
            System.out.println("Red");
        } else if(value < 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 5;
        if(a >= b){
            System.out.println("a => b");
        } else {
            System.out.println(a < b);
        }
    }
}
