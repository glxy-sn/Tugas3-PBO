/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author mac
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double height;
    double volumeL;
    double LmL;
    
    public Tabung(double radius, double height){
                super(radius);
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
        volumeL = phi * radius * radius * height;
    }

    @Override
    public void hitungLuasMuka() {
        LmL = 2 * phi * radius * (radius + height);
    }
    
}
