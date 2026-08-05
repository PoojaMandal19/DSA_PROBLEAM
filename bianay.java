public class bianay {
    public static int binaryserch(int arrey[],int key) {
        int left = 0;
        int right = arrey.length-1;
      

       

        while (left<=right) {
              int mid = (left+right)/2;
              if (arrey[mid] == key) 
                return mid;
            else if (arrey[mid]<key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arrrey[] = {10,20,30,40,50,60,70};
        int key = 70;
        System.out.println(binaryserch(arrrey, key));


    }
}
