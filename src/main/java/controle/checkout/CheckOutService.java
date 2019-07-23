package controle.checkout;

public class CheckOutService {


    private double obterValorTotalDaHospedagem(){
        return 0;
    }

    private double obterConsumo(){
        return 0;
    }

    private void imprimirVoucher(CheckOut checkOut){
        System.out.println("-----------NOME DO HOTEL-----------");
        System.out.println("Numero do quarto: " + checkOut.getNumeroQuarto());
        System.out.println("Responsavel hospedagem: " + checkOut.getNomeResponsavel() );
        System.out.println("Periodo: " + checkOut.getPeriodoHospedagem());
        System.out.println("Itens consumidos: " + checkOut.getItensConsumidos());
        System.out.println("Valor total hospedagem: " + checkOut.getValorTotalHospedagem());
    }

}
