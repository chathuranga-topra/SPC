package org.topraworld.callouts;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MInOutLine;

public class VendorReturnCallouts extends CalloutEngine{
	
	//Material receipt line
	//org.topraworld.callouts.VendorReturnCallouts.refInoutLine
	public void refInoutLine(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(value == null) return;
		
		int Ref_InoutLine_ID = Integer.parseInt(value.toString());
		MInOutLine line = new  MInOutLine(ctx, Ref_InoutLine_ID, null);
		mTab.setValue("M_Product_ID", line.getM_Product_ID());
		mTab.setValue("C_UOM_ID", line.getC_UOM_ID());
		mTab.setValue("M_AttributeSetInstance_ID", line.getM_AttributeSetInstance_ID());
		mTab.setValue("QtyEntered", line.getQtyEntered());
		mTab.setValue("MovementQty", line.getMovementQty());
	}
}
