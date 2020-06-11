/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleproblem;

import java.io.*;
/**
 *
 * @author 
 */
public class TriangleProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
      //DataInputStream stdin = new DataInputStream (System.in);
      BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
        
        int a=1;
        int b=1;
        int c=1;
        boolean control=false;
        while (!control) {

            // Sides of triangle.
            System.out.println ("\nEnter side1 length: ");
            a = Integer.parseInt (stdin.readLine());

            System.out.println ("Enter side2 length: ");
            b = Integer.parseInt (stdin.readLine());

            System.out.println ("Enter side3 length: ");
            c = Integer.parseInt (stdin.readLine());
            control=checkInputs(a,b,c);
            
        }
        System.out.println ("Side a is ");
        System.out.println (a);
        System.out.println ("Side b is ");
        System.out.println (b);
        System.out.println ("Side c is ");
        System.out.println (c);
                   
        System.out.println ("\nIs triangle? ");
        System.out.println(typeTriangle(a,b,c));
             
    }
    
    //public static boolean checkInputs(Object a,Object b, Object c) {
    	public static boolean checkInputs(int a,int b, int c) {
    	boolean c1=false;
        boolean c2=false;
        boolean c3=false;
        //try {
    	//c1=(1<=(Integer)a)&((Integer)a<=200);
        //c2=(1<=(Integer)b)&((Integer)b<=200);
        //c3=(1<=(Integer)c)&((Integer)c<=200);
        c1=(1<=a)&(a<=200);
        c2=(1<=b)&(b<=200);
        c3=(1<=c)&(c<=200);

        if (!c1){
            System.out.println ("Value of a is not in the range of permitted values");
        }
        else if (!c2){
            System.out.println ("Value of b is not in the range of permitted values");
        }
        else if (!c3){
            System.out.println ("Value of c is not in the range of permitted values");
        }
        return c1&c2&c3;
        //}catch(Exception e) {
        //	System.out.println("Values entered aren't valid");
        //}
		//return false;
    }
    
    public static String typeTriangle(int a, int b, int c) {
    	boolean tr=(a<b+c)&(b<a+c)&(c<a+b);
        System.out.println (tr);
        String type="";
        if (tr){
            if(a==b & b==c){
               type="Equilateral";
            }
            else if (a!=b & a!=c & b!=c){
                type="Scalene";
            }
            else{
                type="Isosceles";
            }                       
        }
        else{
            type="Not a triangle";
        }
        return type;
    }
    
}
