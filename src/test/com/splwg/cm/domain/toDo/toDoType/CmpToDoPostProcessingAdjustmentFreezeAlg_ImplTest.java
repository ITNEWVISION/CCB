package com.splwg.cm.domain.toDo.toDoType;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import com.splwg.base.api.testers.AlgorithmImplementationTestCase;
import com.splwg.base.domain.common.algorithm.Algorithm;
import com.splwg.base.domain.common.algorithm.Algorithm_Id;

public class CmpToDoPostProcessingAdjustmentFreezeAlg_ImplTest extends
		AlgorithmImplementationTestCase {

	@Override
	protected Class getAlgorithmImplementationClass() {
		// TODO Auto-generated method stub
		return CmpToDoPostProcessingAdjustmentFreezeAlg_Impl.class;
	}

	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}


	@Test
	public void test() {
		// Check style implemented here. One simple check style used here is that 
		// local variable names should contain a-z or 0 - 9 only. 
		// If out of this range any character is used, it will shown as warning message.
		
		Algorithm_Id algorithmId = new Algorithm_Id("123"); // Here capital I is used, hence warning from "check-style"
		Algorithm algorithm5 = algorithmId.getEntity();
		
		Algorithm algorithmA=null;// Here capital A is used, hence warning from "check-style"
		// long version = algorithm5.getVersion();
		//assertNull(null, algorithm5.getVersion());
				System.out.println("******Hi Prasad**************");

	}

}
