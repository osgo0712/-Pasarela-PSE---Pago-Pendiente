package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;


@DefaultUrl ("https://www.colsubsidio.com/ssoc/#/ingresar?goto=http:%2F%2F40.117.63.112%2Fportal%2Fsalud")

public class PagoPendientePageObject extends PageObject {


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	Properties loadProperty = new Properties();	
	
	//HOME
	static By User = PagoPendienteElements.txtUser.getValor_campo();
	static By Pass = PagoPendienteElements.txtPass.getValor_campo();
	static By Ing = PagoPendienteElements.btningreso.getValor_campo();
	static By Servicio = PagoPendienteElements.btnserv.getValor_campo();
	static By Ingreso = PagoPendienteElements.btningresarportal.getValor_campo();
	//AGENDAR CITA
	static By Agendar = PagoPendienteElements.btnagendar.getValor_campo();
	//TIPO DE CITA
	static By TipoCita = PagoPendienteElements.btntipocita.getValor_campo();
	static By CitaPresencial = PagoPendienteElements.btncitapresencial.getValor_campo();
	//SELECCION DE CIUDAD
	static By Ciudad = PagoPendienteElements.btnciudad.getValor_campo();
	static By Bogota = PagoPendienteElements.btnBogota.getValor_campo();
	static By ConfirmarCiudad = PagoPendienteElements.btnconfirmarciudad.getValor_campo();
	//SELECCION CENTRO MEDICO
	static By CentroMedico = PagoPendienteElements.btncentromedico.getValor_campo();
	static By CentroMedicoSuba = PagoPendienteElements.btncentromedicosuba.getValor_campo();
	static By Horario = PagoPendienteElements.btnhorario.getValor_campo();
	static By ConfirmarHorario = PagoPendienteElements.btnconfirmarhora.getValor_campo();
	//SELECCION FECHA
	static By Fecha = PagoPendienteElements.btnfecha.getValor_campo();
	static By ValidacionDisponibilidad = PagoPendienteElements.txtValidacionDisponibilidad.getValor_campo();
	static By Atras = PagoPendienteElements.btnAtras.getValor_campo();
	static By Hora = PagoPendienteElements.btnconfirmarhora.getValor_campo();
	static By Medico = PagoPendienteElements.btnmedico.getValor_campo();
	static By ConfirmarFecha = PagoPendienteElements.btnconfirmarfecha.getValor_campo();
	//ConfirmarReserva
	static By ConfirmarReserva = PagoPendienteElements.btnconfirmarreserva.getValor_campo();
	//PAGO
	static By BtnCitasAegndadas = PagoPendienteElements.btnCitasAgendadas.getValor_campo();
	static By BtnPagarCitaAgendada = PagoPendienteElements.btnPagarCitaAgendada.getValor_campo();
	static By BtnIconoPago = PagoPendienteElements.btnIcono.getValor_campo();
	static By TxtCel = PagoPendienteElements.txtCel.getValor_campo();
	static By TxtEmail = PagoPendienteElements.txtemail.getValor_campo();
	static By Captchat = PagoPendienteElements.btnCaptchat.getValor_campo();
	static By BtnConfirmarDatos = PagoPendienteElements.btnPagar.getValor_campo();
	static By BtnPSE = PagoPendienteElements.btnPSE.getValor_campo();
	static By MsjCreacion = PagoPendienteElements.MnsjCreacion.getValor_campo();
	//TIPO PERSONA
	static By BtnTipoPersona = PagoPendienteElements.btnTipoPersona.getValor_campo();
	static By BtnPersonaNatural = PagoPendienteElements.btnPersonaNatural.getValor_campo();
	static By BtnBanco = PagoPendienteElements.btnBanco.getValor_campo();
	static By BtnBancoUnionColombiano = PagoPendienteElements.btnBancoUnionColombia.getValor_campo();
	static By BtnContinuarPago = PagoPendienteElements.btnContinuarPago.getValor_campo();
	//EMAIL PSE
	static By TxtEmailPSE = PagoPendienteElements.txtEamilPSE.getValor_campo();
	static By BtnAceptar = PagoPendienteElements.btnAceptar.getValor_campo();
	static By BtnIrBanco = PagoPendienteElements.btnIrBanco.getValor_campo();
	//INFORMACION PAGO
	static By BtnDebug = PagoPendienteElements.btnDebug.getValor_campo();
	static By BtnEstado = PagoPendienteElements.btnEstado.getValor_campo();
	static By BtnPendiente = PagoPendienteElements.btnPendiente.getValor_campo();
	static By TxtFecha = PagoPendienteElements.txtFecha.getValor_campo();
	static By TxtCodigo = PagoPendienteElements.txtCodigo.getValor_campo();
	static By BtnCall = PagoPendienteElements.btnCall.getValor_campo();
	static By BtnPPE = PagoPendienteElements.btnPpe.getValor_campo();



