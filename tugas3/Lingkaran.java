/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author mac
 */
public class Lingkaran implements MenghitungBidang{
    double radius;
    double phi  = 3.14;
    double aroundL;
    double perimeterL;
    
    public Lingkaran(double radius){
        this.radius = radius;
    }
    //constructor input radius
    public void setRadius(double radius){
		this.radius = radius; //memberikan nilai variabel panjang dengan nilai yang ada di dalam parameter
	}
    public double getRadius(){
		return radius; //memberikan nilai kembalian
	}

    @Override
    public void hitungLuas() {
        aroundL = phi * radius * radius;
    }

    @Override
    public void hitungKeliling() {
        perimeterL = 2 * phi * radius;
    }
    
    
}
