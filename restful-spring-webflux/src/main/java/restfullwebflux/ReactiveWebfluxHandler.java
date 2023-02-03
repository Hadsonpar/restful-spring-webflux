package restfullwebflux;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Controller Reactive (WebFlux) para controlar todas las
 * solicitudes (peticiones), es el encargado de retornar una
 * respuesta según las peticiones.
 *
 * CONSIDERACIÓN REACTIVE:
 * Importar la librería MONO: Un objeto MONO es el encargado de de
 * reportar el cuerpo de un servicio REACTIVE, es decir retorar el
 * ServerResponse
 */
@Component
public class ReactiveWebfluxHandler {
    public Mono<ServerResponse> mensaje(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(new ReactiveWebflux("Hola Spring Webflux - Programación Reactiva!")));
    }
}