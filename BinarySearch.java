import java.util.Scanner;
class BinarySearch {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a[] = {1, 2, 3, 4, 5};
    System.out.println("Enter the key to search:");
    int key = sc.nextInt();
    int low = 0, high = a.length - 1;
    boolean found = false;
    int mid;

    while (low <= high) {
      mid = (low + high) / 2;

      if (a[mid] == key) {
        System.out.println("Element is found at index " + mid);
        found = true;
        break;
      } else if (a[mid] < key) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    if (!found) {
      System.out.println("Element not found");
    }

    sc.close();
  }
}
