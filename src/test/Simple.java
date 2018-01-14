package test;

public class Simple {
    public static int findLargestNumber(int a, int b, int c){
        int numbers [] = {a, b, c};
        int largest = a;

        for (int num : numbers){
            if(num > largest){
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(findLargestNumber(35, 234, 34));
    }
}
