package ma.projet.graph;

import ma.projet.graph.entities.Compte;
import ma.projet.graph.entities.TypeCompte;
import ma.projet.graph.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GraphApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphApplication.class, args);
	}


	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			compteRepository.save(new Compte(null, 1000.0, new Date(2022 - 1900, 1, 15), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 2500.0, new Date(2022 - 1900, 2, 10), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 3200.0, new Date(2022 - 1900, 3, 5), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 4200.0, new Date(2022 - 1900, 4, 20), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 1500.0, new Date(2022 - 1900, 5, 25), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 5400.0, new Date(2023 - 1900, 6, 10), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 6300.0, new Date(2023 - 1900, 7, 15), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 7200.0, new Date(2023 - 1900, 8, 20), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 8200.0, new Date(2023 - 1900, 9, 5), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 9100.0, new Date(2023 - 1900, 10, 30), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 4500.0, new Date(2024 - 1900, 0, 10), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 2800.0, new Date(2024 - 1900, 1, 15), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 3600.0, new Date(2024 - 1900, 2, 20), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 4800.0, new Date(2024 - 1900, 3, 25), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 5800.0, new Date(2024 - 1900, 4, 30), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 6700.0, new Date(2024 - 1900, 5, 5), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 7500.0, new Date(2024 - 1900, 6, 10), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 8300.0, new Date(2024 - 1900, 7, 15), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 9200.0, new Date(2024 - 1900, 8, 20), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 9900.0, new Date(2024 - 1900, 9, 25), TypeCompte.COURANT));
		};
	}

}
