package firstcode;

public class main {
    public static void main(String[] args) {
        int[] testarr1 = {0, 1, 2, 3, 4}; //previously named foo but changed to testarr1

        int[] bar = new int[100];
        for(int i = 0; i < 100; i++){
            bar[i] = i;
        }
        System.out.println("The number of even numbers in testarr1 is:");
        System.out.println(countEvenNum(testarr1, 5));

        System.out.println("The number of even numbers in bar is:");
        System.out.println(countEvenNum(bar, 100));

    }



    private static int countEvenNum(int[] arr, int size){
        int count = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
            else{

            }
        }

        return count;
    }
}
