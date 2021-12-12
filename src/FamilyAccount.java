public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        //初始金额10000
        int balance = 10000;
        //用于记录用户收入和支出详情
        String details = "收支\t\t账户金额\t\t收支金额\t\t说 明\n";
        while (isFlag) {
            System.out.println("-----------------家庭收支记账软件-----------------\n");
            System.out.println("                   1.收支明细");
            System.out.println("                   2.登记收入");
            System.out.println("                   3.登记支出");
            System.out.println("                   4.退\t出\n");
            System.out.print("                   请选择（1-4）：");
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("-----------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int addMoney = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String addInfo = Utility.readString();
                    System.out.println("-------------------登记完成---------------------");
                    //处理收支明细
                    balance += addMoney;
                    details += "收入\t\t" + balance + "\t\t" + addMoney + "\t\t" + addInfo + "\n";
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int reduceMoney = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String reduceInfo = Utility.readString();
                    System.out.println("-------------------登记完成---------------------");
                    if (reduceMoney>balance){
                        //支出大于余额，支付失败
                        System.out.println("余额不足，支付失败！");
                    }else {
                        //处理收支明细
                        balance -= reduceMoney;
                        details += "支出\t\t" + balance + "\t\t" + reduceMoney + "\t\t" + reduceInfo + "\n";
                    }
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N)");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    break;
            }


        }
    }
}
