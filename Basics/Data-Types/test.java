public class test {
    public static void main(String[] args){
        int[] arr1 = new int[9];
        // System.out.println("arr1 (original values): ");
        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.print(arr1[i] + " ");
        //     System.out.print("\n");           
        // }

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;
        arr1[5] = 60;

        for (int num : arr1) {
            System.out.println( num + " ");
        }
    }
}
