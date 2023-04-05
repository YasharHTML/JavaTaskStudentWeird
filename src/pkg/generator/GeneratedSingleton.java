package pkg.generator;

public class GeneratedSingleton {
    private int _idx;

    public int index() {
        this._idx += 1;
        return this._idx;
    }

    private static GeneratedSingleton instance = null;
    private GeneratedSingleton(int idx) { this._idx = idx; }
    public static GeneratedSingleton getInstance() {
        if (instance == null) {
            instance = new GeneratedSingleton(0);
        }
        return instance;
    }
}
