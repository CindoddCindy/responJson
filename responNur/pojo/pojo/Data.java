
package pojo.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("ID")
    @Expose
    private long iD;
    @SerializedName("user_login")
    @Expose
    private String userLogin;
    @SerializedName("user_nicename")
    @Expose
    private String userNicename;
    @SerializedName("user_email")
    @Expose
    private String userEmail;
    @SerializedName("user_url")
    @Expose
    private String userUrl;
    @SerializedName("user_registered")
    @Expose
    private String userRegistered;
    @SerializedName("user_activation_key")
    @Expose
    private String userActivationKey;
    @SerializedName("user_status")
    @Expose
    private long userStatus;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("zona_status")
    @Expose
    private String zonaStatus;
    @SerializedName("zona_lokasi")
    @Expose
    private String zonaLokasi;
    @SerializedName("zona_latitude")
    @Expose
    private String zonaLatitude;
    @SerializedName("zona_longitude")
    @Expose
    private String zonaLongitude;
    @SerializedName("zona_nama_depan")
    @Expose
    private String zonaNamaDepan;
    @SerializedName("zona_nama_belakang")
    @Expose
    private String zonaNamaBelakang;
    @SerializedName("zona_jenis_kelamin")
    @Expose
    private String zonaJenisKelamin;
    @SerializedName("zona_email")
    @Expose
    private String zonaEmail;
    @SerializedName("zona_telp")
    @Expose
    private String zonaTelp;
    @SerializedName("fcm_token")
    @Expose
    private String fcmToken;
    @SerializedName("saldo")
    @Expose
    private long saldo;
    @SerializedName("daily_order")
    @Expose
    private long dailyOrder;
    @SerializedName("weekly_order")
    @Expose
    private long weeklyOrder;
    @SerializedName("monthly_order")
    @Expose
    private long monthlyOrder;
    @SerializedName("overal_order")
    @Expose
    private long overalOrder;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param zonaLatitude
     * @param userStatus
     * @param monthlyOrder
     * @param displayName
     * @param zonaStatus
     * @param zonaEmail
     * @param zonaTelp
     * @param saldo
     * @param userRegistered
     * @param userNicename
     * @param zonaJenisKelamin
     * @param userLogin
     * @param overalOrder
     * @param zonaLongitude
     * @param dailyOrder
     * @param userEmail
     * @param zonaNamaDepan
     * @param iD
     * @param userActivationKey
     * @param zonaNamaBelakang
     * @param fcmToken
     * @param weeklyOrder
     * @param userUrl
     * @param zonaLokasi
     */
    public Data(long iD, String userLogin, String userNicename, String userEmail, String userUrl, String userRegistered, String userActivationKey, long userStatus, String displayName, String zonaStatus, String zonaLokasi, String zonaLatitude, String zonaLongitude, String zonaNamaDepan, String zonaNamaBelakang, String zonaJenisKelamin, String zonaEmail, String zonaTelp, String fcmToken, long saldo, long dailyOrder, long weeklyOrder, long monthlyOrder, long overalOrder) {
        super();
        this.iD = iD;
        this.userLogin = userLogin;
        this.userNicename = userNicename;
        this.userEmail = userEmail;
        this.userUrl = userUrl;
        this.userRegistered = userRegistered;
        this.userActivationKey = userActivationKey;
        this.userStatus = userStatus;
        this.displayName = displayName;
        this.zonaStatus = zonaStatus;
        this.zonaLokasi = zonaLokasi;
        this.zonaLatitude = zonaLatitude;
        this.zonaLongitude = zonaLongitude;
        this.zonaNamaDepan = zonaNamaDepan;
        this.zonaNamaBelakang = zonaNamaBelakang;
        this.zonaJenisKelamin = zonaJenisKelamin;
        this.zonaEmail = zonaEmail;
        this.zonaTelp = zonaTelp;
        this.fcmToken = fcmToken;
        this.saldo = saldo;
        this.dailyOrder = dailyOrder;
        this.weeklyOrder = weeklyOrder;
        this.monthlyOrder = monthlyOrder;
        this.overalOrder = overalOrder;
    }

    public long getID() {
        return iD;
    }

    public void setID(long iD) {
        this.iD = iD;
    }

    public Data withID(long iD) {
        this.iD = iD;
        return this;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public Data withUserLogin(String userLogin) {
        this.userLogin = userLogin;
        return this;
    }

    public String getUserNicename() {
        return userNicename;
    }

    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    public Data withUserNicename(String userNicename) {
        this.userNicename = userNicename;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Data withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public Data withUserUrl(String userUrl) {
        this.userUrl = userUrl;
        return this;
    }

    public String getUserRegistered() {
        return userRegistered;
    }

    public void setUserRegistered(String userRegistered) {
        this.userRegistered = userRegistered;
    }

    public Data withUserRegistered(String userRegistered) {
        this.userRegistered = userRegistered;
        return this;
    }

    public String getUserActivationKey() {
        return userActivationKey;
    }

    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    public Data withUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
        return this;
    }

    public long getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(long userStatus) {
        this.userStatus = userStatus;
    }

    public Data withUserStatus(long userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Data withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getZonaStatus() {
        return zonaStatus;
    }

    public void setZonaStatus(String zonaStatus) {
        this.zonaStatus = zonaStatus;
    }

    public Data withZonaStatus(String zonaStatus) {
        this.zonaStatus = zonaStatus;
        return this;
    }

    public String getZonaLokasi() {
        return zonaLokasi;
    }

    public void setZonaLokasi(String zonaLokasi) {
        this.zonaLokasi = zonaLokasi;
    }

    public Data withZonaLokasi(String zonaLokasi) {
        this.zonaLokasi = zonaLokasi;
        return this;
    }

    public String getZonaLatitude() {
        return zonaLatitude;
    }

    public void setZonaLatitude(String zonaLatitude) {
        this.zonaLatitude = zonaLatitude;
    }

    public Data withZonaLatitude(String zonaLatitude) {
        this.zonaLatitude = zonaLatitude;
        return this;
    }

    public String getZonaLongitude() {
        return zonaLongitude;
    }

    public void setZonaLongitude(String zonaLongitude) {
        this.zonaLongitude = zonaLongitude;
    }

    public Data withZonaLongitude(String zonaLongitude) {
        this.zonaLongitude = zonaLongitude;
        return this;
    }

    public String getZonaNamaDepan() {
        return zonaNamaDepan;
    }

    public void setZonaNamaDepan(String zonaNamaDepan) {
        this.zonaNamaDepan = zonaNamaDepan;
    }

    public Data withZonaNamaDepan(String zonaNamaDepan) {
        this.zonaNamaDepan = zonaNamaDepan;
        return this;
    }

    public String getZonaNamaBelakang() {
        return zonaNamaBelakang;
    }

    public void setZonaNamaBelakang(String zonaNamaBelakang) {
        this.zonaNamaBelakang = zonaNamaBelakang;
    }

    public Data withZonaNamaBelakang(String zonaNamaBelakang) {
        this.zonaNamaBelakang = zonaNamaBelakang;
        return this;
    }

    public String getZonaJenisKelamin() {
        return zonaJenisKelamin;
    }

    public void setZonaJenisKelamin(String zonaJenisKelamin) {
        this.zonaJenisKelamin = zonaJenisKelamin;
    }

    public Data withZonaJenisKelamin(String zonaJenisKelamin) {
        this.zonaJenisKelamin = zonaJenisKelamin;
        return this;
    }

    public String getZonaEmail() {
        return zonaEmail;
    }

    public void setZonaEmail(String zonaEmail) {
        this.zonaEmail = zonaEmail;
    }

    public Data withZonaEmail(String zonaEmail) {
        this.zonaEmail = zonaEmail;
        return this;
    }

    public String getZonaTelp() {
        return zonaTelp;
    }

    public void setZonaTelp(String zonaTelp) {
        this.zonaTelp = zonaTelp;
    }

    public Data withZonaTelp(String zonaTelp) {
        this.zonaTelp = zonaTelp;
        return this;
    }

    public String getFcmToken() {
        return fcmToken;
    }

    public void setFcmToken(String fcmToken) {
        this.fcmToken = fcmToken;
    }

    public Data withFcmToken(String fcmToken) {
        this.fcmToken = fcmToken;
        return this;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public Data withSaldo(long saldo) {
        this.saldo = saldo;
        return this;
    }

    public long getDailyOrder() {
        return dailyOrder;
    }

    public void setDailyOrder(long dailyOrder) {
        this.dailyOrder = dailyOrder;
    }

    public Data withDailyOrder(long dailyOrder) {
        this.dailyOrder = dailyOrder;
        return this;
    }

    public long getWeeklyOrder() {
        return weeklyOrder;
    }

    public void setWeeklyOrder(long weeklyOrder) {
        this.weeklyOrder = weeklyOrder;
    }

    public Data withWeeklyOrder(long weeklyOrder) {
        this.weeklyOrder = weeklyOrder;
        return this;
    }

    public long getMonthlyOrder() {
        return monthlyOrder;
    }

    public void setMonthlyOrder(long monthlyOrder) {
        this.monthlyOrder = monthlyOrder;
    }

    public Data withMonthlyOrder(long monthlyOrder) {
        this.monthlyOrder = monthlyOrder;
        return this;
    }

    public long getOveralOrder() {
        return overalOrder;
    }

    public void setOveralOrder(long overalOrder) {
        this.overalOrder = overalOrder;
    }

    public Data withOveralOrder(long overalOrder) {
        this.overalOrder = overalOrder;
        return this;
    }

}
