package day16_17;

public class MergeSort {
	
    static String[] mergeSort(String[] Arr, int num1, int num2)
    {
        if (num1 == num2) {
            String[] array = { Arr[num1] };
            return array;
        }
        int mid = num1 + (num2 - num1) / 2;
        String[] arr1 = mergeSort(Arr, num1, mid);
        String[] arr2 = mergeSort(Arr, mid + 1, num2);
        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    static String[] merge(String[] Arr1, String[] Arr2)
    {
        int m = Arr1.length;
        int n = Arr2.length;
        String[] Arr3 = new String[m + n];

        int val = 0;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(Arr1[i], Arr2[j])) {
            	Arr3[val] = Arr1[i];
            		i++;
            	val++;
            }
            else {
                Arr3[val] = Arr2[j];
                j++;
                val++;
            }
        }
        while (i < m) {
            Arr3[val] = Arr1[i];
            i++;
            val++;
        }
        while (j < n) {
            Arr3[val] = Arr2[j];
            j++;
            val++;
        }
        return Arr3;
    }
    static boolean isAlphabeticallySmaller(String str1, String str2)
    {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        String[] Arr = { "Pen", "Pencil", "Eraser", "Shopner", "Scale" };
        String[] a = mergeSort(Arr, 0, Arr.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
