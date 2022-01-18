package PageObject;

import org.openqa.selenium.By;

public enum PagoPendienteElements {
	
		
		txtUser (By.xpath("//*[@id=\"username\"]")),
		txtPass(By.xpath("//*[@id=\"password\"]")),
		btningreso (By.xpath("//*[@id=\"loginForm\"]/form/div[4]/button")),
		btnserv(By.xpath("/html/body/app-root/div/app-inicio/div/div/div/div/form/div/div[1]/div/div/div[2]/label")),
		btningresarportal(By.xpath("//*[@id=\"content-page-eps\"]/div/form/div/div[3]/div/div/div[2]/button")),
		btnagendar(By.xpath("//*[@id=\"btnMenuHome29\"]")),
		btntipocita (By.xpath("//*[@id=\"agenda_medicinageneral\"]")),
		btncitapresencial (By.xpath("//*[@id=\"btnModality61\"]")),
		btnciudad (By.xpath("//*[@id=\"inpCityCita\"]")),
		btnBogota (By.xpath("//select[@id='inpCityCita']/option[text() = ' BOGOTA D.C ']")),
		btnconfirmarciudad (By.xpath("//*[@id=\"nextagenda_step1\"]")),
		btncentromedico (By.xpath("//*[@id=\"ipsSelect\"]")),
		btncentromedicosuba (By.xpath("//*[@id=\"ipsSelect\"]/option[16]")),
		btnhorario (By.xpath("/html/body/app-root/div/app-inicio/div/div/article/gp-main-content/section/app-agendar-cita-general/div/div[2]/div/mat-horizontal-stepper/div[2]/div[2]/form/div[3]/div/div/div[2]/label")),
		btnconfirmarhora (By.xpath("//*[@id=\"nextagenda_step2\"]")),
		btnfecha (By.xpath("//span[contains(@class,'custom-day lol ng-star-inserted weekend')]")),
		txtValidacionDisponibilidad (By.xpath("/html/body/app-root/div/app-inicio/div/div/article/gp-main-content/section/app-agendar-cita-general/div/div[2]/div/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div/ngb-alert/strong")),
		btnAtras (By.xpath("/html/body/app-root/div/app-inicio/div/div/article/gp-main-content/section/app-agendar-cita-general/div/div[2]/div/mat-horizontal-stepper/div[2]/div[3]/form/div[7]/div/div/div[1]/button")),
		btnhora (By.xpath("//*[@id=\"cdk-step-content-0-2\"]/form/div[4]/div/div/div/select")),
		btnmedico (By.xpath("//*[@id=\"cdk-step-content-0-2\"]/form/div[5]/div/div/div/select")),
		btnconfirmarfecha (By.xpath("//*[@id=\"nextagenda_step3\"]")),
		btnconfirmarreserva (By.xpath("//*[@id=\"nextagenda_step4\"]")),
		/************************************************************************************************************/
		btnCitasAgendadas (By.xpath("//a[.=\"Citas Agendadas\"]/ancestor::span[@class=\"info-user\"]")),
		btnPagarCitaAgendada (By.xpath("/html/body/app-root/div/app-inicio/div/div/article/gp-main-content/section/app-citas-agendadas/div/div[2]/div/mat-tab-group/div/mat-tab-body/div/div/app-cita/div/div/div/div/div[2]/a")),
		btnIcono (By.xpath("//i[contains(@class,'fas fa-money-check-alt')]")),	
		txtCel (By.xpath("//*[@id=\"main\"]/div/section/app-payment/div/div[2]/div/form/div[1]/div[2]/input")),
		txtemail (By.xpath("//*[@id=\"main\"]/div/section/app-payment/div/div[2]/div/form/div[2]/div[2]/input")),
		btnCaptchat (By.xpath("//span[contains(@class,'recaptcha-checkbox ')]")),
		btnPagar(By.xpath("//*[@id=\"main\"]/div/section/app-payment/div/div[2]/div/form/div[4]/button[2]")),
		btnPSE (By.xpath("/html/body/div[2]/div/div/form/div/div[1]/div[5]/div/div/div[2]/table/tbody/tr[1]/td/a/img")),  
		MnsjCreacion (By.xpath("/html/body/app-root/app-layout-base/div/app-pse-payment/form/mat-card/div/mat-card-content/app-pse-payment-state/div")),
		btnTipoPersona (By.xpath("//*[@id=\"mat-select-value-1\"]/span")),
		btnPersonaNatural (By.xpath("//*[@id=\"mat-option-0\"]/span")),  
		btnBanco (By.xpath("/html/body/app-root/app-layout-base/div/app-pse-payment/form/mat-card/div/mat-card-content/div/div[2]/mat-form-field[2]/div/div[1]/div[3]")),
		btnBancoUnionColombia (By.xpath("//*[@id=\"mat-option-30\"]/span")),
		btnContinuarPago (By.xpath("/html/body/app-root/app-layout-base/div/app-pse-payment/form/mat-card/mat-card-actions/button[1]")),
		txtEamilPSE (By.xpath("//*[@id=\"PNEMail\"]")), 
		btnAceptar (By.xpath("//*[@id=\"btnAcceptPolicy\"]")),
		btnIrBanco (By.xpath("//*[@id=\"btnSeguir\"]")),
		
		btnDebug (By.xpath("//*[@id=\"btnDebug\"]")), 
		btnEstado (By.xpath("//*[@id=\"ddTransactionState\"]")), 
		btnPendiente (By.xpath("//*[@id=\"ddTransactionState\"]/option[3]")), 
		txtFecha (By.xpath("//*[@id=\"txtBankProcessDate\"]")),
		txtCodigo (By.xpath("//*[@id=\"txtAuthorizationID\"]")),
		btnCall (By.xpath("//*[@id=\"btnCall\"]")),
		btnPpe (By.xpath("//*[@id=\"btnReturnToPPE\"]"));
	
		
		
		private By valor_campo;

		PagoPendienteElements(By valorCampo) {
			// TODO Auto-generated constructor stub
			this.setValor_campo(valorCampo);
		}

		public void setValor_campo(By valorCampo) {
			// TODO Auto-generated method stub
			this.valor_campo = valorCampo;
		}
		
		public By getValor_campo() {
			return valor_campo;
		}

}