	public void ClickAgendar() throws InterruptedException, AWTException {
		if (element(User).isDisplayed()) {
			Thread.sleep(1000);
			find(User).click();
			find(User).sendKeys("53084100");
			Thread.sleep(1000);	
			find(Pass).click();
			find(Pass).sendKeys("Mafe2408");
			Thread.sleep(1500);	
			find(Ing).click();
			Thread.sleep(5000);	
			find(Servicio).click();
			Thread.sleep(1000);	
			find(Ingreso).click();
			Thread.sleep(3000);	
			find(Agendar).click();
			Thread.sleep(3000);	

		}		
	}

	public void TipoCita() throws InterruptedException {
		find(TipoCita).click();
		Thread.sleep(2000);	
		find(CitaPresencial).click();
		Thread.sleep(4000);	
	}

	public void SeleccionarCiudad() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		find(Ciudad).click();
		Thread.sleep(1000);
		find(Bogota).click();
		//robot.keyPress(KeyEvent.VK_DOWN);
		//robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		find(ConfirmarCiudad).click();
		Thread.sleep(1000);
	}

	public void SeleccionCentroMedico() throws InterruptedException, AWTException {
		find(CentroMedico).click();
		Thread.sleep(1000);
		find(CentroMedicoSuba).click();
		Thread.sleep(1000);	
		find(Horario).click();
		Thread.sleep(1000);	
		find(ConfirmarHorario).click();
		Thread.sleep(1000);	

	}

	public void SeleccionFecha() throws AWTException, InterruptedException {

		Robot robot = new Robot();	
			Thread.sleep(1000);	
			find(Fecha).click();
			Thread.sleep(3000);		
			//HORA
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			//MEDICO
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			find(ConfirmarFecha).click();
			Thread.sleep(3000);
		
	}

	public void ConfirmarReserva() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(3000);
		find(ConfirmarReserva).click();
		Thread.sleep(9000);

	}

	public void CitaAgendada() throws InterruptedException {
		if(element(BtnCitasAegndadas).isDisplayed()) {
			find(BtnCitasAegndadas).click();
			Thread.sleep(1000);
		}
	}

	public void ClickBtnPagar() throws InterruptedException {


		String mainTab = getDriver().getWindowHandle();
		String newTab = "";	
		System.out.println("Main Tab" + mainTab);
		find(BtnPagarCitaAgendada).click();
		Thread.sleep(2000);

		Set<String> handles = getDriver().getWindowHandles();
		for (String actual : handles) {
			System.out.println("Handle id:" + actual);	
			if (!actual.equalsIgnoreCase(mainTab)) {
				//Cambio de Pestaña
				getDriver().switchTo().window(actual);
			}
		}

	}


	public void RegistrarDatos()  {
		try {
			//Robot robot = new Robot();
			find(BtnIconoPago).click();
			Thread.sleep(2000);
			find(TxtCel).sendKeys("3104985492");
			Thread.sleep(1000);
			find(TxtEmail).sendKeys("Test@gmail.com");
			Thread.sleep(2000);
			getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@id=\"ngrecaptcha-0\"]/div/div/iframe")));
			Thread.sleep(1000);
			find(Captchat).click();
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			getDriver().switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

	public void ConfirmarDatos() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		find(BtnConfirmarDatos).click();	
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		find(BtnPSE).click();	
		Thread.sleep(2000);
	}

	public void ValidarMensajeCreacion() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
	}

	public void RegistroDatosPago() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,500)");
		find(BtnTipoPersona).click();
		Thread.sleep(2000);
		find(BtnPersonaNatural).click();
		Thread.sleep(2000);
		find(BtnBanco).click();
		Thread.sleep(2000);
		find(BtnBancoUnionColombiano).click();
		Thread.sleep(2000);
		find(BtnContinuarPago).click();
		Thread.sleep(3000);

	}

	public void IngresoEmailPSE() throws InterruptedException {

		find(TxtEmailPSE).sendKeys("oscaesgo@colsubsidio.com");
		Thread.sleep(2000);
		find(BtnAceptar).click();
		Thread.sleep(1000);
		find(BtnIrBanco).click();
		Thread.sleep(2000);
	}

	public void FlujoDebug() throws InterruptedException {
		find(BtnDebug).click();
		Thread.sleep(2000);
	}
	
	public void IngresoDatos() throws InterruptedException {
		
		find(BtnEstado).click();
		Thread.sleep(1000);
		find(BtnPendiente).click();
		Thread.sleep(1000);
		find(TxtFecha).sendKeys("26/11/2021");
		Thread.sleep(1000);
		find(TxtCodigo).sendKeys("00001");
		Thread.sleep(1000);

	}

	public void Call() throws InterruptedException {
		find(BtnCall).click();
		Thread.sleep(1000);
		find(BtnPPE).click();	
		Thread.sleep(5000);
	}
	

	public void ValidarMensajePendiente() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(5000);		
	}

}