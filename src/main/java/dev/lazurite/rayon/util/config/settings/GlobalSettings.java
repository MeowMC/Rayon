package dev.lazurite.rayon.util.config.settings;

import io.github.fablabsmc.fablabs.api.fiber.v1.annotation.Setting;
import io.github.fablabsmc.fablabs.api.fiber.v1.annotation.Settings;

@Settings
public class GlobalSettings {
    @Setting
    private float gravity;

    @Setting
    @Setting.Constrain.Range(min = 0.0f)
    private float airDensity;

    public GlobalSettings(float gravity, float airDensity) {
        this.gravity = gravity;
        this.airDensity = airDensity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public void setAirDensity(float airDensity) {
        this.airDensity = airDensity;
    }

    public float getGravity() {
        return this.gravity;
    }

    public float getAirDensity() {
        return this.airDensity;
    }
}