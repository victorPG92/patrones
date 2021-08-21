package patronesnuevo.arquitectonicos.dao;

import patronesnuevo.arquitectonicos.transfer.Transfer;

public class DAOSQL implements DAO
{

	@Override
	public void insert(Transfer t)
	{
		// conecta con sql para insertar
		
	}

	@Override
	public boolean existe(Transfer t)
	{
		return false;
	}

}
