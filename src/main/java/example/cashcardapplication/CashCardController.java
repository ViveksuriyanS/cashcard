package example.cashcardapplication;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/cashcards")
public class CashCardController {

    private final CashCardRepository cashCardRepository;

    private CashCardController(CashCardRepository cashCardRepository) {
        this.cashCardRepository = cashCardRepository;
    }

    @GetMapping("/{requestedId}")
    public ResponseEntity<CashCard> findById(@PathVariable Long requestedId) {

        Optional<CashCard> cashCard = cashCardRepository.findById(requestedId);
        // Traditional If else statement
        if (cashCard.isPresent()) {
            return ResponseEntity.ok(cashCard.get());
        } else {
            return ResponseEntity.notFound().build();
        }

        // return cashCard.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
