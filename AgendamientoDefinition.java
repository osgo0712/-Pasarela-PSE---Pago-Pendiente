package Definitions;

import Steps.AgendamientoStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgendamientoDefinition {
	
	@Steps
	AgendamientoStep AgendamientoStep;
	
	@Given("^El usuario se encuentra en el portal salud de colsubsidio$")
	public void el_usuario_se_encuentra_en_el_portal_salud_de_colsubsidio() throws Throwable {
		AgendamientoStep.abrirHome();
	}

	@When("^Hace click en opcion de agendar cita$")
	public void hace_click_en_opcion_de_agendar_cita() throws Throwable {
		AgendamientoStep.Agenda();
	}

	@When("^Selecciona opcion de medicina general y hace click en atencion presencial$")
	public void selecciona_opcion_de_medicina_general_y_hace_click_en_atencion_presencial() throws Throwable {
		AgendamientoStep.TipoCita();
	}

	@When("^Selecciona la ciudad y hace click en boton siguiente$")
	public void selecciona_la_ciudad_y_hace_click_en_boton_siguiente() throws Throwable {
		AgendamientoStep.SeleccionCiudad();
	}

	@When("^Selecciona el centro medico, la zona horaria y have click en boton siguiente$")
	public void selecciona_el_centro_medico_la_zona_horaria_y_have_click_en_boton_siguiente() throws Throwable {
		AgendamientoStep.SeleccionCentroMedico();
	}

	@When("^Selecciona el dia, hora, medico y hace click en boton siguiente$")
	public void selecciona_el_dia_hora_medico_y_hace_click_en_boton_siguiente() throws Throwable {
		AgendamientoStep.SeleccionFecha();
	}

	@Then("^Confirma cita medica$")
	public void confirma_cita_medica() throws Throwable {
		AgendamientoStep.ConfirmarReserva();
	}
}
