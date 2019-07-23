package controle.checkin;

import java.util.Date;

public class Checkin {

    private String nomeHospede;
    private int numeroQuarto;
    private Date inicio;
    private Date fim;

    public Checkin(String nomeHospede, int numeroQuarto, Date inicio, Date fim) {
        this.nomeHospede = nomeHospede;
        this.numeroQuarto = numeroQuarto;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFim() {
        return fim;
    }
}
