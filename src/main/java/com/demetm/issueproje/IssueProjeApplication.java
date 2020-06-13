package com.demetm.issueproje;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@SpringBootApplication
public class IssueProjeApplication {

	public static void main(String[] args) {

		SpringApplication.run(IssueProjeApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper(){

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration() .setMatchingStrategy(MatchingStrategies.STRICT);

		return modelMapper;
	}

	@Bean
	public Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {
		Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
		factory.setResources(new Resource[]{new ClassPathResource("projects.json")});
		return factory;
	}



}
