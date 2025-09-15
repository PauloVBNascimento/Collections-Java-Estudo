package map.Ordenacao;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventos;

    public AgendaEventos () {
        this.agendaEventos = new HashMap<>();
    }

    public void adicionarEvento (LocalDate data, String nome, String atributo) {
        agendaEventos.put(data, new Evento(nome, atributo));
    }

    public Map<LocalDate, Evento> exibirAgendaOrdenada () {
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(agendaEventos);
        return eventosOrdenados;
    }

    public Map<LocalDate, Evento> obterProximoEvento () {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosOrdenados = exibirAgendaOrdenada();
        //var poderia ser usado abaixo se não quiser declarar o tipo da variavel
        for (Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                Map<LocalDate, Evento> eventoProximo = new HashMap<>();
                eventoProximo.put(entry.getKey(), entry.getValue());
                return eventoProximo; 
            }
        }
        return Collections.emptyMap();
    }
    
}
