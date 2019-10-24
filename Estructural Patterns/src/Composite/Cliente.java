package Composite;

import java.util.ArrayList;

public class Cliente {

	public static void main(String[] args) {
		ArrayList<Componente> componentes = new ArrayList<>();
		
		Componente motor1 = new MotorGasolina();
		Componente bujia1 = new Bujia();
		bujia1.agregarComponente(new Conexion());
		bujia1.agregarComponente(new Aislante());
		motor1.agregarComponente(bujia1);
		motor1.agregarComponente(new Piston());
		motor1.agregarComponente(new Piston());
		motor1.agregarComponente(new Piston());
		
		componentes.add(motor1);
		
		
		Componente motor2 = new MotorGasolina();
		Componente bujia2 = new Bujia();
		bujia2.agregarComponente(new Conexion());
		bujia2.agregarComponente(new Aislante());
		motor2.agregarComponente(bujia2);
		motor2.agregarComponente(new Piston());
		motor2.agregarComponente(new Piston());
		motor2.agregarComponente(new Piston());
		motor2.agregarComponente(new Piston());
		motor2.agregarComponente(new Piston());
		motor2.agregarComponente(new Piston());
		
		componentes.add(motor2);
		
		for(Componente c : componentes) {
			System.out.println(c.descripcionComponente());
		}
		
	}

}
