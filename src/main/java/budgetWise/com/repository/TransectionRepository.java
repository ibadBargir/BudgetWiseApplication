package budgetWise.com.repository;


import budgetWise.com.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  TransectionRepository extends JpaRepository<Transaction, Long> {

}
