package mario.cph;


import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Order {
    private final List<Pizza> pizzas;
    private final LocalDateTime ldt;

    Order() {
        ldt = LocalDateTime.now();
        pizzas = new ArrayList<>();
    }



}
