public class Task_4_Numbers {
    public static void main(String[] args) {
        int num1 = 20, num2=10;
        sum(num1,num2);
        difference(num1,num2);
        System.out.println("The product is "+product(num1,num2));
    }
    private static void sum(int a,int b){
        System.out.println("The sum is "+(a+b));
    }
    private static void difference(int a,int b){
        System.out.println("The difference is "+(a-b));
    }
    private static int product(int a,int b){
        return a*b;
    }
}
