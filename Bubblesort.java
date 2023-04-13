import java.util.scanner;
class Bubblesort{
  public static void main(Strings args){
  Scanner sc=new Sacnner(System.in);
    int n=sc.nextInt();
    int arr[]=new Int[n];
    int temp=0;
    Ssytem.out.println("Enter the elements ");
     int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
    System.out.println("Before Sort ");
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
  int temp=0;
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
System.out.println("After Sort ");
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
    
  }
}
