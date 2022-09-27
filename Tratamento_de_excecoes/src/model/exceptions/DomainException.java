package model.exceptions;

public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {//Construtor que recebe String como argumento
		super(msg);//permitir pra instanciar Exceção personalizada 
	}
	
}
