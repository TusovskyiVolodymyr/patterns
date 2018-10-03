package compositor;

public class App {
    public static void main(String[] args) {
        HeadManager head = new HeadManager("Yanov");
        ResourceManager rm = new ResourceManager("Roman");
        ResourceManager rm2 = new ResourceManager("Oleg");
        Employee vova = new SubEmployee("Vova");
        Employee vitalik = new SubEmployee("Vitalik");
        Employee sveta = new SubEmployee("Sveta");
        Employee ivan = new SubEmployee("Ivan");
        head.addManager(rm);
        head.addManager(rm2);
        rm.addToPull(vova);
        rm.addToPull(ivan);
        rm2.addToPull(vitalik);
        rm2.addToPull(sveta);
        System.out.println(head.toString());
        System.out.println(head.getManager("Roman").toString());
    }
}
