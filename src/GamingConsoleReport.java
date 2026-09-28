public class GamingConsoleReport {
    public static void main(String[] agrs) {
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };
        int[]cityTotals = new int[cities.length];
        for(int i = 0; i < cities.length;i++){
            int total = 0;
            for (int j =0; j <3;j++) {
                total += sales[i][j];
            }
            cityTotals[i] = total;
        }
        int maxIndex = 0;
        for(int i = 1; i < cityTotals.length; i++){
            if (cityTotals[i] > cityTotals[maxIndex])maxIndex= i ;
        }
        System.out.println("________________________________");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("_________________________________");
        System.out.printf("%-20s %-10s %-10s/n","","PS5","XBOX","SWITCH");
        for (int i = 0; i < cityTotals.length;i++){
            System.out.printf("%-20s %-10d %-10d %-10d/n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }
    }
}
