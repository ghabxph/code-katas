/**
 * Class NetworkFinder
 *
 * @author Gabriel Lucernas Pascual <me@ghabxph.info>
 * @version 1.0
 * @since 2017.08.21
 */
public class NetworkFinder {

    /**
     * List of cellular prefixes with corresponding networks
     */
    private Networks networks;

    /**
     * Found network
     */
    private Network found;

    /**
     * Determine whether a network found from specified prefix
     */
    private boolean isFound = false;

    /**
     * Instantiate NetworkFinder
     */
    public NetworkFinder() {
        networks = new Networks();
    }

    /**
     * Find prefix
     * @param prefix The mobile prefix to find
     */
    public NetworkFinder findPrefix(String prefix) {
        for(int index = 0; index < networks.count(); index++) {
            Network network = networks.get(index);
            if (network.getPrefix().equals(prefix)) {
                found = network;
                isFound = true;
                return this;
            }
        }
        isFound = false;
        return this;
    }

    /**
     * Determines whether a prefix is found or not
     * @return Returns true if prefix is specified
     */
    public boolean isPrefixFound() {
        return isFound;
    }

    /**
     * Return found network
     * @return Network of prefix that has been searched
     */
    public Network getFoundNetwork() {
        return found;
    }
}
