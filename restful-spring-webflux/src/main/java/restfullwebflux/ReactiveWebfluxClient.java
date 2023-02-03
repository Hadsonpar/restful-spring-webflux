package restfullwebflux;
/**
 * Implementamos una clase basada en WebClient para consumir nuestro
 * servicio RESTful
 *
 * CONSIDERACIÓN:
 * Importar WebClient, que es la clase para realizar funciones reactivas  en
 * forma de MONO, con la finalidad de procesar el contenido del mensaje, en
 * nuestro caso será devuelto por el metodo getMessage en base a funciones MONO
 */

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class ReactiveWebfluxClient {
    //declarar WebCleint
    private final WebClient webClient;
    /**
     * Spring Boot configura automáticamente la instancia WebClient.Builder
     * con valores predeterminados y personalizaciones.
     * Podemos usarlo para crear un `WebClient` dedicado para nuestro proyecto.
     */
    public ReactiveWebfluxClient(WebClient.Builder builder){
        this.webClient = builder.baseUrl("http://localhost:8080").build();
    }

    //Crear nuestro método MONO para capturar las petición en formato JSON
    public Mono<String> getMessage(){
     return this.webClient.get().uri("/mensaje").accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(ReactiveWebflux.class).map(ReactiveWebflux::getMessage);
    }
}
