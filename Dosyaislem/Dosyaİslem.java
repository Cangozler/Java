/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dosyaislem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Can
 */
public class Dosyaİslem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ad,soy,no;
            int fin,vize;
            double ort;
            
            Scanner n = new Scanner (System.in);
             
            System.out.println("Ad giriniz");
            ad=n.next();
            System.out.println("Soy ad giriniz");
            soy=n.next();
            System.out.println("No giriniz");
            no=n.next();
            System.out.println("Vize giriniz");
            vize=n.nextInt();
            System.out.println("final giriniz");
            fin=n.nextInt();
            String son;
            ort=vize*0.4+fin*0.6;
            if(ort<=30)
            {
                  son="kaldı";
            }
            else{
                    son="geçti";
            }
            File f = new File("C:/yeni/"+ad+".txt");
            if (f.exists()) {
                System.out.println("dosya var");
                try
             {
            FileInputStream oku=new FileInputStream (f);
             int size=(int) f.length();
                for (int i = 0; i < size; i++)
                {
                 System.out.print((char)oku.read());
                }                           
        }
        catch(IOException e){
            System.out.println("Bir hata oluştu");
        }
            
            
             }
             else{
            System.out.println("dosya yok yeni dosya yazılıyor");
                try{
                FileWriter yaz=new FileWriter("C:/yeni/"+ad+".txt");
                yaz.write("Oğrenci adi "+ad);
                yaz.write("Oğrenci soy adi "+soy);
                yaz.write("Oğrenci vize notu "+vize);
                yaz.write("Oğrenci final notu "+fin);
                yaz.write("Oğrenci ortalamasi"+String.valueOf(ort));
                yaz.write("Oğrenci Dürümü"+String.valueOf(son));
                yaz.write("*****");
                yaz.close();
                    }
            catch(IOException e){
                System.out.println("Dosya yazılamadı");
            }
    }
    
    }
}
