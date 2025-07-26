// package Lec5Algos;
import java.util.*;
public class StringSearch {
    public static void main(String[] args) {
     System.out.println(SearchString("Arya", 'd'));   
    }
    static boolean SearchString(String str, char b) {
        if(str.length()==0){
            return false;
        } //functionstr.length()

        for(int i = 0;i<str.length();i++){
            if(b == str.charAt(i)){
                return true;
            }
    }
    return false;
    }
}

