/**
 * Class Networks
 *
 * @author Gabriel Lucernas Pascual <me@ghabxph.info>
 * @version 1.0
 * @since 2017.08.21
 */
public class Networks {
    private Network[] networks;

    public Networks() {
        networks = new Network[]{
                new Network("817", "Globe Telecom"),
                new Network("905", "Globe Telecom"),
                new Network("906", "Globe Telecom"),
                new Network("907", "Smart Communications"),
                new Network("908", "Smart Communications"),
                new Network("909", "Smart Communications"),
                new Network("912", "Smart Communications"),
                new Network("915", "Globe Telecom"),
                new Network("916", "Globe Telecom"),
                new Network("917", "Globe Telecom"),
                new Network("918", "Smart Communications"),
                new Network("919", "Smart Communications"),
                new Network("910", "Smart Communications"),
                new Network("921", "Smart Communications"),
                new Network("922", "Sun Cellular"),
                new Network("923", "Sun Cellular"),
                new Network("925", "Sun Cellular"),
                new Network("926", "Globe Telecom"),
                new Network("927", "Globe Telecom"),
                new Network("928", "Smart Communications"),
                new Network("929", "Smart Communications"),
                new Network("920", "Smart Communications"),
                new Network("920", "Smart Communications"),
                new Network("932", "Sun Cellular"),
                new Network("933", "Sun Cellular"),
                new Network("935", "Globe Telecom"),
                new Network("936", "Globe Telecom"),
                new Network("937", "Globe Telecom or ABS-CBN Mobile"),
                new Network("938", "Smart Communications"),
                new Network("939", "Smart Communications"),
                new Network("930", "Smart Communications"),
                new Network("942", "Sun Cellular"),
                new Network("943", "Sun Cellular"),
                new Network("945", "Globe Telecom"),
                new Network("946", "Smart Communications"),
                new Network("947", "Smart Communications"),
                new Network("948", "Smart Communications"),
                new Network("949", "Smart Communications"),
                new Network("955", "Globe Telecom"),
                new Network("956", "Globe Telecom"),
                new Network("950", "Smart Communications"),
                new Network("973", "Express Telecom"),
                new Network("974", "Express Telecom"),
                new Network("975", "Globe Telecom"),
                new Network("977", "Globe Telecom"),
                new Network("978", "Next Mobile"),
                new Network("979", "Next Mobile"),
                new Network("989", "Smart Communications"),
                new Network("995", "Globe Telecom"),
                new Network("996", "Globe Telecom"),
                new Network("997", "Globe Telecom"),
                new Network("998", "Smart Communications"),
                new Network("999", "Smart Communications"),
        };
    }

    /**
     * Returns network from a specific index
     * @param index  Index of element to access
     * @return Returns the network
     */
    public Network get(int index) {
        return networks[index];
    }

    /**
     * Returns the number of available networks
     * @return Returns the length of networks array
     */
    public int count() {
        return networks.length;
    }
}
