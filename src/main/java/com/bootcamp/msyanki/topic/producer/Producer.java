package com.bootcamp.msyanki.topic.producer;

import com.bootcamp.msyanki.documents.dto.Debitcard;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Producer {

    private static final String SERVICE_ASSOCIATE_DEBIT = "associateDebit-req";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendSaveCustomerService(Debitcard debitcard) {
        kafkaTemplate.send(SERVICE_ASSOCIATE_DEBIT, debitcard );
    }
}
