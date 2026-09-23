import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        long num1 = input.nextLong();
        System.out.println("请输入操作符（+、-、*、/）：");
        char letter = input.next().charAt(0);
        while(letter != '+'&letter != '-'&letter !='*'&letter !='/'){//检测操作符输入是否正确，如果不正确则提示重新输入
            System.out.println("操作符输入错误，请输入：+、-、*、/中的一个：");
            letter = input.next().charAt(0);
        }
        System.out.println("请输入第二个数字：");
        long num2 = input.nextLong();

        switch (letter) {
            case '+':
                System.out.println("结果为："+(num1+num2));
                break;
            case '-':
                System.out.println("结果为："+(num1-num2));
                break;
            case '*':
                System.out.println("结果为："+(num1*num2));
                break;
            case '/':
                if(num2==0){
                    System.out.println("除数不能为0！");
                }else {
                    System.out.println("结果为："+(num1 / num2));
                }
                break;
        }
    }
}
