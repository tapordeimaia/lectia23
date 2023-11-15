import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String a = new String("A");
        String a1 = new String("A");
        System.out.println(a == a1); // False

        String b = "B";
        String b1 = new String("B");
        System.out.println(b == b1); // False

        String c = "C";
        String c1 = "C";
        System.out.println(c==c1); // True

        String x = "A";
        x = x + "B";
        for (int i = 0; i<1000; i++){
            x=x+i;
        }

        StringBuilder stringBuilder = new StringBuilder("A");
        stringBuilder.append("B");
        for (int i = 0; i<1000; i++){
            stringBuilder.append(i);
        }
        String result = stringBuilder.toString();

        String t = "ABCDE";
        StringBuilder stringBuilder1 = new StringBuilder(t);
        t = stringBuilder1.reverse().toString();

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        for (int i = 0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }

        List<String> list = new ArrayList<>();
        list.add("Vasile");
        list.add("Anatolie");
        list.add("Ion");
        list.add("Andrei");
        List<String> filteredList = new ArrayList<>();
        for (int i = 0; i<list.size(); i++) {
            if(list.get(i).startsWith("A")){
                filteredList.add(list.get(i));
            }
        }
        for (int i = 0; i<list.size(); i++) {
            filteredList.set(i, filteredList.get(i).toLowerCase());
        }

        Set<String> list2 = list.stream()
                .filter((s) -> s.startsWith("A"))
                .map((s) -> s.toLowerCase())
                .collect(Collectors.toSet());

        Set<String> list3 = Stream.of("Andrei", "Ion", "Anatolie")
                .filter((s) -> s.startsWith("A"))
                .map((s) -> s.toLowerCase())
                .collect(Collectors.toSet());

        String[] array = new String[2];
        array[0] = "Ion";
        array[1]="ion";
        Set<String> list4 = Arrays.stream(array)
                .filter((s) -> s.startsWith("A"))
                .map((s) -> s.toLowerCase())
                .collect(Collectors.toSet());

        List<String> d = Stream.of("Andrei", "Vlad", "Nicolae")
                .collect(Collectors.toList());

        Set<String> e = Stream.of("Andrei", "Vlad", "Nicolae")
                .collect(Collectors.toSet());

        List<String> list5 = new ArrayList<>();
        list5.add("A");
        list5.add("BSD");
        list5.add("CE");
        list5.add("A");
        Set<String> set7 = list.stream()
                .collect(Collectors.toSet());
    }
}