package hello.advanced.app.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerV1 {

    private final OrderServiceV1 orderServiceV0;

    @GetMapping("/v1/request")
    public String request(String itemId) {
        orderServiceV0.orderItem(itemId);
        return "ok";
    }
}
