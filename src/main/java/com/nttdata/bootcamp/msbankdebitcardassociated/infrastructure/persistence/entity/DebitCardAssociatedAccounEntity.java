package com.nttdata.bootcamp.msbankdebitcardassociated.infrastructure.persistence.entity;

import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nttdata.bootcamp.msbankdebitcardassociated.domain.model.DebitCardAssociatedAccount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**.*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "DebitCardAssociatedAccount")
public class DebitCardAssociatedAccounEntity {
	
	@Id
	private String debitCardAssociatedAccountId;
	private String debidCardId;
	private String accountId;
	private boolean isMainAccount;
	private String debitCardAssociationSate;
	private String debitCardAssociationCreateDate;


	public static DebitCardAssociatedAccount toDebitCardAssociatedAccount(DebitCardAssociatedAccounEntity debitCardAssociatedAccounEntity){
		DebitCardAssociatedAccount debitCardAssociatedAccount = new DebitCardAssociatedAccount();
		BeanUtils.copyProperties(debitCardAssociatedAccounEntity, debitCardAssociatedAccount);
		return debitCardAssociatedAccount;
	}

	public static DebitCardAssociatedAccounEntity toDebitCardAssociatedAccountEntity(DebitCardAssociatedAccount debitCardAssociatedAccount){
		DebitCardAssociatedAccounEntity debitCardAssociatedAccounEntity = new DebitCardAssociatedAccounEntity();
		BeanUtils.copyProperties(debitCardAssociatedAccount, debitCardAssociatedAccounEntity);
		return debitCardAssociatedAccounEntity;
	}


}
