package guru.springframework.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import guru.springframework.joke.controllers.JokeController;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokeappApplication {

	public static void main(String[] args) {
	
		ApplicationContext ctx = SpringApplication.run(JokeappApplication.class, args);
		JokeController controller = (JokeController) ctx.getBean("jokeController");
		System.out.println(controller.getJoke());
	}

}
