package com.dapp.soap;
import javax.jws.*;

@WebService
public interface Calculadora {

	@WebMethod
	public double calculadora(int opc, int a, int b);

}
