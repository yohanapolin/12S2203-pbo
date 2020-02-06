/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23 12S16008 Alfendo Situmorang
 * @author 23 12s18018 Yohana Polin Simatupang
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] _args) {
        System.out.println("Hello, world!");
    

// declaring and manipulating primitive variables
int gear = 1;
boolean result = true;
char capitalC = 'C';
byte b = 100;

System.out.println(gear + ", " + result + "' " + capitalC + "' " + b);

gear++;
result = !result;
capitalC += 4;

System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);

// 26 in hexadecimal and binary
int hexVal = 0x1a;
int binVal = 0b11010;

System.out.println(hexVal + ", " + binVal);

//intantiating and manipulating objects
String name = "Wiro Sableng";
Short gearObject  = 1;
Boolean resultObj = true;

System.out.println(name + ", " + gearObject + ", " + resultObj);

name = name.toUpperCase();
gearObject++;
resultObj = (result == false) || !resultObj;

System.out.println(name + ", " + gearObject + ", " + resultObj);

// array, collections, and loop
int[][] numbers = new int[10][10];

for (int i = 0; i < numbers.length; ++i){
    for (int j = 0; j < numbers[i].length; ++j){
        numbers[i][j] = i + j;
    }
}

for (int i = 0; i < numbers.length; ++i) {
    for (int j = 0; j < numbers[i].length; ++j){
        System.out.print(numbers[i][j] + " ");  
    }

System.out.println();
}

//challenge
System.out.println();
System.out.println("Challenge");

ArrayList<Integer> array = new ArrayList<Integer>();
int num = 10;

for (int p=0; p <num; ++p){
    int c=0;
    int d=0;
    for(int e=0; e< num; ++e){
        c = p + d;
        System.out.print(c + " ");
        d++;
    }
    System.out.println();
        
    }}

    }
