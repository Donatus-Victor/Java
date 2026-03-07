public class Switchz {
    public static void main(String a[]){

    int n = 2;

    // if(n==1)
    //     System.out.print("Monday");

    // else if(n==2)
    //     System.out.print("Tuesday");

    // else if(n==2)
    //     System.out.print("Wednesday");

    // else if(n==2)
    //     System.out.print("Thursday");

    // else if(n==2)
    //     System.out.print("Friday");

    // else if(n==2)
    //     System.out.print("Saturday");

    // else if(n==2)
    //     System.out.print("Sunday");   


    // USING SWITCH CASE INPLACE OF IIF ELSE STATEMENT
    switch(n){
        case 1:
            System.out.println("Monday");
            break;
        
        case 2:
            System.out.print("Tuesday");
            break;
        
        case 3:
            System.out.print("Wednesday");
            break;
        
        case 4:
            System.out.print("Thursday");
            break;
                    
        case 5:
            System.out.print("Friday");
            break;

        case 6:
            System.out.print("Saturday");
    
        case 7:
            System.out.print("Sunday");
        
        default:
            System.out.print("Invalid Number: Enter a Valid Number");
    }

    }
}
