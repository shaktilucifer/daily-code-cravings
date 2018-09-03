import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.List;
import java.util.Collections.*;
import java.util.stream.*;

class TestingVisualStudio{
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println("Testing java compilation in Visual Studio Code");
        System.out.println(Math.min(1, 0));
        List<String> testList = Arrays.asList("griffyndor","Slytherin","Hufflepuff","Ravenclaw");
        List<String> goodAndNuetral = testList.stream().filter(i -> !i.equals("Slytherin")).collect(Collectors.toList());
        
        System.out.println(goodAndNuetral);
    }
}