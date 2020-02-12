/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23_12S16008 Alfendo Situmorang
 * @author 23_12S18018 Yohana Simatupang
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

  private static List<String> nims = new ArrayList<>();
  private static List<String> names = new ArrayList<>();
  
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        boolean quit = false;
        do {
        s = in.nextLine();
        String[] tokens = s.split(" ");
        String output = "";
        switch (tokens[0]) {
        case "add":
            add(tokens[1], tokens[2]);
            break;
        case "find":
            output = find(tokens[1]);
            break;
        case "count":
            output = "" + count();
            break;
        case "reset":
            reset();
            break;
        case "exit":
        quit = true;
 }
 
        if (output.length() > 0) {
         System.out.println(output);
 }
 } 
        while (!quit);
   
    }
        public static void add (String _nim, String _name){
            int checkStudent = 0;
            for (int i = 0; i<nims.size(); i++){
                if (_nim.equals(nims.get(i))){
                    checkStudent++;
                }
            }
            if (checkStudent == 0){
                nims.add(_nim);
                names.add(_name);
            }
          }
          
          
        public static String find(String _nim){
        int index = nims.indexOf(_nim);
            if (index >= 0){
                return (nims.get(index) + " " + names.get(index));
            }
                return "";
        }
        
        public static int count(){
          if (nims.size() > 0){
              return nims.size();}
              else {
              return 0;
                      }
        }        
        
        
        
        public static void reset(){
            nims.clear();
            names.clear(); 
        }

}


