import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      Random random=new Random();
        ArrayList<Integer> arrayList=new ArrayList<>();
    ArrayList<Integer> jup=new ArrayList<>();

        for (int i = 0; i <=50; i++) {
            arrayList.add(random.nextInt(1,100));
            System.out.println(" "+arrayList.get(i));

        }


ArrayList<Integer> tak=new ArrayList<>();
        for (Integer i:arrayList) {
            if (i%2==0){
                jup.add(i);
            } else if (i%2==1) {
                tak.add(i);
            }


        }

    }
}
 //