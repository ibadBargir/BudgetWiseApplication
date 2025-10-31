package budgetWise.com.Service;

import budgetWise.com.entity.Transaction;
import budgetWise.com.repository.TransectionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionService {

    private final TransectionRepository repo;

    public TransactionService(TransectionRepository repo) {
        this.repo = repo;
    }

    public void saveTransection(Transaction transaction){
        repo.save(transaction);
    }

    public List<Transaction> getAllTransections(){
        return repo.findAll();
    }

}
