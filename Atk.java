public class Atk implements Comparable<Atk>{
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private Integer stok;

    public Atk (String kodeBarang, String jenisBarang, String namaBarang, Integer stok){
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public Integer getStok() {
        return stok;
    }

        @Override
    public String toString(){
        return this.kodeBarang + " " + this.jenisBarang + " " + this.namaBarang + " " + this.stok;
    }

        @Override
    public int compareTo(Atk list) {
        return this.getKodeBarang().compareTo(list.getKodeBarang());
    }

        @Override
    public int hashCode(){
        return this.kodeBarang.hashCode();
    }

        @Override
    public boolean equals (Object s){
        if (s instanceof Atk){
            Atk all = (Atk) s;
            return this.kodeBarang.equals(all.kodeBarang);
        }
        return false;
    }
}
