package com.nttdata.bootcamp.msbankdebitcardassociated.infrastructure.persistence.adapter.mongo;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.bootcamp.msbankdebitcardassociated.infrastructure.persistence.entity.DebitCardAssociatedAccounEntity;

public interface ReactiveMongoDebitCardAssociatedAccountRepository extends ReactiveMongoRepository<DebitCardAssociatedAccounEntity, String>{


}