package day16_17;

public class BubbleSort {

	public static void main(String[] args) {
        String[] bubble = {"Pen", "Pencil", "Eraser", "Shopner", "Scale"};

     
        for(int i = 0; i < bubble.length - 1; i++)
        {
            for(int j = 0; j < bubble.length -i -1; j++)
            {
                if(bubble[j].compareTo(bubble[j + 1]) > 0){
                    String temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }
        printBubble(bubble);
    }

    public static void printBubble(String[] bubble){
        System.out.println("Bubble sorted array : ");
        for(int i = 0; i < bubble.length; i++)
        {
            System.out.println(bubble[i]);
        }
    }
}
