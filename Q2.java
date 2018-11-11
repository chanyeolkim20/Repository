/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;
import java.util.*;
/**
 *
 * @author paul821
 */
public class Q2 {
    public static void main(String[] args) {
        int one = 1;
        int two = 1;
        int third;
        int x = 1;
        int y;
        int sum = 0;
        while (x<=31) {
            third = one + two;
            one = two;
            two = third;
            System.out.println(third);
            if(third%2==0) {
                sum = sum + third;
            }
            x++;
        }
        System.out.println(sum);
    }
}
