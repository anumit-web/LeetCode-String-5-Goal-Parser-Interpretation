/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Final Value of Variable After Performing Operations");

        Solution solution = new Solution();

        String command1 =  "G()(al)" ;      
        String output1 = solution.interpret(command1);
        System.out.println("Output = " + output1);

        String command2 =  "G()()()()(al)" ;      
        String output2 = solution.interpret(command2);
        System.out.println("Output = " + output2);




    }
}
