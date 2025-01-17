package com.sun.fintrack.category.query.repository;

import com.sun.fintrack.category.domain.Category;
import com.sun.fintrack.trade.domain.enums.TradeType;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

  Optional<Category> findByCategorySeqAndType(Long categorySeq, TradeType type);
}
