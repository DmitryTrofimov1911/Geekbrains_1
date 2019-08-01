package Java1_lesson2;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0){
                array[i]++;
            } else {
                array[i]--;
            }
        }
        System.out.println(Arrays.toString(array));
        getElementsToArray();
        cycleElementsMassMultiply2();
        twoDimensionalArray();
        findMinAndMaxElementsOfAray();
        JOptionPane.showMessageDialog(null,"Можно добить и перезалить полную домашку чуть позже?");
    }

    public static void getElementsToArray() {
        int[]arr=new int[8];
        int pi=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pi;
            pi = pi+3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleElementsMassMultiply2() {
        int[]arr={1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6){
                arr[i]=arr[i]*2;
            }   else {
                arr[i]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void twoDimensionalArray() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j || j==(arr.length-i-1)){
                    arr[i][j]=1;
                }   else {
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j]);;
            }
            System.out.println();
        }
    }

    public static void findMinAndMaxElementsOfAray() {
        int[]arr = {1,15,2,6,8,-19,-69,29};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Минимальный элемент массива = " + min);
        System.out.println("Максимальный элемент массива = " + max);
    }
}