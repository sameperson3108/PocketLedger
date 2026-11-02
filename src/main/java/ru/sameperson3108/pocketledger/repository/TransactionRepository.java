package ru.sameperson3108.pocketledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sameperson3108.pocketledger.entity.Transaction;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
