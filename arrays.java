import java.util.*;
public class arrays {

    public static void main(String[] args) {
        int [] marks = new int [5];
        marks[0] = 5;
        marks [1] = 10;
        marks[2] = 8;
        for(int i = 0; i<3; i++){
            System.out.println(marks[i]);
        }
        int i = 0;
        while(i<3){
            System.out.println(marks[i]);
            i++;
        }
    }
}