#Escenario 1
Feature: Pagina de portal salud
  Como usuario deseo realizar transaccion de pago en estado pendiente de cita medica
  	
		
  Scenario: Ingresar al modulo de salud y realizar transaccion de pago en estado pendiente de cita medica
    Given El usuario se encuentra en el portal salud de colsubsidio
    When Hace click en opcion de agendar cita
    And Selecciona opcion de medicina general y hace click en atencion presencial
    And Selecciona la ciudad y hace click en boton siguiente
    And Selecciona el centro medico, la zona horaria y hace click en boton siguiente
    And Selecciona el dia, hora, medico y hace click en boton siguiente
		And Confirma cita medica
		And El usuario hace click en boton citas agendadas
    And Hace click en el boton de pago
    And Ingresa numero de telefono, email y validacion de captchat
    And Hace click en boton siguiente y boton pse
    And Hace confirmacion de mensaje de creacion de la transaccion
    And Selecciona tipo de cliente natural, tipo de identidad bancounion y hace click en boton continuar
    And Ingresa Email y Hace click en boton ir al banco
    And Hace click en opcion debug
    And Ingresa fecha, seleccion estado pendiente e ingresa codigo de authorizationID
    And Hace click en boton call y Return to PPE
    Then Transaccion en estado pendiente