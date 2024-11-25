package transaction.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import transaction.poc.entities.Transaction;

public interface TransRepository extends JpaRepository<Transaction,Integer> {

}
