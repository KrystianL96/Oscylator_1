import javax.swing.*;

public class SpringApplet extends JApplet {
	//przeciazona metoda init()
	public void init(){
		
		//utworzenie wektorow
		Vector2D w1= new Vector2D(10,2);
		Vector2D w2= new Vector2D(3,4);
		
		//obliczenie sumi i roznicy wektorow
		Vector2D ws1 = w1.suma(w2);
		Vector2D ws2 = w1.roznica(w2);
		
		//obliczenie dlugosci wektorow
		double wd1 = w1.dl();
		double wd2 = w2.dl();
		
		//obliczenie wektorow znormalizowanych
		Vector2D wn1 = w1.normy();
		Vector2D wn2 = w2.normy();
		
		//oblicznie wektora 1 przemnozonego przez 3
		Vector2D wm1 = w1.mnozenie(3);
		
		//zwrocenie opisu wektorow na konsoli
		System.out.println("Wektory");
		System.out.format("Wektor_1: %s %f %s %f \n","x=",w1.x,"y=",w1.y);
		System.out.format("Wektor_2: %s %f %s %f \n","x=",w2.x,"y=",w2.y);
		System.out.format("Suma wektorow: %s %f %s %f \n","x=",ws1.x,"y=",ws1.y);
		System.out.format("Roznica wektorów: %s %f %s %f \n","x=",ws2.x,"y=",ws2.y);
		System.out.format("Wektor_1 znormalizowany: %s %f %s %f \n","x=",wn1.x,"y=",wn1.y);
		System.out.format("Wektor_2 znormalizowany: %s %f %s %f \n","x=",wn2.x,"y=",wn2.y);
		System.out.format("Dlugosc wektora_1: %f\n" ,wd1 );
		System.out.format("Dlugosc wektora_2: %f\n" ,wd2 );
		System.out.format("Wektor_1 przemnozony przez 3: %s %f %s %f \n","x=",wm1.x,"y=",wm1.y);
		
	}
	//przeciazona metoda paint()
	public void paint (){
	

	}
}
