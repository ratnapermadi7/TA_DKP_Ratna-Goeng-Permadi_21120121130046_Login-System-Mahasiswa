public class User {
    public String[][] data;
    public String fName[][];
    public String matkul[];

    public User(){
        this.data = new String[][]{
                {"Ratna","222"},
                {"Fathoni","333"},
                {"Dewi","444"},
                {"Liya","555"},
                {"Ghea","666"},
                {"David","777"},
                {"Ludvi","888"},
                {"Uki","999"}
        };
        this.fName = new String[][]{
                {"Ratna Goeng Permadi","21120121130046"},
                {"Ahmad Fathoni","21120121120051"},
                {"Dewi Sinta","21120121130024"},
                {"Liya Dwi Rahmawati","21120121140013"},{"Ghea Antika","21120121130048"},
                {"David Kuncoro","21120121140097"},
                {"Ludvi Argorahayu","21120121120064"},
                {"Sukimin","21120121130001"}
        };
        this.matkul = new String[]{
          "Kimia","Algoritma  ","Elektronika Dasar","Fisika Dasar II","Aljabar Linier","Internet Of Things","Matematika Teknik","Praktikum DKP"
        };
    }
}
