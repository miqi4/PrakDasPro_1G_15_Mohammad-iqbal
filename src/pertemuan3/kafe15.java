package pertemuan3;

        import java.util.Scanner;
        
        public class kafe15 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                boolean keanggotaan;
                double jmlKopi, jmlTeh, jmlroti;
                double hargakopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalharga, nominalBayar;
                float diskon = 10/100f;
        
                System.out.print("masukkan keanggotaan (true/false) :");
                keanggotaan = input.nextBoolean();
                System.out.print("masukkan jumlah pembelian kopi :");
                jmlKopi = input.nextInt();
                System.out.print("masukkan jumlah pembelian teh :");
                jmlTeh = input.nextInt();
                System.out.print("masukkan jumlah pembelian roti :");
                jmlroti = input.nextInt();
        
                totalharga = (jmlKopi*hargakopi) + (jmlTeh*hargaTeh) + (jmlroti*hargaRoti);
        
                nominalBayar = totalharga - (diskon*totalharga);
                int nominalint = (int)nominalBayar;
                byte nominalByte = (byte) nominalBayar;
                      
                
                System.out.println("Keanggotaan pelanggan " +keanggotaan);
                System.out.println("item pembelian "+jmlKopi+" kopi "+jmlTeh+" teh "+jmlroti+" roti ");
                System.out.println("nominal bayar : "+nominalBayar);
                System.out.println("nominal int :"+nominalint);
                System.out.println("nominal byte :"+nominalByte);
                
        
        
        
        
        
            }
            
        }
