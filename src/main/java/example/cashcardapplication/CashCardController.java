package example.cashcardapplication;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cashcards")
public class CashCardController {

    @GetMapping("/{cashCardId}")
    public ResponseEntity<CashCard> findCashCardById(@PathVariable long cashCardId) {
        CashCard cashCard;
        if(cashCardId == 1001L)  {
            cashCard = new CashCard(1001L, 123.45);
            return ResponseEntity.ok(cashCard);

        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
