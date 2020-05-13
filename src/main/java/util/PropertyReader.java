package util;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertyReader {


    private static PropertyReader uniqueInstance;

    private PropertyReader() {
    }

    public static synchronized PropertyReader getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PropertyReader();
        }
        return uniqueInstance;
    }

    public Properties getProperties(String propertyFile) {
        Properties props = new Properties();
        Reader reader = null;
        try {
            reader = Files.newReader(new File(propertyFile), Charsets.UTF_8);
            props.load(reader);
            return props;
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex.getMessage(), ex);
                }
            }
        }
    }

    public String getProperty(String key, String propertyFile) {
        return getProperties(propertyFile).getProperty(key);
    }

    public String[] getProperties(String key, String propertyFile) {
        String[] values = getProperties(propertyFile).getProperty(key).split(",");
        return values;
    }

}
