import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int deger;
		
		System.out.println("1-On Numara\n2-�ans Topu\n3-S�per Loto\n4-Say�sal Loto");
		System.out.print("L�tfen men�den oynamak istedi�iniz oyunu se�iniz: ");
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
			Say�sal_Loto.Say�sal_Loto();
		}
		else 
			System.out.println("Hatal� tu�lama yapt�n�z.Tekrar deneyiniz.");
	}

}
