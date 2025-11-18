package relasidm;
public class Dosen {
    private String Nidn;
    private String[] nimMhs = new String[11];
    private int jmlMhs;

    public void setNidn(String Nidn) {
        this.Nidn = Nidn;
    }

    public String getNidn() {
        return this.Nidn;
    }

    public void setNimMhs(String nimMhs) {
        if (jmlMhs < this.nimMhs.length) {
            this.nimMhs[jmlMhs] = nimMhs;
            jmlMhs++;
        }
    }

    public int getJmlMhs() {
        return this.jmlMhs;
    }

    public String getNimMhs(int indeks) {
        return (nimMhs[indeks]);
    }
}
