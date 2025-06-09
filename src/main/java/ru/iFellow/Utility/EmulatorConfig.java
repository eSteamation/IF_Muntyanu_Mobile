package ru.iFellow.Utility;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:src/test/resources/emulator.properties"
})
public interface EmulatorConfig extends Config {
    @Key("deviceName")
    String deviceName();

    @Key("platformName")
    String platformName();

    @Key("appPackage")
    String appPackage();

    @Key("app")
    String app();

    @Key("appWaitActivity")
    String appWaitActivity();

    @Key("remoteURL")
    String remoteURL();

    @Key("platformVersion")
    String platformVersion();
}
