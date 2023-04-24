public class Test
{ 
    public static void main(String[] args)
    {
        
        byte byte_var = 127;
        short short_var =  -32768;
        int int_var = 2000100010;
        long long_var = 2147483647;
        float float_var = 0.1234567890123456789f;
        double double_var = 0.1234567890123456789f;
        boolean boolean_var = true;

        System.out.printf("%%c is %c\n", 'A');
        System.out.printf("%%d is %d %-4d1 %03d\n", int_var, short_var, byte_var); 
        //The %3d specifier is used with integers, and means a minimum width of three spaces,
        System.out.printf("%%e is %13e\n", float_var);
        System.out.printf("%%f is %05.16f\n", float_var);// tai po 8 butu kiek is langoiu uzims visas print
        //System.out.printf("%%i is %i\n", 10000); 

        System.out.printf("%%o is %o\n", byte_var);
        System.out.printf("%%s is %s", "Name Is Nice");
        //System.out.printf("%%u is %u", int_var);
        System.out.printf("%%x is %x", long_var);
        System.out.printf("%,d %n", 10000);
        System.out.printf("%% is %%");
    }
}
//https://alvinalexander.com/programming/printf-format-cheat-sheet/
