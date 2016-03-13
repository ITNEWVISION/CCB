/*
 **************************************************************************
 *
 * This module is the confidential and proprietary information of
 * GIEAU; it is not to be copied, reproduced, or
 * transmitted in any form, by any means, in whole or in part,
 * nor is it to be used for any purpose other than that for which
 * it is expressly provided without the written permission of
 * GIEAU. 
 * Testing prasad 0111
 *
 **************************************************************************
 *
 * PROGRAM DESCRIPTION:
 *
 * Post Processing - Transfer To Do Context
 *
 * This algorithm will update the newly created To Do entry with the
 * latest completed To Do entry(s) comment and assigned user if the To Do
 * is created for the same service agreement, same To Do type,
 * same Message Number, same Message Parm1 as in input parameter.
 * Test 2
 **************************************************************************
 *
 * CHANGE HISTORY:
 *
 * Date:        by:     Reason:
 * YYYY-MM-DD   IN      Reason text.
 *
 * 2013-01-31  WTechn   TD04.01 Initial Version.
 *************************************************************************
 */
package com.splwg.cm.domain.todo.toDoType;

import com.splwg.base.domain.todo.toDoEntry.ToDoEntry;
import com.splwg.base.domain.todo.toDoEntry.ToDoEntry_DTO;
import com.splwg.base.domain.todo.toDoType.ToDoTypeToDoPostProcessAlgorithmSpot;
/*import com.splwg.ccb.domain.adjustment.adjustment.Adjustment;
import com.splwg.ccb.domain.adjustment.adjustment.Adjustment_Id;
import com.splwg.ccb.domain.admin.cisDivision.CisDivision_Id;
import com.splwg.ccb.domain.approval.approvalRequest.ApprovalRequest;
import com.splwg.ccb.domain.approval.approvalRequest.ApprovalRequest_Id;
import com.splwg.ccb.domain.customerinfo.account.Account;
import com.splwg.ccb.domain.customerinfo.account.Account_Id;
// import com.splwg.cm.domain.customMessages.CmMessageRepository;
import com.splwg.shared.common.ApplicationError;
*/

/**
 * @author Ajit Jena
 * @AlgorithmComponent (softParameters = { @AlgorithmSoftParameter (name = toDoTypeServiceAgreementCharacteristicType, required = true, type = entity, entityName = characteristicType) } )
 */
public class CmToDoPostProcessingAdjustmentFreezeAlg_Impl extends
		CmToDoPostProcessingAdjustmentFreezeAlg_Gen implements
		ToDoTypeToDoPostProcessAlgorithmSpot {

	// Hard Parameter
	ToDoEntry newToDoEntry = null;
	ToDoEntry_DTO oldToDoDto = null;

	/*
	 * This method is used to validate the of parameters.
	 */
	protected void extraSoftParameterValidations(boolean arg0) {

	}

	public void setNewToDoEntry(ToDoEntry toDoEntry) {

		newToDoEntry = toDoEntry;
	}

	public void setOldToDoEntryDTO(ToDoEntry_DTO toDoEntryDTO) {

		oldToDoDto = toDoEntryDTO;
	}

	public void invoke() {
		if(notNull(oldToDoDto)){
			// Adjustment adjustment = null;
			if(!oldToDoDto.getEntity().getDrillKeyValues().isEmpty()){
				String drilKeyValue = oldToDoDto.getEntity().getDrillKeyValues().iterator().next().getKeyValue13030912();
				// adjustment = new Adjustment_Id(drilKeyValue).getEntity();
			}
			// adjustment.getApprovalRequestId();

			

		}
	}
}
