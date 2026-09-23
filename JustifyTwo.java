public class JustifyTwo {
    public static void main(String[] args) {
        System.out.println((float)0.01*100);
        int i = 1;
        float x = 0;
        while(i<=100){
            x += 0.01;
            i++;
        }
        System.out.println(x);
    }
}
