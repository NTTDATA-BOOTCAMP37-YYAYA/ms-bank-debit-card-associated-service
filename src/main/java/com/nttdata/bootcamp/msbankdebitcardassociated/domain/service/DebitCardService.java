package com.nttdata.bootcamp.msbankdebitcardassociated.domain.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.msbankdebitcardassociated.application.incoming.CreateDebidCardAssociatedAccountUseCase;
import com.nttdata.bootcamp.msbankdebitcardassociated.application.outgoing.CreateDebidCardAssociatedAccountPort;
import com.nttdata.bootcamp.msbankdebitcardassociated.domain.model.DebitCardAssociatedAccount;

import reactor.core.publisher.Mono;

/**.*/
@Service
public class DebitCardService implements CreateDebidCardAssociatedAccountUseCase{

final  Logger logger = LoggerFactory.getLogger(DebitCardService.class);


@Autowired
private CreateDebidCardAssociatedAccountPort createDebidCardAssociatedAccountPort;


@Override
public Mono<DebitCardAssociatedAccount> createDebitCardAssociatedAccount(
		DebitCardAssociatedAccount debitCardAssociatedAccount) {
	return createDebidCardAssociatedAccountPort
			.createDebitCardAssociatedAccount(debitCardAssociatedAccount);
}

 




}
