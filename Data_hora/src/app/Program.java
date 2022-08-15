package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-10");// com .parse consegue manipular a data
		LocalDateTime d05 = LocalDateTime.parse("2022-07-10T12:00:00");//
		Instant d06 = Instant.parse("2022-07-10T01:30:00Z");//

		LocalDate pastWeekLocalDate = d04.minusDays(7);// menos (dia) que colocar
		LocalDate nextWeekLocalDate = d04.plusDays(7);// mais (dia)
		LocalDate nextYearsLocalDate = d04.plusYears(7);// somando mais anos

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("nextYearsLocalDate = " + nextYearsLocalDate);

		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);// menos (dia) que colocar
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());//duração de dias
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}
