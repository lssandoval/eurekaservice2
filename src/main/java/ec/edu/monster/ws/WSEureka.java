/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.ws;

import ec.edu.monster.modelo.Movimiento;
import ec.edu.monster.servicio.EurekaService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@WebService(serviceName = "WSEureka")
public class WSEureka {

    @WebMethod(operationName = "traerMovimientos")
    @WebResult(name = "movimiento")
    @XmlElementWrapper(name = "movimientos")
    @XmlElement(name = "movimiento")
    public List<Movimiento> traerMovimientos(@WebParam(name = "numeroCuenta") String cuenta) {
        EurekaService service = new EurekaService();
        return service.leerMovimientos(cuenta);
    }

    /**
     * Web service operation
     *
     * @param cuenta
     * @param importe
     * @return Estado, 1 o -1
     */
    @WebMethod(operationName = "regDeposito")
    @WebResult(name = "estado")
    public int regDeposito(@WebParam(name = "cuenta") String cuenta, @WebParam(name = "importe") double importe) {
        int estado;

        //proceso
        String codEmp = "0001";
        try {
            EurekaService service = new EurekaService();
            service.registrarDeposito(cuenta, importe, codEmp);
            estado = 1;
        } catch (Exception e) {
            estado = -1;
        }

        //retorno
        return estado;
    }

    @WebMethod(operationName = "login")
    @WebResult(name = "estado")
    public boolean login(@WebParam(name = "usuario") String usuario, @WebParam(name = "clave") String clave) {
        EurekaService service = new EurekaService();
        return service.validarUsuario(usuario, clave);
    }
}
