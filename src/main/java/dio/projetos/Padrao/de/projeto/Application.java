package dio.projetos.Padrao.de.projeto;

import dio.projetos.Padrao.de.projeto.Robo.Agressivo;
import dio.projetos.Padrao.de.projeto.Robo.Calmo;
import dio.projetos.Padrao.de.projeto.Robo.Comportamento;
import dio.projetos.Padrao.de.projeto.Robo.Medo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Comportamento agressivo = new Agressivo();
		Comportamento calmo = new Calmo();
		Comportamento medo = new Medo();

		System.out.println("Robo Agressivo");

		agressivo.mover();

		agressivo.falar();

		agressivo.action();

		System.out.println("--------------");
		System.out.println("Robo Calmo");

		calmo.mover();

		calmo.falar();

		calmo.action();

		System.out.println("--------------");
		System.out.println("Robo Medroso");

		medo.mover();

		medo.falar();

		medo.action();


	}



}
