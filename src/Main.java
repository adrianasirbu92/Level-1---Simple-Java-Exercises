public class Main {

    public static void main(String[] args) {
        // 1.Create a loop that will print numbers from 1 to 10, except number 7
        for (int i = 1; i <= 10; i++) {
            if (i == 7) continue;
            System.out.println(i);
        }
        //2.Create An Array of integers from 1 to 5, Call an integer on array using index and print it.
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[2]);

        //3.Call index outside of the bound. Handle this exception printing “Outside of bound message.”
        try{
            int[] y = {1,2,3,4,5,6,7};
            System.out.println(y [8]);
        }catch (Exception e) {
            System.out.println("Outside of bound message!");
        }

    }
}



