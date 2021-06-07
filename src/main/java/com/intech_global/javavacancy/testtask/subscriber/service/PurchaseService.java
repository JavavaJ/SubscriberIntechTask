package com.intech_global.javavacancy.testtask.subscriber.service;

import com.intech_global.javavacancy.testtask.subscriber.model.Purchase;
import com.intech_global.javavacancy.testtask.subscriber.repo.PurchaseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final PurchaseRepo purchaseRepo;

    @Transactional
    public Purchase save(Purchase purchase) {
        return purchaseRepo.save(purchase);
    }
}
