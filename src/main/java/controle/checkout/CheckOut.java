package controle.checkout;

import controle.Produto;

import java.util.Date;
import java.util.EnumMap;
import java.util.List;

public class CheckOut{

    private int numeroQuarto;
    private String nomeResponsavel;
    private int periodoHospedagem;
    private List<Produto> itensConsumidos;
    private Double valorTotalHospedagem;
    private Date inicio;
    private Date fim;

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public int getPeriodoHospedagem() {
        // Calcular a data fim - a data Inicio.

        return periodoHospedagem;
    }

    public String getItensConsumidos() {

        StringBuilder itemImpressao = new StringBuilder();
        for (Produto itemConsumido : itensConsumidos) {
            //Descobrir como recuperar o valor do ENUM
            //itemImpressao.append(itemConsumido. ??? + "\n");
            itemImpressao.append(itemConsumido.name() + "\n");
        }
        return itemImpressao.toString();
    }

    public Double getValorTotalHospedagem() {

        //Total do periodo + consumo.
        return valorTotalHospedagem;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFim() {
        return fim;
    }
}
