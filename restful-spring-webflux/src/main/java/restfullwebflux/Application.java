package restfullwebflux;
/**
 * Crearemos nuestro propio método main para invocar a nuestro
 * método MONO getMessage
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        ReactiveWebfluxClient reactiveWebfluxClient = context.getBean(ReactiveWebfluxClient.class);
        // Capturamos el mensaje procesado
        System.out.println(">> mensaje = " + reactiveWebfluxClient.getMessage().block());
    }
}