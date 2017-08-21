import IO.*;

/**
 * Class PHMobile
 *
 * @author Gabriel Lucernas Pascual <me@ghabxph.info>
 * @version 1.0
 * @since 2017.08.21
 */
public class PHMobile {

    public static void main(String[] args) {
        Output.print("3 digit prefix number: ");
        getNetwork(Input.get());
    }

    /**
     * Displays the network (GLOBE, SMART, SUN, ETC...)
     * @param prefix  String containing the 3 digit prefix number
     */
    private static void getNetwork(String prefix) {
        NetworkFinder networkFinder = new NetworkFinder();
        boolean isPrefixFound = networkFinder.findPrefix(prefix).isPrefixFound();
        if (isPrefixFound) {
            String network = networkFinder.getFoundNetwork().getNetwork();
            Output.printlnf("%s is %s", prefix, network);
        } else {
            Output.printlnf("%s does not exist. Probably invalid network.", prefix);
        }
    }
}
