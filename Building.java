import java.util.Scanner;
public class Building {                 // counting number of building greater than current building
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int [] arr = new int [n];
        // for(int i=1;i<=n-1;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int count = 1;
        // int current_max = arr[0];
        // for(int i=1;i<=n-1;i++){
        //     if(arr[i]>current_max){
        //         count ++;
        //         current_max = arr[i];
    

        //     }
        // }
        // System.out.println(count);
        int N = Integer.parseInt(sc.nextLine());
        String[] inp = sc.nextLine().split(" ");
        int [] arr = new int [inp.length];
        for(int i=0;i<inp.length;i++){
            arr[i] = Integer.parseInt(inp[i]);
        }
        sc.close();
        System.out.println(count_building(arr,N));
    }
    public static int count_building(int [] arr, int n){
        int count = 1;
        int current_max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>current_max){
                count ++;
                current_max = arr[i];
            }
        }
        return count;
    }
    
}
