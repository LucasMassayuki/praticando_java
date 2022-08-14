package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//difinindo as ordens 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");//Horas:minutos
		
		LocalDate d01 = LocalDate.now();// ano-mês-data
		LocalDateTime d02 = LocalDateTime.now();// ano-mês-data-horas-minutos-segundos
		Instant d03 = Instant.now();//data-hora global fuso de 3 horas de Londres
		
		LocalDate d04 = LocalDate.parse("2022-07-07");//com .parse consegue manipular a data
		LocalDateTime d05 = LocalDateTime.parse("2022-07-07T12:00:00");// 
		Instant d06 = Instant.parse("2022-07-07T12:00:00Z");//
		
		LocalDate d07 = LocalDate.parse("07/07/2022", fmt1);
		LocalDate d08 = LocalDate.parse("07/10/2022 07:07", fmt2);
		LocalDate d09 = LocalDate.of(2022, 7, 07);
		LocalDateTime d10 = LocalDateTime.of(2022, 7, 8, 1, 1);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
	}

}
