public class Currency extends ApiClient{

    String nameActualCurrency;
    String nameTargetCurrency;

    public Currency(Integer userInput) {
        switch (userInput) {
            case 1:
                super.actualCurrency = "PEN";
                super.targetCurrency = "USD";
                break;
            case 2:
                super.actualCurrency = "USD";
                super.targetCurrency = "PEN";
                break;
            case 3:
                super.actualCurrency = "ARS";
                super.targetCurrency = "USD";
                break;
            case 4:
                super.actualCurrency = "USD";
                super.targetCurrency = "ARS";
                break;
            case 5:
                super.actualCurrency = "BOB";
                super.targetCurrency = "USD";
                break;
            case 6:
                super.actualCurrency = "USD";
                super.targetCurrency = "BOB";
                break;
            case 7:
                super.actualCurrency = "BRL";
                super.targetCurrency = "USD";
                break;
            case 8:
                super.actualCurrency = "USD";
                super.targetCurrency = "BRL";
                break;
            default:
                break;
            
            }
        this.nameActualCurrency = getName(actualCurrency);
        this.nameTargetCurrency = getName(targetCurrency);
    }

    public String getName(String codeCurrency) {

        String name = "";
        switch (codeCurrency) {
            case "PEN":
                name = "soles";
                break;
            case "USD":
                name = "dolares";
                break;
            case "ARS":
                name = "pesos argentinos";
                break;
            case "BOB":
                name = "bolivianos";
                break;
            case "BRL":
                name = "reales brasileños";
                break;
            default:
                name = "none";
                break;
        }
        return name;
    }

    public Double getConversionRate () {
        if (super.apiResponse ==null) {
            getApiResponse();
        }
        return super.apiResponse.conversion_rate();
    }
}
