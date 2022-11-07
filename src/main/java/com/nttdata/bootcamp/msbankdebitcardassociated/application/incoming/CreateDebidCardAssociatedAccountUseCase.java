package com.nttdata.bootcamp.msbankdebitcardassociated.application.incoming;

import com.nttdata.bootcamp.msbankdebitcardassociated.domain.model.DebitCardAssociatedAccount;

import reactor.core.publisher.Mono;

public interface CreateDebidCardAssociatedAccountUseCase {

	Mono<DebitCardAssociatedAccount> createDebitCardAssociatedAccount(DebitCardAssociatedAccount debitCardAssociatedAccount);
}
