package restfullwebflux;

/**
 * Controller Entidad WebFlux para retornar el mensaje a procesar.
 * POJO que retorna el servicio RESTful en serialización JSON.
 */
public class ReactiveWebflux {
    private String message;

    public ReactiveWebflux() {
    }

    public ReactiveWebflux(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ReactiveWebflux{" +
                "message='" + message + '\'' +
                '}';
    }
}