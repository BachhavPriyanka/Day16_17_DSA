package day16_17;
import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        ans.add("Pen");
        ans.add("Pencil");
        ans.add("Eraser");
        ans.add("Shopner");
        ans.add("Scale");
        insertionSort(ans);
    }
    public static void insertionSort(List<String> ans) {
        for (int i = 0; i < ans.size() - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (ans.get(j).compareTo(ans.get(j - 1)) < 0) {
                  String temp = ans.get(j);
                    ans.set(j, ans.get(j - 1));
                    ans.set(j - 1, temp);
                }
            }
        }
        System.out.println("Sorted Strings are : ");
        for (int i = 0; i < ans.size() ; i++) {
            System.out.println(ans.get(i));
        }
    }
}
