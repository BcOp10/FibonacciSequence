public class FibonnaciSequence {


public static int fibonacci(int x){
    if (x == 0){
    return 0;
   } else if (x == 1 || x == 2){
    return 1;
} else {
    return fibonacci(x - 1) + fibonacci(x - 2);
    }
}


    public static void main(String[] args) throws Exception {
       int input;
        if (args.length > 0){
            try {
                input = Integer.parseInt(args[0]);
                if (input < 0){
                   throw new Exception("Must enter an non-negative number!");
                }
            } catch (NumberFormatException e){
                //System.err.println("Argument " + args[0] + " must be an integer");
                throw new Exception("Must enter an integer!");
                //System.exit(1);
                //e.printStackTrace();
            } 
        }

        for (String str: args){
        input = Integer.parseInt(str);
            System.out.println("" + fibonacci(input));
        }
    }
}
