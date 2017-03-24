package com.study.neo4j;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TaskTest {

	@LocalServerPort
	private int port;

	private URL base;
	@Autowired
	private TestRestTemplate restTemplate;

	@Before
	public void setUp() throws Exception {
		this.base = new URL("http://localhost:" + port + "/");
	}

	@Test
	public void findByTaskName() {
		System.out.println("findByTaskName");
		/*ResponseEntity<Task> test = this.restTemplate.getForEntity(this.base.toString() + "/测试任务", Task.class);
		System.out.println(gson.toJson(test.getBody()));*/
	}

	@Test
	public void saveTask() {
		System.out.println("saveTask");
		/*Task task = new Task();
		task.setTaskName("测试任务");
		ResponseEntity<Task> test = this.restTemplate.postForEntity(this.base.toString() + "/task", task, Task.class);
		System.out.println(gson.toJson(test.getBody()));*/
	}
}