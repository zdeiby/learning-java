package com.fundamentos.springboot.fundamentos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentos.component.ComponentDependecy;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner{

	private ComponentDependecy componentDependecy;

	public FundamentosApplication(ComponentDependecy componentDependecy){
		this.componentDependecy= componentDependecy;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependecy.saludar();
	}

}
