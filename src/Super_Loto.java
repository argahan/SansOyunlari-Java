import java.util.Scanner;
import java.util.Random;
public class Super_Loto {
public static void Super_Loto(){
	Scanner input=new Scanner(System.in);
	Random randomNum=new Random();
	int kolon;
	int sayac=0;
	int deger;
	System.out.print("Ka� kolon girmek istersiniz: ");
	kolon=input.nextInt();
	System.out.print("Kendiniz mi oynamak istersiniz?(Evet=1/Hay�r=2): ");
	deger=input.nextInt();
	
	int [] sansli_numara;
	int [][] secim;
	
	secim=new int[kolon][6];
	sansli_numara=new int[6];
	
	for(int i=0;i<6;i++){
		sansli_numara[i]=randomNum.nextInt(54)+1;
	}
	
if(deger==1){
		
		for(int i=0;i<kolon;i++){
			System.out.println(i+1 + ". kolunu giriniz.");
			for(int j=0;j<6;j++){
				System.out.print(i+1 +". kolonun "+ (j+1) +". say�s�n� giriniz:");
				secim[i][j]=input.nextInt();
				if(secim[i][j]<1 || secim[i][j]>54){
					System.out.println("hatal� say� girdiniz.Tekrar giriniz.");
					j--;
				}
					for(int b=0;b<j;b++){
						if(secim[i][j]==secim[i][b]){
							System.out.println("Ayn� kolonda ayn� say� olamaz.Tekrar giriniz.");
							j--;}
						
					}
			}
		}
		
		}

else if(deger==2){
	for(int i=0;i<kolon;i++){
		for(int j=0;j<6;j++){
			secim[i][j]=randomNum.nextInt(79)+1;
		}
	}
}
else
	System.out.println("hatal� tu�lama yapt�n�z.");


System.out.print("Sansl� Numaralar: ");
for(int i=0;i<6;i++){
	System.out.print(sansli_numara[i]+" ");
}
System.out.println();


for(int i=0;i<kolon;i++){
	System.out.print(i+1 +". kolon Numaralar�= ");
	for(int j=0;j<6;j++){
		System.out.print(secim[i][j]+" ");
	}
	System.out.println();
}
for(int i=0;i<kolon;i++){
	for(int j=0;j<6;j++){
		for(int k=0;k<6;k++){
			if(secim[i][j]==sansli_numara[k])
				sayac++;
		}
	}
	System.out.println(i+1 +". kolonda "+ sayac +" adet say� tutturdunuz.");
	sayac=0;

}
	}
}
