package com.dapp.soap;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endpoint.publish("http://localhost:1515/WS/Calculadora",new CalculadoraImpl());
		

	}

}
