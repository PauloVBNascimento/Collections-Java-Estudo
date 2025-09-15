package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class TestarAgenda {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 9, 18), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 9, 16), "Evento 3", "Atração 3");

        System.out.println("\nAgenda por Ordem: \n" + agendaEventos.exibirAgendaOrdenada());

        System.out.println("\nEvento mais próximo: \n" + agendaEventos.obterProximoEvento());
    }
}
