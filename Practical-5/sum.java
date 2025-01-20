class Sum {
    public static void main(String[] args) {
        int[] arr = {5,10,34,32,5,-11,23};
        System.out.println("The sum of array : " + getSum(arr, 0)); 
    }
    
    public static int getSum(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + getSum(array, index + 1);
    }
}
