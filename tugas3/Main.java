/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Main {
    public static void main(String[] args){
        int choose;
        double length;
        double width;
        double height;
        double radius;
        int btm = 0;
        Tabung T = new Tabung (0,0);
        Balok B = new Balok(0,0,0);
        
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Cuboid and Cylinder Calculator Program");
            System.out.println("======================================");  
            System.out.println("                Main Menu             ");
            System.out.println("1. Calculate Cuboid");
            System.out.println("2. Calculate Cylinder");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choose = input.nextInt();
            if (choose == 1){
                System.out.print("Input length: ");
                length = input.nextDouble();
                B.setLength(length);
                
                System.out.print("Input width: ");
                width = input.nextDouble();
                B.setWidth(width);
                
                System.out.print("Input height: ");
                height = input.nextDouble();
                B.setHeight(height);
               
                B.hitungLuas();
                System.out.println("Area of Rectangle : " + B.around);
                B.hitungKeliling();
                System.out.println("Perimeter of Rectangle : " + B.perimeter);
                
                B.hitungVolume();
                System.out.println("Volume of Rectangle : " + B.volumeB);
                B.hitungLuasMuka();
                System.out.println("Luas Muka of Rectangle : " + B.LmB);
                
                System.out.println("Back to main menu? (Yes = 1 | No = 0)");
                btm = input.nextInt();
            }else if (choose == 2){
                System.out.print("Input radius: ");
                radius = input.nextDouble();
                T.setRadius(radius);
                
                System.out.print("Input height: ");
                height = input.nextDouble();
                T.setHeight(height);
                
                T.hitungLuas();
                System.out.println("Area of Circle : " + T.aroundL);
                T.hitungKeliling();
                System.out.println("Perimeter of Circle : " + T.perimeterL);
                
                T.hitungVolume();
                System.out.println("Volume of Circle : " + T.volumeL);
                T.hitungLuasMuka();
                System.out.println("Luas Muka of Circle : " + T.LmL);
                
                System.out.println("Back to main menu? (Yes = 1 | No = 0)");
                btm = input.nextInt();
            }else if (choose == 0){
                btm = 0;
            }else{
                System.out.println("Please input the correct number");
            }
        }while (btm == 1);
    }
}
