// import java.lang.System;
import java.io.Console;

public class SystemExample {
    //We are here to know "System" methods that we usually use to print the output as "System.out.print()";
    public static void main (String[] args) {
        String[] names = {"Vamshi Krishna", "Keerthana", "Neihaal"};
        long time = System.currentTimeMillis();
        
        //To use arrayCopy we firts have to initialize the array to copy.
        /*System.arrayCopy takes 5 parameters which are 
            1. Source of the array of which being copied
            2. Starting position for the copy
            3. Destination array
            4. The destination position where to be copied
            5. Length of the elements to be copied.
        */ 
        String[] favorite_person_names = new String[3];
        System.arraycopy(names, 0, favorite_person_names, 0, 3);
        for (int i = 0; i < 3; i++) { print(favorite_person_names[i]); }
        println("");

        /* System.getProperty(), System.clearProperty(), System.setProperty() 
            it all uses property defined by the system 
            such as using string "user.dir" shows us the current working folder 
            "java.class.path" shows us the path where java class is defined.
        */
        println(System.getProperty("user.dir"));
        println(System.getProperties());
        // System.setProperty();
        // System.clearProperty(null);


        // *************CONSOLE*************
            Console console = System.console();
            // char[] password = console.readPassword("Type your password (Password is protected) : ");
            // String input = console.readLine("Give input to the console : ");
            // console.printf("password is : %s", String.valueOf(password));
            // console.format("Password is : %s", String.valueOf(password));
        //*************Console End*************

        println((System.currentTimeMillis() - time) * 100);

        println(System.lineSeparator());

        print(System.nanoTime());

        // It stores the system enivornment variables in map way
        println(System.getenv("COMPUTERNAME"));
        
        System.exit(0);
    }

    public static <T> void print (T string) { System.out.print(string + " "); }
    public static <T> void println (T string) { System.out.println(string); }
}