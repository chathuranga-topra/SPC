package org.topraworld.model;

import org.compiere.util.Env;

public class TpUtility {
	
	
	//POS Business Partners Groups
	private int PregnantC_BpGroup_ID;
	private int SeniorC_BPGroup_ID;
	private int ChildC_BPGroup_ID;
	private int GeneralC_BPGroup_ID;
	private int SpCusC_BPGroup_ID;
	
	public TpUtility(){
		
		int AD_Org_ID = Env.getAD_Org_ID(Env.getCtx());
		
		if(AD_Org_ID == 1000000){  //Avissawella
			PregnantC_BpGroup_ID=1000008;
			SeniorC_BPGroup_ID=1000010;
			ChildC_BPGroup_ID=1000009;
			GeneralC_BPGroup_ID=1000005;
			SpCusC_BPGroup_ID=1000007;
		}else{
			
			PregnantC_BpGroup_ID=1000006;
			SeniorC_BPGroup_ID=1000007;
			ChildC_BPGroup_ID=1000008;
			GeneralC_BPGroup_ID=1000005;
			SpCusC_BPGroup_ID=1000009;
			
		}
	}
	
	
	
	public int getPregnantC_BpGroup_ID() {
		return PregnantC_BpGroup_ID;
	}
	public int getSeniorC_BPGroup_ID() {
		return SeniorC_BPGroup_ID;
	}
	public int getChildC_BPGroup_ID() {
		return ChildC_BPGroup_ID;
	}
	public int getGeneralC_BPGroup_ID() {
		return GeneralC_BPGroup_ID;
	}
	public int getSpCusC_BPGroup_ID() {
		return SpCusC_BPGroup_ID;
	}
}
