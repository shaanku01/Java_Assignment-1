package com.zemoso;
import java.util.*;
import java.io.*;

public class Main {

    public static void fileFinder(){
        Scanner ob = new Scanner(System.in);
        File files = new File("/home/shansrg");


            int flag = 0;
            System.out.println("Enter the file name");
            String st = ob.nextLine();
            String arr[] = files.list();
//            for(String sto : arr){
//                System.out.println(sto);
//            }
            for(String str : arr){
                Boolean val = st.equals(str);

                if(val){
                    flag=1;
                    System.out.println("File"+ str +" has been found");
                    System.out.println("Path is:" + files.getAbsolutePath()+"/"+st);

                }
}
        if(flag==0){
            System.out.println("File not found");
        }




    }

    public static void main(String[] args) {
        Main.fileFinder();

    }
}
