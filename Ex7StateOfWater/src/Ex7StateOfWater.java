/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author 17011947
 */
public class Ex7StateOfWater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = kb.nextDouble();
        if (temperature <= 0){
            System.out.println("ICE");}
        else if (temperature >= 100){
            System.out.println("GAS");}
        else
            System.out.println("LIQUID");
        }
    }

