package com.intech_global.javavacancy.testtask.subscriber.controller;

import com.intech_global.javavacancy.testtask.subscriber.dto.Message;
import com.intech_global.javavacancy.testtask.subscriber.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("msg")
@RequiredArgsConstructor
@Slf4j
public class MessageController {

    private final MessageService messageService;

    @PostMapping("save")
    // todo decide on return type
    public void saveMessage(@RequestBody Message message) {
        log.info("Received message {}", message);
        messageService.save(message);
    }
}
