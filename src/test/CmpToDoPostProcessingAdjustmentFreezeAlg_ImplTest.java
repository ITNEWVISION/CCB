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
		Algorithm_Id algorithmId = new Algorithm_Id("123");
		Algorithm algorithm = algorithmId.getEntity();
		Algorithm algorithm1=null;
		//CmpToDoPostProcessingAdjustmentFreezeAlg_Impl
		//long bigInteger = algorithm.getVersion();
		assertNull(null,algorithm1);
		//fail("Not yet implemented");
	}

}
