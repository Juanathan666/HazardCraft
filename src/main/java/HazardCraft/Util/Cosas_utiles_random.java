package HazardCraft.Util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;

public class Cosas_utiles_random {

	public static double calcular_distancia_entre_un_punto_y_el_jugador(double x1,double y1, double z1, EntityPlayer player) {
		 //Coje los puntos y crea un vector y hace su modulo
		 double x2 = player.posX;
		 double y2 = player.posY;
		 double z2 = player.posZ;
		 
		 //Resta los puntos para crear el vector A--->B
		 double vectorx = x1-x2;
		 double vectory=  y1-y2;
		 double vectorz= z1-z2;
		 
		 //Colocamos el resultado de los puntos del vector en un Vector3d de java
		Vec3d e = new Vec3d(vectorx, vectory, vectorz);
		
		//Le damos el resultado en Bloques obv en metros imposible en minecraft xd. La longitud del vector se calculara haciendo el modulo del vector que seria. 
		//La raiz cuadrada de la suma de las componentes al cuadrado osea.
		//vector x^2 +  vector y^2 + vector z^2 todo esto raiz cuadrada.
		return  Math.sqrt((Math.pow(e.x, 2)) + (Math.pow(e.y, 2)) + (Math.pow(e.z, 2)));	
	}
	
	public static double calcular_distancia_entre_2_puntos(double x1, double y1, double z1, double x2, double y2, double z2) {
		//Resta los puntos para crear el vector A--->B
		 double vectorx = x1-x2;
		 double vectory=  y1-y2;
		 double vectorz= z1-z2;
		 
		 //Colocamos el resultado de los puntos del vector en un Vector3d de java
		Vec3d e = new Vec3d(vectorx, vectory, vectorz);
		
	         	//Le damos el resultado en Bloques obv en metros imposible en minecraft xd. La longitud del vector se calculara haciendo el modulo del vector que seria. 
				//La raiz cuadrada de la suma de las componentes al cuadrado osea.
	         	//vector x^2 +  vector y^2 + vector z^2 todo esto raiz cuadrada.
		return  Math.sqrt((Math.pow(e.x, 2)) + (Math.pow(e.y, 2)) + (Math.pow(e.z, 2)));
		
	}
	
}
