package com.intech_global.javavacancy.testtask.subscriber.service;

import com.intech_global.javavacancy.testtask.subscriber.model.Subscription;
import com.intech_global.javavacancy.testtask.subscriber.repo.SubscriptionRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SubscriptionService {

    private final SubscriptionRepo subscriptionRepo;

    @Transactional
    public Subscription save(Subscription subscription) {
        return subscriptionRepo.save(subscription);
    }
}
