# String Class
String is an object in the java. The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class.

The String class provides methods for dealing with Unicode code points (i.e., characters), in addition to those for dealing with Unicode code units (i.e., char values).

<br>

### 1. charAt(int index) 
It returns a character at the specified index.

<br>

### 2. CodePoint :
Code point is the ascii value of the character at the specified index. 

- <b>codePointAt (int index) :</b> It returns ascii value of char at specified index
- <b>codePointBefore (int index) : </b> It returns ascii value of char before the specified index.
- <b>codePointCount (int starting_index, int ending_index) :</b> In simple terms it returns the length of string.
<br>

### 3. String.valueOf(T something)
It turns any datatype to string datatype.
 
 <br>

### 4. Character conversion
- <b>toLowerCase() :</b> converts string to lowercase.
- <b>toUpperCase() :</b> converts String to uppercase.
- <b>trim() :</b> removes trailing and leading white spaces.
<br>

### 5. substring, subsequence
Tho substring and subsequence holds same meaning the returning type is different. The method substring returns a string while subsequence returns "charSequence". The method substring is overloaded with two parameters : "<b>string.substring(int strating_index)</b>" determines the substring that is to be returned starts from specified index and run through whole string. While "<b>string.substring(int starting_index, int ending_index)</b>" specifies the indices from which the string to be returned. The ending index is always exclusive.

"<b>string.subSequence(int starting_index, int ending_index)</b>" is only method without any overloaded methods. It does the same thing as seubstring but it returns charSequence.

<br>

### 6. String Compare
Two strings are compared using "<b>string.equals(String another_string)</b>", "<b>string.equalsIgnoreCase(String snother_string)</b>". It compares two string value. The usual equality comparsion compare the two String objects rather than contents of the string. 

The another comparsion methods "<b>string.startsWith(String prefix)</b>", "<b>string.startsWith(String prefix, int comparsion_starts_from_index)</b>" , "<b>string.endsWith(String suffix)</b>".

The regex is also used to find the sequence in the string "<b>string.matches(String regex)</b>"

<br>

### 7. Index Retreive
By given char in the string the index of that char is specified using "<b>string.indexOf(char ch)</b>".
The slight variations of this method are : 

- string.indexOf(char ch)
- string.indexOf(char ch, int search_starts_from)
- string.indexOf(String substring)
- strign.indexOf(String substring, int search_starts_from)

If you want to search the element from the last the variations of the overload methods are :

- string.lastIndexOf(char ch)
- string.lastIndexOf(char ch, int search_starts_from)
- string.lastIndexOf(String substring)
- strign.lastIndexOf(String substring, int search_starts_from)
<br>

### 8. Spliting String
Spliting can be done using regex. If the string has given regex expression then the string is split into two different strings, If there are multiple patterns matching regex expressions the string would be divided the times the pattern matches. "<b>string.split(String regex)</b>", "string.split(String regex, int limit)</b>"

<br>

### 9. One Line methods
- string.length()
- string.isEmpty()