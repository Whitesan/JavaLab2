public class Main
{
    public static void main(String [] args) throws InvalidRange
    {
        if (args.length != 3) {
            throw new IllegalArgumentException("Exactly 3 parameters required !");
        }
        int firstArgInt=0;
        int secondArgInt=0;
        try {
            firstArgInt = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }

        try {
            secondArgInt = Integer.parseInt(args[2]);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }


        if(firstArgInt < 0 || secondArgInt >= args[0].length())
            throw new InvalidRange("Wrong parameters");

        for(int i=0;i<args[0].length();i++)
        {
            if(i>=firstArgInt && i<= secondArgInt)
                System.out.println(args[0].charAt(i));
        }


    }
}