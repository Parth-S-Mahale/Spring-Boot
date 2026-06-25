package Core_Java.arrays;

class Exercise {
    public static void main(String[] args) {
        int arr[] = {45, 22, 89, 16, 80, 33};
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i : arr) {
            if (min <= i) {
                min = i;
            } else if (max >= i) {
                max = i;
            }
        }
        
        System.out.println("Smallest: "+max);
        System.out.println("Largest: "+ min);
    }
}
