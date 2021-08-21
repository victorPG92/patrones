package patronesnuevo.arquitectonicos.sa;

import patronesnuevo.arquitectonicos.dao.DAO;
import patronesnuevo.arquitectonicos.transfer.Transfer;

public class ServicioAplicacionImpl implements ServicioAplicacion
{
	private DAO dao; 

	@Override
	public void realizaAlta(Transfer transfer)
	{
		if(!dao.existe(transfer))
			dao.insert(transfer);
		
	}

}
