
package bank;

import java.util.Scanner;

/**
 *
 * @author Ali khosrow and Reda El Bizri
 */
public class bank_info {
    
    private final double AccountNo;
    private final String Name;
    private final String Acc_type;
    private final String Address;
    private double BankBallance;
    
    bank_info(double AccNo,String AccName,String AccType,String Add,double balance){
        AccountNo=AccNo;
        Name=AccName;
        Acc_type=AccType;
        Address=Add;
        BankBallance=balance;
        
    }
    
    public void display_info(){
        System.out.println("---------    Hesap Detayları    ---------");
        System.out.println("Ad:   "+Name);
        System.out.println("Hesap Numarası:   "+AccountNo);
        System.out.println("Cari Bakiye:   "+BankBallance+Acc_type);
        System.out.println("Adres:    "+Address);
    }
    
    ///////////////////////Yatırma////////////////////////////////////
    
    public void Deposit(double depose)
    {
        BankBallance=BankBallance+depose;
    }
    
    ///////////////////////Para Çekmek////////////////////////////////////
    public void withdraw(double wd){
        if(BankBallance>=wd){
            BankBallance=BankBallance-wd;
            System.out.println("---------- İşlem Başarıyla Yapıldı ------------");
            System.out.println("---------    Çekildikten Sonra Hesap Detayları    ---------");
        System.out.println("Ad:   "+Name);
        System.out.println("Hesap Numarası:   "+AccountNo);
        System.out.println("Cari Bakiye:   "+BankBallance+Acc_type);
        System.out.println("Adres:    "+Address);
            
            
        }
        else{
            
            System.out.println("UYARMAK!!!!!\nBu İşlemi Gerçekleştirmek İçin Yeterli Miktarınız Yok!");
            System.out.println("Önce Tutarınızı Artırın Sonra Tekrar Deneyin! ");
        }
    }
    
    /////////////////Transfer////////////////////////////////////////////
    int permission;
    Scanner in=new Scanner(System.in);
    public void transfer(double trans,double acn){
        if(BankBallance>=trans){
            System.out.println("Emin misin, Aktarmak İstiyorsun "+trans+Acc_type);
            System.out.println("1. Evet      -----      2. Hayır    ");
            permission=in.nextInt();
            if(permission==1){
                BankBallance=BankBallance-trans;

                System.out.println("---------- İşlem Başarıyla Yapıldı ------------");
                System.out.println("Başarıyla Aktardınız "+trans+Acc_type+" Tutar Bu hesap numarası "+acn);
            System.out.println("---------    Transfer Sonrası Hesap Detayları    ---------");
        System.out.println("Ad:   "+Name);
        System.out.println("Hesap Numarası:   "+AccountNo);
        System.out.println("Cari Bakiye:   "+BankBallance+Acc_type);
        System.out.println("Adres:    "+Address);
                
            }
            else{
                System.out.println("Aktarım Başarısız !  \nBizimle olduğunuz için teşekkürler,");
            }
        }
        else{
            System.out.println("UYARMAK!!!!!\nBu İşlemi Gerçekleştirmek İçin Yeterli Miktarınız Yok!");
            System.out.println("Önce Tutarınızı Artırın Sonra Tekrar Deneyin! ");
        }
    }
    //Transferin sonu......
    
}
