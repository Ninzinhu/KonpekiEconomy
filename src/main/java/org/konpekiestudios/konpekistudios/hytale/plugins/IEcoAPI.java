package org.konpekiestudios.konpekistudios.hytale.plugins;

import java.util.UUID;

public interface IEcoAPI {
    float getBalance(UUID uuid);
    void addBalance(UUID uuid, float amount);
    void removeBalance(UUID uuid, float amount);
    void setBalance(UUID uuid, float amount);

    class Service {
        private static IEcoAPI instance;

        public static void setInstance(IEcoAPI api) {
            instance = api;
        }

        public static IEcoAPI getInstance() {
            return instance;
        }
    }
}
