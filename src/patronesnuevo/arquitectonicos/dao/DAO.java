package patronesnuevo.arquitectonicos.dao;

import patronesnuevo.arquitectonicos.transfer.Transfer;

public interface DAO
{

	public void insert(Transfer t);
	
	public boolean existe(Transfer t);
}
