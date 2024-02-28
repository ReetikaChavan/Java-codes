import java.util.*;

class NextLargeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num of elements: ");
        int[] arr = new int[100];

        int n = sc.nextInt();

        System.out.println("Enter array elements: ");

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] < arr[j]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(i == n-1){
                System.out.print("-1");
            }
        }

    }
}

