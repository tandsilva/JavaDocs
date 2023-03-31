package aplication;

import entities.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        Acount acc = new Acount(1001,"Alex",0);
//        BusinessAcount bacc = new BusinessAcount(1002,"Maria",0,500.0);
//         //-----------------------------------UPCASTING
//        //mandei a variael do tipo acount receber as instancias da classe bacc
//        Acount  acc1 = bacc;
//        //estou atribuindo um objeto da subclasse para super classe
//        Acount acc2 = new BusinessAcount(1003,"bob",0.0,200.0);
//        Acount acc3 = new SavingsAcount(1004,"ana",0.0,0.01);
//
//        //-------------------------------------------DOWNCASTING
//        //para se usar metodos da classe principal
//        BusinessAcount acc4 =(BusinessAcount) acc2;
//
//        //agora sim
//       // acc4.loan(100.0);
//
//        //-----------------------------------Exemplo proibido
//        //uma sub classe nao pode consultar outra sub
//
//       //-------------- BusinessAcount acc5 = (BusinessAcount) acc3;
//
//
//        //------------------------------------para saber se eh filho ou pai
//    if(acc3 instanceof BusinessAcount) {
//        BusinessAcount acc5 = (BusinessAcount) acc3;
//        acc5.loan(200.0);
//        System.out.printf("Loan");
//    }
//        if(acc3 instanceof SavingsAcount){
//            SavingsAcount acc5 = (SavingsAcount) acc3;
//            acc5.updateBalance();
//            System.out.println("update");
//
//        }
//
      /*      Acount acc1 = new Acount(1001,"Alex",1000.0);
            acc1.withdraw(200.0);
            System.out.println(acc1.getBalance());
            //____________________________UPCASTING_____________________________

            Acount acc2 = new SavingsAcount(1002,"Bacana",1000.0,0.01);
            acc2.withdraw(200.0);
            System.out.println(acc2.getBalance());

    //um modo diferente de usar o super
            Acount acc3 = new BusinessAcount(1003,"Thiago",1000.0,500.0);
            acc3.withdraw(200.0);
            System.out.println(acc3.getBalance());*/
        //instanciou o objeto e chamou metodo wit e chamou o outro metodo para ver o saldo
//         Acount x = new Acount(1020,"Thiago",1000.0);
//        Acount y = new SavingsAcount(1023,"Kelle",1000.0,0.01);
//        x.withdraw(50.0);
//        y.withdraw(50.0);
//        System.out.println(x.getBalance());
//        System.out.println(y.getBalance());


        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees");
        int n =sc.nextInt();

        for (int i =1;i<=n;i++){
            System.out.println("Employee #" +i+ "data");

            System.out.print("OutSourced (y/n)");
            char ch = sc.next().charAt(0);

            System.out.print("Name");
            sc.nextLine();

            String name = sc.nextLine();
            System.out.print("Hours");
           int hours = sc.nextInt();

            System.out.print("Value per hour");
            double valuePerHouer = sc.nextDouble();

            if(ch =='y'){
                System.out.println("Additional charge ");
                double additionalCharge = sc.nextDouble();
                //se voce ficar perdido tranquilo estas variaveis
                //pode ser feito assim tambem  Employee emp = new OuttsourceEmployee(name,hours,valuePerHouer,additionalCharge);
               list.add( new OuttsourceEmployee(name,hours,valuePerHouer,additionalCharge));
               // list.add(emp);

            }else {
                //Employee emp = new Employee(name,hours,valuePerHouer);
                //list.add(emp);
                list.add( new Employee(name,hours,valuePerHouer));
            }



    }
        sc.close();

        System.out.println();
        System.out.println("payments");
        for(Employee thi : list){
            System.out.println(thi.getName()+" -$ "+String.format("%.2f",thi.payment()));
        }




    }

}
