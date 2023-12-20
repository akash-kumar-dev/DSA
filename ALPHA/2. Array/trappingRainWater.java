public class trappingRainWater {

    public static int trappingRainWaterFunction (int arr[]) { //O(n)
        //calculate left max Boundary array
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        //calculate right max Boundary array
        int rightMax[] = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i = 0; i < arr.length; i++) {
            //waterLevel = min(leftMax boundary, rightMax Boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trappedWater = (waterLevel - arr[i]) * width
            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;
    }

    public static void main (String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};   //11
        int arr2[] = {2, 0, 2}; //2
        int arr3[] = {3, 0, 2, 0, 4};   //7

        System.out.println(trappingRainWaterFunction(height));
    }
}
