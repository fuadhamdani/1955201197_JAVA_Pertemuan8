/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_8;

/**
 *
 * @author HP
 */
public class Java_Math_1 {
    public static void main(String[] args) {
        double x = 28;
        double y = 4;
        
        //bilangan terbesar antara x dan y
        System.out.println("Maximum number of x and y is : "+ Math.max(x, y));
        
        //akar dari y
        System.out.println("Square root of y is : "+ Math.sqrt(y));
        
        //28 pangkat 4
        System.out.println("Power of x and y is : "+ Math.pow(x, y));
        
        //mengembalikan logaritma nilai yang diberikan
        System.out.println("Logarithm of x is : "+ Math.log(x));
        System.out.println("Logarithm of y is : "+ Math.log(y));
        
        //mengembalikan logaritma nilai yang diberikan ketika basis adalah 10
        System.out.println("log10 of x is : "+ Math.log10(x));
        System.out.println("log10 of y is : "+ Math.log10(y));
        
        //mengembalikan log x + 1
        System.out.println("log1p of x is : "+ Math.log1p(x));
        
        System.out.println("exp of a is : "+ Math.exp(x));
        
        System.out.println("expm1 of a is : "+ Math.expm1(x));
    }
 
}
