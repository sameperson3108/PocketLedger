package ru.sameperson3108.pocketledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sameperson3108.pocketledger.entity.Category;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
