public class Variables {
    int num1;
    static int num2;
    
    public void printName(String name){
        String prtMsg = name + " Hello";
        System.out.println(prtMsg);
    }
    public static void main(String[] args) {
        System.out.println("Hello World!\n");
        Variables mc = new Variables();
        mc.num1 = 100;
        Variables.num2 = 50;

        mc.printName("홍길동");
        System.out.printf("%d, %d", mc.num1, Variables.num2);
    }
}