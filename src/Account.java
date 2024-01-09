
  // Создайте класс "Account" с приватными полями для номера счета и текущего баланса.
    import java.util.Arrays;
    public class Account { private String accountNumber;
        private double currentBalance;
        private double[] depositAmounts;
  // Конструктор Account:
  //
  //Параметры: Принимает номер счета (accountNumber) и начальный баланс (initialBalance).
  //Действие: Инициализирует объект Account с указанными параметрами и
  // создает пустой массив depositAmounts для хранения истории пополнений.
        public Account(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.currentBalance = initialBalance;
            this.depositAmounts = new double[0];
        }
   // Реализуйте методы для пополнения и снятия средств.
  // Метод deposit:
   //
   //Параметры: Принимает сумму (amount), которую нужно добавить к текущему балансу.
   //Действие: Увеличивает текущий баланс на указанную сумму и добавляет этот депозит в историю.
        public void deposit(double amount) {
            currentBalance += amount;
            addDepositToHistory(amount);
        }
  // Если при попытке снятия средств сумма списания превышает баланс необходимо вывести об этом сообщение.
  // Метод withdraw:
  //
  //Параметры: Принимает сумму (amount), которую нужно снять со счета.
  //Действие: Если сумма снятия не превышает текущий баланс, уменьшает текущий баланс на указанную сумму.
  // В противном случае выводит сообщение о недостаточных средствах.
        public void withdraw(double amount) {
            if (amount <= currentBalance) {
                currentBalance -= amount;
            } else {
                System.out.println("При попытке снятия средств сумма списания превышает баланс.");
            }
        }
        //             Создайте массив depositAmounts, который хранит суммы пополнений счета.
        //  При каждом пополнении счета размер массива увеличивается на 1 и в новую ячейку вписывается сумма.
 // Приватный метод addDepositToHistory:
        //
        //Параметры: Принимает сумму (amount), которую нужно добавить в историю пополнений.
        //Действие: Увеличивает размер массива depositAmounts на 1 и добавляет в новую ячейку сумму депозита.
        private void addDepositToHistory(double amount) {
            depositAmounts = Arrays.copyOf(depositAmounts, depositAmounts.length + 1);
            depositAmounts[depositAmounts.length - 1] = amount;
        }
      //  Создайте метод clearHist, который очищает массив с историей пополнений.
 // Метод clearHist:
      //
      //Действие: Обнуляет историю пополнений, устанавливая массив depositAmounts в пустой массив.
        public void clearHist() {
            depositAmounts = new double[0];
        }
  //      Создайте методы getMaxDeposit и getMinDeposit, которые возвращают максимлальный или минимальный депозит.
  //      Если история пуста, то методы возвращают -1.
  // Метод getMaxDeposit:
  //
  //Возвращаемое значение: Максимальная сумма депозита в истории.
  //Действие: Если история не пуста, использует стримы и возвращает максимальное значение. В противном случае возвращает -1.
        public double getMaxDeposit() {
            if (depositAmounts.length > 0) {
                double maxDeposit = depositAmounts[0];
                for (double deposit : depositAmounts) { if (deposit > maxDeposit) {
                    maxDeposit = deposit;
                }
                }
                return maxDeposit;
            } else {
                return -1;
            }
// Метод getMinDeposit:
//
//Возвращаемое значение: Минимальная сумма депозита в истории.
//Действие: Если история не пуста, использует стримы и возвращает минимальное значение. В противном случае возвращает -1.

        } public double getMinDeposit() {
            if (depositAmounts.length > 0) {
                double minDeposit = depositAmounts[0];
                for (double deposit : depositAmounts) {
                    if (deposit < minDeposit) {
                        minDeposit = deposit;
                    }
                } return minDeposit;
            } else {
                return -1;
            }
        }
 // Метод getCurrentBalance:
 //
 //Возвращаемое значение: Текущий баланс счета.
        public double getCurrentBalance() {
            return currentBalance;
        }
// Метод getDepositAmounts:
//
//Возвращаемое значение: Массив с историей пополнений.
        public double[] getDepositAmounts(){
            return depositAmounts;
        }
    }

