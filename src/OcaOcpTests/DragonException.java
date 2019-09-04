package src.OcaOcpTests;

class DragonException extends Exception {
}

class Lair {
    public void openDrawbridge() throws Exception { // r1
        try {
            throw new Exception("This Exception");
        } catch (
                RuntimeException e) {
            throw new DragonException(); // r2
        } finally {
            throw new RuntimeException("Or maybe this one");
        }

    }

    public static void main(String[] moat) throws Exception {
        new Lair().openDrawbridge(); // r3

    }
}
