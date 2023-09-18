Why char array are preferred over Strings to store passwords?
1. With plain String you have much higher chances of accidentally printing the password to logs, monitors or some other insecure place. char[] is less vulnerable.

Consider this:

public static void main(String[] args) {
    String pw = "Password";
    System.out.println("String: " + pw);

    pw = "Password".toCharArray();
    System.out.println("Array: " + pw);
}

Prints:
String: Password
Array: [C@5829428e

2. It would seem logical to collect and store the password in an object of type java.lang.String. However, here's the caveat: Objects of type String are immutable, i.e., there are no methods defined that allow you to change (overwrite) or zero out the contents of a String after usage. 

Since, we cannot overwrite the value, it remains in the intern pool. Anybody who has access to the intern pool can access the string contents.

This feature makes String objects unsuitable for storing security sensitive information such as user passwords. You should always collect and store security sensitive information in a char array instead.

Why Strings are immutable in Java?
Choice by Language designers. You have C++ where Strings are mutable.
String pool exists because Strings are immutable. In turn, it enhances the performance by saving heap memory.
Thread safe, as we cannot make changes to String object and hence, it cannot be changed when accessed by multiple threads.
