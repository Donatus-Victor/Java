public class conditional {
    
        public static void main(String a[])
    {
        int x = 18;
        int y = 28;
        /// Condition 1
        if(x>10)
            System.out.println("Hello");

        ///condition 2
        if(true)
            System.out.println("Hello"); 

        // condition 3  IF STATEMENT
        if(x>10 && x<=20)
            System.out.println("Correct");
        
        // Condition 4 IF AND ELSE STATEMENT
        if(y>10 && y<=20)
            System.out.println("Hello");

        else
            System.out.println("Wrong");

         // Condition 5 IF AND ELSE STATEMENT
        int q = 8;
        int s = 7;
        int t = 6;

        if(q>s)
            System.out.println("This is wrong");
        else
            System.out.print("This is correct");

        // COMPILING 3 NUMBERS

        int u = 8;
        int v = 7;
        int w = 6;

        if(u>v && u>w)
            System.out.println(u);

        else if(v>u && v>w)
            System.out.println(v);

        else
            System.out.println(w);


    
        // TERNARY OPERATOR IS A SHORTER CONDITION TO IF ELSE STATEMENT
        int n = 4;
        int resultz = 0;

        // if(n%2==0)
        //     resultz=10;

        // else
        //     resultz=20;

        // INSTEAD OF USING THE LONG 4LINES OF CODE I WILL USE TERNARY OPERATOR
        resultz = n%2==0? 10 : 20;

        System.out.print(resultz);

    } 
}
