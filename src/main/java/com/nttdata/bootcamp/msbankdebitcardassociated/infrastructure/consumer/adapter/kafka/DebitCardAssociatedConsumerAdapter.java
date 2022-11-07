package com.nttdata.bootcamp.msbankdebitcardassociated.infrastructure.consumer.adapter.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.nttdata.bootcamp.msbankdebitcardassociated.application.incoming.CreateDebidCardAssociatedAccountUseCase;
import com.nttdata.bootcamp.msbankdebitcardassociated.domain.model.DebitCardAssociatedAccount;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DebitCardAssociatedConsumerAdapter {


  @Autowired
  private CreateDebidCardAssociatedAccountUseCase  createDebidCardAssociatedAccountUseCase;

  
  @KafkaListener(topics = "${kafka.topic.bank.debit-card-associated-account.create.name}")
  public void listenerCreate(@Payload DebitCardAssociatedAccount debitCardAssociatedAccount) {
	  createDebidCardAssociatedAccountUseCase.createDebitCardAssociatedAccount(debitCardAssociatedAccount).block();
  }
  

}
