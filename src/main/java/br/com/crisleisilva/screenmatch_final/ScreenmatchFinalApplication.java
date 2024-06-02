package br.com.crisleisilva.screenmatch_final;

import br.com.crisleisilva.screenmatch_final.model.DadosSerie;
import br.com.crisleisilva.screenmatch_final.principal.Principal;
import br.com.crisleisilva.screenmatch_final.service.ConsumoApi;
import br.com.crisleisilva.screenmatch_final.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchFinalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchFinalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}