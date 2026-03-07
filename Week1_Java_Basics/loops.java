public class loops {
    public static void main(String a[]){
        
        int i = 1;

        while(i<=4) // this condition will iterate and terminates when the value of i is less than or equal to 4. The moment while gets false it will not run.
        {
                System.out.println("Hi");
                i++;

        }

        System.out.print("Bye" + i); // The print output here will print along side the last value of "i" which is 5 that is greater than 4 which 4 couldn't return. The last value "5" will be maintain because "i" is declare outside the loop

        // Below is a nested while loop

        int c = 1;

        while(c<=4){
            System.out.println("Hello");
            c++;
            int b = 1;
            while(b<=2){
                System.out.println("Hi");
                b++;
            }
        System.out.println("Successful");

    }




    } 
}
