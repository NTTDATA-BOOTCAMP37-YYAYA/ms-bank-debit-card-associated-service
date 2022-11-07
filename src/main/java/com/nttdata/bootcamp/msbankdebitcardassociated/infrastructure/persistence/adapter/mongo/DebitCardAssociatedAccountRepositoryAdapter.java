package com.nttdata.bootcamp.msbankdebitcardassociated.infrastructure.persistence.adapter.mongo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nttdata.bootcamp.msbankdebitcardassociated.application.outgoing.CreateDebidCardAssociatedAccountPort;
import com.nttdata.bootcamp.msbankdebitcardassociated.domain.enums.States;
import com.nttdata.bootcamp.msbankdebitcardassociated.domain.model.DebitCardAssociatedAccount;
import com.nttdata.bootcamp.msbankdebitcardassociated.infrastructure.persistence.entity.DebitCardAssociatedAccounEntity;

import reactor.core.publisher.Mono;

@Component
public class DebitCardAssociatedAccountRepositoryAdapter implements CreateDebidCardAssociatedAccountPort{

  @Autowired
  private ReactiveMongoDebitCardAssociatedAccountRepository reactiveMongoDB;


	@Override
	public Mono<DebitCardAssociatedAccount> createDebitCardAssociatedAccount(
			DebitCardAssociatedAccount debitCardAssociatedAccount) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		LocalDateTime now = LocalDateTime.now();
	    String createDate = now.format(formatter);
	    debitCardAssociatedAccount.setDebitCardAssociationCreateDate(createDate);
	    debitCardAssociatedAccount.setDebitCardAssociationSate(States.ACTIVE.getValue());
		return reactiveMongoDB.insert(DebitCardAssociatedAccounEntity.toDebitCardAssociatedAccountEntity(debitCardAssociatedAccount))
				  .map(DebitCardAssociatedAccounEntity::toDebitCardAssociatedAccount);
	}
	 

	


}
