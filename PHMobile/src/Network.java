/**
 * Class Network
 *
 * @author Gabriel Lucernas Pascual <me@ghabxph.info>
 * @version 1.0
 * @since 2017.08.21
 */
public class Network {

    private String prefix;
    private String network;

    /**
     * Initializes the network type
     * @param prefix  Phone number prefix
     * @param network Mobile Network
     */
    public Network (String prefix, String network) {
        this.prefix  = prefix;
        this.network = network;
    }

    /**
     * Get prefix
     * @return 3 digit prefix (excluding zero)
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Get network
     * @return Return the network name
     */
    public String getNetwork() {
        return network;
    }
}
