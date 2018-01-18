package com.oquinn.exercise01;

public class Main {

    public static void main(String[] args) {
        String cityname = "Columbus";
        int zipcode = 43125;
        int[] dailyhighs = {32, 25, 2, 40, 45};
        int avgTemp = (dailyhighs[0] + dailyhighs[1] + dailyhighs[2] + dailyhighs[3] + dailyhighs[4]) / 5;
        
        System.out.println("City: " + cityname);
        System.out.println("Zipcode: " + zipcode);
        System.out.println("The average temp is " + avgTemp);
    }
}
