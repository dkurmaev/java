public class LogicalOperationAppl {
    public static void main(String[] args) {
        int res = oddProduct();
        System.out.println("Odd product = " + res);
        int age = 25;
        checkArmy(age);
    }

    public static int oddProduct() {
        int res = 1;
        for (int i = 10; i < 100; i++) {
            if (i % 2 != 0 && i % 13 == 0) { // И

                res = res * i;

            }
        }
        return res;
    }
    public static void checkArmy(int age){
        if(age < 18 || age >= 45){ // Или
            System.out.println("RElax pleas");
        }else {
            System.out.println("Go to army");
        }
    }
}