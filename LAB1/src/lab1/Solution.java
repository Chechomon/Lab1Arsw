/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 2110461
 */
public class Solution {
    /**
     * @param x String
     * @param y String
     */
    static boolean isAnagram(String a,String b){
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
        boolean r = false;
        if(array1.length!=array2.length){
            return r;
        }else{
            for(int i = 0; i < array1.length; i++){
                if(Character.toString(array1[i]).equalsIgnoreCase(Character.toString(array2[i]))){
                    r=true;
                }
                if(array2.toString().contains(Character.toString(array1[i]))){
                    r = true;
                } else {
                    return r;
                }
            }
            return r;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
    
}
