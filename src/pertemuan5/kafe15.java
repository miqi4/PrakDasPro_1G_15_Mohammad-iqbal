package pertemuan5;

        import java.util.Scanner;
        
        public class kafe15 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String keanggotaan;
                double jmlKopi, jmlTeh, jmlroti;
                double hargakopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalharga, nominalBayar;
                float diskon = 10/100f;
        
                System.out.print("member kafe (iya/tidak) ?");
                keanggotaan = input.nextLine();
                System.out.print("masukkan jumlah pembelian kopi :");
                jmlKopi = input.nextInt();
                System.out.print("masukkan jumlah pembelian teh :");
                jmlTeh = input.nextInt();
                System.out.print("masukkan jumlah pembelian roti :");
                jmlroti = input.nextInt();
                
                totalharga = (jmlKopi*hargakopi) + (jmlTeh*hargaTeh) + (jmlroti*hargaRoti);
        
                nominalBayar = totalharga - (diskon*totalharga);
                int nominalint = (int)nominalBayar;
                
                switch (keanggotaan.toLowerCase()) {
                case "iya":
                System.out.println("anggota kafe");
                System.out.println("item pembelian "+jmlKopi+" kopi "+jmlTeh+" teh "+jmlroti+" roti ");
                System.out.println("nominal bayar : "+nominalint);
                break;

                case "tidak": 
                System.out.println("bukan anggota kafe");
                System.out.println("item pembelian "+jmlKopi+" kopi "+jmlTeh+" teh "+jmlroti+" roti ");
                System.out.println("nominal bayar : "+totalharga);
                }

        
            }
            
        }
    
