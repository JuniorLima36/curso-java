package enums.application;

import java.util.Date;

import enums.entities.Ordem;
import enums.entities.enums.OrdemStatus;

public class Programa {
	public static void main(String[] args) {
		
		Ordem ordem = new Ordem(1080, new Date(), OrdemStatus.PEDING_PAYMENT);
		System.out.println(ordem);
		
		OrdemStatus os1 = OrdemStatus.DELIVERED;
		OrdemStatus os2 = OrdemStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
