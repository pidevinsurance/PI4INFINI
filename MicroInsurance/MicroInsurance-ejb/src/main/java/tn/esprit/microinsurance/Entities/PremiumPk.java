package tn.esprit.microinsurance.Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PremiumPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PremiumPk() {
		super();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + AgentId;
		result = prime * result + ContractId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PremiumPk other = (PremiumPk) obj;
		if (AgentId != other.AgentId)
			return false;
		if (ContractId != other.ContractId)
			return false;

		return true;
	}

	private int ContractId;
	
	private int AgentId ;


	public int getContractId() {
		return ContractId;
	}

	public void setContractId(int contractId) {
		ContractId = contractId;
	}

	public int getAgentId() {
		return AgentId;
	}

	public void setAgentId(int agentId) {
		AgentId = agentId;
	}


	

}
