public class Main {
        public static void main(String[] args) throws LimitExeption {
            BankAccount bankAccount = new BankAccount.deposit(20000);

            while ((true)) {
                try {
                    bankAccount.withDraw(6000);
                }catch (LimitExeption limitExeption) {
                    try {
                        bankAccount.withDraw ((int) limitExeption.getRemainingAmount());
                    } catch (LimitExeption e) {
                        e.printStackTrace();

                    }
                    break;
                }
            }



        }

    }
