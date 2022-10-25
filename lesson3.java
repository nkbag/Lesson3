
/**
 * lesson3
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class lesson3 {
    // 1.
    public static List<String> newList() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("black");
        list.add("white");
        return list;
    }

    // 2.
    public static List<String> iterList(List<String> list) {
        ListIterator<String> newList = list.listIterator();
        while (newList.hasNext()) {
            newList.set(newList.next().concat("!"));
        }
        return list;
    }

    // 3.
    public static List<String> addList(List<String> list) {
        list.add(0, "grey");
        return list;
    }

    // 4.
    public static String getList(List<String> list) {
        return list.get(3);
    }

    // 5.
    public static List<String> replacElement(List<String> list, String firstElement, String secondElement) {
        list.set(list.indexOf(firstElement), secondElement);
        return list;
    }

    // 6.
    public static List<String> removeList(List<String> list) {
        list.remove(2);
        return list;
    }

    // 7.
    public static boolean searchElementList(List<String> list, String element) {
        if (list.contains(element))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // 1
        System.out.println(newList());

        // 2
        System.out.println(iterList(newList()));

        // 3
        System.out.println(addList(iterList(newList())));

        // 4
        System.out.println(getList(addList(iterList(newList()))));

        // 5
        System.out.println(replacElement(addList(iterList(newList())), "grey",
                "grey!"));

        // 6
        System.out.println(removeList(replacElement(addList(iterList(newList())),
                "grey", "grey!")));

        // 7
        String serchElement = "red!";
        System.out.println(searchElementList(
                removeList(replacElement(addList(iterList(newList())), "grey",
                        "grey!")),
                serchElement));
    }
}
