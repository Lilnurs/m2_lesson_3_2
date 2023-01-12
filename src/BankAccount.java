public class BankAccount {
    private double amount;

    public double getAmount(){
        return amount;
    }

    public  void deposit(double sum){
        amount += sum;
        System.out.println("вы поплнили счет" + sum);

    }
    public  void withDraw(int sum) throws  LimitExeption {
        if (amount < sum) {
            throw new LimitExeption("вы хотите снять больше чем на счете", amount);
        }else {
            amount -= sum;
            System.out.println("вы сняли -+" + sum);


        }

    }

    public void setAmount(int i) {
    }

    public static class deposit extends BankAccount {
        public deposit(int i) {
            super(
            );
        }
    }
}
