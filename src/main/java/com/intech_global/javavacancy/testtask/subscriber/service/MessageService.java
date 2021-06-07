package com.intech_global.javavacancy.testtask.subscriber.service;

import com.intech_global.javavacancy.testtask.subscriber.dto.Action;
import com.intech_global.javavacancy.testtask.subscriber.dto.Message;
import com.intech_global.javavacancy.testtask.subscriber.model.Purchase;
import com.intech_global.javavacancy.testtask.subscriber.model.Subscription;
import com.intech_global.javavacancy.testtask.subscriber.utils.TimeUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessageService {

    private final PurchaseService purchaseService;
    private final SubscriptionService subscriptionService;

    @Transactional
    // todo decide on return type
    public void save(Message message) {
        if (message == null) {
            throw new IllegalArgumentException("Message should not be null");
        }

        if (message.getAction() == Action.PURCHASE) {
            Purchase savedPurchase = purchaseService.save(messageToPurchase(message));
            log.info("Saved purchase {}", savedPurchase);
        }

        if (message.getAction() == Action.SUBSCRIPTION) {
            Subscription savedSubscription = subscriptionService.save(messageToSubscription(message));
            log.info("Saved subscription {}", savedSubscription);
        }

    }

    private Purchase messageToPurchase(Message message) {
        Purchase purchase = new Purchase();
        purchase.setMsisdn(message.getMsisdn());
        purchase.setIssuedAt(TimeUtils.unixTimeToMoscowTime(message.getTimestamp()));
        return purchase;
    }

    private Subscription messageToSubscription(Message message) {
        Subscription subscription = new Subscription();
        subscription.setMsisdn(message.getMsisdn() );
        subscription.setIssuedAt(TimeUtils.unixTimeToMoscowTime(message.getTimestamp()));
        return subscription;
    }

}
