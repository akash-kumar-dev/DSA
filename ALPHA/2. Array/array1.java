public class array1 {

    public static void arrayChange(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
    }
    public static void main(String args[]){
        int[] array = new int[5];
        for(int i=0;i<5;i++){
            array[i] = i*10;
        }

        arrayChange(array);

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
