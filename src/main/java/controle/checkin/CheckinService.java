package controle.checkin;

import controle.checkin.Checkin;
import repository.QuartoRepository;

public class CheckinService {

    private QuartoRepository quartoRepository = new QuartoRepository();

    public void checkIn(Checkin checkin) {
        if (isQuartosDisponiveis()) {
            imprimeVoucher(checkin);
        } else {
            System.out.println("Não existe quarto disponivel.");
        }
    }

    private boolean isQuartosDisponiveis() {
        return quartoRepository.quantidadeQuartosDisponiveis() > 0;
    }

    private void imprimeVoucher(Checkin checkin) {
        System.out.println("-----------NOME DO HOTEL-----------");
        System.out.println("Numero do quarto: " + checkin.getNumeroQuarto());
        System.out.println("Responsavel pela hospedagem: " + checkin.getNomeHospede());
        System.out.println("De: " + checkin.getInicio());
        System.out.println("Até: " + checkin.getFim());
    }
}
