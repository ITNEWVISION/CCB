package com.splwg.cm.domain.customerinfo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.splwg.base.api.sql.PreparedStatement;
import com.splwg.base.api.testers.AlgorithmImplementationTestCase;
import com.splwg.ccb.domain.customerinfo.account.entity.Account;
import com.splwg.ccb.domain.customerinfo.account.entity.Account_DTO;
import com.splwg.ccb.domain.customerinfo.account.entity.Account_Id;
import com.splwg.shared.common.ApplicationError;
import com.splwg.shared.common.ApplicationException;

public class CmpDisplayAccountInfo_ImplTest extends AlgorithmImplementationTestCase {

	Account account=null;
	@Override
	protected Class getAlgorithmImplementationClass() {
		// TODO Auto-generated method stub
		return CmpDisplayAccountInfo_Impl.class;
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();
		account = new Account_Id("0002596902").getEntity();
	}

	@Test
	public void testaddAlertInfo(){
		System.out.println("***********New Test Case*************");
		
		Account_DTO  accountDTO = account.getDTO();
		try{
			accountDTO.setAlertInformation("Test");
			account.setDTO(accountDTO);
		} catch (ApplicationError applicationError) {
			System.out.println("**********ApplicationError***********************"+applicationError.getLocalizedMessage());
	}
		account=null;
	}
		
	@Test
	public void testInvoke() {
		System.out.println("********Start of test case**********"+account);
		CmpDisplayAccountInfo_Impl impl = new CmpDisplayAccountInfo_Impl();
		
		//checks if account is not null, if it is not a null, test passes else test fails
		assertNotNull(account);

		//checks if account is null, if it is a null, test passes else test fails
		// assertNull(account);
				
		impl.setAccount(account);
		
		try{			
			impl.addAlertInfo("**1st Test***",account.getCustomerClass().getId());
			impl.addAlertInfo("**2nd Test***");
		}catch(ApplicationError applicationError){
			System.out.println("**********ApplicationError***********************"+applicationError.getServerMessage());
				
		}
		System.out.println("********Account Name**********"+impl.getAccountName());
		System.out.println("********End of test case*****Account Info is *****"+account.getDTO());
	}

}
