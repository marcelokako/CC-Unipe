class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Criando a nova instância Singleton.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}