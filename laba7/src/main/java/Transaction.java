import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public class Transaction {

    @NonNull
    private Day dayOfTransaction;

    private double price;

    @NonNull
    private Recipient recipient;

    @NonNull
    private Sender sender;


}
