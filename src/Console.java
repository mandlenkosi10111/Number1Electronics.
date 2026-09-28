public abstract class Console implements IConsoles{
    private String consoleType, storeName;
    private int totalSales;
    public Console(String consoleType, String storeName, int totalSales){
        this.consoleType=consoleType,this.storeName=storeName; this.totalSales=totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    public String getStoreName() {
        return storeName;
    }

    @Override
    public int getTotalSales() {

    }
}
