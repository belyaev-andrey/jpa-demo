package io.jpabuddy.spring.demo;

import io.jpabuddy.spring.demo.entities.Project;
import io.jpabuddy.spring.demo.repositories.ProjectRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.TestPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class JpaDemoApplicationTests {

    @Autowired
    private ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testProjectRepository() {
		List<Project> projects = projectRepository.findAll();
		assertNotNull(projects);
	}

}
