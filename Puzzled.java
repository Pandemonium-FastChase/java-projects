import java.util.ArrayList;
import java.util.List;

public class Puzzled{
    public static void main(String[] args){
        List<List<Integer>> pairs =new ArrayList<>();
        List<Integer> orders = new ArrayList<>();
        int x=0,y=0,order=0,direction;
        orders.add(order);
        pairs.add(List.of(x, y));

        while(order<=24) {
            direction = (int) (Math.random() * 4);
            switch (direction) {
                case 0:
                    if (!(y == 0 || (pairs.contains(List.of(x, y - 1))))) {
                        y--;
                        order++;
                        orders.add(order);
                        pairs.add(List.of(x, y));
                    }
                    break;
                case 1:
                    if (!(y == 9 || (pairs.contains(List.of(x, y + 1))))) {
                        y++;
                        order++;
                        orders.add(order);
                        pairs.add(List.of(x, y));
                    }
                    break;
                case 2:
                    if (!(x == 0 || (pairs.contains(List.of(x - 1, y))))) {
                        x--;
                        order++;
                        orders.add(order);
                        pairs.add(List.of(x, y));
                    }
                    break;
                case 3:
                    if (!(x == 9 || (pairs.contains(List.of(x + 1, y))))) {
                        x++;
                        order++;
                        orders.add(order);
                        pairs.add(List.of(x, y));
                    }
                    break;
            }
            if ((y == 0 || (pairs.contains(List.of(x, y - 1)))) && (y == 9 || (pairs.contains(List.of(x, y + 1))))&&(x == 0 || (pairs.contains(List.of(x - 1, y))))&&(x == 9 || (pairs.contains(List.of(x + 1, y))))) {
                break;
            }
        }

        order=0;
        x=0;
        y=0;
        while(y<=9){
            while(x<=9){
                if ((pairs.contains(List.of(x,y)))){
                    System.out.print(((char)(orders.get(pairs.indexOf(List.of(x,y))) + 65)+"\t"));
                    order++;
                }else{
                    System.out.print(".\t");
                }
                x++;
            }
            x=0;
            y++;
            System.out.println();
        }
    }
}
