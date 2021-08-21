package patronesnuevo.otros.dao;

import patronesnuevo.otros.transfer.Transfer;

public interface DAO
{

	public void insert(Transfer t);
	
	public boolean existe(Transfer t);
}
