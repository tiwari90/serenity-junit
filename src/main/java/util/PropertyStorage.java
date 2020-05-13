package util;

public class PropertyStorage {

    private static final String TEST_PROPERTY_FILE = "thucydides.properties";
    private static final String BROWSER_KEY = "webdriver.driver";
    private static final String USER_NAME_KEY = "user.login";
    private static final String USER_PASSWORD_KEY = "user.password";
    private static final String USER_LIT_NAME_KEY = "user.line.item.taxation.login";
    private static final String USER_LIT_PASSWORD_KEY = "user.line.item.taxation.password";
    private static final String SERVER_FAKE_CERTIFICATE_KEY = "server.has.fake.certificate";
    private static final String BASE_URL_KEY = "webdriver.base.url";
    private static final String PATH_TO_DRIVER_EXECUTABLE_KEY = "path.to.driver.executable";
    private static final String PATH_TO_LOG_FILE_KEY = "path.to.log.file";
    private static final String DEFAULT_PATH_TO_APP_API_KEY = "path.to.app.api";
    private static final String ETOUCHES_ACCOUNT_ID = "etouches.account.id";
    private static final String ETOUCHES_ACCOUNT_KEY = "etouches.account.key";
    private static final String ETOUCHES_ACCOUNT_NUMBER = "etouches.account.number";
    private static final String ETOUCHES_ACCOUNT_LIT_NUMBER =
        "etouches.account.line.item.taxation.number";
    private static final String ETOUCHES_FOLDER_NAME = "etouches.folder.name";
    private static final String DOWNLOAD_PATH = "download.dir";
    private static final String OUTLOOK_URL = "outlook.url";
    private static final String OUTLOOK_CRED1 = "mail.outlook.creds1";
    private static final String OUTLOOK_CRED2 = "mail.outlook.creds2";
    private static final String LOOPD_EVENT_NAME = "loopd.Event.Name";
    private static final String LOOPD_APP_NAME = "loopd.App.Name";
    private static final String OKTA_USER_NAME_KEY = "okta.user.login";
    private static final String OKTA_USER_PASSWORD_KEY = "okta.user.password";
    private static final String QA_MASKING_URL = "qa.masking.url";
    private static final String STAGE_MASKING_URL = "stage.masking.url";
    private static final String PRODISO_MASKING_URL = "prod-iso.masking.url";
    private static final String PROD_MASKING_URL = "prod.masking.url";
    private static final String AU_MASKING_URL = "au.masking.url";
    private static final String EU_MASKING_URL = "eu.masking.url";

    private static String readProperty(String key) {
        return PropertyReader.getInstance().getProperty(key, TEST_PROPERTY_FILE);
    }

    private static String[] readProperties(String key) {
        return PropertyReader.getInstance().getProperties(key, TEST_PROPERTY_FILE);
    }

    public static String getBrowser() {
        return readProperty(BROWSER_KEY);
    }

    public static String getUsername() {
        if (System.getProperty(USER_NAME_KEY) != null) {
            return System.setProperty(USER_NAME_KEY, System.getProperty(USER_NAME_KEY));
        }
        return readProperty(USER_NAME_KEY);
    }

    public static String getPassword() {
        if (System.getProperty(USER_PASSWORD_KEY) != null) {
            return System.setProperty(USER_PASSWORD_KEY, System.getProperty(USER_PASSWORD_KEY));
        }
        return readProperty(USER_PASSWORD_KEY);
    }

    public static String getServerFakeCertificate() {
        return readProperty(SERVER_FAKE_CERTIFICATE_KEY);
    }

    public static String getBaseUrl() {
        if (System.getProperty(BASE_URL_KEY) != null) {
            return System.setProperty(BASE_URL_KEY, System.getProperty(BASE_URL_KEY).trim());
        }
        return readProperty(BASE_URL_KEY).trim();
    }

    public static String getPathToDriverExecutable() {
        return readProperty(PATH_TO_DRIVER_EXECUTABLE_KEY);
    }

    public static String getPathToLogFile() {
        return readProperty(PATH_TO_LOG_FILE_KEY);
    }

    public static String getDefaultPathToAppAPI() {
        return readProperty(DEFAULT_PATH_TO_APP_API_KEY);
    }

    public static String getEtouchesAccountKey() {
        return readProperty(ETOUCHES_ACCOUNT_KEY);
    }

    public static String getEtouchesAccountId() {
        return readProperty(ETOUCHES_ACCOUNT_ID);
    }

    public static String getEtouchesAccountNumber() {
        return readProperty(ETOUCHES_ACCOUNT_NUMBER);
    }

    public static String getEtouchesLitAccountNumber() {
        return readProperty(ETOUCHES_ACCOUNT_LIT_NUMBER);
    }

    public static String getEtouchesFolderName() {
        return readProperty(ETOUCHES_FOLDER_NAME);
    }

    public static String getDownloadPath() {
        return readProperty(DOWNLOAD_PATH);
    }

    public static String getLineItemTaxationUsername() {
        return readProperty(USER_LIT_NAME_KEY);
    }

    public static String getLineItemTaxationPassword() {
        return readProperty(USER_LIT_PASSWORD_KEY);
    }

    public static String getEmailUrl() {
        return readProperty(OUTLOOK_URL);
    }

    public static String[] getOutlookCredOne() {
        String[] cred1 = readProperties(OUTLOOK_CRED1);
        return cred1;
    }

    public static String[] getOutlookCredTwo() {
        String[] cred2 = readProperties(OUTLOOK_CRED2);
        return cred2;
    }

    public static String getLoopdEventName() {
        return readProperty(LOOPD_EVENT_NAME);
    }

    public static String getLoopdAppName() {
        return readProperty(LOOPD_APP_NAME);
    }

    public static String getOktaUserName() {
        if (System.getProperty(OKTA_USER_NAME_KEY) != null) {
            return System.setProperty(OKTA_USER_NAME_KEY, System.getProperty(OKTA_USER_NAME_KEY));
        }
        return readProperty(OKTA_USER_NAME_KEY);
    }

    public static String getOktaPassword() {
        if (System.getProperty(OKTA_USER_PASSWORD_KEY) != null) {
            return System
                .setProperty(OKTA_USER_PASSWORD_KEY, System.getProperty(OKTA_USER_PASSWORD_KEY));
        }
        return readProperty(OKTA_USER_PASSWORD_KEY);
    }

    public static String getQaMaskingUrl() {
        return readProperty(QA_MASKING_URL);
    }

    public static String getStageMaskingUrl() {
        return readProperty(STAGE_MASKING_URL);
    }

    public static String getProdIsoMaskingUrl() {
        return readProperty(PRODISO_MASKING_URL);
    }

    public static String getProdMaskingUrl() {
        return readProperty(PROD_MASKING_URL);
    }

    public static String getAuMaskingUrl() {
        return readProperty(AU_MASKING_URL);
    }

    public static String getEuMaskingUrl() {
        return readProperty(EU_MASKING_URL);
    }
}

