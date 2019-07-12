import java.util.ArrayList;

public class Basic {

    public void print1To255() {
        for(int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    public void printOdd() {
        for(int i = 1; i < 256; i += 2) {
            System.out.println(i);
        }
    }

    public void printSum() {
        for(int i = 1; i < 256; i++) {
            int sum = 0;
            sum += i;
        }
    }

    public void iterateArr() {
        int[] arr = {1,2,3,4,5,6};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }

    public void findMax() {
        int[] arr = {1,3,76,23,546};
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } 
        }
        System.out.println(max);
    }

    public void findAvg() {
        int[] arr = { 1, 3, 76, 23, 546 };
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println(avg);
    }

    public void greaterThanY(int Y) {
        int[] arr = { 1, 3, 76, 23, 546, 43 };
        // ArrayList<Integer> arrnew = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > Y) {
                // arrnew.add(arr[i]);
                sum ++;
            }
        }
        System.out.println(sum);
    }

    public void sqrInt() {
        int[] arr = { 1, 3, 76, 23, 546, 43 };
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
            System.out.println(arr[i]);
        }
    }

    public void noNeg() {
        int[] arr = { 1, 3, -76, 23, -546, 43 };
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(arr);
    }

    public void maxMinAvg() {
        int[] arr = { 1, 3, -76, 23, -546, 43 };
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
            if (arr[i] < min) {
                min=arr[i];
            }
            sum += arr[i];
        }
        int avg = sum / arr.length;
        int[] arrnew = {max, min, avg};
        System.out.println(arrnew);
    }
}