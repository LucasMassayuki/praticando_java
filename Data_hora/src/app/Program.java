package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-10");// com .parse consegue manipular a data
		LocalDateTime d05 = LocalDateTime.parse("2022-07-10T12:00:00");//
		Instant d06 = Instant.parse("2022-07-10T01:30:00Z");//

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());// pega o fuso do usuário
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));// pode escolher o fuso
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

		System.out.println("d04 dia = " + d04.getDayOfMonth());//PEGA O DIA DO MÊS
		System.out.println("d04 mês = " + d04.getMonthValue());//PEGA O MÊS
		System.out.println("d04 ano = " + d04.getYear());//PEGA O ANO
		
		System.out.println("d05 hora = " + d05.getHour());//PEGA A HORA
		System.out.println("d05 hora = " + d05.getMinute());//PEGA MINUTO
	}
}
