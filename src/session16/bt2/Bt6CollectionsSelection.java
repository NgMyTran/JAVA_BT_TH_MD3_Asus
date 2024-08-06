package session16.bt2;

import session16.sorting.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bt6CollectionsSelection {
    public static <T> void selectionSort(List<T> list, Comparator<T> comparator) {
        boolean isNext = true;
        for (int i = 0; i < list.size() - 1 && isNext; i++) {
            System.out.println("Vòng lặp i : " + i);
            isNext = false;
            for (int j = 0; j < list.size() - 1 - i; j++) {
                System.out.println("\tvòng lặp j :" + j);
                if (comparator.compare(list.get(j), list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    isNext = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<session16.sorting.Person> peopleList = new ArrayList<>();
        peopleList.add(new session16.sorting.Person(1, "Lan"));
        peopleList.add(new session16.sorting.Person(2, "Mai"));
        peopleList.add(new session16.sorting.Person(3, "Trung"));

        selectionSort(peopleList, Comparator.comparing(Person::getName));
        System.out.println(peopleList);

        selectionSort(peopleList, (o1, o2) -> o2.getId() - o1.getId());
        System.out.println(peopleList);
    }
}
