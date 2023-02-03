package restfullwebflux;
/**
 * Router para escuchar el tráfico generado en la ruta /mensaje, valor
 * proporcionado por nuestra clase de Controller Reactive (WebFlux).
 *
 * CONSIDERACIÓN:
 * Import static manualmente los Requests Predicates GET y accept
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class ReactiveWebfluxRouter {
    @Bean
    public RouterFunction<ServerResponse> routerFunction(ReactiveWebfluxHandler reactiveWebfluxHandler){
        return RouterFunctions.route(GET("/mensaje").and(accept(MediaType.APPLICATION_JSON)), reactiveWebfluxHandler::mensaje);
    }
}
