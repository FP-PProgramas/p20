/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.problema.pkg020;
import java.util.*;
/**
 *
 * @author karen
 */
public class FpProblema020 {
 public static int suma(int N,int Suma){
        for(int i=2;i<N;i++){
            if(N % i==0){
            Suma=Suma+i;
            }
        }
    return Suma;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        int sum1=1,sum2=1;
            System.out.println("Teclea el primer numero");
        a=sc.nextInt();
            System.out.println("Ahora el segundo");
        b=sc.nextInt();
        sum1=suma(a,sum1);
        sum2=suma(b,sum2);
       
        if((sum1==b)&&(sum2==a)){
            System.out.println("los numeros "+ a+" y "+b+" Si son numeros amigos");
        }else{
            System.out.println("los numeros "+ a+" y "+b+" No son numeros amigos");
        }
     }
}