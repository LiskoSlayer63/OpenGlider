package gr8pefish.openglider.common.helper;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

import static gr8pefish.openglider.api.OpenGliderInfo.MOD_NAME;

/**
 * A logger class ot output information to the FML log nicely
 */
public class Logger{

    public static void log(Level logLevel, Object object){
        FMLLog.log(MOD_NAME, logLevel, String.valueOf(object));
    }

    public static void all(Object object){
        log(Level.ALL, object);
    }

    public static void debug(Object object){
        log(Level.DEBUG, object);
    }

    public static void error(Object object){
        log(Level.ERROR, object);
    }

    public static void fatal(Object object){
        log(Level.FATAL, object);
    }

    public static void info(Object object){
        log(Level.INFO, object);
    }

    public static void off(Object object){
        log(Level.OFF, object);
    }

    public static void trace(Object object){
        log(Level.TRACE, object);
    }

    public static void warn(Object object){
        log(Level.WARN, object);
    }
}
