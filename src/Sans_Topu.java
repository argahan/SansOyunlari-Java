import java.util.Scanner;
import java.util.Random;
public class Sans_Topu {
public static void Sans_Topu(){
	Scanner input=new Scanner(System.in);
	Random randomNum=new Random();
	int kolon;
	int sayac=0,sayac2=0;
	int deger;
	System.out.print("Kaç kolon girmek istersiniz: ");
	kolon=input.nextInt();
	System.out.print("Kendiniz mi oynamak istersiniz?(Evet=1/Hayýr=2): ");
	deger=input.nextInt();
	
	int [] sansli_numara;
	int sansli_numara1;
	int [][] secim;
	
	secim=new int[kolon][6];
	sansli_numara=new int[5];
	
	for(int i=0;i<5;i++){
		sansli_numara[i]=randomNum.nextInt(34)+1;
	}
	sansli_numara1=randomNum.nextInt(14)+1;
	
if(deger==1){
		
		for(int i=0;i<kolon;i++){
			System.out.println(i+1 + ". kolunu giriniz.");
			for(int j=0;j<5;j++){
				System.out.print(i+1 +". kolonun "+ (j+1) +". sayýsýný giriniz:");
				secim[i][j]=input.nextInt();
				if(secim[i][j]<1 || secim[i][j]>34){
					System.out.println("hatalý sayý girdiniz.Tekrar giriniz.");
					j--;
				}
					for(int b=0;b<j;b++){
						if(secim[i][j]==secim[i][b]){
							System.out.println("Ayný kolonda ayný sayý olamaz.Tekrar giriniz.");
							j--;}
					}
					
						
			}
			System.out.print(i+1 +". kolonun +1 ini giriniz: ");
			secim[i][5]=input.nextInt();
		}
		
		}

else if(deger==2){
	for(int i=0;i<kolon;i++){
		for(int j=0;j<5;j++){
			secim[i][j]=randomNum.nextInt(34)+1;
		}
		secim[i][5]=randomNum.nextInt(14)+1;
	}
}

else
	System.out.println("hatalý tuþlama yaptýnýz.");


System.out.print("Sanslý Numaralar: ");
for(int i=0;i<5;i++){
	System.out.print(sansli_numara[i]+" ");
}
System.out.println("+ "+sansli_numara1);
System.out.println();

for(int i=0;i<kolon;i++){
	System.out.print(i+1 +". kolon Numaralarý= ");
	for(int j=0;j<5;j++){
		System.out.print(secim[i][j]+" ");
	}System.out.print("+ "+secim[i][5]);
	System.out.println();
}
for(int i=0;i<kolon;i++){
	for(int j=0;j<5;j++){
		for(int k=0;k<5;k++){
			if(secim[i][j]==sansli_numara[k])
				sayac++;
		}
	
	}
	if(sansli_numara1==secim[i][5])
		sayac2++;
	
	System.out.println(i+1 +". kolonda= "+ sayac +" + "+sayac2+ " tutturdunuz.");
	sayac=0;
	sayac2=0;

}
	
	}
}
