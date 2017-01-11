package net.ausiasmarch.manejofechas.modelo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * ManejadorFechas.java
 *
 * @author adri
 */
public class ManejadorFechas {

    private static final Locale locale = new Locale("es", "ES");

    public static int getDiaMes(LocalDateTime ldt) {
        return ldt.getDayOfMonth();
    }

    public static int getDiaMes(LocalDate ld) {
        return ld.getDayOfMonth();
    }

    public static String getMes(LocalDateTime ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.FULL, locale);
    }

    public static String getMes(LocalDate ld) {
        return ld.getMonth().getDisplayName(TextStyle.FULL, locale);
    }

    public static String getMesCorto(LocalDateTime ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.SHORT, locale);
    }

    public static String getMesCorto(LocalDate ld) {
        return ld.getMonth().getDisplayName(TextStyle.SHORT, locale);
    }

    public static int getAnyo(LocalDateTime ldt) {
        return ldt.getYear();
    }

    public static int getAnyo(LocalDate ld) {
        return ld.getYear();
    }

    public static String getDiaSemana(LocalDateTime ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }

    public static String getDiaSemana(LocalDate ld) {
        return ld.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }

    public static String getDiaSemanaCorto(LocalDateTime ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale);
    }

    public static String getDiaSemanaCorto(LocalDate ld) {
        return ld.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale);
    }

    public static int getHora(LocalDateTime ldt) {
        return ldt.getHour();
    }

    public static int getMinuto(LocalDateTime ldt) {
        return ldt.getMinute();
    }

    public static int getSegundo(LocalDateTime ldt) {
        return ldt.getSecond();
    }

    public static String FechaAhora(String ahora) {

        DateTimeFormatter zonaHoraria = DateTimeFormatter.ofPattern("EEEE dd MMMM, yyyy       H:mm ");

        ahora = ZonedDateTime.now().format(zonaHoraria);

        return ahora;
    }

    public static LocalDate sumaDias(LocalDate ld, int valor) {

        return ld.plusDays(valor);
    }

    public static LocalDateTime sumaDias(LocalDateTime ldt, int valor) {

        return ldt.plusDays(valor);
    }

    public static LocalDate sumaMes(LocalDate ld, int valor) {

        return ld.plusMonths(valor);
    }

    public static LocalDateTime sumaMes(LocalDateTime ldt, int valor) {

        return ldt.plusMonths(valor);
    }

    public static LocalDate sumaAño(LocalDate ld, int valor) {

        return ld.plusYears(valor);
    }

    public static LocalDateTime sumaAño(LocalDateTime ldt, int valor) {

        return ldt.plusYears(valor);
    }

    public static LocalDate sumaSemana(LocalDate ld, int valor) {

        return ld.plusWeeks(valor);
    }

    public static LocalDateTime sumaSemana(LocalDateTime ldt, int valor) {

        return ldt.plusWeeks(valor);
    }

    public static LocalDate restaDias(LocalDate ld, int valor) {

        return ld.minusDays(valor);
    }

    public static LocalDateTime restaDias(LocalDateTime ldt, int valor) {

        return ldt.minusDays(valor);
    }

    public static LocalDate restaMes(LocalDate ld, int valor) {

        return ld.minusMonths(valor);
    }

    public static LocalDateTime restaMes(LocalDateTime ldt, int valor) {

        return ldt.minusMonths(valor);
    }

    public static LocalDate restaaño(LocalDate ld, int valor) {

        return ld.minusYears(valor);
    }

    public static LocalDateTime restaaño(LocalDateTime ldt, int valor) {

        return ldt.minusYears(valor);
    }

    public static LocalDate restaSemana(LocalDate ld, int valor) {

        return ld.minusWeeks(valor);
    }

    public static LocalDateTime restSemana(LocalDateTime ldt, int valor) {

        return ldt.minusWeeks(valor);
    }

}
