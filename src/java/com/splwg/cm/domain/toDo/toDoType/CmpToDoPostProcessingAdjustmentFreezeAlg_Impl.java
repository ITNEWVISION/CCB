/*
 **************************************************************************
 *
 * PROGRAM DESCRIPTION:
 *
 * TEST - Prasad 1
 **************************************************************************
 */
package com.splwg.cm.domain.toDo.toDoType;

import com.splwg.base.domain.todo.toDoEntry.ToDoEntry;
import com.splwg.base.domain.todo.toDoEntry.ToDoEntry_DTO;
import com.splwg.base.domain.todo.toDoType.ToDoTypeToDoPostProcessAlgorithmSpot;

/**
 * @author Prasad Rao
 * @AlgorithmComponent (softParameters = { @AlgorithmSoftParameter (name = toDoTypeServiceAgreementCharacteristicType, required =  true, type = entity, entityName = characteristicType)} )
 *							
 */
public class CmpToDoPostProcessingAdjustmentFreezeAlg_Impl extends
		CmpToDoPostProcessingAdjustmentFreezeAlg_Gen implements
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
				String drilKeyValue = oldToDoDto.getEntity().getDrillKeyValues().iterator().next().getKeyValue();
				// adjustment = new Adjustment_Id(drilKeyValue).getEntity();
			}
			// adjustment.getApprovalRequestId();

			

		}
	}
}
