import java.util.Arrays;
class Main {
  void merge(int array[], int p, int q, int r) {

    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];
    for (int i = 0; i < n1; i++)
      L[i] = array[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = array[q + 1 + j];

    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        array[k] = L[i];
        i++;
      } else {
        array[k] = M[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      array[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      array[k] = M[j];
      j++;
      k++;
    }
  }

  void mergeSort(int array[], int lft, int rht) {
    if (lft < rht) {

      int mid = (lft + rht) / 2;

      mergeSort(array, lft, mid);
      mergeSort(array, mid + 1, rht);

      merge(array, lft, mid, rht);
    }
  }

  public static void main(String args[]) {

    int[] array = { 6, 5, 12, 10, 9, 1 };

    Main ob = new Main();

    ob.mergeSort(array, 0, array.length - 1);

    System.out.println("Sorted Array Is following -> :");
    System.out.println(Arrays.toString(array));
  }
}
import java.util.*;
public class quick
{
 int partition(int a[],int low,int high)
{
 int pivot=low;
 int i=low;
 int j=high;
 while(i<j)
 {
  do
   {
    i++;
   }while(a[i]<=pivot);
  do
   {
    j--; 
   }while(a[j]>pivot);
 if(i<j)
 {
 int temp=a[i];
 a[i]=a[j];
 a[j]=temp;
 }
}
int temp2=a[low];
a[low]=a[j];
a[j]=temp2;

return j;
}

void quicksort(int a[],int low,int high)
{
 if(low<high)
 {
 int pari=partition(a,low,high);
 quicksort(a,low,pari-1);
 quicksort(a,pari+1,high);
 }
}

public static void main(String[] args)
{
 Random rn=new Random();
 int n=2000;
 int a[]=new int[n];
 for(int i=0;i<n;i++)
 {
 a[i]=rn.nextInt(n);
 }

quick obj=new quick();
obj.partition(a,0,n-1);
obj.quicksort(a,0,n-1);
for(int i=0;i<=n-1;i++)
{
System.out.println(a[i]);
}  
}
}
