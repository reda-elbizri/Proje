
package bank;

import java.util.Scanner;

/**
 *
 * @author Ali khosrow and Reda El Bizri
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO kodu uygulama mantığı burada
        Scanner input=new Scanner(System.in);
        double ac,balances;
        String name,AcTyp,Add;
        //Yeni Hesap Oluşturma......
        System.out.println("Arkamızda Hesap Oluşturmak İçin Aşağıdaki Formu Doldurun!");
        System.out.println("Hesap Numarasını Girin Lütfen !");
        ac=input.nextDouble();
        System.out.println("Adınızı Girin Lütfen !");
        name=input.next();
        System.out.println("Sembolleri Kullanarak Hesap Türünü Girin !");
        AcTyp=input.next();
        System.out.println("Bakiyenizi Girin Lütfen !");
        balances=input.nextDouble();
        System.out.println("Adresinizi Girin Lütfen !");
        Add=input.next();
        
        bank_info client=new bank_info(ac,name,AcTyp,Add,balances);
         client.display_info();
        //Hesap Oluşturma Sonu......
         System.out.println("-----------------------------------------------------------");
      
         
//Hesapta İşlem.......234567
    boolean loop=true;
       int action;
       double addmoney,withdraw,transfer,rec_acc;
       
     do{  
       System.out.println("Hesabınızda Hangi İşlemi Yapmak İstiyorsunuz? ");
          System.out.println("1. --- Yatırma  2. --- Para Çekmek  ---  3. --- Transfer --- 4. Çıkış Yap");
          action=input.nextInt();
        switch (action) {
        
////////////////////////////////////////////////////////////////////////////////////
          //Para Yatırma Başlangıcı........
            case 1:
                System.out.println("Hesabınıza Ne Kadar Para Yatırmak İstiyorsunuz?");
                addmoney=input.nextDouble();
                client.Deposit(addmoney);
                System.out.println("----    Para Yatırma Sonrası Hesap Bilgileri    ----");
                client.display_info();
                break;
                //Para Yatırma Sonu......
////////////////////////////////////////////////////////////////////////////////////                
                
        //Çekilme Başlangıcı.........
            case 2:
                System.out.println("Hesabınızdan Ne Kadar Tutar Çekmek İstiyorsunuz");
                withdraw=input.nextDouble();
                client.withdraw(withdraw);
                
                
                
                break;
                
                //Çekilme Sonu......
////////////////////////////////////////////////////////////////////////////////////                
        //Transfer Başlangıcı......
            case 3:
                System.out.println("Para Transferi Yapmak İstediğiniz Hesabı Hayır Giriniz!");
                rec_acc=input.nextDouble();
                System.out.println("Buna Kaç Tutar Aktarmak İstiyorsunuz  "+rec_acc+" hesabınıza?");
                transfer=input.nextDouble();
                System.out.println("-----------------------------------------------------------");
                client.transfer(transfer,rec_acc);
                break;
                
            case 4:
                loop=false;
                System.out.println("Bizimle olduğunuz için teşekkürler :) ");
                break;
                //Transferin Sonu......
////////////////////////////////////////////////////////////////////////////////////                
            default:
                System.out.println("İşlem İçin Yanlış Giriş!");
                break;
        }
     
        
        
       }while(loop);
         
         
        
    }
    
}
