package patronesnuevo.otros.sa;

import patronesnuevo.otros.dao.DAO;
import patronesnuevo.otros.transfer.Transfer;

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
