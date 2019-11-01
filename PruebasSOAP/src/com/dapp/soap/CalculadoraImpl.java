package com.dapp.soap;

import javax.jws.*;

@WebService(endpointInterface = "com.dapp.soap.Calculadora")
public class CalculadoraImpl implements Calculadora {

	@Override
	public double calculadora(int opc, int a, int b) {

		double resultado = 0;

		switch (opc) {

		case 1:
			resultado = a + b;
			break;

		case 2:
			resultado = a - b;
			break;

		case 3:
			resultado = a * b;
			break;

		case 4:
			resultado = a / b;
			break;

		default:
			break;
		}

		return resultado;

	}

}
