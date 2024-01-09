import java.util.Arrays;

public class Main {
  // Метод main:
  //
  //Действие: Создает экземпляр счета myAccount, выполняет операции пополнения,
  // снятия, выводит историю и другую информацию для тестирования класса.

    public static void main(String[] args) {
         Account myAccount = new Account("12345", 1000.0);
      //   Deposit пополнение
      myAccount.deposit(500.0);
        System.out.println("Текущий баланс после пополнения : " + myAccount.getCurrentBalance());

       //  Withdraw снятие
         myAccount.withdraw(200.0);
        System.out.println("Текущий баланс после снятия : " + myAccount.getCurrentBalance());

        //  Display Deposit History история пополнения
          System.out.println("История пополнения: " + Arrays.toString(myAccount.getDepositAmounts()));

     //    Display Max and Min Deposit
    System.out.println("Максимал пополнение : " + myAccount.getMaxDeposit());
         System.out.println("Min пополнение: " + myAccount.getMinDeposit());

      //   Clear Deposit History
    myAccount.clearHist();
         System.out.println("История после очистки : " + Arrays.toString(myAccount.getDepositAmounts()));
         }
         }


