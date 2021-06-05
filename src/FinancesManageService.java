/**
 * The type Finances manage service.
 */
public class FinancesManageService implements ManageService {

    /**
     * The Total sales.
     */
    double totalSales;
    /**
     * The Employee manage service.
     */
    EmployeeManageService employeeManageService = new EmployeeManageService();
    /**
     * The Total s.
     */
    double totalS;

    /**
     * Instantiates a new Finances manage service.
     *
     * @param totalSales the total sales
     */
    public FinancesManageService(double totalSales) {
        totalS = employeeManageService.calculateFee();
        this.totalSales = totalSales;
    }

    @Override
    public double calculateFee() {
        return totalSales - totalS;
    }

    @Override
    public void printMessage() {
        System.out.println("The total expenses are: RM" + totalS);
        System.out.println("The total sales are: RM" + totalSales);
        System.out.println("The profit for this month is: RM" + calculateFee());
    }
}
