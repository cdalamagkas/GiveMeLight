package givemelight;

/**
 *
 * @author root
 */
public class Singleton {
    
    public static final String DEFAULT_DIR = "/sys/class/backlight/intel_backlight/";
    public static String PREFERED_DIR = DEFAULT_DIR;
    public static final String BRIGHTNESS_STR = "brightness";
    public static final String MAX_BRIGHTNESS_STR = "max_brightness";
    public static String ROOT_PASS = null;
    public static int MAX_BRIGHTNESS = 1;
            
}
