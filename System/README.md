# System Class

The System class is used average on daily basis to print the output using "System.out.println()". This class cannot be instantized but can be directly used with System call. Some of average methods used for the System class are : 

### Copying Array

The method arrayCopy is used to copy array elements from one array to another array. The parameter used for this method are : 
1. Source of the array of which being copied
2. Starting position for the copy
3. Destination array
4. The destination position where to be copied
5. Length of the elements to be copied from source array


### System Property

Property methods are general operating System properties which are pre-defined. Some general property of os are : "user.dir" -> It gives the current working directory 
"java.class.path" -> It gives the java class installation path. 

Now this properties can be accessed by "System.getProperties()".
If you want a specific property you can use "System.getProperty(String string)".
To change the property "System.setProperty(String string, String string2)"
To reset the porperty "System.clearProperty()"


### System Environment Variables

Environment variables of the system can be seen using "System.getenv()". It returns all the enivronment varibales.

"System.getenv(String string)" provides environment variable of specified string.


### Exit Program

If you want to exit the program at any point of the time you can use "System.exit(int num)". Here the default parameters is int, if num = 0 then the termination was occured safely. Non-xero indicates abrupt termination.


### Time 

"System.currentTimeMillis()" will return time in milli seconds.

"System.nanoTime()" will return accurate time provided by JVM.


### Console

System class returns a interactive console on method "System.console()". It uses to get interactive console to work with. The provided console would work as normal terminal. The console returned itself is a object, hence it has to be stored in the console class. The few important console classes are : 

- readPassword(String string), readLine()

It reads the from the console and both the methods does the same work but "readPassword()" hides the input data and it can be stored only in char array "char[]". While readLine() reads the data in usual manner.

- printf(Format format, String string), format(Format format, String string)

printf, format methods works same it takes format string such as "%s" and actual string variable "num" and outputs the data.