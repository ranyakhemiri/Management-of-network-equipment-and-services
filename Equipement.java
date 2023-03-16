import java.util.HashMap;
import java.util.HashSet;

public class Equipement {
    public HashMap<String, String> eqHash = new HashMap<>();
    public HashMap<String, TrapInter> traps = new HashMap<>();

    public Equipement(int id, String name, String ad, String s) {
        eqHash.put("Name", name);
        eqHash.put("Address", ad);
        eqHash.put("Service", s);
        eqHash.put("Id", Integer.toString(id));
    }

    // ******* getters *******
    public String getName() {
        return eqHash.get("Name");
    }

    public String getServices() {
        return eqHash.get("Service");
    }

    public String getAddress() {
        return eqHash.get("Address");
    }

    public String getId() {
        return eqHash.get("Id");
    }

    // ******* setters *******

    // on suppose qu'on peut pas changer l'id
    // une fois que l'objet a été créé

    public void setName(String name) {
        eqHash.replace("Name", name);
    }

    public void setAddress(String ad) {
        eqHash.put("Address", ad);
    }

    public void setService(String s) {
        eqHash.put("Service", s);
    }

    // trapinter
    public void addTrap(String type, TrapInter t) {
        if (type == "name") {
            traps.put("name", t);
        }
        if (type == "service") {
            traps.put("service", t);
        }
        if (type == "address") {
            traps.put("address", t);
        }
    }

    public void removeTrap(String type) {
        this.traps.remove(type);
    }
}
