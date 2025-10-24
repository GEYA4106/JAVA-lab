import java.util.Scanner;
class Binary{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]={1,2,3,4,5};
    System.out.println("enter the key to search");
    int key=sc.nextInt();
    int low=0,high=4;
    boolean found=false;
    while(low<=high)
    {
        mid=(low+high)/2;
        if(a[mid]==key)
        {
            System.out.println("element is found at"+mid);
            found=true;
            break;
        }
        else if(a[mid]<key)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
    if(!found){
    System.out.println("element not found");
    }
  }
}