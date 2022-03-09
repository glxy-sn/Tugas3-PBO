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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    double height;
    double volumeB;
    double LmB;
    
    public Balok(double length, double width, double height){
        super(length, width);
        this.height = height;
    }
    
    public void setHeight(double height){
		this.height = height; //memberikan nilai variabel tinggi dengan nilai yang ada di dalam parameter
	}

    public double getHeight(){
		return height; //memberikan nilai kembalian
	}

    @Override
    public void hitungVolume() {
        volumeB =  height * length * width;
    }

    @Override
    public void hitungLuasMuka() {
        LmB =  2 * ((length * width) + (length * height)+(width * height));
    }
    
}
