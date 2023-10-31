class PrintTable extends Thread {
    private int number;

    public PrintTable(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

public class TablePrintUsingThread {
    public static void main(String[] args) {
        PrintTable t1 = new PrintTable(2);
        t1.start();
    }
}
