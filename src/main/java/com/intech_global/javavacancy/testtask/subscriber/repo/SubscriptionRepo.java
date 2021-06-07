package com.intech_global.javavacancy.testtask.subscriber.repo;

import com.intech_global.javavacancy.testtask.subscriber.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepo extends JpaRepository<Subscription, Long> {
}
