package camp.computer.construct_v2;

import java.util.HashMap;

public class Type {

    private static HashMap<String, Type> identifiers = new HashMap<>();

    public String identifier = null; // type identifier of construct

    private Type(String identifier) {
        this.identifier = identifier;
    }

    public static Type get(String identifier) {
        if (Type.identifiers.containsKey(identifier)) {
            return Type.identifiers.get(identifier);
        } else {
            Type type = new Type(identifier);
            Type.identifiers.put(identifier, type);
            return type;
        }
    }

    public static boolean has(String identifier) {
        return Type.identifiers.containsKey(identifier);
    }

    @Override
    public String toString() {
        return identifier;
    }

}
