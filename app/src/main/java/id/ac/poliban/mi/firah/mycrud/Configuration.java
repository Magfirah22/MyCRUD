package id.ac.poliban.mi.firah.mycrud;

public class Configuration {
    public static final String URL_ADD = "http://192.168.43.159/employee/InsertPegawai.php";
    public static final String URL_GET_ALL = "http://192.168.43.159/employee/GetAllPegawai.php";
    public static final String URL_GET_EMP = "http://192.168.43.159/employee/GetAPegawi.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.43.159/employee/UpdatePegawai.php";
    public static final String URL_DELETE_EMP = "http://192.168.43.159/employee/DeletePegawi.php?id=";

    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_POSISI = "posisi";
    public static final String KEY_EMP_GAJI = "gaji";

    public static final String TAG_JSON_ARRAY = "data";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_POSISI = "posisi";
    public static final String TAG_GAJI = "gaji";

    public static final String EMP_ID = "emp_id";
}
