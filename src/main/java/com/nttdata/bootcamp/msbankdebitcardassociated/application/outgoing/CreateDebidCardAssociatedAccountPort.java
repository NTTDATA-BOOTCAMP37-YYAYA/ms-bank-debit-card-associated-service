package com.nttdata.bootcamp.msbankdebitcardassociated.application.outgoing;

import com.nttdata.bootcamp.msbankdebitcardassociated.domain.model.DebitCardAssociatedAccount;

import reactor.core.publisher.Mono;

public interface CreateDebidCardAssociatedAccountPort {

	Mono<DebitCardAssociatedAccount> createDebitCardAssociatedAccount(DebitCardAssociatedAccount debitCardAssociatedAccount);
}
