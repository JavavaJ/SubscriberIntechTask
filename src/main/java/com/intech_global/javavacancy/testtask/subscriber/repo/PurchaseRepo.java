package com.intech_global.javavacancy.testtask.subscriber.repo;

import com.intech_global.javavacancy.testtask.subscriber.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepo extends JpaRepository<Purchase, Long> {
}
