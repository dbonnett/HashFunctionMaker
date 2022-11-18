package hashFunctionMaker;

public class HashMapPlayAround {

    String[] ourTable = new String[100];

    public int hashStringToInt(String s) {
        int hash = 17;
        int multiplier = 13;

        for (char c : s.toCharArray()) {
            hash = (hash * (Character.getNumericValue(c) * multiplier)) % ourTable.length;
        }
        return hash;
    }

    public int altHash(String s) {
        int hash = 127;
        for (char c : s.toCharArray()) {
            hash = (hash + (Character.getNumericValue(c) % 17)) % 100;
        }
        return hash;
    }


    public String getValue(String key) {
        return ourTable[hashStringToInt(key)];
    }

    public void setValue(String key, String value) {
        ourTable[hashStringToInt(key)] = value;
    }


//    public static void main(String[] args) {
//
//    }
}
