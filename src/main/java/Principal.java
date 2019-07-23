import controle.checkin.Checkin;
import controle.checkin.CheckinService;
import controle.Hospede;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Hospede hospede = new Hospede();
        CheckinService checkinService = new CheckinService();

        hospede.setId("01");
        hospede.setNome("Eduardo Santos");
        hospede.setCpf("456.669.999-88");

        checkinService.checkIn(new Checkin(hospede.getNome(),01, new Date(), new Date()));

//        System.out.println(hospede.toString());




    }
}

