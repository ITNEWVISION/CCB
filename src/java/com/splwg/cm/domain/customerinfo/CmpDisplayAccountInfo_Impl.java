package com.splwg.cm.domain.customerinfo;

import com.splwg.base.api.batch.file.MessageRepository;
import com.splwg.ccb.domain.admin.customerClass.entity.CustomerClass_Id;
import com.splwg.ccb.domain.common.installation.algorithm.accountInfo.AccountInformationAlgorithmSpot;
import com.splwg.ccb.domain.customerinfo.account.entity.Account;
import com.splwg.ccb.domain.customerinfo.account.entity.Account_DTO;
import com.splwg.shared.common.ApplicationError;
import com.splwg.shared.common.ServerMessage;
import com.splwg.shared.logging.Logger;

/**
 * @author Prasad
 *
@AlgorithmComponent ()
 */
public class CmpDisplayAccountInfo_Impl 
      extends CmpDisplayAccountInfo_Gen 
		implements AccountInformationAlgorithmSpot {

	Account accountTemp = null;
	Account_DTO accountDto= null;
	String accountName=" Test Account ";
	Logger logger;
	String alertInfo;
	String alertInfoConstant="***** Welcome To Prasad Build Process *****";
	CustomerClass_Id customerClassId= new CustomerClass_Id("C");
	
	@Override
	public void invoke() {

		accountDto = createDTO(Account.class);
		alertInfo= "***Welcome***";

		addAlertInfo(alertInfo);
		addAlertInfo(alertInfo,customerClassId);

		// accountName = " Test Account ";
		// customerClassId = new CustomerClass_Id("C");
		// customerClassId = new CustomerClass_Id("R");				
		// TODO Auto-generated method stub
	}
	
	public void addAlertInfo(String alertInfo){

		System.out.println("***alertInfo***"+alertInfo);

		if(alertInfo!=alertInfoConstant){
			addError(MessageRepository.batchSoftParmHasInvalidValue("Alert Info", alertInfo));
		}

		try{
			startChanges();
			accountDto.setAlertInformation(alertInfo);
			accountTemp.setDTO(accountDto);
			saveChanges();
		}catch(ApplicationError applicationError){
			logger.info("**********ApplicationError***********************"+applicationError.getLocalizedMessage());
		}		
	}

	public void addAlertInfo(String alertInfo,CustomerClass_Id id){
		
		if(id.getTrimmedValue()!=customerClassId.getTrimmedValue()){
			addError(MessageRepository.fieldInvalid("This account will not be processed because it is Residental customer"+customerClassId));
		}
		if(alertInfo!=alertInfoConstant){
			addError(MessageRepository.batchSoftParmHasInvalidValue("Alert Info", alertInfo));
		}
		try{
		    startChanges();
		    accountDto.setAlertInformation(alertInfo);
		    accountTemp.setDTO(accountDto);
		    saveChanges();
		}catch(ApplicationError applicationError){
			logger.info("**********ApplicationError***********************"+applicationError.getLocalizedMessage());
		}		
	}
	@Override
	public String getAccountName() {
		// TODO Auto-generated method stub
		return accountName;
	}

	@Override
	public void setAccount(Account account) {
		// TODO Auto-generated method stub
		accountTemp = account;

	}

}
