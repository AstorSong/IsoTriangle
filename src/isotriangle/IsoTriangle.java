/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package isotriangle;

import java.util.Scanner;

/**
 *
 * @author asson2417
 */
public class IsoTriangle {

    /**
     * @param temp
     * @param size
     */
    public static void drawBar(int temp, char size){
        for (int i = 1; i < 10; i += 2){
            for (int k = 0; k < (4 - i / 2); k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void addSpaces (int temp, int size){
        for (int i = size - 1; i > 0; --i){
            for (int j = 0; j < i; ++j){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter the size: ");
        size = input.nextInt();
        int temp = size;
        drawBar(temp, (char) size);
    
            
        
    }
}
