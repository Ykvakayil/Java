import java.util.Scanner;

//ORDER-AGNOSTIC BINARY SEARCH ALGORITHM

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("HOW MANY ELEMENTS DO YOU WANT TO ENTER : ");
        int t = in.nextInt();
        int[] x = new int[t];
        in.nextLine();
        for (int i = 0; i < t; i++) {
            x[i] = in.nextInt();
            in.nextLine();
        }
        System.out.print("ENTER THE ELEMENT TO SEARCH FOR : ");
        int ele = in.nextInt();
        int pos = binarySearch(x, ele);
        System.out.println(pos);
    }

    //returning the index

    static int binarySearch(int[] a, int element) {
        int low = 0;
        int high = a.length - 1;

        boolean isAsc = a[low] < a[high];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == element) {
                return mid;
            } else {
                if (isAsc) {
                    if (element < a[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (element < a[mid]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
