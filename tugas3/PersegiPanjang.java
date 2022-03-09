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
public class PersegiPanjang implements MenghitungBidang{
    double length;
    double width;
    double around;
    double perimeter;
    
    //constructor input length and width
    public PersegiPanjang(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length){
                this.length = length; //memberikan nilai variabel panjang dengan nilai yang ada di dalam parameter
	}
    public double getLength(){
		return length; //memberikan nilai kembalian
	}
    public void setWidth(double width){
		this.width = width; //memberikan nilai variabel lebar dengan nilai yang ada di dalam parameter
	}
    public double getWidth(){
                return width; //memberikan nilai kembalian
	}
    
    
    @Override
    public void hitungLuas() {
        around = width * length;
    }

    @Override
    public void hitungKeliling() {
         perimeter = 2*(width+length);
    }
}
