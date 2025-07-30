public class SetCurrency{
    String nameActualCurrency;
    String codeActualCurrency;
    String nameTargetCurrency;
    String codeTargetCurrency;


    public SetCurrency(Integer opcScanner) {

        switch (opcScanner) {
            case 1:
                this.nameActualCurrency = "soles peruanos";
                this.codeActualCurrency = "PEN";
                this.nameTargetCurrency = "dólares";
                this.codeTargetCurrency = "EUR";
                break;
            case 2:
                this.nameActualCurrency = "dólares";
                this.codeActualCurrency = "USD";
                this.nameTargetCurrency = "soles peruanos";
                this.codeTargetCurrency = "PEN";
                break;
            default:
                break;

        }
    }


}
