import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int deger;
		
		System.out.println("1-On Numara\n2-Þans Topu\n3-Süper Loto\n4-Sayýsal Loto");
		System.out.print("Lütfen menüden oynamak istediðiniz oyunu seçiniz: ");
		deger=input.nextInt();
		
		if(deger==1){
			On_Numara.On_Numara();
		}
		else if(deger==2){
			Sans_Topu.Sans_Topu();
		}
		else if(deger==3){
			Super_Loto.Super_Loto();
		}
		else if(deger==4){
			Sayýsal_Loto.Sayýsal_Loto();
		}
		else 
			System.out.println("Hatalý tuþlama yaptýnýz.Tekrar deneyiniz.");
	}

}
