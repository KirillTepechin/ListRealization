import java.util.*;

public class Main {

    public static void main(String[] args) {
        benchmarkSort(10000000,10000000);
    }

    public static void benchmarkSort(int n, int range){
        List<Integer> myList = new MyList<>();

        for (int i = 0; i < n; i++) {
            myList.add((int)(Math.random()*range));
        }

        var startMy = System.currentTimeMillis();
        myList.sort(Comparator.comparingInt(value -> value));
        System.out.println("Моё время сортировки - "+ (System.currentTimeMillis() - startMy));

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add((int)(Math.random()*range));
        }


        var startAr = System.currentTimeMillis();
        arrayList.sort(Comparator.comparingInt(value -> value));
        System.out.println("Время сортировки ArrayList - "+ (System.currentTimeMillis() - startAr));

    }
}
