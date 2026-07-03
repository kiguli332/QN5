public class GatewayConfig {
    private static GatewayConfig instance;

    private GatewayConfig(){}

    public static GatewayConfig getInstance(){
        if(instance == null){
            instance = new GatewayConfig();
        }
        return instance;
    }
}
