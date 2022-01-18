package Steps;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import PageObject.PagoPendientePageObject;
import net.thucydides.core.annotations.Step;

public class PagoPendienteStep {
	
	PagoPendientePageObject AgendamientoPageObject;

	@Step
	public void abrirHome() {
		AgendamientoPageObject.open();		
	}
	
	@Step
	public void Agenda() throws InterruptedException, AWTException {
		AgendamientoPageObject.ClickAgendar();		
	}

	@Step
	public void TipoCita() throws FileNotFoundException, IOException, InterruptedException, AWTException {
		AgendamientoPageObject.TipoCita();		
	}

	@Step
	public void SeleccionCiudad() throws AWTException, InterruptedException {
		AgendamientoPageObject.SeleccionarCiudad();
	}

	@Step
	public void SeleccionCentroMedico() throws InterruptedException, AWTException {
		AgendamientoPageObject.SeleccionCentroMedico();		
	}
	
	@Step
	public void SeleccionFecha() throws InterruptedException, AWTException {
		AgendamientoPageObject.SeleccionFecha();		
	}
	
	@Step
	public void ConfirmarReserva() throws InterruptedException, AWTException {
		AgendamientoPageObject.ConfirmarReserva();		
	}
	
	@Step
	public void CitasAgendadas() throws InterruptedException {	
		AgendamientoPageObject.CitaAgendada();
	}
	
	@Step
	public void ClickBtnPago() throws InterruptedException {
		AgendamientoPageObject.ClickBtnPagar();		
	}	
	
	@Step
	public void RegistroInfor() throws InterruptedException, AWTException {
		AgendamientoPageObject.RegistrarDatos();
	}
	
	@Step
	public void ConfirmacionDatos() throws InterruptedException {
		AgendamientoPageObject.ConfirmarDatos();
	}
	
	@Step
	public void ValidarMensajeCreacion() throws InterruptedException  {
		AgendamientoPageObject.ValidarMensajeCreacion();
	}
	
	@Step
	public void DatosDePago() throws InterruptedException  {
		AgendamientoPageObject.RegistroDatosPago();
	}
	
	@Step
	public void IngresoEmail() throws InterruptedException  {
		AgendamientoPageObject.IngresoEmailPSE();
	}
	
	@Step
	public void FlujoDebug() throws InterruptedException  {
		AgendamientoPageObject.FlujoDebug();
	}

	@Step
	public void IngresoDatos() throws InterruptedException  {
		AgendamientoPageObject.IngresoDatos();
	}

	@Step
	public void Call() throws InterruptedException  {
		AgendamientoPageObject.Call();
	}
	
	@Step
	public void MensajePendiente() throws InterruptedException  {
		AgendamientoPageObject.ValidarMensajePendiente();
	}

}
