import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        int[] list = {2, 3, 4, 6, 8, 4, 2, 9, 10, 10};

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] % 2 == 0) { // Is it even?
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) { // Is it repeat?
                        System.out.println(list[i] + " is repeat.");
                        break;
                    }
                }
            }
        }
    }
}