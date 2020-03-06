public class Lab2
{
    public static void main(String [] args)
    {
        if (args.length != 3) {
            throw new IllegalArgumentException("Exactly 3 parameters required !");
        }
        int firstArgInt=0;
        int secondArgInt=0;
        try {
            firstArgInt = Integer.parseInt(args[1]);
        } 
        catch (NumberFormatException nbfe) { }
        try {
            secondArgInt = Integer.parseInt(args[2]);
        }
         catch (NumberFormatException nbfe) {}
       
        for(int i=0;i<args[0].length();i++)
        {
            if(i>=firstArgInt && i<= secondArgInt)
                 System.out.println(args[0].charAt(i));
        }

    
    }
}