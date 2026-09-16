package Demo;

public class Count_frequency {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 2, 2};
        
        for(int k = 0; k < arr.length; k++) {
            boolean alreadyCounted = false;
            
            for(int j = 0; j < k; j++) {
                if(arr[j] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            
            int count = 0;
            for(int i = 0; i < arr.length; i++) {
                if (arr[k] == arr[i]) {
                    count++;
                }
            }
            
            System.out.println(arr[k] + " occurs " + count + " times"); 
        }
    }
}
